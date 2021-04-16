/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goblinherowar.Frame;

import goblinherowar.API.GameManager;
import java.awt.Color;

/**
 *
 * @author peeravich.c
 */
public class Result extends Scene {

    /**
     * Creates new form Result
     */
    public Result() {
        initComponents();
        this.setBackground(new Color(0,0,0,50));
        this.setOpaque(false);
        
        greybg.setOpaque(false);
        youWin.setOpaque(false);
        tryAgain.setOpaque(false);
        star1.setOpaque(false);
        star2.setOpaque(false);
        star3.setOpaque(false);
        
        retry.setOpaque(false);
        retry.setContentAreaFilled(false);
        retry.setBorderPainted(false);
        
        next.setOpaque(false);
        next.setContentAreaFilled(false);
        next.setBorderPainted(false);
        
        exit.setOpaque(false);
        exit.setContentAreaFilled(false);
        exit.setBorderPainted(true);
        
        resetScene();
                
    }
    
    public void getWinScene(String r){
        //GameManager.pauseGame();
        youWin.setVisible(true);
        next.setVisible(true);
        if("1 Star".equals(r)){
            star1.setVisible(true);
        }
        else if("2 Stars".equals(r)){
            star1.setVisible(true);
            star2.setVisible(true);
        }
        else{
            star1.setVisible(true);
            star2.setVisible(true);
            star3.setVisible(true);
        }
    }
    
    public void getLoseScene(){
        //GameManager.pauseGame();
        tryAgain.setVisible(true);
        retry.setVisible(true);
    }
    
    public void resetScene(){
        greybg.setVisible(true);
        youWin.setVisible(false);
        tryAgain.setVisible(false);
        star1.setVisible(false);
        star2.setVisible(false);
        star3.setVisible(false);
        retry.setVisible(false);
        next.setVisible(false);
        exit.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        next = new javax.swing.JButton();
        star3 = new javax.swing.JLabel();
        star2 = new javax.swing.JLabel();
        star1 = new javax.swing.JLabel();
        youWin = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        retry = new javax.swing.JButton();
        tryAgain = new javax.swing.JLabel();
        greybg = new javax.swing.JLabel();

        setLayout(null);

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/resultComponent/next.png"))); // NOI18N
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        add(next);
        next.setBounds(360, 340, 270, 90);

        star3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/resultComponent/star.png"))); // NOI18N
        add(star3);
        star3.setBounds(610, 170, 140, 140);

        star2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/resultComponent/star.png"))); // NOI18N
        add(star2);
        star2.setBounds(420, 170, 140, 140);

        star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/resultComponent/star.png"))); // NOI18N
        add(star1);
        star1.setBounds(230, 170, 140, 140);

        youWin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/resultComponent/You win.png"))); // NOI18N
        youWin.setSize(new java.awt.Dimension(244, 54));
        add(youWin);
        youWin.setBounds(370, 50, 244, 54);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/resultComponent/exit.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        add(exit);
        exit.setBounds(360, 430, 270, 90);

        retry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/resultComponent/retry.png"))); // NOI18N
        retry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retryActionPerformed(evt);
            }
        });
        add(retry);
        retry.setBounds(390, 340, 210, 90);

        tryAgain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/resultComponent/Try again.png"))); // NOI18N
        add(tryAgain);
        tryAgain.setBounds(340, 40, 327, 280);

        greybg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/resultComponent/transparentgrey.png"))); // NOI18N
        add(greybg);
        greybg.setBounds(0, 0, 960, 540);
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        MainFrame.setSceneVisible(12, false);
        MainFrame.setSceneVisible(1, false);    //SceneManager.currentIdx
        MainFrame.midResetScene();
        //SceneManager.randomScene
        MainFrame.setSceneVisible(2,true);  //SceneManager.currentIdx
        resetScene();
    }//GEN-LAST:event_nextActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        MainFrame.setSceneVisible(12,false);
        MainFrame.setSceneVisible(1, false); //SceneManager.currentIdx
        MainFrame.midResetScene();
        MainFrame.setSceneVisible(0,true);
        resetScene();
    }//GEN-LAST:event_exitActionPerformed

    private void retryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retryActionPerformed
        // TODO add your handling code here:
        MainFrame.setSceneVisible(12,false);
        MainFrame.midResetScene();
        resetScene();
    }//GEN-LAST:event_retryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel greybg;
    private javax.swing.JButton next;
    private javax.swing.JButton retry;
    private javax.swing.JLabel star1;
    private javax.swing.JLabel star2;
    private javax.swing.JLabel star3;
    private javax.swing.JLabel tryAgain;
    private javax.swing.JLabel youWin;
    // End of variables declaration//GEN-END:variables
}
