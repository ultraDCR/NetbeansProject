
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author deepbhai
 */
public class RegisterNewStudent extends javax.swing.JFrame {
    private ImageIcon format =null;
    //strin filename
    String filename = null;
    byte[] person_image = null;
    /**
     * Creates new form RegisterNewStudent
     */
    public RegisterNewStudent() {
        initComponents();
        maleFemale();
      
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fNameNewStudent = new javax.swing.JTextField();
        lNameNewStudent = new javax.swing.JTextField();
        maleNewStudent = new javax.swing.JRadioButton();
        femaleNewStudent = new javax.swing.JRadioButton();
        addressNewStudent = new javax.swing.JTextField();
        emailNewStudent = new javax.swing.JTextField();
        phoneNewStudent = new javax.swing.JTextField();
        courseNewStudent = new javax.swing.JComboBox<>();
        semNewStudent = new javax.swing.JComboBox<>();
        btnBackToDashboard = new javax.swing.JButton();
        btnRegisterNewStudentForm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(765, 550));

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("Gender");

        jLabel4.setText("Address");

        jLabel5.setText("Email");

        jLabel6.setText("Phone");

        jLabel7.setText("Course");

        jLabel8.setText("Semester");

        fNameNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameNewStudentActionPerformed(evt);
            }
        });

        lNameNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameNewStudentActionPerformed(evt);
            }
        });

        maleNewStudent.setText("Male");
        maleNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleNewStudentActionPerformed(evt);
            }
        });

        femaleNewStudent.setText("Female");

        addressNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressNewStudentActionPerformed(evt);
            }
        });

        emailNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailNewStudentActionPerformed(evt);
            }
        });

        phoneNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNewStudentActionPerformed(evt);
            }
        });

        courseNewStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSC CSIT", "BBA", "BBS", "+2" }));
        courseNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseNewStudentActionPerformed(evt);
            }
        });

        semNewStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));

        btnBackToDashboard.setText("Back");
        btnBackToDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToDashboardActionPerformed(evt);
            }
        });

        btnRegisterNewStudentForm.setText("Register");
        btnRegisterNewStudentForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterNewStudentFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(jLabel5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneNewStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lNameNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fNameNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(maleNewStudent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(femaleNewStudent))
                            .addComponent(courseNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(semNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 172, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnBackToDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegisterNewStudentForm, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fNameNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNameNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(maleNewStudent)
                    .addComponent(femaleNewStudent))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(courseNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(semNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackToDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegisterNewStudentForm, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fNameNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameNewStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameNewStudentActionPerformed

    private void lNameNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameNewStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameNewStudentActionPerformed

    private void maleNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleNewStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleNewStudentActionPerformed

    private void addressNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressNewStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressNewStudentActionPerformed

    private void emailNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailNewStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailNewStudentActionPerformed

    private void phoneNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNewStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNewStudentActionPerformed
    
    public boolean maleFemale(){
        ButtonGroup bg = new ButtonGroup();
        bg.add(maleNewStudent);
        bg.add(femaleNewStudent);
        
        if(bg.getSelection()==null){
            return true;
        }else{
            return false;
        }
    }
    
    private void btnBackToDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToDashboardActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnBackToDashboardActionPerformed

    private void btnRegisterNewStudentFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterNewStudentFormActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(null, "Are you sure you want to Register?", "Select an option", JOptionPane.WARNING_MESSAGE);
        if(n == JOptionPane.YES_OPTION){
            String fName = fNameNewStudent.getText();
            String lName = lNameNewStudent.getText();
            String address = addressNewStudent.getText();
            String email = emailNewStudent.getText();
            String phone = phoneNewStudent.getText();
            String course = (String)courseNewStudent.getSelectedItem();
            String semester = (String)semNewStudent.getSelectedItem();
            String gender;
            if(maleNewStudent.isSelected()){
                gender = maleNewStudent.getText();
            }else{
                gender = femaleNewStudent.getText();
            }
        
            boolean maleFemalecheck = maleFemale();

            
            if(checkIfValueCorrect(fName, lName, address, email, phone,maleFemalecheck)){
                if(!SignUp.isValidEmailAddress(email)){
                    JOptionPane.showMessageDialog(null, "Enter Valid email address", "Try Again", JOptionPane.ERROR_MESSAGE);
                }else if(SignUp.validPhone(phone)){
                    JOptionPane.showMessageDialog(null, "Enter Valid Phone Number", "Try Again", JOptionPane.ERROR_MESSAGE);
                }else{
                    InsertIntoDatabase insDatabase = new InsertIntoDatabase();
                    insDatabase.insertIntoStudentDatabase(fName,lName,gender,course,semester,address,email,phone);
                    JOptionPane.showMessageDialog(null, "Data Sucessfully Registered", "Sucess", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                }
            }
        }
        
    }//GEN-LAST:event_btnRegisterNewStudentFormActionPerformed

    private void courseNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseNewStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseNewStudentActionPerformed

    
    public boolean checkIfValueCorrect(String fname,String lname,String address,String email,String phone,boolean maleFemale){
        if(fname.equals("")){
            JOptionPane.showMessageDialog(null, "First Name is Empty", "Try Again", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(lname.equals("")){
            JOptionPane.showMessageDialog(null, "Last Name is Empty", "Try Again", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(maleFemale){
            JOptionPane.showMessageDialog(null, "Select Your Gender", "Try Again", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(address.equals("")){
            JOptionPane.showMessageDialog(null, "Address is Empty", "Try Again", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(email.equals("")){
            JOptionPane.showMessageDialog(null, "Email is Empty", "Try Again", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(phone.equals("")){
            JOptionPane.showMessageDialog(null, "Phone is Empty", "Try Again", JOptionPane.ERROR_MESSAGE);
            return false;
        }else{
            return true;
        }
    }
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
            java.util.logging.Logger.getLogger(RegisterNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterNewStudent().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressNewStudent;
    private javax.swing.JButton btnBackToDashboard;
    private javax.swing.JButton btnRegisterNewStudentForm;
    private javax.swing.JComboBox<String> courseNewStudent;
    private javax.swing.JTextField emailNewStudent;
    private javax.swing.JTextField fNameNewStudent;
    private javax.swing.JRadioButton femaleNewStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lNameNewStudent;
    private javax.swing.JRadioButton maleNewStudent;
    private javax.swing.JTextField phoneNewStudent;
    private javax.swing.JComboBox<String> semNewStudent;
    // End of variables declaration//GEN-END:variables
}

