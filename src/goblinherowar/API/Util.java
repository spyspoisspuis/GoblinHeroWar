
package goblinherowar.API;
import javax.swing.*;
import java.util.*;
public class Util {
    public static void timeDelayed(double t){
        try {
            long ms = (long)t*1000;
            Thread.sleep(ms);
            return;
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
    public static void moveButton(JButton button,int xpos,int ypos){
        //get Array key 
        ArrayList<JButton> jb = new ArrayList<>(); // getKeyArray[SceneManager.currentIDX]
        if(Physics.Collision(button, jb)) {
            int firstx = button.getX();
            int firstY = button.getY();
            button.setLocation(xpos,ypos);
            timeDelayed(0.5);
            button.setLocation(firstx, firstY);
        }
        else 
            button.setLocation(xpos, ypos);
        return;
    }
}
