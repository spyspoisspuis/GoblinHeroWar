/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goblinherowar.Frame;

import goblinherowar.API.Util;
import goblinherowar.API.GameManager;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.Timer;
/**
 *
 * @author peeravich.c
 */
public class Scene7 extends Scene implements GetDetectName{

    // <editor-fold defaultstate="collapsed" desc="instance variable"> 
    private int key1cnt,key2cnt,key3cnt,key4cnt,key5cnt,key6cnt;
    private int[] keyInterrupt = new int[6];
    private boolean key1Onprogress,key2Onprogress,key3Onprogress,key4Onprogress,key5Onprogress,key6Onprogress;
    private boolean key1Open,key2Open,key3Open,key4Open,key5Open,key6Open;
    private boolean key1Done,key2Done,key3Done,key4Done;
    private Timer[] t = new Timer[10];
    private int[] timeCounter = new int[10];
    private int idx = 0;
    private JButton k1,k2,k3,k4,k5,k6;
    private int[] keytimer =new int[6];
    private int sequence = 0;
    //</editor-fold>
    /**
     * Creates new form Scene7
     */
    public Scene7() {
        initComponents();
        
        k1 = new JButton();
        k1.setLocation(key1.getX(), key1.getY());
        k2 = new JButton();
        k2.setLocation(key2.getX(), key2.getY());
        k3 = new JButton();
        k3.setLocation(key3.getX(), key3.getY());
        k4 = new JButton();
        k4.setLocation(key4.getX(), key4.getY());       
        k5 = new JButton();
        k5.setLocation(key5.getX(), key5.getY());        
        k6 = new JButton();
        k6.setLocation(key6.getX(), key6.getY());

        resetScene();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Scene Method">
    public String getPlayerDetectName(){
        return playerDetect.getName();
    }
    
    public String getEnemyDetectName(){
        return enemyDetect.getName();
    }

    public ArrayList<JButton> getButton(){
        ArrayList<JButton> b = new ArrayList<>();
        b.add(key1);
        b.add(key2);
        b.add(key3);
        b.add(key4);
        b.add(key5);
        b.add(key6);
        return b;
    }
    
    public void resetScene(){
        setting.setOpaque(false);
        setting.setContentAreaFilled(false);
        setting.setBorderPainted(false);
        
        key1.setEnabled(true);
        key2.setEnabled(true);
        key3.setEnabled(true);
        key4.setEnabled(true);
        key5.setEnabled(true);
        key6.setEnabled(true);
        key1.setVisible(true);
        key2.setVisible(true);
        key3.setVisible(true);
        key4.setVisible(true);
        key5.setVisible(true);
        key6.setVisible(true);
        /*
        key1.setLocation(,);
        key2.setLocation(,);
        key3.setLocation(,);
        key4.setLocation(,);
        key5.setLocation(,);
        key6.setLocation(,);
        */
        top1_L.setVisible(true);
        top2_L.setVisible(true);
        top3_L.setVisible(true);
        top1_R.setVisible(true);
        top2_R.setVisible(true);
        top3_R.setVisible(true);
        mid1_L.setVisible(false);
        mid2_L.setVisible(false);
        mid3_L.setVisible(false);
        mid4_L.setVisible(false);
        mid1_R.setVisible(true);
        mid2_R.setVisible(true);
        mid3_R.setVisible(true);
        mid_M.setVisible(false);
        bottom1_L.setVisible(false);
        bottom2_L.setVisible(false);
        bottom3_L.setVisible(false);
        bottom4_L.setVisible(false);
        bottom1_R.setVisible(false);
        bottom2_R.setVisible(false);
        enemyDetect.setVisible(false);
        playerDetect.setVisible(false);
        Util.moveButton(key1,k1.getX(),k1.getY());
        Util.moveButton(key2,k2.getX(),k2.getY());
        Util.moveButton(key3,k3.getX(),k3.getY());
        Util.moveButton(key4,k4.getX(),k4.getY());
        Util.moveButton(key5,k5.getX(),k5.getY());
        Util.moveButton(key6,k6.getX(),k6.getY());
        
        key1cnt = key2cnt = key3cnt = key4cnt = key5cnt = key6cnt = 0;
        key1Open = key2Open = key3Open = key4Open = key5Open = key6Open = false;
        key1Onprogress = key2Onprogress = key3Onprogress = key4Onprogress = key5Onprogress = key6Onprogress = false;
        key1Done = key2Done = key3Done = key4Done = false;
        enemyHPBar.setForeground(Color.red);
        enemyHPBar.setValue(GameManager.goblinHP);
        playerHPBar.setForeground(Color.red);
        playerHPBar.setValue(GameManager.heroHP);
        
        for (int i =0;i<keytimer.length;i++)
            keytimer[i]  = -1;
        for (int i =0;i<keyInterrupt.length;i++)
            keyInterrupt[i]  = -1;
    }
//</editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        key1 = new javax.swing.JButton();
        key2 = new javax.swing.JButton();
        key3 = new javax.swing.JButton();
        key4 = new javax.swing.JButton();
        key5 = new javax.swing.JButton();
        key6 = new javax.swing.JButton();
        top1_L = new javax.swing.JLabel();
        top2_L = new javax.swing.JLabel();
        top3_L = new javax.swing.JLabel();
        top1_R = new javax.swing.JLabel();
        top2_R = new javax.swing.JLabel();
        top3_R = new javax.swing.JLabel();
        mid1_L = new javax.swing.JLabel();
        mid2_L = new javax.swing.JLabel();
        mid3_L = new javax.swing.JLabel();
        mid4_L = new javax.swing.JLabel();
        mid1_R = new javax.swing.JLabel();
        mid2_R = new javax.swing.JLabel();
        mid3_R = new javax.swing.JLabel();
        mid_M = new javax.swing.JLabel();
        bottom1_L = new javax.swing.JLabel();
        bottom2_L = new javax.swing.JLabel();
        bottom3_L = new javax.swing.JLabel();
        bottom4_L = new javax.swing.JLabel();
        bottom1_R = new javax.swing.JLabel();
        bottom2_R = new javax.swing.JLabel();
        playerDetect = new javax.swing.JLabel();
        enemyDetect = new javax.swing.JLabel();
        setting = new javax.swing.JButton();
        enemyHPBar = new javax.swing.JProgressBar();
        playerHPBar = new javax.swing.JProgressBar();
        Scene7 = new javax.swing.JLabel();

        setLayout(null);

        key1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/key1.png"))); // NOI18N
        key1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key1ActionPerformed(evt);
            }
        });
        add(key1);
        key1.setBounds(110, 90, 116, 60);

        key2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/key2.png"))); // NOI18N
        key2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key2ActionPerformed(evt);
            }
        });
        add(key2);
        key2.setBounds(480, 100, 117, 140);

        key3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/key3.png"))); // NOI18N
        key3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key3ActionPerformed(evt);
            }
        });
        add(key3);
        key3.setBounds(110, 180, 116, 60);

        key4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/key4.png"))); // NOI18N
        key4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key4ActionPerformed(evt);
            }
        });
        add(key4);
        key4.setBounds(680, 180, 126, 60);

        key5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/key5.png"))); // NOI18N
        key5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key5ActionPerformed(evt);
            }
        });
        add(key5);
        key5.setBounds(240, 270, 116, 60);

        key6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/key6.png"))); // NOI18N
        key6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key6ActionPerformed(evt);
            }
        });
        add(key6);
        key6.setBounds(720, 270, 126, 60);

        top1_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/top1_L.png"))); // NOI18N
        add(top1_L);
        top1_L.setBounds(130, 40, 110, 80);

        top2_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/top2_L.png"))); // NOI18N
        add(top2_L);
        top2_L.setBounds(130, 70, 110, 50);

        top3_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/top3_L.png"))); // NOI18N
        add(top3_L);
        top3_L.setBounds(130, 90, 110, 30);

        top1_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/top1_R.png"))); // NOI18N
        add(top1_R);
        top1_R.setBounds(670, 40, 110, 80);

        top2_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/top2_R.png"))); // NOI18N
        add(top2_R);
        top2_R.setBounds(670, 70, 110, 50);

        top3_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/top3_R.png"))); // NOI18N
        add(top3_R);
        top3_R.setBounds(670, 90, 110, 30);

        mid1_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/mid1_L.png"))); // NOI18N
        add(mid1_L);
        mid1_L.setBounds(180, 120, 30, 94);

        mid2_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/mid2_L.png"))); // NOI18N
        add(mid2_L);
        mid2_L.setBounds(180, 170, 110, 40);

        mid3_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/mid3_L.png"))); // NOI18N
        add(mid3_L);
        mid3_L.setBounds(280, 170, 110, 40);

        mid4_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/mid4_L.png"))); // NOI18N
        add(mid4_L);
        mid4_L.setBounds(380, 170, 90, 40);

        mid1_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/mid1_R.png"))); // NOI18N
        add(mid1_R);
        mid1_R.setBounds(710, 120, 33, 90);

        mid2_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/mid2_R.png"))); // NOI18N
        add(mid2_R);
        mid2_R.setBounds(610, 170, 120, 40);

        mid3_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/mid3_R.png"))); // NOI18N
        add(mid3_R);
        mid3_R.setBounds(500, 170, 120, 40);

        mid_M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/mid1_M.png"))); // NOI18N
        add(mid_M);
        mid_M.setBounds(470, 170, 40, 90);

        bottom1_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/bottom1_L.png"))); // NOI18N
        add(bottom1_L);
        bottom1_L.setBounds(180, 210, 30, 50);

        bottom2_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/bottom2_L.png"))); // NOI18N
        add(bottom2_L);
        bottom2_L.setBounds(180, 260, 90, 30);

        bottom3_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/bottom3_L.png"))); // NOI18N
        add(bottom3_L);
        bottom3_L.setBounds(260, 260, 110, 30);

        bottom4_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/bottom4_L.png"))); // NOI18N
        add(bottom4_L);
        bottom4_L.setBounds(370, 250, 140, 50);

        bottom1_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/bottom1_R.png"))); // NOI18N
        add(bottom1_R);
        bottom1_R.setBounds(710, 210, 40, 80);

        bottom2_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/bottom2_R.png"))); // NOI18N
        add(bottom2_R);
        bottom2_R.setBounds(740, 260, 70, 40);

        playerDetect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/fail.png"))); // NOI18N
        add(playerDetect);
        playerDetect.setBounds(750, 300, 60, 90);

        enemyDetect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/win.png"))); // NOI18N
        add(enemyDetect);
        enemyDetect.setBounds(280, 300, 56, 90);

        setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/setting.png"))); // NOI18N
        setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingActionPerformed(evt);
            }
        });
        add(setting);
        setting.setBounds(880, 10, 57, 70);
        add(enemyHPBar);
        enemyHPBar.setBounds(248, 498, 120, 20);
        add(playerHPBar);
        playerHPBar.setBounds(720, 497, 120, 20);

        Scene7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene7Component/Scene7.jpg"))); // NOI18N
        Scene7.setSize(new java.awt.Dimension(960, 540));
        add(Scene7);
        Scene7.setBounds(0, 0, 960, 540);
    }// </editor-fold>//GEN-END:initComponents

    private void settingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingActionPerformed
        // TODO add your handling code here:
        GameManager.pauseGame();
        MainFrame.addScene(9,0);
        MainFrame.setSceneVisible(9,true);
        key1.setEnabled(false);
        key2.setEnabled(false);
        key3.setEnabled(false);
        key4.setEnabled(false);
        key5.setEnabled(false);
        key6.setEnabled(false);
        Pause.pause(t, keyInterrupt, keytimer);
    }//GEN-LAST:event_settingActionPerformed

    private void key1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key1ActionPerformed
        // TODO add your handling code here:
        if(!key1.isEnabled()) return;
        key1Open = !key1Open;
        key1cnt++;
        // <editor-fold defaultstate="collapsed" desc="open key"> 
        if (key1cnt%2 == 1) {
            Util.moveButton(key1, key1.getX()-80, key1.getY());
            if(key1Done) return;
            key1Onprogress = true;
            keytimer[0] = recheckTimerIdx();
            timeCounter[keytimer[0]] = 0;
            t[keytimer[0]] = new Timer(1000,new ActionListener(){
            //@override
            public void actionPerformed(ActionEvent e) {
                int idx = keytimer[0];
                    if(key1Done) t[idx].stop();
                    if(!key1Open) {  key1Onprogress = false; keyInterrupt[0] = idx;  t[idx].stop(); }   
                    if(keyInterrupt[0] != -1) {  idx = keyInterrupt[0]; keyInterrupt[0] = -1;  }
   
                    openkey1(timeCounter[idx],idx);
                    if(key3Open && mid1_L.isVisible()){
                        int k = timeCounter[idx]-getkey3sequence()-1;
                        openkey3(k,idx,1);
                    }
                    if(key5Open && bottom3_L.isVisible()){
                       enemyDamage();
                       endkey1(idx);
                    }
                    timeCounter[idx]++;
            }
            });
            t[keytimer[0]].start();
                    
        }
        //</editor-fold>
        // <editor-fold defaultstate="collapsed" desc="close key"> 
        else{
            Util.moveButton(key1, key1.getX()+80, key1.getY());
            key1Onprogress = false;
        }
        //</editor-fold>
    }//GEN-LAST:event_key1ActionPerformed
    private void openkey1(int t,int idx){
        if (t==0) {
            mid1_L.setVisible(true);
            top1_L.setVisible(false);
        }
        else if (t==1) {
            mid2_L.setVisible(true);
            top2_L.setVisible(false);
        }
        else if (t==2) {
            mid3_L.setVisible(true);
            top3_L.setVisible(false);
        }
        else if (t==3){
            mid4_L.setVisible(true);
            if(!key3Open) endkey1(idx);
        }
    }
    private void endkey1(int idx){
        key1Onprogress = false;
        key1Done = true;
        t[idx].stop();
        timeCounter[idx] = 0;
    }
    
    private void key3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key3ActionPerformed
        // TODO add your handling code here:
        if(!key3.isEnabled()) return;
        key3Open = !key3Open;
        key3cnt++;
        // <editor-fold defaultstate="collapsed" desc="open key"> 
        if(key3cnt%2==1) {
            Util.moveButton(key3,key3.getX()-80,key3.getY());
            key3sequencing();
            if(!mid1_L.isVisible())return; 
            if(key1Onprogress) return;
            if(key3Done) return;
            key3Onprogress = true;
            keytimer[2]=recheckTimerIdx();
            timeCounter[keytimer[2]] = 0;
            t[keytimer[2]] = new Timer(1000, new ActionListener() {
                //@override
                public void actionPerformed(ActionEvent e) { 
                    int idx = keytimer[2];
                    if(key3Done) t[idx].stop();
                    if(!key3Open) { key3Onprogress = false; keyInterrupt[2] = idx;  t[idx].stop();  }
                    if(keyInterrupt[2] != -1) {  idx = keyInterrupt[2]; keyInterrupt[2] = -1; }
                    openkey3(timeCounter[idx],idx,3);
                    timeCounter[idx]++;
                }
            });
             t[keytimer[2]].start();
        }
        //</editor-fold>
        // <editor-fold defaultstate="collapsed" desc="close key"> 
        else{
            Util.moveButton(key3, key3.getX()+80, key3.getY());
            key3Onprogress = false;
        }
        //</editor-fold>
    }//GEN-LAST:event_key3ActionPerformed
    private void openkey3(int t, int idx,int key){
        if(t == 0) {
            bottom1_L.setVisible(true);
            if (!key1Onprogress && mid4_L.isVisible()&& !key2Onprogress && !key2Done) 
                mid4_L.setVisible(false);
        }
        else if (t>= 1 && (key2Onprogress || key2Done)) {
            bottom2_L.setVisible(true);
            if(key == 1) endkey1(idx);
            else if (key==3) endkey3(idx);
            return;
        }
        else if (t == 1){
            bottom2_L.setVisible(true);
            if (!key1Onprogress && mid3_L.isVisible()) mid3_L.setVisible(false);
        }
        else if (t == 2){
            bottom3_L.setVisible(true);
            if (!key1Onprogress && mid2_L.isVisible())mid2_L.setVisible(false);
            else if (key1Onprogress) mid4_L.setVisible(false);
        }
        else if (t==3) {
            if(key5Open) enemyDamage();
            else { 
                bottom4_L.setVisible(true); 
                if(key1Onprogress) mid3_L.setVisible(false);
                else mid1_L.setVisible(false);
            }
            if(key == 1) endkey1(idx);
            else if (key==3) endkey3(idx);
        }
    }
    private void key3sequencing(){
        sequence = 0;
        if(mid2_L.isVisible()) sequence = 1;
        if (mid3_L.isVisible()) sequence= 2;
        if (mid4_L.isVisible()) sequence = 3;
        
    }
    private int getkey3sequence() { return sequence;}
    private void endkey3(int idx){
        key3Onprogress = false;
        key3Done = true;
        t[idx].stop();
        timeCounter[idx] = 0;
    }
    
    private void key2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key2ActionPerformed
        // TODO add your handling code here:
        if(!key2.isEnabled()) return;
        key2Open = !key2Open;
        key2cnt++;
        // <editor-fold defaultstate="collapsed" desc="open key"> 
        if(key2cnt%2==1) {
            Util.moveButton(key2,key2.getX(),key2.getY()-50);
            key2Onprogress = true;
            keytimer[1]  = recheckTimerIdx();
            timeCounter[keytimer[1]] = 0;
            t[keytimer[1]] = new Timer(1000, new ActionListener() {
                //@override
                public void actionPerformed(ActionEvent e) { 
                    int idx = keytimer[1];
                    if(key2Done) t[idx].stop();
                    if(!key2Open) { key2Onprogress = false; keyInterrupt[1] = idx;  t[idx].stop();  }
                    if(keyInterrupt[1]  != -1) {  idx = keyInterrupt[1] ; keyInterrupt[1]  = -1; }
                    openkey2(timeCounter[idx],idx);
                    timeCounter[idx]++;
                }
            });
             t[keytimer[1]].start();
        }
        //</editor-fold>
        // <editor-fold defaultstate="collapsed" desc="close key"> 
        else{
            Util.moveButton(key2, key2.getX(), key2.getY()+50);
            key2Onprogress = false;
        }
        //</editor-fold>
    }//GEN-LAST:event_key2ActionPerformed
    private void openkey2(int t,int idx){
        if(t==0) mid_M.setVisible(true);
       
        else if (t>=1){
            if((key1Onprogress && key3Open) || key3Onprogress) {
                endkey2(idx);
                return;
            }
        }
        if (t==1) bottom4_L.setVisible(true);
        else if (t==2) bottom3_L.setVisible(true);
        else if (t==3) { 
            //System.out.println("v");
            if(key5Open) enemyDamage();
            else bottom2_L.setVisible(true); 
            endkey2(idx); 
        }
        checktopright(t);
    }
    private void endkey2(int idx){
        key2Onprogress = false;
        key2Done = true;
        t[idx].stop();
        timeCounter[idx] = 0;
    }
    
    private void key5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key5ActionPerformed
        // TODO add your handling code here:
        if(!key5.isEnabled()) return;
        key5Open = !key5Open;
        key5cnt++;
        // <editor-fold defaultstate="collapsed" desc="open key"> 
        if(key5cnt%2==1) {
            Util.moveButton(key5,key5.getX()-80,key5.getY());
            key5Onprogress = true;
            if(key3Onprogress || key2Onprogress) return;
            if(!bottom3_L.isVisible()) return;
            keytimer[4] = recheckTimerIdx();
            t[keytimer[4]] = new Timer(1000, new ActionListener() {
                //@override
                public void actionPerformed(ActionEvent e) { 
                    enemyDamage();
                    t[keytimer[4]].stop();   
                }
            });
             t[keytimer[4]].start();
        }
        //</editor-fold>
        // <editor-fold defaultstate="collapsed" desc="close key"> 
        else{
            Util.moveButton(key5, key5.getX()+80, key5.getY());
            stopenemyDamage();
            key5Onprogress = false;
        }
        //</editor-fold>
    }//GEN-LAST:event_key5ActionPerformed

    private void key4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key4ActionPerformed
        // TODO add your handling code here:
        if(!key4.isEnabled()) return;
        key4Open = !key4Open;
        key4cnt++;
        // <editor-fold defaultstate="collapsed" desc="open key"> 
        if(key4cnt%2==1) {
            Util.moveButton(key4,key4.getX()+80,key4.getY());
            if(!mid1_R.isVisible()) return;
            key4Onprogress = true;
            keytimer[3] = recheckTimerIdx();
            timeCounter[keytimer[3]] = 0;
            t[keytimer[3]] = new Timer(1000, new ActionListener() {
                //@override
                public void actionPerformed(ActionEvent e) { 
                    int idx = keytimer[3];
                    if(key4Done) t[idx].stop();
                    if(!key4Open) { key4Onprogress = false; keyInterrupt[3]  = idx;  t[idx].stop();  }
                    if(keyInterrupt[3] != -1) {  idx = keyInterrupt[3]; keyInterrupt[3] = -1; }
                    openkey4(timeCounter[idx],idx);
                    timeCounter[idx] ++;
                }
            });
             t[keytimer[3]].start();
        }
        //</editor-fold>
        // <editor-fold defaultstate="collapsed" desc="close key"> 
        else{
            Util.moveButton(key4, key4.getX()-80, key4.getY());
            key4Onprogress = false;
        }
        //</editor-fold>
    }//GEN-LAST:event_key4ActionPerformed
    private void openkey4(int t,int idx){
        if(t==0) bottom1_R.setVisible(true);
        else if (t==1) bottom2_R.setVisible(true);
        else if (t==2) {
            if(key6Open){
                playerDamage();
                mid1_R.setVisible(false);
            }
            endkey4(idx);
            return;
        }
        if(key2Done) checkmidright(t);
        else checktopright(t);
    }
    private void endkey4(int idx){
        key4Onprogress = false;
        key4Done = true;
        t[idx].stop();
        timeCounter[idx] = 0;
    }
    
    private void key6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key6ActionPerformed
        // TODO add your handling code here:
        if(!key6.isEnabled()) return ;
        key6Open = !key6Open;
        key6cnt++;
        // <editor-fold defaultstate="collapsed" desc="open key"> 
        if(key6cnt%2==1) {
            Util.moveButton(key6,key6.getX()+80,key6.getY());
            key6Onprogress = true;
            if(key4Onprogress ) return;
            if(!bottom2_R.isVisible()) return;
            keytimer[5] =  recheckTimerIdx();
            t[keytimer[5]] = new Timer(1000, new ActionListener() {
                //@override
                public void actionPerformed(ActionEvent e) { 
                    playerDamage();
                    
                    t[keytimer[5]].stop();   
                }
            });
             t[keytimer[5]].start();
        }
        //</editor-fold>
        // <editor-fold defaultstate="collapsed" desc="close key"> 
        else{
            Util.moveButton(key6, key6.getX()-80, key6.getY());
            stopplayerDamage();
            key6Onprogress = false;
        }
        //</editor-fold>
    }//GEN-LAST:event_key6ActionPerformed
    
    
    private void checktopright(int t){
        if (t==0){
            if (top1_R.isVisible()) top1_R.setVisible(false);
            else if (top2_R.isVisible()) top2_R.setVisible(false);
            else if (top3_R.isVisible()) top3_R.setVisible(false);
        }
        if (t==1){
            if (top2_R.isVisible()) top2_R.setVisible(false);
            else if (top3_R.isVisible()) top3_R.setVisible(false);
        }
        if (t==2){
            if (top3_R.isVisible()) top3_R.setVisible(false);
        }
    }
    private void checkmidright(int t){
        if(t==0) {
            if(mid3_R.isVisible()) mid3_R.setVisible(false);
            else if(mid2_R.isVisible()) mid2_R.setVisible(false);
        }
        else if (t==1){
            if(mid2_R.isVisible()) mid2_R.setVisible(false);
        }
    }
    private void enemyDamage(){
        enemyDetect.setVisible(true);
        GameManager.goblinDamaged();
    }
    private void playerDamage(){
        playerDetect.setVisible(true);
        GameManager.playerDamaged();
    }
    private void stopenemyDamage(){
        enemyDetect.setVisible(false);
        GameManager.stopGoblinDamage();
    }
    private void stopplayerDamage(){
        playerDetect.setVisible(false);
        GameManager.stopHeroDamaged();
    }

    private int recheckTimerIdx(){
        if (idx == timeCounter.length-1) idx = 0;
        else idx+=1;
        return idx;
    }
    public void closeAllTimer(){
        for(int i =0;i<t.length;i++)
            if(t[i]!=null)
                t[i].stop();
    }
    public void setHPBar(){
        GameManager.setGoblinBar(enemyHPBar);
        GameManager.setPlayerBar(playerHPBar);
        enemyHPBar.setValue(100);
        playerHPBar.setValue(100);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Scene7;
    private javax.swing.JLabel bottom1_L;
    private javax.swing.JLabel bottom1_R;
    private javax.swing.JLabel bottom2_L;
    private javax.swing.JLabel bottom2_R;
    private javax.swing.JLabel bottom3_L;
    private javax.swing.JLabel bottom4_L;
    private javax.swing.JLabel enemyDetect;
    private javax.swing.JProgressBar enemyHPBar;
    private javax.swing.JButton key1;
    private javax.swing.JButton key2;
    private javax.swing.JButton key3;
    private javax.swing.JButton key4;
    private javax.swing.JButton key5;
    private javax.swing.JButton key6;
    private javax.swing.JLabel mid1_L;
    private javax.swing.JLabel mid1_R;
    private javax.swing.JLabel mid2_L;
    private javax.swing.JLabel mid2_R;
    private javax.swing.JLabel mid3_L;
    private javax.swing.JLabel mid3_R;
    private javax.swing.JLabel mid4_L;
    private javax.swing.JLabel mid_M;
    private javax.swing.JLabel playerDetect;
    private javax.swing.JProgressBar playerHPBar;
    private javax.swing.JButton setting;
    private javax.swing.JLabel top1_L;
    private javax.swing.JLabel top1_R;
    private javax.swing.JLabel top2_L;
    private javax.swing.JLabel top2_R;
    private javax.swing.JLabel top3_L;
    private javax.swing.JLabel top3_R;
    // End of variables declaration//GEN-END:variables
}
