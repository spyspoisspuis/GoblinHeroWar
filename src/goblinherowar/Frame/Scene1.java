/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goblinherowar.Frame;

// <editor-fold defaultstate="collapsed" desc="Import Zone">    
import goblinherowar.API.Util;
import goblinherowar.API.GameManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.Timer;
//</editor-fold>

/**
 *
 * @author peeravich.c
 */
public class Scene1 extends Scene implements GetDetectName{
    private static int cntEnemy = 0;
    private static int cntPlayer = 0;
    
    private Timer t;
    private int timeCounter;
   
    public Scene1() {
        initComponents();
        
        resetScene();
    } 

    
    // <editor-fold defaultstate="collapsed" desc="Scene Method">
    public String getPlayerDetectName(){
        return s1_PlayerDetect.getName();
    }
    
    public String getEnemyDetectName(){
        return s1_EnemyDetect.getName();
    }
    
    public ArrayList<JButton> getButton(){
        ArrayList<JButton> b = new ArrayList<>();
        b.add(s1Key1);
        b.add(s1Key2);
        b.add(s1Key3);
        return b;
    }
    
    public void resetScene(){
        s1Setting.setOpaque(false);
        s1Setting.setContentAreaFilled(false);
        s1Setting.setBorderPainted(false);
        
        s1Key1.setEnabled(true);
        s1Key2.setEnabled(true);
        s1Key3.setEnabled(true);
        s1Key1.setLocation(400, 190);
        s1Key2.setLocation(250, 140);
        s1Key3.setLocation(700, 230);
        
        s1_top1.setVisible(true);
        s1_top2.setVisible(true);
        s1_top3.setVisible(true);
        s1_top4.setVisible(true);
        s1_mid.setVisible(true);
        s1_bottom1.setVisible(false);
        s1_bottom2.setVisible(false);
        s1_bottom3.setVisible(false);
        s1_bottom4.setVisible(false);
        s1_EnemyDetect.setVisible(false);
        s1_PlayerDetect.setVisible(false);
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

        s1Key3 = new javax.swing.JButton();
        s1Key2 = new javax.swing.JButton();
        s1Key1 = new javax.swing.JButton();
        s1_EnemyDetect = new javax.swing.JLabel();
        s1_PlayerDetect = new javax.swing.JLabel();
        s1_bottom4 = new javax.swing.JLabel();
        s1_bottom3 = new javax.swing.JLabel();
        s1_bottom2 = new javax.swing.JLabel();
        s1_bottom1 = new javax.swing.JLabel();
        s1_mid = new javax.swing.JLabel();
        s1_top4 = new javax.swing.JLabel();
        s1_top3 = new javax.swing.JLabel();
        s1_top2 = new javax.swing.JLabel();
        s1_top1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        s1HP = new javax.swing.JLabel();
        s1Setting = new javax.swing.JButton();
        Scene1BG = new javax.swing.JLabel();

        setSize(new java.awt.Dimension(960, 540));
        setLayout(null);

        s1Key3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/key3.png"))); // NOI18N
        s1Key3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1Key3ActionPerformed(evt);
            }
        });
        add(s1Key3);
        s1Key3.setBounds(700, 230, 140, 60);
        s1Key3.getAccessibleContext().setAccessibleParent(s1Key1);

        s1Key2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/key2.png"))); // NOI18N
        s1Key2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1Key2ActionPerformed(evt);
            }
        });
        add(s1Key2);
        s1Key2.setBounds(250, 140, 59, 140);
        s1Key2.getAccessibleContext().setAccessibleParent(s1Key1);

        s1Key1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/key1.png"))); // NOI18N
        s1Key1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1Key1ActionPerformed(evt);
            }
        });
        add(s1Key1);
        s1Key1.setBounds(400, 190, 140, 55);

        s1_EnemyDetect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/s1_enemy.png"))); // NOI18N
        add(s1_EnemyDetect);
        s1_EnemyDetect.setBounds(190, 220, 150, 130);
        s1_EnemyDetect.getAccessibleContext().setAccessibleParent(s1Key2);

        s1_PlayerDetect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/s1_player.jpg"))); // NOI18N
        add(s1_PlayerDetect);
        s1_PlayerDetect.setBounds(730, 240, 40, 110);
        s1_PlayerDetect.getAccessibleContext().setAccessibleParent(s1Key3);

        s1_bottom4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/s1_bottom4.jpg"))); // NOI18N
        add(s1_bottom4);
        s1_bottom4.setBounds(280, 220, 490, 40);
        s1_bottom4.getAccessibleContext().setAccessibleParent(s1Key1);

        s1_bottom3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/s1_bottom3.jpg"))); // NOI18N
        add(s1_bottom3);
        s1_bottom3.setBounds(270, 220, 410, 40);
        s1_bottom3.getAccessibleContext().setAccessibleParent(s1Key1);

        s1_bottom2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/s1_bottom2.jpg"))); // NOI18N
        add(s1_bottom2);
        s1_bottom2.setBounds(340, 220, 280, 40);
        s1_bottom2.getAccessibleContext().setAccessibleParent(s1Key1);

        s1_bottom1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/s1_bottom1.jpg"))); // NOI18N
        add(s1_bottom1);
        s1_bottom1.setBounds(400, 220, 160, 40);
        s1_bottom1.getAccessibleContext().setAccessibleParent(s1Key1);

        s1_mid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/s1_mid.jpg"))); // NOI18N
        add(s1_mid);
        s1_mid.setBounds(460, 120, 40, 110);

        s1_top4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/s1_top4.jpg"))); // NOI18N
        add(s1_top4);
        s1_top4.setBounds(280, 100, 403, 30);

        s1_top3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/s1_top3.jpg"))); // NOI18N
        add(s1_top3);
        s1_top3.setBounds(280, 80, 403, 50);

        s1_top2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/s1_top2.jpg"))); // NOI18N
        add(s1_top2);
        s1_top2.setBounds(280, 60, 404, 70);

        s1_top1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/s1_top1.jpg"))); // NOI18N
        add(s1_top1);
        s1_top1.setBounds(280, 40, 404, 90);

        jProgressBar1.setBackground(new java.awt.Color(255, 0, 51));
        add(jProgressBar1);
        jProgressBar1.setBounds(680, 500, 130, 20);

        jProgressBar2.setBackground(new java.awt.Color(255, 0, 0));
        add(jProgressBar2);
        jProgressBar2.setBounds(140, 500, 130, 20);

        s1HP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/hp.png"))); // NOI18N
        add(s1HP);
        s1HP.setBounds(140, 500, 670, 22);

        s1Setting.setBackground(new java.awt.Color(255, 255, 255));
        s1Setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/setting.png"))); // NOI18N
        s1Setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1SettingActionPerformed(evt);
            }
        });
        add(s1Setting);
        s1Setting.setBounds(880, 10, 67, 70);

        Scene1BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/Scene1.jpg"))); // NOI18N
        Scene1BG.setSize(new java.awt.Dimension(960, 540));
        add(Scene1BG);
        Scene1BG.setBounds(0, 0, 960, 540);
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Setting Clicked">
    private void s1SettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1SettingActionPerformed
        // TODO add your handling code here:
        //############################ DetectedStopDamage
        MainFrame.addScene(11,0);
        MainFrame.setSceneVisible(11,true);
        s1Key1.setEnabled(false);
        s1Key2.setEnabled(false);
        s1Key3.setEnabled(false);
    }//GEN-LAST:event_s1SettingActionPerformed
//</editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Key1 Clicked">
    private void s1Key1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1Key1ActionPerformed
        // TODO add your handling code here:
        if(s1Key1.isEnabled()==false) return;
        Util.moveButton(s1Key1, 320, 190);
        
        timeCounter =0;
        t = new Timer(1000,new ActionListener(){
        //@override
        public void actionPerformed(ActionEvent e) {
            switch (timeCounter) {
                case 0:
                    s1_top1.setVisible(false);
                    s1_bottom1.setVisible(true);
                    break;
                case 1:
                    s1_top2.setVisible(false);
                    s1_bottom2.setVisible(true);
                    break;
                case 2:
                    s1_top3.setVisible(false);
                    s1_bottom3.setVisible(true);
                    break;
            // หยุดที่วินาทีที่3
                case 3:
                    s1_top4.setVisible(false);
                    s1_bottom4.setVisible(true);
                    t.stop();
                    break;
                default:
                    break;
            }
            timeCounter++;
        }
        });
        t.start();
    }//GEN-LAST:event_s1Key1ActionPerformed
//</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Key2 Clicked"> 
    private void s1Key2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1Key2ActionPerformed
        // TODO add your handling code here:
        if(s1Key2.isEnabled()==false) return;
        if(s1_bottom4.isVisible()==true){
            s1_mid.setVisible(false);  
            if(cntEnemy%2==0){
                Util.moveButton(s1Key2, 250, 90);
                s1_EnemyDetect.setVisible(true);
                //GameManager.goblinDamaged(this.getEnemyDetectName(), s1EnemyHPBar);
                cntEnemy++;
            }
            else{
                Util.moveButton(s1Key2, 250, 140);
                s1_EnemyDetect.setVisible(false);
                cntEnemy++;
            }
        }
        
    }//GEN-LAST:event_s1Key2ActionPerformed
//</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Key3 Clicked">    
    private void s1Key3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1Key3ActionPerformed
        // TODO add your handling code here:
        if(s1Key3.isEnabled()==false) return;
        if(s1_bottom4.isVisible()==true){
            s1_mid.setVisible(false);  
            if(cntPlayer%2==0){
                Util.moveButton(s1Key3, 780, 230);
                s1_PlayerDetect.setVisible(true);
                //GameManager.playerDamaged(this.getPlayerDetectName(), s1PlayerHPBar);
                cntPlayer++;
            }
            else{
                Util.moveButton(s1Key3, 700, 230);
                s1_PlayerDetect.setVisible(false);
                cntPlayer++;
            }
        }
    }//GEN-LAST:event_s1Key3ActionPerformed
//</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Generated Variable">    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Scene1BG;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JLabel s1HP;
    private javax.swing.JButton s1Key1;
    private javax.swing.JButton s1Key2;
    private javax.swing.JButton s1Key3;
    private javax.swing.JButton s1Setting;
    private javax.swing.JLabel s1_EnemyDetect;
    private javax.swing.JLabel s1_PlayerDetect;
    private javax.swing.JLabel s1_bottom1;
    private javax.swing.JLabel s1_bottom2;
    private javax.swing.JLabel s1_bottom3;
    private javax.swing.JLabel s1_bottom4;
    private javax.swing.JLabel s1_mid;
    private javax.swing.JLabel s1_top1;
    private javax.swing.JLabel s1_top2;
    private javax.swing.JLabel s1_top3;
    private javax.swing.JLabel s1_top4;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
    
}
