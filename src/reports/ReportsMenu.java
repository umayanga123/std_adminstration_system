/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * test.java
 *
 */
package reports;

import dbtire.DBConnection;
import gui.student.ShowCard;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author user
 */
public class ReportsMenu extends javax.swing.JFrame {

    /** Creates new form test */
    public ReportsMenu() {
        initComponents();
        setTitle("Students Administration System");
        setLocationRelativeTo(getRootPane());
        setIconImage(new ImageIcon("./img/apple.png").getImage());
        setResizable(false);
        setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cardStdButton = new javax.swing.JButton();
        compStdButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reports Menu");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardStdButton.setText("Print Student Identity Card");
        cardStdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardStdButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cardStdButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 320, 40));

        compStdButton.setText("Complete Student List - Class wise");
        compStdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compStdButtonActionPerformed(evt);
            }
        });
        jPanel1.add(compStdButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 320, 39));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 140, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, 395, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void compStdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compStdButtonActionPerformed
        String reportSource = "./jasper/StudentList.jrxml";
        Map<String, Object> param = new HashMap<String, Object>();
        try {
            JasperReport jr = JasperCompileManager.compileReport(reportSource);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, DBConnection.getDBConnection());
            JasperViewer jv = new JasperViewer(jp);
            ReportView rv = new ReportView(this, true, jv);
            rv.setVisible(true);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_compStdButtonActionPerformed

    private void cardStdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardStdButtonActionPerformed
        new ShowCard().setVisible(true);
        dispose();
    }//GEN-LAST:event_cardStdButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                ReportsMenu a = new ReportsMenu();
                a.setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton cardStdButton;
    private javax.swing.JButton compStdButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}