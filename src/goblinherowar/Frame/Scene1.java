/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goblinherowar.Frame;

import goblinherowar.API.Util;

/**
 *
 * @author peeravich.c
 */
public class Scene1 extends javax.swing.JPanel {

    /**
     * Creates new form Scene1
     */
    public Scene1() {
        initComponents();
        
        s1Setting.setOpaque(false);
        s1Setting.setContentAreaFilled(false);
        s1Setting.setBorderPainted(false);
        
        s1Key1.setOpaque(false);
        s1Key1.setContentAreaFilled(false);
        s1Key1.setBorderPainted(false);
        
        s1Key2.setOpaque(false);
        s1Key2.setContentAreaFilled(false);
        s1Key2.setBorderPainted(false);
        
        s1Key3.setOpaque(false);
        s1Key3.setContentAreaFilled(false);
        s1Key3.setBorderPainted(false);
        
        //Scene1.super.setVisible(true);
        
    }

    
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
        s1HP = new javax.swing.JLabel();
        s1Setting = new javax.swing.JButton();
        Scene1BG = new javax.swing.JLabel();

        setLayout(null);

        s1Key3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/key3.png"))); // NOI18N
        add(s1Key3);
        s1Key3.setBounds(700, 230, 140, 60);

        s1Key2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/key2.png"))); // NOI18N
        add(s1Key2);
        s1Key2.setBounds(250, 140, 59, 140);

        s1Key1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/key1.png"))); // NOI18N
        s1Key1.setBounds(new java.awt.Rectangle(400, 190, 140, 55));
        s1Key1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s1Key1MouseClicked(evt);
            }
        });
        add(s1Key1);
        s1Key1.setBounds(400, 190, 140, 55);

        s1HP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/hp.png"))); // NOI18N
        add(s1HP);
        s1HP.setBounds(140, 500, 670, 22);

        s1Setting.setBackground(new java.awt.Color(255, 255, 255));
        s1Setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/setting.png"))); // NOI18N
        s1Setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s1SettingMouseClicked(evt);
            }
        });
        add(s1Setting);
        s1Setting.setBounds(880, 10, 67, 70);

        Scene1BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goblinherowar/Frame/Component/Scene1.jpg"))); // NOI18N
        Scene1BG.setSize(new java.awt.Dimension(960, 540));
        add(Scene1BG);
        Scene1BG.setBounds(0, 0, 960, 540);
    }// </editor-fold>//GEN-END:initComponents

    private void s1SettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s1SettingMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_s1SettingMouseClicked

    private void s1Key1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s1Key1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_s1Key1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Scene1BG;
    private javax.swing.JLabel s1HP;
    private javax.swing.JButton s1Key1;
    private javax.swing.JButton s1Key2;
    private javax.swing.JButton s1Key3;
    private javax.swing.JButton s1Setting;
    // End of variables declaration//GEN-END:variables
}