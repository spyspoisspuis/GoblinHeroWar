/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goblinherowar.Frame;

import goblinherowar.API.GameManager;
import goblinherowar.API.Util;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author peeravich.c
 */
public class Scene10 extends Scene {

    /**
     * Creates new form Scene10
     */
    public Scene10() {
        initComponents();
        
        resetScene();
        //GameManager.setGoblinBar(s1EnemyHPBar);
        //GameManager.setPlayerBar(s1PlayerHPBar);
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
        Util.moveButton(key1, key1.getX(), key1.getY());
        Util.moveButton(key2, key2.getX(), key2.getY());
        Util.moveButton(key3, key3.getX(), key3.getY());
        Util.moveButton(key4, key4.getX(), key4.getY());
        Util.moveButton(key5, key5.getX(), key5.getY());
        Util.moveButton(key6, key6.getX(), key6.getY());
        
        top1.setVisible(true);
        top2.setVisible(true);
        top3.setVisible(true);
        mid1_L.setVisible(false);
        mid2_L.setVisible(false);
        mid3_L.setVisible(false);
        mid1_R.setVisible(false);
        mid2_R.setVisible(false);
        mid1_M.setVisible(false);
        mid2_M.setVisible(false);
        mid3_M.setVisible(false);
        bottom1_L.setVisible(false);
        bottom1_R.setVisible(false);
        bottom2_R.setVisible(false);
        bucket_L.setVisible(false);
        bucket_R.setVisible(false);
        enemyDetect.setVisible(false);
        playerDetect.setVisible(false);
        
        /*
        key1cnt = key2cnt = key3cnt = key4cnt = 0;
        key1Open = key2Open = key3Open = key4Open = false;
        key1Interrupt = key2Interrupt = key3Interrupt = key4Interrupt = -1;
        
        enemyHPBar.setForeground(Color.red);
        enemyHPBar.setValue(GameManager.goblinHP);
        playerHPBar.setForeground(Color.red);
        playerHPBar.setValue(GameManager.heroHP);
        */
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
        mid1_M = new javax.swing.JLabel();
        mid2_M = new javax.swing.JLabel();
        mid3_M = new javax.swing.JLabel();
        mid1_R = new javax.swing.JLabel();
        mid2_R = new javax.swing.JLabel();
        mid1_L = new javax.swing.JLabel();
        mid2_L = new javax.swing.JLabel();
        mid3_L = new javax.swing.JLabel();
        bottom1_L = new javax.swing.JLabel();
        bottom1_R = new javax.swing.JLabel();
        bottom2_R = new javax.swing.JLabel();
        enemyDetect = new javax.swing.JLabel();
        playerDetect = new javax.swing.JLabel();
        bucket_L = new javax.swing.JLabel();
        bucket_R = new javax.swing.JLabel();
        setting = new javax.swing.JButton();
        timer = new javax.swing.JTextField();
        Scene10 = new javax.swing.JLabel();

        setLayout(null);

        key1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/key1.png"))); // NOI18N
        key1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key1ActionPerformed(evt);
            }
        });
        add(key1);
        key1.setBounds(540, 80, 130, 60);

        key2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/key2.png"))); // NOI18N
        key2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key2ActionPerformed(evt);
            }
        });
        add(key2);
        key2.setBounds(410, 80, 60, 130);

        key3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/key3.png"))); // NOI18N
        key3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key3ActionPerformed(evt);
            }
        });
        add(key3);
        key3.setBounds(370, 220, 130, 60);

        key4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/key4.png"))); // NOI18N
        key4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key4ActionPerformed(evt);
            }
        });
        add(key4);
        key4.setBounds(280, 210, 60, 130);

        key5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/key5.png"))); // NOI18N
        key5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key5ActionPerformed(evt);
            }
        });
        add(key5);
        key5.setBounds(370, 290, 130, 60);

        key6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/key6.png"))); // NOI18N
        key6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key6ActionPerformed(evt);
            }
        });
        add(key6);
        key6.setBounds(720, 210, 60, 130);

        top1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/top1.png"))); // NOI18N
        add(top1);
        top1.setBounds(420, 30, 330, 80);

        top2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/top2.png"))); // NOI18N
        add(top2);
        top2.setBounds(420, 50, 330, 60);

        top3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/top3.png"))); // NOI18N
        add(top3);
        top3.setBounds(420, 80, 330, 30);

        mid1_M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/mid1_M.png"))); // NOI18N
        add(mid1_M);
        mid1_M.setBounds(400, 160, 50, 92);

        mid2_M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/mid2_M.png"))); // NOI18N
        add(mid2_M);
        mid2_M.setBounds(400, 250, 50, 70);

        mid3_M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/mid3_M.png"))); // NOI18N
        add(mid3_M);
        mid3_M.setBounds(400, 320, 50, 140);

        mid1_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/mid1_R.png"))); // NOI18N
        add(mid1_R);
        mid1_R.setBounds(560, 110, 40, 80);

        mid2_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/mid2_R.png"))); // NOI18N
        add(mid2_R);
        mid2_R.setBounds(440, 160, 130, 30);

        mid1_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/mid1_L.png"))); // NOI18N
        add(mid1_L);
        mid1_L.setBounds(240, 210, 170, 40);

        mid2_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/mid2_L.png"))); // NOI18N
        add(mid2_L);
        mid2_L.setBounds(80, 210, 170, 40);

        mid3_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/mid3_L.png"))); // NOI18N
        add(mid3_L);
        mid3_L.setBounds(80, 240, 40, 210);

        bottom1_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/bottom1_L.png"))); // NOI18N
        add(bottom1_L);
        bottom1_L.setBounds(310, 290, 100, 30);

        bottom1_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/bottom1_R.png"))); // NOI18N
        add(bottom1_R);
        bottom1_R.setBounds(440, 290, 170, 30);

        bottom2_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/bottom2_R.png"))); // NOI18N
        add(bottom2_R);
        bottom2_R.setBounds(600, 290, 150, 30);

        enemyDetect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/win.png"))); // NOI18N
        add(enemyDetect);
        enemyDetect.setBounds(270, 290, 50, 100);

        playerDetect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/fail.png"))); // NOI18N
        add(playerDetect);
        playerDetect.setBounds(750, 290, 50, 100);

        bucket_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/bucket_L.png"))); // NOI18N
        add(bucket_L);
        bucket_L.setBounds(30, 440, 130, 60);

        bucket_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/bucket_R.png"))); // NOI18N
        add(bucket_R);
        bucket_R.setBounds(390, 440, 130, 60);

        setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/setting.png"))); // NOI18N
        setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingActionPerformed(evt);
            }
        });
        add(setting);
        setting.setBounds(870, 20, 67, 70);

        timer.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        timer.setForeground(new java.awt.Color(255, 102, 0));
        timer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        timer.setText("20");
        add(timer);
        timer.setBounds(30, 80, 50, 50);

        Scene10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene10Component/Scene10.jpg"))); // NOI18N
        Scene10.setSize(new java.awt.Dimension(960, 540));
        add(Scene10);
        Scene10.setBounds(0, 0, 960, 540);
    }// </editor-fold>//GEN-END:initComponents

    private void settingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingActionPerformed
        // TODO add your handling code here:
        GameManager.pauseGame();
        MainFrame.addScene(11,0);
        MainFrame.setSceneVisible(11,true);
        key1.setEnabled(false);
        key2.setEnabled(false);
        key3.setEnabled(false);
        key4.setEnabled(false);
        key5.setEnabled(false);
        key6.setEnabled(false);
    }//GEN-LAST:event_settingActionPerformed

    private void key1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key1ActionPerformed
        // TODO add your handling code here:
        if(!key1.isEnabled()) return ;
        key1Open = !key1Open;
        key1cnt++;
        
    }//GEN-LAST:event_key1ActionPerformed

    private void key2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key2ActionPerformed
        // TODO add your handling code here:
        if(!key2.isEnabled()) return ;
        key2Open = !key2Open;
        key2cnt++;
    }//GEN-LAST:event_key2ActionPerformed

    private void key3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key3ActionPerformed
        // TODO add your handling code here:
        if(!key3.isEnabled()) return ;
        key3Open = !key3Open;
        key3cnt++;
    }//GEN-LAST:event_key3ActionPerformed

    private void key4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key4ActionPerformed
        // TODO add your handling code here:
        if(!key4.isEnabled()) return ;
        key4Open = !key4Open;
        key4cnt++;
    }//GEN-LAST:event_key4ActionPerformed

    private void key5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key5ActionPerformed
        // TODO add your handling code here:
        if(!key5.isEnabled()) return ;
        key5Open = !key5Open;
        key5cnt++;
    }//GEN-LAST:event_key5ActionPerformed

    private void key6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key6ActionPerformed
        // TODO add your handling code here:
        if(!key6.isEnabled()) return ;
        key6Open = !key6Open;
        key6cnt++;
    }//GEN-LAST:event_key6ActionPerformed

    
    private int recheckTimerIdx(){
        if (idx == timeCounter.length-1) idx = 0;
        else idx+=1;
        return idx;
    }

    // <editor-fold defaultstate="collapsed" desc="Generate Variable">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Scene10;
    private javax.swing.JLabel bottom1_L;
    private javax.swing.JLabel bottom1_R;
    private javax.swing.JLabel bottom2_R;
    private javax.swing.JLabel bucket_L;
    private javax.swing.JLabel bucket_R;
    private javax.swing.JLabel enemyDetect;
    private javax.swing.JButton key1;
    private javax.swing.JButton key2;
    private javax.swing.JButton key3;
    private javax.swing.JButton key4;
    private javax.swing.JButton key5;
    private javax.swing.JButton key6;
    private javax.swing.JLabel mid1_L;
    private javax.swing.JLabel mid1_M;
    private javax.swing.JLabel mid1_R;
    private javax.swing.JLabel mid2_L;
    private javax.swing.JLabel mid2_M;
    private javax.swing.JLabel mid2_R;
    private javax.swing.JLabel mid3_L;
    private javax.swing.JLabel mid3_M;
    private javax.swing.JLabel playerDetect;
    private javax.swing.JButton setting;
    private javax.swing.JTextField timer;
    private javax.swing.JLabel top1;
    private javax.swing.JLabel top2;
    private javax.swing.JLabel top3;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}
