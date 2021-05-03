package goblinherowar.API;
import java.util.Random;
import goblinherowar.Frame.MainFrame;
public class SceneManager {
    public static int currentIdx = 0;
    private static int ezarr = 0;
    private static int medarr = 0 ;
    public static int randomScene(){
        Random rand = new Random();
        int randInt=1;
        int cntSc = GameManager.cntScene%4;
        if (cntSc==0) randInt = 1;
        else if(cntSc==1){
            while (true){
                randInt = rand.nextInt(3)+2;
                if (randInt != ezarr) break;
            }
            ezarr = randInt;
        }
        else if (cntSc==2){
            while (true){
                randInt = rand.nextInt(3)+5;
                if (randInt != medarr) break;
            }
            medarr = randInt;
        }
        else if (cntSc == 3)
            randInt = 8;
        
        currentIdx = randInt;
        return randInt;

    }
    public static void resetSc(){
        ezarr = medarr = 0;
    }
}
