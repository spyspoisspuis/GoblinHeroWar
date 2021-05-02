/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package goblinherowar.Frame;

import goblinherowar.API.GameManager;
import goblinherowar.API.SceneManager;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author spyspoisspui
 */
public class MainFrame extends javax.swing.JFrame{
    private static MainFrame j = new MainFrame("Hero wars");
    private static ArrayList<Scene> scene = new ArrayList<>();
    private static String[] heroDetect = new String[20];
    private static String[] goblinDetect = new String[20];
    private static ArrayList<ArrayList<JButton>> buttonScene = new ArrayList<>();

    /**
     * Creates new form JFrame
     */
    public MainFrame() {
        initComponents();
        
    }
    public MainFrame(String name){
        super(name);
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="MainFrame Method">
    public static void addScene(int index){
        j.add(scene.get(index));
    }
    public static void addScene(int index,int position){
        j.add(scene.get(index), position);
        if (scene.get(index) instanceof Scene8) {
           Scene8 s = (Scene8) scene.get(index);
            s.timerCountDown();
        }
        scene.get(index).setHPBar();
    }
    
    public static String[] getHeroDetect(){
        return heroDetect;
    }
    
    public static String[] getEnemyDetect(){
        return goblinDetect;
    }

    public static ArrayList<ArrayList<JButton>> getButtonScene(){
        return buttonScene;
    }
    
    public static void setKeyButtonEnabled(boolean set){
        for(int i=0;i<buttonScene.get(SceneManager.currentIdx).size();i++){ //currentIDx
            buttonScene.get(SceneManager.currentIdx).get(i).setEnabled(set);
        }
    }
    
    public static void setKeyButtonVisible(boolean set){
        for(int i=0;i<buttonScene.get(SceneManager.currentIdx).size();i++){ //currentIDx
            buttonScene.get(SceneManager.currentIdx).get(i).setVisible(set);
        }
    }
    
    public static void setSceneVisible(int s,boolean set){
        scene.get(s).setVisible(set);
    }
    
    public static void midResetScene(){

        scene.get(SceneManager.currentIdx).resetScene();
        scene.get(SceneManager.currentIdx).closeAllTimer();
    }
    
    public static void endWinScene(){
        if(scene.get(SceneManager.currentIdx) instanceof Scene8) {
            Scene8 s = (Scene8) scene.get(SceneManager.currentIdx);
            s.stoptimerCountDown();
        }
        addScene(10, 0);
        setSceneVisible(10, true);
        setKeyButtonEnabled(false);
        setKeyButtonVisible(false);
        scene.get(SceneManager.currentIdx).closeAllTimer();
        scene.get(10).getWinScene(GameManager.result);
        GameManager.heroHP = GameManager.goblinHP = 100;
    }
    public static void endLoseScene(){
        if(scene.get(SceneManager.currentIdx) instanceof Scene8) {
            Scene8 s = (Scene8) scene.get(SceneManager.currentIdx);
            s.stoptimerCountDown();
        }
        addScene(10, 0);
        setSceneVisible(10, true);
        setKeyButtonEnabled(false);
        setKeyButtonVisible(false);
        scene.get(SceneManager.currentIdx).closeAllTimer();
        scene.get(10).getLoseScene();
        GameManager.heroHP = GameManager.goblinHP = 100;
    }
    
    public static void setTransparent(int s){
        for(int i=0;i<buttonScene.get(s).size();i++){
            buttonScene.get(s).get(i).setOpaque(false);
            buttonScene.get(s).get(i).setContentAreaFilled(false);
            buttonScene.get(s).get(i).setBorderPainted(false);
        }
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 400, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        
        // <editor-fold defaultstate="collapsed" desc="Create Scene object">
        Home home = new Home();
        Scene1 s1 = new Scene1();
        Scene2 s2 = new Scene2();
        Scene3 s3 = new Scene3();
        Scene4 s4 = new Scene4();
        Scene5 s5 = new Scene5();
        Scene6 s6 = new Scene6();
        Scene7 s7 = new Scene7();
        Scene8 s8 = new Scene8();
        Pause pause = new Pause();
        Result result = new Result();
        //</editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Add to variable">
        scene.add(home);
        scene.add(s1);
        scene.add(s2);
        scene.add(s3);
        scene.add(s4);
        scene.add(s5);
        scene.add(s6);
        scene.add(s7);
        scene.add(s8);
        scene.add(pause);
        scene.add(result);
        
        
       /* heroDetect[1]=s1.getPlayerDetectName();
        heroDetect[2]=s2.getPlayerDetectName();
        heroDetect[3]=s3.getPlayerDetectName();
        heroDetect[4]=s4.getPlayerDetectName();
        heroDetect[5]=s5.getPlayerDetectName();
        heroDetect[6]=s6.getPlayerDetectName();
        heroDetect[7]=s7.getPlayerDetectName();
        heroDetect[10]=s10.getPlayerDetectName();
        */
        
       /* goblinDetect[1]=s1.getEnemyDetectName();
        goblinDetect[2]=s2.getEnemyDetectName();
        goblinDetect[3]=s3.getEnemyDetectName();
        goblinDetect[4]=s4.getEnemyDetectName();
        goblinDetect[5]=s5.getEnemyDetectName();
        goblinDetect[6]=s6.getEnemyDetectName();
        goblinDetect[7]=s7.getEnemyDetectName();
        goblinDetect[10]=s10.getEnemyDetectName();
        */
        
        buttonScene.add(home.getButton());
        buttonScene.add(s1.getButton());
        buttonScene.add(s2.getButton());
        buttonScene.add(s3.getButton());
        buttonScene.add(s4.getButton());
        buttonScene.add(s5.getButton());
        buttonScene.add(s6.getButton());
        buttonScene.add(s7.getButton());
        buttonScene.add(s8.getButton());
        
        //</editor-fold>
        
        j.setSize(960, 560);
        j.setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        j.add(scene.get(0));
        
        pause.setVisible(true);
        pause.setVisible(false);
        result.setVisible(true);
        result.setVisible(false);
        
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

