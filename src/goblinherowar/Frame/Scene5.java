/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goblinherowar.Frame;

import goblinherowar.API.GameManager;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author peeravich.c
 */
public class Scene5 extends Scene implements GetDetectName{

    /**
     * Creates new form Scene5
     */
    public Scene5() {
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
        top4_L.setVisible(true);
        top1_R.setVisible(true);
        top2_R.setVisible(true);
        top3_R.setVisible(true);
        top4_R.setVisible(false);
        mid1_L.setVisible(false);
        mid2_L.setVisible(false);
        mid3_L.setVisible(false);
        mid1_R.setVisible(false);
        mid2_R.setVisible(false);
        mid3_R.setVisible(false);
        mid1_M.setVisible(false);
        mid2_M.setVisible(false);
        bottom_L.setVisible(false);
        bottom_M.setVisible(false);
        bottom1_R.setVisible(false);
        bottom2_R.setVisible(false);
        enemyDetect.setVisible(false);
        playerDetect.setVisible(false);
        /*
        key1cnt = key2cnt = key3cnt = 0;
        key1Open = key2Open = key3Open = false;
        
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
        top1_L = new javax.swing.JLabel();
        top2_L = new javax.swing.JLabel();
        top3_L = new javax.swing.JLabel();
        top4_L = new javax.swing.JLabel();
        top1_R = new javax.swing.JLabel();
        top2_R = new javax.swing.JLabel();
        top3_R = new javax.swing.JLabel();
        top4_R = new javax.swing.JLabel();
        mid1_L = new javax.swing.JLabel();
        mid2_L = new javax.swing.JLabel();
        mid3_L = new javax.swing.JLabel();
        mid1_R = new javax.swing.JLabel();
        mid2_R = new javax.swing.JLabel();
        mid3_R = new javax.swing.JLabel();
        mid1_M = new javax.swing.JLabel();
        mid2_M = new javax.swing.JLabel();
        bottom_L = new javax.swing.JLabel();
        bottom_M = new javax.swing.JLabel();
        bottom1_R = new javax.swing.JLabel();
        bottom2_R = new javax.swing.JLabel();
        playerDetect = new javax.swing.JLabel();
        enemyDetect = new javax.swing.JLabel();
        setting = new javax.swing.JButton();
        Scene5 = new javax.swing.JLabel();

        setLayout(null);

        key1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/key1.png"))); // NOI18N
        add(key1);
        key1.setBounds(110, 140, 130, 60);

        key2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/key2.png"))); // NOI18N
        add(key2);
        key2.setBounds(680, 90, 130, 60);

        key3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/key3.png"))); // NOI18N
        add(key3);
        key3.setBounds(220, 200, 70, 130);

        key4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/key4.png"))); // NOI18N
        add(key4);
        key4.setBounds(440, 230, 130, 60);

        key5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/key5.png"))); // NOI18N
        add(key5);
        key5.setBounds(710, 180, 130, 60);

        key6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/key6.png"))); // NOI18N
        add(key6);
        key6.setBounds(730, 270, 130, 60);

        top1_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/top1_L.png"))); // NOI18N
        add(top1_L);
        top1_L.setBounds(140, 40, 120, 80);

        top2_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/top2_L.png"))); // NOI18N
        add(top2_L);
        top2_L.setBounds(140, 60, 120, 60);

        top3_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/top3_L.png"))); // NOI18N
        add(top3_L);
        top3_L.setBounds(140, 90, 120, 30);

        top4_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/top4_L.png"))); // NOI18N
        add(top4_L);
        top4_L.setBounds(170, 110, 50, 60);

        top1_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/top1_R.png"))); // NOI18N
        add(top1_R);
        top1_R.setBounds(670, 40, 120, 80);

        top2_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/top2_R.png"))); // NOI18N
        add(top2_R);
        top2_R.setBounds(670, 60, 120, 60);

        top3_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/top3_R.png"))); // NOI18N
        add(top3_R);
        top3_R.setBounds(670, 90, 120, 30);

        top4_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/top4_R.png"))); // NOI18N
        add(top4_R);
        top4_R.setBounds(710, 120, 50, 50);

        mid1_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/mid1_L.png"))); // NOI18N
        add(mid1_L);
        mid1_L.setBounds(180, 160, 110, 50);

        mid2_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/mid2_L.png"))); // NOI18N
        add(mid2_L);
        mid2_L.setBounds(280, 160, 110, 50);

        mid3_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/mid3_L.png"))); // NOI18N
        add(mid3_L);
        mid3_L.setBounds(380, 160, 90, 50);

        mid1_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/mid1_R.png"))); // NOI18N
        add(mid1_R);
        mid1_R.setBounds(710, 160, 110, 50);

        mid2_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/mid2_R.png"))); // NOI18N
        add(mid2_R);
        mid2_R.setBounds(640, 160, 110, 50);

        mid3_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/mid3_R.png"))); // NOI18N
        add(mid3_R);
        mid3_R.setBounds(510, 160, 140, 50);

        mid1_M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/mid1_M.png"))); // NOI18N
        add(mid1_M);
        mid1_M.setBounds(470, 160, 50, 110);

        mid2_M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/mid2_M.png"))); // NOI18N
        add(mid2_M);
        mid2_M.setBounds(760, 200, 60, 70);

        bottom_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/bottom_L.png"))); // NOI18N
        add(bottom_L);
        bottom_L.setBounds(250, 250, 140, 60);

        bottom_M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/bottom_M.png"))); // NOI18N
        add(bottom_M);
        bottom_M.setBounds(380, 250, 220, 60);

        bottom1_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/bottom1_R.png"))); // NOI18N
        add(bottom1_R);
        bottom1_R.setBounds(590, 250, 190, 60);

        bottom2_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/bottom2_R.png"))); // NOI18N
        add(bottom2_R);
        bottom2_R.setBounds(760, 250, 70, 60);

        playerDetect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/fail.png"))); // NOI18N
        add(playerDetect);
        playerDetect.setBounds(760, 300, 60, 80);

        enemyDetect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/win.png"))); // NOI18N
        add(enemyDetect);
        enemyDetect.setBounds(200, 250, 60, 130);

        setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/setting.png"))); // NOI18N
        setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingActionPerformed(evt);
            }
        });
        add(setting);
        setting.setBounds(880, 10, 67, 70);

        Scene5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene5Component/Scene5.jpg"))); // NOI18N
        Scene5.setSize(new java.awt.Dimension(960, 540));
        add(Scene5);
        Scene5.setBounds(0, 0, 960, 540);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Scene5;
    private javax.swing.JLabel bottom1_R;
    private javax.swing.JLabel bottom2_R;
    private javax.swing.JLabel bottom_L;
    private javax.swing.JLabel bottom_M;
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
    private javax.swing.JLabel mid3_R;
    private javax.swing.JLabel playerDetect;
    private javax.swing.JButton setting;
    private javax.swing.JLabel top1_L;
    private javax.swing.JLabel top1_R;
    private javax.swing.JLabel top2_L;
    private javax.swing.JLabel top2_R;
    private javax.swing.JLabel top3_L;
    private javax.swing.JLabel top3_R;
    private javax.swing.JLabel top4_L;
    private javax.swing.JLabel top4_R;
    // End of variables declaration//GEN-END:variables
}
