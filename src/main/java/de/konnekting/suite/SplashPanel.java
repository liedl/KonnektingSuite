/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.konnekting.suite;

import java.awt.Rectangle;

/**
 *
 * @author achristian
 */
public class SplashPanel extends javax.swing.JFrame {

    /**
     * Creates new form SplashPanel
     */
    public SplashPanel() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(400, 300);
        setVisible(true);
    }
    
    public void setProgress(int progress) {
        jProgressBar1.setValue(progress);
        if (progress==100) {
            setVisible(false);
            dispose();
        }
    }
    
    public void setVersionText(String text) {
        jLabel1.setText(text);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 9)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Loading...");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1.setMaximumSize(new java.awt.Dimension(30, 19));
        jLabel1.setMinimumSize(new java.awt.Dimension(30, 19));
        jLabel1.setPreferredSize(new java.awt.Dimension(30, 19));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 270, 380, 20);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(10, 250, 380, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/splash/splash.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 400, 300);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
