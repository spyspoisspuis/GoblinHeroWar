package goblinherowar.API;
import javax.swing.JProgressBar;
public class GameManager {
    public static int cntScene = 0;
    public static int heroHP = 100; 
    public static int goblinHP = 100;
    private static int damageMultiplier;
    private static DamageTimer[] dmtArr = new DamageTimer[2]; // 0 for hero 1 for goblin
    
    public static void playerDamaged(JProgressBar heroBar){
        damageMultiplier = (int)setCalculateSceneCnt();
        DamageTimer dmt = new DamageTimer(heroHP,heroBar,15*damageMultiplier);
        dmtArr[0] = dmt;
        dmt.runTimer();
    }
    public static void goblinDamaged(JProgressBar goblinBar){
        damageMultiplier = (int)setCalculateSceneCnt();
        DamageTimer dmt = new DamageTimer(goblinHP,goblinBar,15*damageMultiplier);
        dmtArr[1] = dmt;
        dmt.runTimer();
    }
    /*public void detectedStopDamage(String objName){
        // getArray
        String heroCorrectName = "";
        String goblinCorrectName = "";
        if(objName.equals(heroCorrectName)) 
            stopHeroDamaged();
        else if (objName.equals(goblinCorrectName))
            stopGoblinDamage();
        else 
            return;
    }*/
    public static void stopHeroDamaged(){
        dmtArr[0].stopTimer();
    }
    public static void stopGoblinDamage(){
        dmtArr[1].stopTimer();
    }
    
    private static double setCalculateSceneCnt(){
        if(cntScene<2)
            return 1;
        else if (cntScene < 4)
            return 1.34;
        else if (cntScene == 4)
            return 1.67;
        else if (cntScene == 5)
            return 2;
        return 1;
        
    }
}

