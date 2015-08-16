/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * StudentMenu.java
 */
package gui.student;

import javax.swing.ImageIcon;

/**
 *
 * @author uma
 */
public class StudentMenu extends javax.swing.JFrame {

    /** Creates new form StudentMenu */
    public StudentMenu() {
        initComponents();
        setIconImage(new ImageIcon("./img/apple.png").getImage());
        setResizable(false);
        setLocationRelativeTo(getRootPane());
        setAlwaysOnTop(true);
        setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);

        
        newStudentButton.setIcon(new ImageIcon("./img/new.png"));
        uploadImageButton.setIcon(new ImageIcon("./img/upload.png"));
        searchStudentButton.setIcon(new ImageIcon("./img/Search.png"));


    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        newStudentButton = new javax.swing.JButton();
        uploadImageButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        searchStudentButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Menu");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 0, 24));
        jLabel1.setText("Student Menu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 11, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newStudentButton.setText("Enroll new Student");
        newStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStudentButtonActionPerformed(evt);
            }
        });
        jPanel1.add(newStudentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 90));

        uploadImageButton.setText("Upload Profile Image");
        uploadImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadImageButtonActionPerformed(evt);
            }
        });
        jPanel1.add(uploadImageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 250, 90));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 140, 40));

        searchStudentButton.setText("Search Student");
        searchStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStudentButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchStudentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 250, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 290, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStudentButtonActionPerformed
        new AddStudent().setVisible(true);
        dispose();
    }//GEN-LAST:event_newStudentButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        //  new MainMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void uploadImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadImageButtonActionPerformed
        new UploadImage().setVisible(true);
        dispose();
    }//GEN-LAST:event_uploadImageButtonActionPerformed

    private void searchStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStudentButtonActionPerformed
       new ViewStudent().setVisible(true);
       dispose();
    }//GEN-LAST:event_searchStudentButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new StudentMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton newStudentButton;
    private javax.swing.JButton searchStudentButton;
    private javax.swing.JButton uploadImageButton;
    // End of variables declaration//GEN-END:variables
}
