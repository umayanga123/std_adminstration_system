/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LogonFrame.java
 */
package gui;

import controller.UserHandler;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Umayanga
 */
public class LogonFrame extends javax.swing.JFrame {

    /** Creates new form LogonFrame */
    public LogonFrame() {
        initComponents();
        setLocationRelativeTo(getRootPane());
        setAlwaysOnTop(true);
        setIconImage(new ImageIcon("./img/apple.png").getImage());
        setResizable(false);
        setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        picLabel.setIcon(new ImageIcon("./img/Login.jpg"));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logInButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passText = new javax.swing.JPasswordField();
        picLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log On to stdAdmin");
        setAlwaysOnTop(true);

        logInButton.setText("Log In");
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("User Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Password");

        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 18));
        jLabel3.setText("Login to StdAdmin System");

        passText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel3)
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(logInButton)
                        .addGap(43, 43, 43)
                        .addComponent(cancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passText)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logInButton)
                            .addComponent(cancelButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(picLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed

        try {
            String username = nameText.getText();
            char[] p = passText.getPassword();
            String password = new String(p);
            int handel = UserHandler.validateUser(username, password);
            //System.out.println("han:"+handel);
            if (handel != 0) {
                new MainMenu().setVisible(true);
                dispose();
            }
            if (handel == 0) {
                JOptionPane.showMessageDialog(this, "Incorrect Login Details!");
                passText.transferFocusBackward();
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "please check your connection", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(LogonFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "please check your connection", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(LogonFrame.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_logInButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        int showConfirmDialog = JOptionPane.showConfirmDialog(this, "Are you wont to close the system" ,"massage",JOptionPane.YES_NO_OPTION);
        if(showConfirmDialog==0){
            System.exit(0);
        }else{
            //
        }

    }//GEN-LAST:event_cancelButtonActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        nameText.transferFocus();
    }//GEN-LAST:event_nameTextActionPerformed

    private void passTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTextActionPerformed
        passText.transferFocus();
        try {
            logInButtonActionPerformed(evt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "please check your connection", "Error", ERROR);
        }

    }//GEN-LAST:event_passTextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new LogonFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logInButton;
    private javax.swing.JTextField nameText;
    private javax.swing.JPasswordField passText;
    private javax.swing.JLabel picLabel;
    // End of variables declaration//GEN-END:variables
}
