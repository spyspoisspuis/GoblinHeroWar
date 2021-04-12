package goblinherowar.API;
import javax.swing.JProgressBar;
import java.util.*;
public class DamageTimer {
    private JProgressBar bar;
    private int mxtime,damageRecieve,hp;
    private int cnt = 0;
    private boolean runningTimer = true;
    public DamageTimer(int hp,JProgressBar bar,int damageRecieve){
        this.hp = hp;
        this.bar = bar;
        this.mxtime = mxtime;
        this.damageRecieve = damageRecieve;
    }
    public void runTimer(){
        Timer t = new Timer();
        TimerTask tt = new TimerTask(){
            public void run(){
                while(runningTimer && cnt<=(hp/damageRecieve)){
                    cnt += 1;
                    if(hp-damageRecieve >= 0)
                        hp -= damageRecieve;
                    else hp = 0;
                    bar.setValue(hp);
                }
                t.cancel();
            }
        };
    }
    public void stopTimer(){
        runningTimer = false;
    }
}
