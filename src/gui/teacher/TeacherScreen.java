/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * StudentMenu.java
 */
package gui.teacher;

import controller.TeacherHandler;
import common.CommonMethods;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Teacher;

/**
 *
 * @author Umayanga
 */
public class TeacherScreen extends javax.swing.JFrame {

    String mode = null;
    int res = 0;
    ResultSet rs = null;
    Teacher currentTch = null;
    
    /** Creates new form StudentMenu */
    public TeacherScreen() {
        initComponents();
        setLocationRelativeTo(getRootPane());
        setAlwaysOnTop(true);
        setResizable(false);
        setDefaultCloseOperation(TeacherScreen.DO_NOTHING_ON_CLOSE);
        setIconImage(new ImageIcon("./img/apple.png").getImage());
        saveButton.setEnabled(false);
        cancelButton.setEnabled(false);
        ButtonGroup group = new ButtonGroup();
        group.add(titleRadioButton1);
        group.add(titleRadioButton2);
        group.add(titleRadioButton3);
        disableFields();
        try {
            rs = TeacherHandler.setNavigationResultSet("teacher");
            currentTch = TeacherHandler.getFirstRecord(rs);
            showDataFields(currentTch);
        } catch (SQLException ex) {
            Logger.getLogger(TeacherScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeacherScreen.class.getName()).log(Level.SEVERE, null, ex);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        addTextField1 = new javax.swing.JTextField();
        addTextField2 = new javax.swing.JTextField();
        cityTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        telTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        mobileTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dobDateChooser = new com.toedter.calendar.JDateChooser();
        joinDateDateChooser = new com.toedter.calendar.JDateChooser();
        statusCheckBox = new javax.swing.JCheckBox();
        titleRadioButton1 = new javax.swing.JRadioButton();
        titleRadioButton2 = new javax.swing.JRadioButton();
        titleRadioButton3 = new javax.swing.JRadioButton();
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
        setTitle("Teacher Details");

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 0, 24));
        jLabel1.setText("Teacher Details");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Teacher ID");

        jLabel3.setText("Title");

        jLabel4.setText("Name");

        jLabel5.setText("DOB");

        jLabel6.setText("Address1");

        jLabel7.setText("Address2");

        nameTextField.setEnabled(false);

        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        addTextField1.setEnabled(false);

        addTextField2.setEnabled(false);

        cityTextField.setEnabled(false);

        jLabel8.setText("City");

        telTextField.setColumns(10);
        telTextField.setEnabled(false);

        jLabel9.setText("Telephone");

        mobileTextField.setEnabled(false);

        jLabel10.setText("Mobile");

        jLabel11.setText("Join Date");

        jLabel12.setText("Status");

        statusCheckBox.setText("Active");

        titleRadioButton1.setText("Ms");

        titleRadioButton2.setText("Mrs");

        titleRadioButton3.setText("Mr");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusCheckBox)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(addTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(mobileTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(telTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(titleRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(titleRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(titleRadioButton3))
                    .addComponent(dobDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(joinDateDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cityTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(titleRadioButton1)
                    .addComponent(titleRadioButton2)
                    .addComponent(titleRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(dobDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(addTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(addTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(telTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(mobileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(joinDateDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(statusCheckBox))
                .addContainerGap(71, Short.MAX_VALUE))
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lastButton, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(firstButton, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(previousButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nextButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addComponent(firstButton)
                .addGap(18, 18, 18)
                .addComponent(previousButton)
                .addGap(18, 18, 18)
                .addComponent(nextButton)
                .addGap(18, 18, 18)
                .addComponent(lastButton)
                .addGap(28, 28, 28))
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
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(editButton)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton)
                    .addComponent(cancelButton)
                    .addComponent(backButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        CommonMethods.getNextID(idTextField, "TCH", "idteacher", "teacher");
    }//GEN-LAST:event_addButtonActionPerformed
    private void disableFields() {
        titleRadioButton1.setEnabled(false);
        titleRadioButton2.setEnabled(false);
        titleRadioButton3.setEnabled(false);
        nameTextField.setEnabled(false);
        dobDateChooser.setEnabled(false);
        addTextField1.setEnabled(false);
        addTextField2.setEnabled(false);
        cityTextField.setEnabled(false);
        telTextField.setEnabled(false);
        mobileTextField.setEnabled(false);
        joinDateDateChooser.setEnabled(false);
        statusCheckBox.setEnabled(false);
    }

    private void enableFields() {
        titleRadioButton1.setEnabled(true);
        titleRadioButton2.setEnabled(true);
        titleRadioButton3.setEnabled(true);
        nameTextField.setEnabled(true);
        dobDateChooser.setEnabled(true);
        addTextField1.setEnabled(true);
        addTextField2.setEnabled(true);
        cityTextField.setEnabled(true);
        telTextField.setEnabled(true);
        mobileTextField.setEnabled(true);
        joinDateDateChooser.setEnabled(true);
        statusCheckBox.setEnabled(true);
    }

    private void clearFields() {
        idTextField.setText("");
        nameTextField.setText("");
        addTextField1.setText("");
        addTextField2.setText("");
        cityTextField.setText("");
        telTextField.setText("");
        mobileTextField.setText("");
        statusCheckBox.setSelected(false);
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
        String title="";
        if (titleRadioButton1.isSelected())
            title=titleRadioButton1.getText();
        if (titleRadioButton2.isSelected())
            title=titleRadioButton2.getText();
        if (titleRadioButton3.isSelected())
            title=titleRadioButton3.getText();
        int status=0;
        if (statusCheckBox.isSelected())
            status=1;
        
        Teacher teacher = new Teacher(idTextField.getText(), title, nameTextField.getText(),CommonMethods.getDbDate(dobDateChooser), addTextField1.getText(),addTextField2.getText(),cityTextField.getText(), telTextField.getText(), mobileTextField.getText(),CommonMethods.getDbDate(joinDateDateChooser),status);
        String msg = "Record " + idTextField.getText();
        try {
            if (mode.equals("add")) {
                res = TeacherHandler.addTeacher(teacher);
                msg += " Added Successfully!";
            }
            if (mode.equals("edit")) {
                res = TeacherHandler.updateTeacher(teacher);
                msg += " Updated Successfully!";
            }
            if (res == 1) {
                JOptionPane.showMessageDialog(this, msg);
                rs = TeacherHandler.setNavigationResultSet("teacher");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        clearFields();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        if (idTextField.getText().length() > 0) {
            try {
                Teacher tch = TeacherHandler.getTeacher(idTextField.getText());
                if (tch != null) {
                    showDataFields(tch);
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrect Techer ID - " + idTextField.getText());
                }
            } catch (SQLException ex) {
                Logger.getLogger(TeacherScreen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TeacherScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Do you want to delete " + idTextField.getText() + "?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            try {
                TeacherHandler.deleteTeacher(idTextField.getText());
                rs = TeacherHandler.setNavigationResultSet("teacher");
            } catch (SQLException ex) {
                Logger.getLogger(TeacherScreen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TeacherScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Teacher - " + idTextField.getText() + " Deleted!");
            clearFields();
        }

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void firstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstButtonActionPerformed
        try {
            currentTch = TeacherHandler.getFirstRecord(rs);
            showDataFields(currentTch);
        } catch (SQLException ex) {
            Logger.getLogger(TeacherScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeacherScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_firstButtonActionPerformed

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
         try {
            currentTch = TeacherHandler.getPreviousRecord(rs);
            showDataFields(currentTch);
        } catch (SQLException ex) {
            Logger.getLogger(TeacherScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeacherScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_previousButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
         try {
            currentTch = TeacherHandler.getNextRecord(rs);
            showDataFields(currentTch);
        } catch (SQLException ex) {
            Logger.getLogger(TeacherScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeacherScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void lastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastButtonActionPerformed
         try {
            currentTch = TeacherHandler.getLastRecord(rs);
            showDataFields(currentTch);
        } catch (SQLException ex) {
            Logger.getLogger(TeacherScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeacherScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lastButtonActionPerformed
    private void showDataFields(Teacher curTch) {
        if (curTch != null) {
            idTextField.setText(curTch.getIdteacher());
            if (curTch.getTitle().equals("Ms"))
                titleRadioButton1.setSelected(true);
            if (curTch.getTitle().equals("Mrs"))
                titleRadioButton2.setSelected(true);
            if (curTch.getTitle().equals("Mr"))
                titleRadioButton3.setSelected(true);
            nameTextField.setText(curTch.getName());
            addTextField1.setText(curTch.getAdd1());
            addTextField2.setText(curTch.getAdd2());
            cityTextField.setText(curTch.getCity());
            telTextField.setText(curTch.getTel());
            mobileTextField.setText(curTch.getMobile());
            try {
                CommonMethods.setDbDate(curTch.getJoiningDate(), joinDateDateChooser);
                CommonMethods.setDbDate(curTch.getDOB(), dobDateChooser);
            } catch (ParseException ex) {
                Logger.getLogger(TeacherScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (curTch.getStatus()==1)
                statusCheckBox.setSelected(true);
            else
                statusCheckBox.setSelected(false);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TeacherScreen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addTextField1;
    private javax.swing.JTextField addTextField2;
    private javax.swing.JButton backButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JButton deleteButton;
    private com.toedter.calendar.JDateChooser dobDateChooser;
    private javax.swing.JButton editButton;
    private javax.swing.JButton firstButton;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private com.toedter.calendar.JDateChooser joinDateDateChooser;
    private javax.swing.JButton lastButton;
    private javax.swing.JTextField mobileTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton previousButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JCheckBox statusCheckBox;
    private javax.swing.JTextField telTextField;
    private javax.swing.JRadioButton titleRadioButton1;
    private javax.swing.JRadioButton titleRadioButton2;
    private javax.swing.JRadioButton titleRadioButton3;
    // End of variables declaration//GEN-END:variables
}
