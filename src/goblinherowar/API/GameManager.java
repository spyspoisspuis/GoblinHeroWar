package goblinherowar.API;
import javax.swing.JProgressBar;
public class GameManager {
    public static int cntScene = 0;
    public static int heroHP = 100; 
    public static int goblinHP = 100;
    private static int damageMultiplier;
    private static DamageTimer[] dmtArr = new DamageTimer[2]; // 0 for hero 1 for goblin
    
    public static void playerDamaged(String objName,JProgressBar heroBar){
        //need to get Array
        String correctName = ""; //getImagetouchHeroArray()[SceneManager.currentIdx];
        if (!objName.equals(correctName)) return ;
        damageMultiplier = (int)setCalculateSceneCnt();
        DamageTimer dmt = new DamageTimer(heroHP,heroBar,15*damageMultiplier);
        dmtArr[0] = dmt;
        dmt.runTimer();
    }
    public static void goblinDamaged(String objName,JProgressBar goblinBar){
        //need to get Array
        String correctName = ""; //getImagetouchGoblinArray()[SceneManager.currentIdx];
        if (!objName.equals(correctName)) return ;
        damageMultiplier = (int)setCalculateSceneCnt();
        DamageTimer dmt = new DamageTimer(goblinHP,goblinBar,15*damageMultiplier);
        dmtArr[1] = dmt;
        dmt.runTimer();
    }
    public void detectedStopDamage(String objName){
        // getArray
        String heroCorrectName = "";
        String goblinCorrectName = "";
        if(objName.equals(heroCorrectName)) 
            stopHeroDamaged();
        else if (objName.equals(goblinCorrectName))
            stopGoblinDamage();
        else 
            return;
    }
    private void stopHeroDamaged(){
        dmtArr[0].stopTimer();
    }
    private void stopGoblinDamage(){
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

