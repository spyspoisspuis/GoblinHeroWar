package goblinherowar.API;
import goblinherowar.Frame.MainFrame;
import javax.swing.JProgressBar;
public class GameManager {
    public static int cntScene = 0;
    public static int heroHP = 100; 
    public static int goblinHP = 100;
    private static int damageMultiplier;
    private static DamageTimer[] dmtArr = new DamageTimer[2]; // 0 for hero 1 for goblin
    private static boolean heroDetect = false;
    private static boolean goblinDetect = false;
    private static boolean pause = false;
    
    public static String result;
    
    private static JProgressBar heroBar,goblinBar;
    public static void setPlayerBar(JProgressBar bar) { heroBar = bar; }
    public static void setGoblinBar(JProgressBar bar) { goblinBar = bar; }
    
    public static void playerDamaged(){
        damageMultiplier = (int)(15*setCalculateHeroDamageDuetoSceneCnt());
        DamageTimer dmt = new DamageTimer(heroBar.getValue(),heroBar,damageMultiplier,"Hero");
        dmtArr[0] = dmt;
        heroDetect = true;
        dmt.runTimer();
    }
    public static void goblinDamaged(){
        damageMultiplier = (int)(30*setCalculateGoblinDamageDuetoSceneCnt());
        DamageTimer dmt = new DamageTimer(goblinBar.getValue(),goblinBar,damageMultiplier,"Goblin");
   
        dmtArr[1] = dmt;
        goblinDetect = true;
        dmt.runTimer();
    }
    public static void stopHeroDamaged(){
        if(!heroDetect) return ;
        if(!pause) heroDetect = false;
         dmtArr[0].stopTimer();
    }
    public static void stopGoblinDamage(){
        if(!goblinDetect) return;
        if(!pause) goblinDetect = false;
        dmtArr[1].stopTimer();
    }
    
    private static double setCalculateHeroDamageDuetoSceneCnt(){
        int c = cntScene%8;
        if(c<2) //15
            return 1;
        else if (c == 2 || c == 4 || c == 5) //20
            return 1.34;
        else if (c == 3 || c == 6 )//25
            return 1.67;
        else if (c == 7)//30
            return 2;
        return 1;
        
    }
    private static double setCalculateGoblinDamageDuetoSceneCnt(){
        int c = cntScene%8;
        if(c<2) //30
            return 1;
        else if (c == 2 || c == 4 || c == 5) //20
            return 0.67;
        else if (c == 3 || c == 6 )//15
            return 0.5;
        else if (c == 7)//10
            return 0.33;
        return 1;
        
    }
    public static void endGame(String name){
        //need to end this game;
        pauseGame();
        if("Hero".equals(name)){
            //System.out.println("Goblin Win");
            MainFrame.endLoseScene();
        }
        else if ("Goblin".equals(name)){
            //System.out.println("Player Win"+calculateScore());
            if("1 Star".equals(calculateScore()))  result = "1 Star";
            else if("2 Stars".equals(calculateScore())) result = "2 Stars";
            else if("3 Stars".equals(calculateScore())) result = "3 Stars";
            MainFrame.endWinScene();
        }
        heroHP = goblinHP = 100;
    }
    
    private static String calculateScore(){
        int hpLeft = heroBar.getValue();
        if(hpLeft <= 40) return "1 Star";
        else if (hpLeft <= 70) return "2 Stars";
        else return "3 Stars";
    }
    public static void pauseGame(){
        pause = true;
        stopHeroDamaged();
        stopGoblinDamage();
    }
    public static void resumeGame(){
        pause = false;
        if(heroDetect) playerDamaged();
        if(goblinDetect) goblinDamaged();
    }
    public static void exitGame(){
        cntScene = 0;
        SceneManager.resetSc();
    }
}

