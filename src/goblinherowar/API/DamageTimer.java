package goblinherowar.API;
import javax.swing.JProgressBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
public class DamageTimer {
    private String name;
    private JProgressBar bar;
    private int mxtime,damageRecieve,hp;
    
    private Timer t;
    
    public DamageTimer(int hp,JProgressBar bar,int damageRecieve,String name){
        this.name = name;
        this.hp = hp;
        this.bar = bar;
        this.mxtime = mxtime;
        this.damageRecieve = damageRecieve;
    }
    public void runTimer(){
        t = new Timer(1000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(hp-damageRecieve >= 0)
                        hp -= damageRecieve;
                else hp = 0;
                bar.setValue(hp);
                if(hp <= 0){ GameManager.endGame(name); t.stop(); return; }
           }
        });
        t.start();
    }
    public void stopTimer(){
        t.stop();
    }
    

}
