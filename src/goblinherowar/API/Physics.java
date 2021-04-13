
package goblinherowar.API;
import javax.swing.JButton;
import java.util.ArrayList;
public class Physics {
    public static boolean Collision(JButton b1,ArrayList<JButton> butt){
        for (JButton but : butt) {
            if (b1.getBounds().intersects(but.getBounds()))
                return true;
        }
        return false;
    }
}
