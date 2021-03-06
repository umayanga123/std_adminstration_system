/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainMenu.java
 *
 */
package gui;

import controller.UserHandler;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import reports.ReportsMenu;
import gui.student.StudentMenu;
import gui.classes.ClassScreen;
import gui.grade.GradeScreen;
import gui.teacher.TeacherScreen;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**Payment
 *
 * @author Umayanga
 */
public class MainMenu extends javax.swing.JFrame {

    Font ftNornal = new Font("System", Font.BOLD, 24);
    Font ftOther = new Font("Calibri", 1, 14);
    int myHandel = 1;

    /** Creates new form MainMenu */
    public MainMenu() {

        int Width = (int) java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        int Height = (int) java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        this.setSize(Width - 100, Height - 45);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        initComponents();


        setLocationRelativeTo(null);
        setTitle("Students Administration System");
        setIconImage(new ImageIcon("./img/apple.png").getImage());

        setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        makeButtonGui();
        buttonSettings();


        try {
            if (UserHandler.getUserHandel() == 2) {
                teacherButton.setEnabled(false);
                gradeButton.setEnabled(false);
                classButton.setEnabled(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void buttonSettings() {
        studentButton.setMnemonic(KeyEvent.VK_S);
        teacherButton.setMnemonic(KeyEvent.VK_T);
        gradeButton.setMnemonic(KeyEvent.VK_G);
        classButton.setMnemonic(KeyEvent.VK_C);
        reportsButton.setMnemonic(KeyEvent.VK_R);
        settingsButton.setMnemonic(KeyEvent.VK_E);
        exitButton.setMnemonic(KeyEvent.VK_X);
        reportsButton.setMnemonic(KeyEvent.VK_R);

        studentButton.setFont(ftNornal);
        gradeButton.setFont(ftNornal);
        reportsButton.setFont(ftNornal);
        classButton.setFont(ftNornal);
        settingsButton.setFont(ftNornal);
        teacherButton.setFont(ftNornal);
        exitButton.setFont(ftNornal);
        teacherButton.setIcon(new ImageIcon("./img/teacher.png"));
        studentButton.setIcon(new ImageIcon("./img/student.png"));
        classButton.setIcon(new ImageIcon("./img/class.png"));
        gradeButton.setIcon(new ImageIcon("./img/grade.png"));
        reportsButton.setIcon(new ImageIcon("./img/reports.png"));
        settingsButton.setIcon(new ImageIcon("./img/settings.png"));




    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        homeSeparatorOne = new javax.swing.JSeparator();
        buttonPanel = new javax.swing.JPanel();
        studentButton = new javax.swing.JButton();
        teacherButton = new javax.swing.JButton();
        classButton = new javax.swing.JButton();
        gradeButton = new javax.swing.JButton();
        reportsButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        sidePanal = new javax.swing.JPanel();
        settingsButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        switchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Administration System");

        welcomeLabel.setFont(new java.awt.Font("Arial", 3, 48));
        welcomeLabel.setForeground(new java.awt.Color(8, 8, 140));
        welcomeLabel.setText("Welcome  Student Adminstration System ");
        welcomeLabel.setAlignmentY(0.0F);
        welcomeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        buttonPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buttonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentButton.setFont(new java.awt.Font("Tahoma", 1, 24));
        studentButton.setText("Student Page");
        studentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studentButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studentButtonMouseExited(evt);
            }
        });
        studentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(studentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 320, 130));

        teacherButton.setFont(new java.awt.Font("Tahoma", 1, 24));
        teacherButton.setText("Teacher Page");
        teacherButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                teacherButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                teacherButtonMouseExited(evt);
            }
        });
        teacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(teacherButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 330, 133));

        classButton.setFont(new java.awt.Font("Tahoma", 1, 24));
        classButton.setText("Class Page");
        classButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                classButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                classButtonMouseExited(evt);
            }
        });
        classButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(classButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 320, 132));

        gradeButton.setFont(new java.awt.Font("Tahoma", 1, 24));
        gradeButton.setText("Grade Page");
        gradeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gradeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gradeButtonMouseExited(evt);
            }
        });
        gradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(gradeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 330, 135));

        reportsButton.setFont(new java.awt.Font("Tahoma", 1, 24));
        reportsButton.setText("Reports Page");
        reportsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportsButtonMouseExited(evt);
            }
        });
        reportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(reportsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 350, 140));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        sidePanal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sidePanal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsButtonMouseExited(evt);
            }
        });
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });
        sidePanal.add(settingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 110, 100));

        exitButton.setIcon(new javax.swing.ImageIcon("F:\\Working Directory\\UCSC\\java\\Final Project - Andrew - 763052222V\\Net Beans\\StdAdmin\\img\\exit (2).png")); // NOI18N
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
        });
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        sidePanal.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 50, 50));

        switchButton.setIcon(new javax.swing.ImageIcon("F:\\Working Directory\\UCSC\\java\\Final Project - Andrew - 763052222V\\Net Beans\\StdAdmin\\img\\Changer-d'utilisateur.png")); // NOI18N
        switchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                switchButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                switchButtonMouseExited(evt);
            }
        });
        switchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchButtonActionPerformed(evt);
            }
        });
        sidePanal.add(switchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(sidePanal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(homeSeparatorOne, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(880, 880, 880)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(welcomeLabel)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(sidePanal, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(homeSeparatorOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Do you want to exit ? ", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            System.exit(0);
        }


    }//GEN-LAST:event_exitButtonActionPerformed

    private void teacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherButtonActionPerformed
        new TeacherScreen().setVisible(true);
    }//GEN-LAST:event_teacherButtonActionPerformed

    private void studentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentButtonActionPerformed
        new StudentMenu().setVisible(true);
    }//GEN-LAST:event_studentButtonActionPerformed

    private void gradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeButtonActionPerformed
        new GradeScreen().setVisible(true);
    }//GEN-LAST:event_gradeButtonActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        new SettingsMenu().setVisible(true);
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void classButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classButtonActionPerformed
        new ClassScreen().setVisible(true);
}//GEN-LAST:event_classButtonActionPerformed

    private void reportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsButtonActionPerformed
        new ReportsMenu().setVisible(true);
    }//GEN-LAST:event_reportsButtonActionPerformed

    private void teacherButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherButtonMouseEntered
        teacherButton.setFont(ftOther);
    }//GEN-LAST:event_teacherButtonMouseEntered

    private void teacherButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherButtonMouseExited

        teacherButton.setFont(ftNornal);
    }//GEN-LAST:event_teacherButtonMouseExited

    private void classButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classButtonMouseEntered
        classButton.setFont(ftOther);
    }//GEN-LAST:event_classButtonMouseEntered

    private void classButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classButtonMouseExited
        classButton.setFont(ftNornal);
    }//GEN-LAST:event_classButtonMouseExited

    private void studentButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentButtonMouseEntered
        studentButton.setFont(ftOther);
    }//GEN-LAST:event_studentButtonMouseEntered

    private void studentButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentButtonMouseExited
        studentButton.setFont(ftNornal);
    }//GEN-LAST:event_studentButtonMouseExited

    private void gradeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradeButtonMouseEntered
        gradeButton.setFont(ftOther);
    }//GEN-LAST:event_gradeButtonMouseEntered

    private void gradeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradeButtonMouseExited
        gradeButton.setFont(ftNornal);
    }//GEN-LAST:event_gradeButtonMouseExited

    private void reportsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsButtonMouseEntered
        reportsButton.setFont(ftOther);
    }//GEN-LAST:event_reportsButtonMouseEntered

    private void reportsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsButtonMouseExited
        reportsButton.setFont(ftNornal);
    }//GEN-LAST:event_reportsButtonMouseExited

    private void settingsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseEntered
        settingsButton.setFont(ftOther);
    }//GEN-LAST:event_settingsButtonMouseEntered

    private void settingsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseExited
        settingsButton.setFont(ftNornal);
    }//GEN-LAST:event_settingsButtonMouseExited

    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
        exitButton.setFont(ftOther);
    }//GEN-LAST:event_exitButtonMouseEntered

    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
        exitButton.setFont(ftNornal);
    }//GEN-LAST:event_exitButtonMouseExited

    private void switchButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_switchButtonMouseEntered

    private void switchButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_switchButtonMouseExited

    private void switchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Do you want to exit ? ", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            new LogonFrame().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_switchButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton classButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton gradeButton;
    private javax.swing.JSeparator homeSeparatorOne;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton reportsButton;
    private javax.swing.JButton settingsButton;
    private javax.swing.JPanel sidePanal;
    private javax.swing.JButton studentButton;
    private javax.swing.JButton switchButton;
    private javax.swing.JButton teacherButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables

    private void makeButtonGui() {
        studentButton.setBorderPainted(false);
        studentButton.setFocusPainted(false);
        studentButton.setContentAreaFilled(false);

        teacherButton.setBorderPainted(false);
        teacherButton.setFocusPainted(false);
        teacherButton.setContentAreaFilled(false);

        classButton.setBorderPainted(false);
        classButton.setFocusPainted(false);
        classButton.setContentAreaFilled(false);

        gradeButton.setBorderPainted(false);
        gradeButton.setFocusPainted(false);
        gradeButton.setContentAreaFilled(false);

        reportsButton.setBorderPainted(false);
        reportsButton.setFocusPainted(false);
        reportsButton.setContentAreaFilled(false);


        switchButton.setBorderPainted(false);
        switchButton.setFocusPainted(false);
        switchButton.setContentAreaFilled(false);

        exitButton.setBorderPainted(false);
        exitButton.setFocusPainted(false);
        exitButton.setContentAreaFilled(false);

        settingsButton.setBorderPainted(false);
        settingsButton.setFocusPainted(false);
        settingsButton.setContentAreaFilled(false);


    }
}
