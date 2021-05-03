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
public class Scene6 extends Scene implements GetDetectName{

    // <editor-fold defaultstate="collapsed" desc="instance variable"> 
    private int key1cnt,key2cnt,key3cnt,key4cnt,key5cnt,key6cnt;
    private int[] keyInterrupt = new int[6];
    private boolean key1Onprogress,key2Onprogress,key3Onprogress,key4Onprogress,key5Onprogress,key6Onprogress;
    private boolean key1Open,key2Open,key3Open,key4Open,key5Open,key6Open;
    private int[] keytimer =new int[6];
    private boolean key1Done,key2Done,key3Done,key4Done;
    private Timer[] t = new Timer[6];
    private int[] timeCounter = new int[6];
    private int idx = 0;
    private JButton k1,k2,k3,k4,k5,k6;
    private int sequence = 0;
    //</editor-fold>
    /**
     * Creates new form Scene6
     */
    public Scene6() {
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
        top1.setVisible(true);
        top2.setVisible(true);
        top3.setVisible(true);
        mid1_L.setVisible(false);
        mid2_L.setVisible(false);
        mid1_R.setVisible(false);
        mid2_R.setVisible(false);
        mid3_R.setVisible(false);
        mid4_R.setVisible(false);
        mid5_R.setVisible(false);
        bottom1_L.setVisible(false);
        bottom2_L.setVisible(false);
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
        top1 = new javax.swing.JLabel();
        top2 = new javax.swing.JLabel();
        top3 = new javax.swing.JLabel();
        mid1_L = new javax.swing.JLabel();
        mid2_L = new javax.swing.JLabel();
        mid1_R = new javax.swing.JLabel();
        mid2_R = new javax.swing.JLabel();
        mid3_R = new javax.swing.JLabel();
        mid4_R = new javax.swing.JLabel();
        mid5_R = new javax.swing.JLabel();
        bottom1_L = new javax.swing.JLabel();
        bottom2_L = new javax.swing.JLabel();
        bottom1_R = new javax.swing.JLabel();
        bottom2_R = new javax.swing.JLabel();
        playerDetect = new javax.swing.JLabel();
        enemyDetect = new javax.swing.JLabel();
        setting = new javax.swing.JButton();
        enemyHPBar = new javax.swing.JProgressBar();
        playerHPBar = new javax.swing.JProgressBar();
        Scene6 = new javax.swing.JLabel();

        setLayout(null);

        key1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/key1.png"))); // NOI18N
        key1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key1ActionPerformed(evt);
            }
        });
        add(key1);
        key1.setBounds(280, 100, 130, 60);

        key2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/key2.png"))); // NOI18N
        key2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key2ActionPerformed(evt);
            }
        });
        add(key2);
        key2.setBounds(560, 70, 60, 130);

        key3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/key3.png"))); // NOI18N
        key3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key3ActionPerformed(evt);
            }
        });
        add(key3);
        key3.setBounds(230, 220, 130, 60);

        key4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/key4.png"))); // NOI18N
        key4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key4ActionPerformed(evt);
            }
        });
        add(key4);
        key4.setBounds(620, 250, 130, 60);

        key5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/key5.png"))); // NOI18N
        key5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key5ActionPerformed(evt);
            }
        });
        add(key5);
        key5.setBounds(140, 300, 130, 60);

        key6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/key6.png"))); // NOI18N
        key6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key6ActionPerformed(evt);
            }
        });
        add(key6);
        key6.setBounds(750, 300, 130, 60);

        top1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/top1.png"))); // NOI18N
        add(top1);
        top1.setBounds(200, 30, 400, 100);

        top2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/top2.png"))); // NOI18N
        add(top2);
        top2.setBounds(200, 70, 400, 60);

        top3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/top3.png"))); // NOI18N
        add(top3);
        top3.setBounds(200, 90, 390, 40);

        mid1_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/mid1_L.png"))); // NOI18N
        add(mid1_L);
        mid1_L.setBounds(310, 120, 70, 90);

        mid2_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/mid2_L.png"))); // NOI18N
        add(mid2_L);
        mid2_L.setBounds(260, 170, 60, 80);

        mid1_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/mid1_R.png"))); // NOI18N
        add(mid1_R);
        mid1_R.setBounds(590, 90, 140, 40);

        mid2_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/mid2_R.png"))); // NOI18N
        add(mid2_R);
        mid2_R.setBounds(680, 120, 40, 130);

        mid3_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/mid3_R.png"))); // NOI18N
        add(mid3_R);
        mid3_R.setBounds(590, 240, 140, 40);

        mid4_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/mid4_R.png"))); // NOI18N
        add(mid4_R);
        mid4_R.setBounds(420, 240, 170, 40);

        mid5_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/mid5_R.png"))); // NOI18N
        add(mid5_R);
        mid5_R.setBounds(255, 240, 165, 40);

        bottom1_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/bottom1_L.png"))); // NOI18N
        add(bottom1_L);
        bottom1_L.setBounds(260, 240, 60, 80);

        bottom2_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/bottom2_L.png"))); // NOI18N
        add(bottom2_L);
        bottom2_L.setBounds(190, 280, 80, 40);

        bottom1_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/bottom1_R.png"))); // NOI18N
        add(bottom1_R);
        bottom1_R.setBounds(680, 280, 90, 50);

        bottom2_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/bottom2_R.png"))); // NOI18N
        add(bottom2_R);
        bottom2_R.setBounds(760, 280, 60, 50);

        playerDetect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/fail.png"))); // NOI18N
        add(playerDetect);
        playerDetect.setBounds(770, 330, 50, 60);

        enemyDetect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/win.png"))); // NOI18N
        add(enemyDetect);
        enemyDetect.setBounds(190, 330, 50, 60);

        setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/setting.png"))); // NOI18N
        setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingActionPerformed(evt);
            }
        });
        add(setting);
        setting.setBounds(880, 10, 57, 70);
        add(enemyHPBar);
        enemyHPBar.setBounds(140, 496, 130, 22);
        add(playerHPBar);
        playerHPBar.setBounds(707, 496, 130, 22);

        Scene6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/Scene6.jpg"))); // NOI18N
        Scene6.setSize(new java.awt.Dimension(960, 540));
        add(Scene6);
        Scene6.setBounds(0, 0, 960, 540);
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
        if(!key1.isEnabled()) return ;
        key1Open = !key1Open ;
        key1cnt++;
        // <editor-fold defaultstate="collapsed" desc="open key"> 
        if(key1cnt%2==1) {
            Util.moveButton(key1,key1.getX()-80,key1.getY());
            if(key1Done) return;
            if(!top1.isVisible() && !top2.isVisible() && !top3.isVisible()) return;
            key1Onprogress = true;
            keytimer[0] = recheckTimerIdx();
            timeCounter[keytimer[0]] = 0;
            t[keytimer[0]] = new Timer(1000, new ActionListener() {
                //@override
                public void actionPerformed(ActionEvent e) {
                    int idx = keytimer[0];
                    if(key1Done) t[idx].stop();
                    if(!key1Open) { keyInterrupt[0] = idx;  t[idx].stop();  }
                    if(keyInterrupt[0] != -1) {  idx = keyInterrupt[0]; keyInterrupt[0] = -1; }
                    key1firststep(timeCounter[idx],idx);
                    if (key3Open) 
                        openkey3(timeCounter[idx]-2,idx,1);
                    
                    timeCounter[idx]++;
                }
            });t[keytimer[0]].start();
        } 
        //</editor-fold>
        // <editor-fold defaultstate="collapsed" desc="close key"> 
        else{
            Util.moveButton(key1, key1.getX()+80, key1.getY());
            key1Onprogress = false;
        }
 //</editor-fold>
    }//GEN-LAST:event_key1ActionPerformed
    private void key1firststep(int timerCounter,int idx){
        if(timerCounter == 0) {
            mid1_L.setVisible(true);
        }
        else if (timerCounter == 1){
            mid2_L.setVisible(true);
            if (!key3Open) endkey1(idx);
        }
        checktop(timerCounter);
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
            Util.moveButton(key3,key3.getX()+80,key3.getY());
            if(key3Done) return;
            if(key1Onprogress) return;
            if(!mid2_L.isVisible()) return;
            key3Onprogress = true;
            keytimer[2] = recheckTimerIdx();
            timeCounter[keytimer[2]] = 0;
            t[keytimer[2]] = new Timer(1000, new ActionListener() {
                //@override
                public void actionPerformed(ActionEvent e) {
                    int idx = keytimer[2];
                    if(key3Done) t[idx].stop();;
                    if(!key3Open) { keyInterrupt[2] = idx;  t[idx].stop();  }
                    if(keyInterrupt[2] != -1) {idx= keyInterrupt[2]; keyInterrupt[2] = -1; }
                    openkey3(timeCounter[idx],idx,3);
                    timeCounter[idx]++;
                }
            });t[keytimer[2]].start();
        } 
        //</editor-fold>
        // <editor-fold defaultstate="collapsed" desc="close key"> 
        else{
            Util.moveButton(key3, key3.getX()-80, key3.getY());
            key3Onprogress = false;
        }
 //</editor-fold>
    }//GEN-LAST:event_key3ActionPerformed
    private void openkey3(int timerCounter,int idx,int key){
        if(timerCounter == 0) 
            bottom1_L.setVisible(true);
        else if (timerCounter == 1){
            bottom2_L.setVisible(true);
        }
        else if (timerCounter == 2){
            mid5_R.setVisible(true); 
            if(key5Open) {
                mid1_L.setVisible(false);
                enemyDamage();
            }
        }
        else if (timerCounter == 3) {
            mid4_R.setVisible(true);
            mid1_L.setVisible(false);
            
        }
        else if (timerCounter == 4) {
            if(enemyDetect.isVisible()) mid2_L.setVisible(false);
            mid3_R.setVisible(true);
            mid2_L.setVisible(false);
            if(key == 1) endkey1(idx);
            if(key == 3) endkey3(idx);
        }
    }
    private void endkey3(int idx){
        key3Onprogress = false;
        key3Done = true;
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
            if(key1Onprogress || key3Onprogress) return;
            if(!bottom2_L.isVisible()) return;
            keytimer[4] = recheckTimerIdx();
            timeCounter[keytimer[4]] = 0;
            t[keytimer[4]] = new Timer(1000, new ActionListener() {
                //@override
                public void actionPerformed(ActionEvent e) {
                    enemyDamage();
                    t[keytimer[4]].stop();

                }
            });t[keytimer[4]].start();
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

    private void key2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key2ActionPerformed
        // TODO add your handling code here:
        if(!key2.isEnabled()) return;
        key2Open = !key2Open;
        key2cnt++;
        // <editor-fold defaultstate="collapsed" desc="open key"> 
        if(key2cnt%2==1) {
            Util.moveButton(key2,key2.getX(),key2.getY()+50);
            if(key2Done) return;
            if(!top1.isVisible() && !top2.isVisible() && !top3.isVisible()) return;
            key2Onprogress = true;
            keytimer[1] = recheckTimerIdx();
            timeCounter[keytimer[1]] = 0;
            t[keytimer[1]] = new Timer(1000, new ActionListener() {
                //@override
                public void actionPerformed(ActionEvent e) {
                    int idx = keytimer[1];
                    if(key2Done) t[idx].stop();
                    if(!key2Open) { keyInterrupt[1] = idx;  t[idx].stop(); }
                    if(keyInterrupt[1] != -1) {  idx = keyInterrupt[1]; keyInterrupt[1] = -1; }
                    //System.out.println(timeCounter[idx]);
                    openkey2(timeCounter[idx],idx);
                    if (key4Open && mid3_R.isVisible()){
                        int k  =timeCounter[idx] - 2 - getkey4sequence();
                        openkey4(k,idx,2);
                    }
                    timeCounter[idx]++;
                }
            });t[keytimer[1]].start();
        } 
        //</editor-fold>
        // <editor-fold defaultstate="collapsed" desc="close key"> 
        else{
            Util.moveButton(key2, key2.getX(), key2.getY()-50);
            key2Onprogress = false;
        }
 //</editor-fold>
    }//GEN-LAST:event_key2ActionPerformed
    private void openkey2(int timerCounter,int idx){
            if (timerCounter == 0) mid1_R.setVisible(true);
            else if (timerCounter == 1) mid2_R.setVisible(true);
            else if (timerCounter == 2) mid3_R.setVisible(true);
            else if (timerCounter == 3)  mid4_R.setVisible(true); 
            else if (timerCounter == 4)  mid5_R.setVisible(true); 
            else if (timerCounter == 5) { bottom1_L.setVisible(true); mid1_R.setVisible(false); }
            else if (timerCounter == 6) { bottom2_L.setVisible(true); mid2_R.setVisible(false); }
            else if (timerCounter == 7) { 
                if(key5Open) enemyDamage();
                endkey2(idx);
            }
            checktop(timerCounter);
        
    }
    private void endkey2(int idx){
        key2Onprogress = false;
        key2Done = true;
        t[idx].stop();
        timeCounter[idx] = 0;
    }
    
    private void key4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key4ActionPerformed
        // TODO add your handling code here:
        if(!key4.isEnabled()) return;
        key4Open = !key4Open;
        key4cnt++;
        // <editor-fold defaultstate="collapsed" desc="open key"> 
        if(key4cnt%2==1) {
            Util.moveButton(key4,key4.getX()-80,key4.getY());
            key4sequence();
            if(key4Done) return;
            if(key2Onprogress) return;
            if(!mid3_R.isVisible()) return;
            keytimer[3] = recheckTimerIdx();
            timeCounter[keytimer[3]] = 0;
            t[keytimer[3]] = new Timer(1000, new ActionListener() {
                //@override
                public void actionPerformed(ActionEvent e) {
                    int idx =keytimer[3];
                    if(key4Done) t[idx].stop();
                    if(!key4Open) { keyInterrupt[3] = idx;  t[idx].stop();  }
                    if(keyInterrupt[3] != -1) {  idx = keyInterrupt[3]; keyInterrupt[3] = -1; }
                    openkey4(timeCounter[idx],idx,4);
                    timeCounter[idx]++;
                }
            });t[keytimer[3]].start();
        } 
        //</editor-fold>
        // <editor-fold defaultstate="collapsed" desc="close key"> 
        else{
            Util.moveButton(key4, key4.getX()+80, key4.getY());
            key1Onprogress = false;
        }
 //</editor-fold>
    }//GEN-LAST:event_key4ActionPerformed
    private void openkey4(int timerCounter,int idx,int key){
        if (timerCounter == 0) bottom1_R.setVisible(true);
        else if (timerCounter == 1) bottom2_R.setVisible(true);
        else if (timerCounter == 2) {
            if(key6Open) playerDamage();
            if (key == 4)endkey4(idx);
            if(key == 2 && bottom2_L.isVisible()) endkey2(idx);
            return;
        }
        checkmidr(timerCounter);
    }
    private void key4sequence(){
        sequence = 0;
        if(mid1_R.isVisible()) sequence = 1;
        if(mid2_R.isVisible()) sequence = 2;
        if (mid3_R.isVisible()) sequence = 3;
        
    }
    private int getkey4sequence() { return sequence;}
    private void endkey4(int idx){
        key4Onprogress = false;
        key4Done = true;
        t[idx].stop();
        timeCounter[idx] = 0;
    }
    
    private void key6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key6ActionPerformed
        // TODO add your handling code here:
        if(!key6.isEnabled()) return;
        key6Open = !key6Open;
        key6cnt++;
        // <editor-fold defaultstate="collapsed" desc="open key"> 
        if(key6cnt%2==1) {
            Util.moveButton(key6,key6.getX()+80,key6.getY());
            if(key2Onprogress || key4Onprogress) return;
            if(!bottom2_R.isVisible()) return;
            keytimer[5] = recheckTimerIdx();
            timeCounter[keytimer[5]] = 0;
            t[keytimer[5]] = new Timer(1000, new ActionListener() {
                //@override
                public void actionPerformed(ActionEvent e) {
                    playerDamage();
                    t[keytimer[5]].stop();
                }
            });t[keytimer[5]].start();
        } 
        //</editor-fold>
        // <editor-fold defaultstate="collapsed" desc="close key"> 
        else{
            Util.moveButton(key6, key6.getX()-80, key6.getY());
            key6Onprogress = false;
            stopplayerDamage();
        }
 //</editor-fold>
    }//GEN-LAST:event_key6ActionPerformed


    private void checktop(int t){
        if (t==0) {
            if(top1.isVisible()) top1.setVisible(false);
            else if(top2.isVisible()) top2.setVisible(false);
            else if(top3.isVisible()) top3.setVisible(false);
        }
        if (t==2) {
            if(top2.isVisible()) top2.setVisible(false);
            else if(top3.isVisible()) top3.setVisible(false);
        }
        if (t==3) {
            if(top3.isVisible()) top3.setVisible(false);
        }
    }
    private void checkmidr(int t){
        if (t == 0) {
            if(top1.isVisible()) top1.setVisible(false);
            else if(top2.isVisible()) top2.setVisible(false);
            else if(top3.isVisible()) top3.setVisible(false);
            else if (mid1_R.isVisible()) mid1_R.setVisible(false);
            if(key3Done){
                if (mid1_R.isVisible()) mid1_R.setVisible(false);
                else if (mid5_R.isVisible()) mid5_R.setVisible(false);
            }
        }
        if (t == 1) {
            if(top2.isVisible()) top2.setVisible(false);
            else if(top3.isVisible()) top3.setVisible(false);
            if (key3Done){
                if (mid2_R.isVisible()) mid2_R.setVisible(false);
                else mid4_R.setVisible(false);
            }else {
                if (mid1_R.isVisible()) mid1_R.setVisible(false);
                else if (mid2_R.isVisible()) mid2_R.setVisible(false);
            }
            
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
    private javax.swing.JLabel Scene6;
    private javax.swing.JLabel bottom1_L;
    private javax.swing.JLabel bottom1_R;
    private javax.swing.JLabel bottom2_L;
    private javax.swing.JLabel bottom2_R;
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
    private javax.swing.JLabel mid3_R;
    private javax.swing.JLabel mid4_R;
    private javax.swing.JLabel mid5_R;
    private javax.swing.JLabel playerDetect;
    private javax.swing.JProgressBar playerHPBar;
    private javax.swing.JButton setting;
    private javax.swing.JLabel top1;
    private javax.swing.JLabel top2;
    private javax.swing.JLabel top3;
    // End of variables declaration//GEN-END:variables
}
