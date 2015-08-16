/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ClassScreen.java
 *
 */
package gui.classes;

import controller.ClassHandler;
import common.CommonMethods;
import dbtire.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Clases;

/**
 *
 * @author Umayanga
 */
public class ClassScreen extends javax.swing.JFrame {

    String mode = null;
    int res = 0;
    ResultSet rs = null;
    Clases currentcls = null;
    ArrayList<String> tchIds = null;
    String[] teacherIds = null;
    ArrayList<String> grdIds = null;
    String[] gradeIds = null;

    /** Creates new form ClassScreen */
    public ClassScreen() {
        initComponents();
        setLocationRelativeTo(getRootPane());
        setTitle("Students Administration System");
        setIconImage(new ImageIcon("./img/apple.png").getImage());
        setAlwaysOnTop(true);
        setResizable(false);
        setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        try {
            tchIds = CommonMethods.fillComboDesc(clsTeacherComboBox, DBConnection.getDBConnection(), "teacher", "name", "idteacher");
            tchIds = CommonMethods.fillComboDesc(assTeacherComboBox, DBConnection.getDBConnection(), "teacher", "name", "idteacher");
            grdIds = CommonMethods.fillComboDesc(gradeComboBox, DBConnection.getDBConnection(), "grade", "name", "idgrade");
            teacherIds = (String[]) tchIds.toArray(new String[0]);
            gradeIds = (String[]) grdIds.toArray(new String[0]);
            rs = ClassHandler.setNavigationResultSet("class");
            currentcls = ClassHandler.getFirstRecord(rs);
            showDataFields(currentcls);
        } catch (SQLException ex) {
            Logger.getLogger(ClassScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClassScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        clsTeacherComboBox = new javax.swing.JComboBox();
        assTeacherComboBox = new javax.swing.JComboBox();
        nameTextField = new javax.swing.JTextField();
        descTextField = new javax.swing.JTextField();
        locationTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        gradeComboBox = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        lastButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();
        firstButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Class Details");

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Class Details ");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("Class Id");

        jLabel10.setText("Name");

        jLabel11.setText("Description");

        jLabel12.setText("Location");

        jLabel13.setText("Class Teacher");

        jLabel14.setText("Assistant Teacher");

        clsTeacherComboBox.setEnabled(false);

        assTeacherComboBox.setEnabled(false);

        nameTextField.setEnabled(false);

        descTextField.setEnabled(false);

        locationTextField.setEnabled(false);

        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        jLabel15.setText("Grade");

        gradeComboBox.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gradeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(descTextField)
                    .addComponent(nameTextField)
                    .addComponent(assTeacherComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clsTeacherComboBox, 0, 179, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(locationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(clsTeacherComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(assTeacherComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(gradeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lastButton.setText("Last");
        lastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        previousButton.setText("Previous");
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        firstButton.setText("First");
        firstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lastButton, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(firstButton, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(previousButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nextButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(firstButton)
                .addGap(18, 18, 18)
                .addComponent(previousButton)
                .addGap(18, 18, 18)
                .addComponent(nextButton)
                .addGap(18, 18, 18)
                .addComponent(lastButton)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(backButton)
                    .addComponent(editButton)
                    .addComponent(cancelButton)
                    .addComponent(deleteButton)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void disableFields() {
        nameTextField.setEnabled(false);
        descTextField.setEnabled(false);
        locationTextField.setEnabled(false);
        clsTeacherComboBox.setEnabled(false);
        assTeacherComboBox.setEnabled(false);
        gradeComboBox.setEnabled(false);
    }

    private void enableFields() {
        nameTextField.setEnabled(true);
        descTextField.setEnabled(true);
        locationTextField.setEnabled(true);
        clsTeacherComboBox.setEnabled(true);
        assTeacherComboBox.setEnabled(true);
        gradeComboBox.setEnabled(true);
    }

    private void clearFields() {
        idTextField.setText("");
        nameTextField.setText("");
        descTextField.setText("");
        locationTextField.setText("");
        clsTeacherComboBox.setSelectedIndex(0);
        assTeacherComboBox.setSelectedIndex(0);
        gradeComboBox.setSelectedIndex(0);

    }

    private void disableNavigation() {
        firstButton.setEnabled(false);
        nextButton.setEnabled(false);
        previousButton.setEnabled(false);
        lastButton.setEnabled(false);
    }

    private void enableNavigation() {
        firstButton.setEnabled(true);
        nextButton.setEnabled(true);
        previousButton.setEnabled(true);
        lastButton.setEnabled(true);
    }
    private void lastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastButtonActionPerformed
        try {
            currentcls = ClassHandler.getLastRecord(rs);
            showDataFields(currentcls);
        } catch (SQLException ex) {
            Logger.getLogger(ClassScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClassScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_lastButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        try {
            currentcls = ClassHandler.getNextRecord(rs);
            showDataFields(currentcls);
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClassScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_nextButtonActionPerformed

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        try {
            currentcls = ClassHandler.getPreviousRecord(rs);
            showDataFields(currentcls);
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClassScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_previousButtonActionPerformed

    private void firstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstButtonActionPerformed
        try {
            currentcls = ClassHandler.getFirstRecord(rs);
            showDataFields(currentcls);
        } catch (SQLException ex) {
            Logger.getLogger(ClassScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClassScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_firstButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        disableNavigation();
        enableFields();
        editButton.setEnabled(false);
        addButton.setEnabled(false);
        deleteButton.setEnabled(false);
        backButton.setEnabled(false);
        saveButton.setEnabled(true);
        cancelButton.setEnabled(true);
        clearFields();
        mode = "add";
        common.CommonMethods.getNextID(idTextField, "CLS", "idclass", "class");

}//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        disableNavigation();
        enableFields();
        editButton.setEnabled(false);
        addButton.setEnabled(false);
        deleteButton.setEnabled(false);
        backButton.setEnabled(false);
        saveButton.setEnabled(true);
        cancelButton.setEnabled(true);
        mode = "edit";
}//GEN-LAST:event_editButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        editButton.setEnabled(true);
        addButton.setEnabled(true);
        deleteButton.setEnabled(true);
        backButton.setEnabled(true);
        saveButton.setEnabled(false);
        cancelButton.setEnabled(false);
        enableNavigation();
        disableFields();
        Clases cls = new Clases(idTextField.getText(), nameTextField.getText(), descTextField.getText(), locationTextField.getText(), teacherIds[clsTeacherComboBox.getSelectedIndex() - 1], teacherIds[assTeacherComboBox.getSelectedIndex() - 1], gradeIds[gradeComboBox.getSelectedIndex() - 1]);
        String msg = "Record " + idTextField.getText();
        try {
            if (mode.equals("add")) {
                res = ClassHandler.addClass(cls);
                msg += " Added Successfully!";
            }
            if (mode.equals("edit")) {
                res = ClassHandler.updateClass(cls);
                msg += " Updated Successfully!";
            }
            if (res == 1) {
                JOptionPane.showMessageDialog(this, msg);
                rs = ClassHandler.setNavigationResultSet("class");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        clearFields();
}//GEN-LAST:event_saveButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Do you want to delete " + idTextField.getText() + "?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            try {
                ClassHandler.deleteClass(idTextField.getText());
                rs = ClassHandler.setNavigationResultSet("grade");
            } catch (SQLException ex) {
                Logger.getLogger(ClassScreen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ClassScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Clases - " + idTextField.getText() + " Deleted!");
            clearFields();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        editButton.setEnabled(true);
        addButton.setEnabled(true);
        deleteButton.setEnabled(true);
        backButton.setEnabled(true);
        saveButton.setEnabled(false);
        cancelButton.setEnabled(false);
        disableFields();
        enableNavigation();
        clearFields();
        mode = null;
}//GEN-LAST:event_cancelButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
}//GEN-LAST:event_backButtonActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        if (idTextField.getText().length() > 0) {
            try {
                Clases cl = ClassHandler.getClass(idTextField.getText());
                if (cl != null) {
                    showDataFields(cl);
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrect Class - " + idTextField.getText());
                }
            } catch (SQLException ex) {
                Logger.getLogger(ClassScreen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ClassScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_idTextFieldActionPerformed
    private void showDataFields(Clases curCls) {
        if (curCls != null) {
            idTextField.setText(curCls.getIdclass());
            nameTextField.setText(curCls.getName());
            descTextField.setText(curCls.getDescription());
            locationTextField.setText(curCls.getLocation());
            clsTeacherComboBox.setSelectedIndex(tchIds.indexOf(new String(curCls.getClassTeacher())));
            assTeacherComboBox.setSelectedIndex(tchIds.indexOf(new String(curCls.getAssistantTeacher())));
            gradeComboBox.setSelectedIndex(grdIds.indexOf(new String(curCls.getIdgrade())));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ClassScreen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox assTeacherComboBox;
    private javax.swing.JButton backButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox clsTeacherComboBox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField descTextField;
    private javax.swing.JButton editButton;
    private javax.swing.JButton firstButton;
    private javax.swing.JComboBox gradeComboBox;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton lastButton;
    private javax.swing.JTextField locationTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton previousButton;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
