/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goblinherowar.Frame;

import goblinherowar.API.GameManager;
import goblinherowar.API.Util;
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
public class Scene2 extends Scene implements GetDetectName{
    // <editor-fold defaultstate="collapsed" desc="Instance variable">
    private int key1cnt = 0;
    private int key2cnt = 0;
    private int key3cnt = 0;
    private int key4cnt = 0;
    private boolean key1Open = false;
    private boolean key2Open = false;
    private boolean key3Open = false;
    private boolean key4Open = false;
    private Timer[] t = new Timer[4];
    private int[] timeCounter = new int[4];
    private int idx = 0;
    private int[] keyInterrupt = new int[4];
    private int[] keytimer =new int[4];
    private JButton k1,k2,k3,k4;
    private boolean key1Onprogress,key2Onprogress;
    //</editor-fold>
    

    /**
     * Creates new form Scene2
     */
    public Scene2() {
        initComponents();
        
        

        k1 = new JButton();
        k1.setLocation(key1.getX(), key1.getY());
        k2 = new JButton();
        k2.setLocation(key2.getX(), key2.getY());
        k3 = new JButton();
        k3.setLocation(key3.getX(), key3.getY());
        k4 = new JButton();
        k4.setLocation(key4.getX(), key4.getY());
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
        b.add(setting);
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
        key1.setVisible(true);
        key2.setVisible(true);
        key3.setVisible(true);
        key4.setVisible(true);
        Util.moveButton(key1,k1.getX(),k1.getY());
        Util.moveButton(key2,k2.getX(),k2.getY());
        Util.moveButton(key3,k3.getX(),k3.getY());
        Util.moveButton(key4,k4.getX(),k4.getY());
        setting.setEnabled(true);
        setting.setVisible(true);
        top1.setVisible(true);
        top2.setVisible(true);
        top3.setVisible(true);
        top4.setVisible(true);
        mid1_L.setVisible(false);
        mid2_L.setVisible(false);
        mid3_L.setVisible(false);
        mid1_R.setVisible(false);
        mid2_R.setVisible(false);
        mid3_R.setVisible(false);
        bottom1_L.setVisible(false);
        bottom2_L.setVisible(false);
        bottom_M.setVisible(false);
        bottom1_R.setVisible(false);
        bottom2_R.setVisible(false);
        enemyDetect.setVisible(false);
        playerDetect.setVisible(false);
        
        key1cnt = key2cnt = key3cnt = key4cnt = 0;
        key1Open = key2Open = key3Open = key4Open = false;
        key1Onprogress = key2Onprogress = false;
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
        top1 = new javax.swing.JLabel();
        top2 = new javax.swing.JLabel();
        top3 = new javax.swing.JLabel();
        top4 = new javax.swing.JLabel();
        mid1_L = new javax.swing.JLabel();
        mid2_L = new javax.swing.JLabel();
        mid3_L = new javax.swing.JLabel();
        mid1_R = new javax.swing.JLabel();
        mid2_R = new javax.swing.JLabel();
        mid3_R = new javax.swing.JLabel();
        bottom1_L = new javax.swing.JLabel();
        bottom2_L = new javax.swing.JLabel();
        bottom_M = new javax.swing.JLabel();
        bottom1_R = new javax.swing.JLabel();
        bottom2_R = new javax.swing.JLabel();
        playerDetect = new javax.swing.JLabel();
        enemyDetect = new javax.swing.JLabel();
        setting = new javax.swing.JButton();
        enemyHPBar = new javax.swing.JProgressBar();
        playerHPBar = new javax.swing.JProgressBar();
        Scene2 = new javax.swing.JLabel();

        setLayout(null);

        key1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/key1.png"))); // NOI18N
        key1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key1ActionPerformed(evt);
            }
        });
        add(key1);
        key1.setBounds(270, 40, 70, 140);

        key2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/key2.png"))); // NOI18N
        key2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key2ActionPerformed(evt);
            }
        });
        add(key2);
        key2.setBounds(640, 40, 70, 140);

        key3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/key3.png"))); // NOI18N
        key3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key3ActionPerformed(evt);
            }
        });
        add(key3);
        key3.setBounds(150, 210, 140, 70);

        key4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/key4.png"))); // NOI18N
        key4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key4ActionPerformed(evt);
            }
        });
        add(key4);
        key4.setBounds(680, 210, 140, 70);

        top1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/top1.png"))); // NOI18N
        add(top1);
        top1.setBounds(310, 10, 360, 140);

        top2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/top2.png"))); // NOI18N
        add(top2);
        top2.setBounds(310, 40, 370, 110);

        top3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/top3.png"))); // NOI18N
        add(top3);
        top3.setBounds(310, 80, 370, 70);

        top4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/top4.png"))); // NOI18N
        add(top4);
        top4.setBounds(310, 110, 370, 40);

        mid1_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/mid1_L.png"))); // NOI18N
        add(mid1_L);
        mid1_L.setBounds(210, 100, 100, 60);

        mid2_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/mid2_L.png"))); // NOI18N
        add(mid2_L);
        mid2_L.setBounds(210, 140, 50, 70);

        mid3_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/mid3_L.png"))); // NOI18N
        add(mid3_L);
        mid3_L.setBounds(210, 200, 50, 50);

        mid1_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/mid1_R.png"))); // NOI18N
        add(mid1_R);
        mid1_R.setBounds(670, 110, 90, 40);

        mid2_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/mid2_R.png"))); // NOI18N
        add(mid2_R);
        mid2_R.setBounds(710, 140, 50, 70);

        mid3_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/mid3_R.png"))); // NOI18N
        add(mid3_R);
        mid3_R.setBounds(710, 200, 50, 50);

        bottom1_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/bottom1_L.png"))); // NOI18N
        add(bottom1_L);
        bottom1_L.setBounds(250, 200, 110, 50);

        bottom2_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/bottom2_L.png"))); // NOI18N
        add(bottom2_L);
        bottom2_L.setBounds(340, 200, 110, 50);

        bottom_M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/bottom_M.png"))); // NOI18N
        add(bottom_M);
        bottom_M.setBounds(430, 200, 110, 50);

        bottom1_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/bottom1_R.png"))); // NOI18N
        add(bottom1_R);
        bottom1_R.setBounds(620, 200, 110, 50);

        bottom2_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/bottom2_R.png"))); // NOI18N
        add(bottom2_R);
        bottom2_R.setBounds(530, 200, 110, 50);

        playerDetect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/fail.png"))); // NOI18N
        add(playerDetect);
        playerDetect.setBounds(710, 240, 40, 90);

        enemyDetect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/win.png"))); // NOI18N
        add(enemyDetect);
        enemyDetect.setBounds(210, 240, 50, 100);

        setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/setting.png"))); // NOI18N
        setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingActionPerformed(evt);
            }
        });
        add(setting);
        setting.setBounds(880, 10, 57, 70);
        add(enemyHPBar);
        enemyHPBar.setBounds(166, 504, 130, 22);
        add(playerHPBar);
        playerHPBar.setBounds(667, 504, 128, 22);

        Scene2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene2Component/Scene2.jpg"))); // NOI18N
        Scene2.setSize(new java.awt.Dimension(960, 540));
        add(Scene2);
        Scene2.setBounds(0, 0, 960, 540);
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Setting Performed">
    private void settingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingActionPerformed
        // TODO add your handling code here:
        GameManager.pauseGame();
        MainFrame.addScene(9,0);
        MainFrame.setSceneVisible(9,true);
        key1.setEnabled(false);
        key2.setEnabled(false);
        key3.setEnabled(false);
        key4.setEnabled(false);
        Pause.pause(t, keyInterrupt, keytimer);
    }//GEN-LAST:event_settingActionPerformed
// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Key1 Performed">
    private void key1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key1ActionPerformed
        // TODO add your handling code here:
        if(!key1.isEnabled()) return;
        key1Open = !key1Open;
        key1cnt++;
        // <editor-fold defaultstate="collapsed" desc="open key"> 
        if(key1cnt%2==1) {
            Util.moveButton(key1,key1.getX(),key1.getY()-40);
            key1Onprogress = true;
            keytimer[0] = recheckTimerIdx();
            timeCounter[keytimer[0]] = 0;
            t[keytimer[0]] = new Timer(1000, new ActionListener() {
                //@override
                public void actionPerformed(ActionEvent e) {
                    int idx = keytimer[0];
                    if(!key1Open) { keyInterrupt[0] = idx;  t[idx].stop(); return; }
                    if(keyInterrupt[0] != -1) {  idx = keyInterrupt[0]; keyInterrupt[0] = -1; }
                    if(timeCounter[idx]<8) key1OpenPerformed(timeCounter[idx],idx);
                    if(timeCounter[idx]>=2 && !enemyDetect.isVisible() && key3Open) enemyDamage();
                    timeCounter[idx]++;
                }
            });
            t[keytimer[0]].start();
        }
        //</editor-fold>
        // <editor-fold defaultstate="collapsed" desc="close key"> 
        if(key1cnt%2 == 0){
            Util.moveButton(key1, key1.getX(), key1.getY()+40);
            
        }
        //</editor-fold>
        
    }//GEN-LAST:event_key1ActionPerformed

    private void key1OpenPerformed(int timerCounter,int idx){
        if(timerCounter == 0) {
            top1.setVisible(false);
            mid1_L.setVisible(true);
        }
        if(timerCounter == 1){
            top2.setVisible(false);
            mid2_L.setVisible(true);
        }
        if (timerCounter == 2){
            top3.setVisible(false);
            mid3_L.setVisible(true);
        }
        if(timerCounter == 3){
            top4.setVisible(false);
            bottom1_L.setVisible(true);

        }
        if(timerCounter == 4){
            mid1_L.setVisible(false);
            bottom2_L.setVisible(true);

        }
        if(timerCounter == 5){
            mid2_L.setVisible(false);
            bottom_M.setVisible(true);

        }
        if(timerCounter == 6){
            bottom2_R.setVisible(true);

        }
        if(timerCounter == 7){
            bottom1_R.setVisible(true);
            mid3_R.setVisible(true);
            if(!key3Open || !key4Open) { key1Onprogress = false; t[idx].stop(); timeCounter[idx] = 0; }
        }
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Key2 Performed">
    private void key2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key2ActionPerformed
        // TODO add your handling code here:
        if(!key2.isEnabled()) return;
        key2Open = !key2Open;
        key2cnt++;
        // <editor-fold defaultstate="collapsed" desc="open key"> 
        if(key2cnt%2==1) {
            Util.moveButton(key2,key2.getX(),key2.getY()-40);
            key2Onprogress = true;
            keytimer[1] = recheckTimerIdx();
            timeCounter[ keytimer[1]] = 0;
            t[ keytimer[1]] = new Timer(1000, new ActionListener() {
                //@override
                public void actionPerformed(ActionEvent e) {
                    int idx = keytimer[1];
                    if(!key2Open) { keyInterrupt[1] = idx;  t[idx].stop(); return; }
                    if(keyInterrupt[1] != -1) {  idx = keyInterrupt[1]; keyInterrupt[1] = -1; }
                    if(timeCounter[idx]<=7) key2OpenPerformed(timeCounter[idx],idx);
                    if(timeCounter[idx]>=2 && !playerDetect.isVisible() && key4Open) playerDamage();
                    timeCounter[idx]++;
                }
            });
            t[idx].start();
        }
        //</editor-fold>
        // <editor-fold defaultstate="collapsed" desc="close key"> 
        if(key2cnt%2 == 0){
            Util.moveButton(key2, key2.getX(), key2.getY()+40);
            
        }
        //</editor-fold>
    }//GEN-LAST:event_key2ActionPerformed

    private void key2OpenPerformed(int timerCounter,int idx){
        if(timerCounter == 0) {
            top1.setVisible(false);
            mid1_R.setVisible(true);
        }
        if(timerCounter == 1){
            top2.setVisible(false);
            mid2_R.setVisible(true);
        }
        if (timerCounter == 2){
            top3.setVisible(false);
            mid3_R.setVisible(true);
        }
        if(timerCounter == 3){
            top4.setVisible(false);
            bottom1_R.setVisible(true);
        }
        if(timerCounter == 4){
            mid1_R.setVisible(false);
            bottom2_R.setVisible(true);

        }
        if(timerCounter == 5){
            mid2_L.setVisible(false);
            bottom_M.setVisible(true);

        }
        if(timerCounter == 6){
            bottom2_L.setVisible(true);

        }
        if(timerCounter == 7){
            bottom1_L.setVisible(true);
            mid3_L.setVisible(true);
            if(!key3Open || !key4Open) { key2Onprogress = false;t[idx].stop(); timeCounter[idx] = 0; }
        }
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Key3 Performed">
    private void key3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key3ActionPerformed
        // TODO add your handling code here:
        if(!key3.isEnabled()) return;
        key3Open = !key3Open;
        key3cnt++;
        
        if(key3cnt%2 == 1) Util.moveButton(key3, key3.getX()-80, key3.getY());
        else  { Util.moveButton(key3, key3.getX()+80, key3.getY()); stopEnemyDamage();}
        
        if(!key3Open && !mid3_L.isVisible()) return;
        if(!key3.isEnabled()) return;
        if(key1Onprogress) return;
        if(mid3_L.isVisible()){ 
            if(key3cnt%2==1){
                System.out.println("s");
                enemyDamage();
            }
            else{
                stopEnemyDamage();
            }
        }
    }//GEN-LAST:event_key3ActionPerformed
//</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Key4 Performed">
    private void key4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key4ActionPerformed
        // TODO add your handling code here:
        if(!key4.isEnabled()) return;
        key4Open = !key4Open;
        key4cnt++;
        
        if(key4cnt%2 == 1) Util.moveButton(key4, key4.getX()+80, key4.getY());
        else { Util.moveButton(key4, key4.getX()-80, key4.getY()); stopPlayerDamage(); }
        
        if(!key4Open && !mid3_R.isVisible()) return;
        if(!key4.isEnabled()) return;
        if(key2Onprogress) return;
        if(mid3_R.isVisible()){ 
            if(key4cnt%2==1){
                playerDamage();
            }
            else{
                stopPlayerDamage();
            }
        }
        
    }//GEN-LAST:event_key4ActionPerformed
//</editor-fold>
    
    private void enemyDamage(){
        enemyDetect.setVisible(true);
        GameManager.goblinDamaged();
    }
    private void playerDamage(){
        playerDetect.setVisible(true);
        GameManager.playerDamaged();
    }
    private void stopEnemyDamage(){
        enemyDetect.setVisible(false);
        GameManager.stopGoblinDamage();
    }
    private void stopPlayerDamage(){
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

    // <editor-fold defaultstate="collapsed" desc="Generate Variable">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Scene2;
    private javax.swing.JLabel bottom1_L;
    private javax.swing.JLabel bottom1_R;
    private javax.swing.JLabel bottom2_L;
    private javax.swing.JLabel bottom2_R;
    private javax.swing.JLabel bottom_M;
    private javax.swing.JLabel enemyDetect;
    private javax.swing.JProgressBar enemyHPBar;
    private javax.swing.JButton key1;
    private javax.swing.JButton key2;
    private javax.swing.JButton key3;
    private javax.swing.JButton key4;
    private javax.swing.JLabel mid1_L;
    private javax.swing.JLabel mid1_R;
    private javax.swing.JLabel mid2_L;
    private javax.swing.JLabel mid2_R;
    private javax.swing.JLabel mid3_L;
    private javax.swing.JLabel mid3_R;
    private javax.swing.JLabel playerDetect;
    private javax.swing.JProgressBar playerHPBar;
    private javax.swing.JButton setting;
    private javax.swing.JLabel top1;
    private javax.swing.JLabel top2;
    private javax.swing.JLabel top3;
    private javax.swing.JLabel top4;
    // End of variables declaration//GEN-END:variables
}
//</editor-fold>