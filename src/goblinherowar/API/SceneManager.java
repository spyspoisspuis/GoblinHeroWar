package goblinherowar.API;
import java.util.Random;
public class SceneManager {
    public static int currentIdx;
    public static void randomScene(){
        Random rand = new Random();
        int randInt=1;
        int cntSc = GameManager.cntScene;
        if(cntSc<2)
            randInt = rand.nextInt(4)+1;
        else if (cntSc < 4)
            randInt = rand.nextInt(3)+5;
        else if (cntSc == 4)
            randInt = rand.nextInt(2)+8;
        else if (cntSc == 5)
            randInt = 10;
        
        currentIdx = randInt;
        MainFrame.openScene(randInt);
    }
}
