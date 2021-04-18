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
public class Scene6 extends Scene implements GetDetectName{

    /**
     * Creates new form Scene6
     */
    public Scene6() {
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
        Scene6 = new javax.swing.JLabel();

        setLayout(null);

        key1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/key1.png"))); // NOI18N
        add(key1);
        key1.setBounds(280, 100, 130, 60);

        key2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/key2.png"))); // NOI18N
        add(key2);
        key2.setBounds(560, 70, 60, 130);

        key3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/key3.png"))); // NOI18N
        add(key3);
        key3.setBounds(230, 220, 130, 60);

        key4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/key4.png"))); // NOI18N
        add(key4);
        key4.setBounds(620, 250, 130, 60);

        key5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/key5.png"))); // NOI18N
        add(key5);
        key5.setBounds(140, 300, 130, 60);

        key6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/key6.png"))); // NOI18N
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
        setting.setBounds(880, 10, 67, 70);

        Scene6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/scene6Component/Scene6.jpg"))); // NOI18N
        Scene6.setSize(new java.awt.Dimension(960, 540));
        add(Scene6);
        Scene6.setBounds(0, 0, 960, 540);
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
    private javax.swing.JLabel Scene6;
    private javax.swing.JLabel bottom1_L;
    private javax.swing.JLabel bottom1_R;
    private javax.swing.JLabel bottom2_L;
    private javax.swing.JLabel bottom2_R;
    private javax.swing.JLabel enemyDetect;
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
    private javax.swing.JButton setting;
    private javax.swing.JLabel top1;
    private javax.swing.JLabel top2;
    private javax.swing.JLabel top3;
    // End of variables declaration//GEN-END:variables
}
