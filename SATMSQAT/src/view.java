
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohit_motiani
 */
public class view extends javax.swing.JFrame {

   public void setController(controller Controller){
       this.Controller=Controller;
   }
   
   String str = "";
    public void screen1(){
        currentScreen="screen1";
        passwordInput.setVisible(false);
        textInputLabel.setText("Welcome to ATM. Please enter your PAN(in digits)");
        buttonSubmit.setText("Submit");
        textInput.setText("");
//        buttonWithdrawal.setText("Withdrawal");
//        buttonDeposit.setText("Deposit");
        buttonWithdrawal.setVisible(false);
        buttonDeposit.setVisible(false);
        //jTextField3.setText("Please enter you PAN");
        //jTextField2.setText("Press button to Start!");
//        jTextField5.setText("SUBMIT");
        //buttonSubmit.setText("Submit");
        buttonDigit1.setEnabled(true);
        buttonDigit2.setEnabled(true);
        buttonDigit3.setEnabled(true);
        buttonDigit4.setEnabled(true);
        buttonDigit5.setEnabled(true);
        buttonDigit6.setEnabled(true);
        buttonDigit7.setEnabled(true);
        buttonDigit8.setEnabled(true);
        buttonDigit9.setEnabled(true);
        buttonDigit0.setEnabled(true);
        buttonCancel.setEnabled(true);
//        jButton12.setEnabled(true);
//        jButton13.setEnabled(false);
//        jButton14.setEnabled(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);    
        jButton14.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(true);
        jTextField6.setVisible(false);
        jTextField10.setVisible(false);
        jTextField8.setVisible(true);
        jTextField9.setVisible(true);
    }
    
    public void screen2(){
        currentScreen="screen2";
        buttonSubmit.setText("Submit");
        
        textInput.setVisible(false);
        passwordInput.setVisible(true);
        passwordInput.setText("");
          buttonWithdrawal.setVisible(false);
        buttonDeposit.setVisible(false);
        buttonDigit1.setEnabled(true);
        buttonDigit2.setEnabled(true);
        buttonDigit3.setEnabled(true);
        buttonDigit4.setEnabled(true);
        buttonDigit5.setEnabled(true);
        buttonDigit6.setEnabled(true);
        buttonDigit7.setEnabled(true);
        buttonDigit8.setEnabled(true);
        buttonDigit9.setEnabled(true);
        buttonDigit0.setEnabled(true);
        buttonCancel.setEnabled(true);
//        jButton12.setEnabled(true);
//        jButton13.setEnabled(false);
//        jButton14.setEnabled(false);  
        jButton12.setVisible(false);
        jButton13.setVisible(false);    
        jButton14.setVisible(false);
        textInputLabel.setText("Enter your PIN(in digits)");
        jLabel1.setVisible(false);
        jTextField6.setVisible(false);
    }
    
    public void screen3(){
        currentScreen="screen3";
        passwordInput.setVisible(false);
        textInputLabel.setText("");
        buttonSubmit.setText("");
        textInput.setText("");
        buttonWithdrawal.setText("");
        buttonDeposit.setText("");
        textInputLabel.setText("Invalid Pin! Please Enter Again");
       // jTextField2.setText("");
        buttonDeposit.setText("SUBMIT");
        buttonDigit1.setEnabled(true);
        buttonDigit2.setEnabled(true);
        buttonDigit3.setEnabled(true);
        buttonDigit4.setEnabled(true);
        buttonDigit5.setEnabled(true);
        buttonDigit6.setEnabled(true);
        buttonDigit7.setEnabled(true);
        buttonDigit8.setEnabled(true);
        buttonDigit9.setEnabled(true);
        buttonDigit0.setEnabled(true);
        buttonCancel.setEnabled(true);
        jLabel1.setVisible(false);
        jTextField6.setVisible(false);
//        jButton12.setEnabled(true);
//        jButton13.setEnabled(false);
//        jButton14.setEnabled(false); 
    }
    public void screen4(){
        currentScreen="screen4";
        passwordInput.setVisible(false);
        textInputLabel.setText("");
        buttonSubmit.setText("OK");
        buttonSubmit.setVisible(true);
        textInput.setVisible(false);
        buttonWithdrawal.setText("");
        buttonDeposit.setText("");
        textInputLabel.setText("Invalid Identification! Your Card will be retained. Please call the bank.");
        buttonDigit1.setEnabled(false);
        buttonDigit2.setEnabled(false);
        buttonDigit3.setEnabled(false);
        buttonDigit4.setEnabled(false);
        buttonDigit5.setEnabled(false);
        buttonDigit6.setEnabled(false);
        buttonDigit7.setEnabled(false);
        buttonDigit8.setEnabled(false);
        buttonDigit9.setEnabled(false);
        buttonDigit0.setEnabled(false);
        buttonCancel.setEnabled(false);
//        jButton12.setEnabled(false);
//        jButton13.setEnabled(false);
//        jButton14.setEnabled(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);    
        jButton14.setVisible(false);
        jLabel1.setVisible(false);
        jTextField6.setVisible(false);
    }
    
    public void screen5(){
        currentScreen="screen5";
        passwordInput.setVisible(false);
        textInput.setVisible(false);
        textInputLabel.setText("Hello " + getfName() +"! \nSelect Transaction Type");
        buttonSubmit.setText("Balance");
        //jTextField3.setText("");
        buttonWithdrawal.setText("Withdrawal");
        buttonDeposit.setText("Deposit");
        buttonWithdrawal.setVisible(true);
        buttonDeposit.setVisible(true);
        buttonSubmit.setVisible(true);
       buttonDigit1.setEnabled(false);
        buttonDigit2.setEnabled(false);
        buttonDigit3.setEnabled(false);
        buttonDigit4.setEnabled(false);
        buttonDigit5.setEnabled(false);
        buttonDigit6.setEnabled(false);
        buttonDigit7.setEnabled(false);
        buttonDigit8.setEnabled(false);
        buttonDigit9.setEnabled(false);
        buttonDigit0.setEnabled(false);
        buttonCancel.setEnabled(false);
//        jButton12.setEnabled(true);
//        jButton13.setEnabled(true);
//        jButton14.setEnabled(true);
        jButton12.setVisible(false);
        jButton13.setVisible(false);    
        jButton14.setVisible(false);
        jLabel1.setVisible(false);
        jTextField6.setVisible(false);
    }
    
    public void screen6(){
        currentScreen="screen6";
        passwordInput.setVisible(false);
         textInputLabel.setText("");
        buttonSubmit.setVisible(false);
         
        
        textInputLabel.setText("Select Account Type");
          buttonWithdrawal.setText("Checking");
        buttonDeposit.setText("Saving");
        buttonDigit1.setEnabled(false);
        buttonDigit2.setEnabled(false);
        buttonDigit3.setEnabled(false);
        buttonDigit4.setEnabled(false);
        buttonDigit5.setEnabled(false);
        buttonDigit6.setEnabled(false);
        buttonDigit7.setEnabled(false);
        buttonDigit8.setEnabled(false);
        buttonDigit9.setEnabled(false);
        buttonDigit0.setEnabled(false);
        buttonCancel.setEnabled(false);
//        jButton12.setEnabled(true);
//        jButton13.setEnabled(true);
//        jButton14.setEnabled(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);    
        jButton14.setVisible(false);
        jLabel1.setVisible(false);
        jTextField6.setVisible(false);
      }
    
    public void screen7(){
        currentScreen="screen7";
        passwordInput.setVisible(false);
         textInputLabel.setText("");        
        textInput.setText("");
        buttonSubmit.setText("Submit");
        buttonWithdrawal.setVisible(false);
        buttonDeposit.setVisible(false);
         textInputLabel.setText("Enter Amount in the multiples of 10(whole numbers only)");
        textInput.setVisible(true);
        buttonSubmit.setVisible(true);
        //jTextField4.setText("");
        buttonSubmit.setText("Submit");
        buttonDigit1.setEnabled(true);
        buttonDigit2.setEnabled(true);
        buttonDigit3.setEnabled(true);
        buttonDigit4.setEnabled(true);
        buttonDigit5.setEnabled(true);
        buttonDigit6.setEnabled(true);
        buttonDigit7.setEnabled(true);
        buttonDigit8.setEnabled(true);
        buttonDigit9.setEnabled(true);
        buttonDigit0.setEnabled(true);
        buttonCancel.setEnabled(true);
//        jButton12.setEnabled(true);
//        jButton13.setEnabled(false);
//        jButton14.setEnabled(false); 
        jButton12.setVisible(false);
        jButton13.setVisible(false);    
        jButton14.setVisible(false);
        jLabel1.setVisible(false);
        jTextField6.setVisible(false);
    }
    
    public void screen8(){
        currentScreen="screen8";
        passwordInput.setVisible(false);
      textInputLabel.setText("");
        buttonSubmit.setVisible(true);
        textInput.setText("");
        buttonWithdrawal.setVisible(false);
        buttonDeposit.setVisible(false);
         textInputLabel.setText("Insufficient Funds!\n Please Enter a new amount");
        //jTextField2.setText("");        
        //jTextField4.setText("");
        buttonSubmit.setText("Submit");
        buttonDigit1.setEnabled(true);
        buttonDigit2.setEnabled(true);
        buttonDigit3.setEnabled(true);
        buttonDigit4.setEnabled(true);
        buttonDigit5.setEnabled(true);
        buttonDigit6.setEnabled(true);
        buttonDigit7.setEnabled(true);
        buttonDigit8.setEnabled(true);
        buttonDigit9.setEnabled(true);
        buttonDigit0.setEnabled(true);
        buttonCancel.setEnabled(true);
//        jButton12.setEnabled(true);
//        jButton13.setEnabled(false);
//        jButton14.setEnabled(false); 
     jButton12.setVisible(false);
        jButton13.setVisible(false);    
        jButton14.setVisible(false);
        jLabel1.setVisible(false);
        jTextField6.setVisible(false);
    }
    
    public void screen9(){
        currentScreen="screen9";        
        passwordInput.setVisible(false);
        buttonSubmit.setVisible(true);
        textInput.setText("");
        buttonWithdrawal.setVisible(false);
        buttonDeposit.setVisible(false);
         textInputLabel.setText("Machine can not despense that amount! \n Please Enter a new amount");
        //jTextField2.setText("");    
        buttonSubmit.setText("Submit");
        buttonDigit1.setEnabled(true);
        buttonDigit2.setEnabled(true);
        buttonDigit3.setEnabled(true);
        buttonDigit4.setEnabled(true);
        buttonDigit5.setEnabled(true);
        buttonDigit6.setEnabled(true);
        buttonDigit7.setEnabled(true);
        buttonDigit8.setEnabled(true);
        buttonDigit9.setEnabled(true);
        buttonDigit0.setEnabled(true);
        buttonCancel.setEnabled(true);
        jLabel1.setVisible(false);
        jTextField6.setVisible(false);
//        jButton12.setEnabled(true);
//        jButton13.setEnabled(false);
//        jButton14.setEnabled(false);
    }
    
    public void screen10(){
        currentScreen="screen10";
        passwordInput.setVisible(false);
        buttonSubmit.setVisible(false);
       
         textInputLabel.setText("Temporarily unable to  process withdrawals \n Another Transaction?");        
        buttonWithdrawal.setText("YES");
        buttonDeposit.setText("NO");
        buttonDigit1.setEnabled(false);
        buttonDigit2.setEnabled(false);
        buttonDigit3.setEnabled(false);
        buttonDigit4.setEnabled(false);
        buttonDigit5.setEnabled(false);
        buttonDigit6.setEnabled(false);
        buttonDigit7.setEnabled(false);
        buttonDigit8.setEnabled(false);
        buttonDigit9.setEnabled(false);
        buttonDigit0.setEnabled(false);
        buttonCancel.setEnabled(false);
//        jButton12.setEnabled(true);
//        jButton13.setEnabled(true);
//        jButton14.setEnabled(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);    
        jButton14.setVisible(false);
        jLabel1.setVisible(false);
        jTextField6.setVisible(false);
    }
    
    
    public void screen11(){
        currentScreen="screen11";
        passwordInput.setVisible(false);
         textInputLabel.setText("");
        buttonSubmit.setText("");
        textInput.setVisible(false);        
        buttonWithdrawal.setText("");
        buttonDeposit.setText("");
         textInputLabel.setText("Your Balance is being updated \n  Please take the cash ");        
//        jTextField4.setText("YES");
        buttonSubmit.setText("Done");
        buttonDigit1.setEnabled(false);
        buttonDigit2.setEnabled(false);
        buttonDigit3.setEnabled(false);
        buttonDigit4.setEnabled(false);
        buttonDigit5.setEnabled(false);
        buttonDigit6.setEnabled(false);
        buttonDigit7.setEnabled(false);
        buttonDigit8.setEnabled(false);
        buttonDigit9.setEnabled(false);
        buttonDigit0.setEnabled(false);
        buttonCancel.setEnabled(false);
        jLabel1.setVisible(false);        
        jTextField6.setVisible(false);
//        jButton12.setEnabled(true);
//        jButton13.setEnabled(false);
//        jButton14.setEnabled(false); 
        jButton12.setVisible(false);
        jButton13.setVisible(false);    
        jButton14.setVisible(false);
    }
    
    public void screen12(){
        currentScreen="screen12";
        passwordInput.setVisible(false);
       textInputLabel.setText("");
        buttonSubmit.setText("");
        textInput.setText("");
        buttonWithdrawal.setText("");
        buttonDeposit.setText("");
         textInputLabel.setText("Temporary unable to  process transactions");
        textInput.setText("Another Transation");
        buttonWithdrawal.setText("YES");
        buttonDeposit.setText("NO");
        buttonDigit1.setEnabled(false);
        buttonDigit2.setEnabled(false);
        buttonDigit3.setEnabled(false);
        buttonDigit4.setEnabled(false);
        buttonDigit5.setEnabled(false);
        buttonDigit6.setEnabled(false);
        buttonDigit7.setEnabled(false);
        buttonDigit8.setEnabled(false);
        buttonDigit9.setEnabled(false);
        buttonDigit0.setEnabled(false);
        buttonCancel.setEnabled(true);
//        jButton12.setEnabled(true);
//        jButton13.setEnabled(true);
//        jButton14.setEnabled(false); 
        jButton12.setVisible(false);
        jButton13.setVisible(false);    
        jButton14.setVisible(false);
     jLabel1.setVisible(false);
        jTextField6.setVisible(false);
    }
    public void screen13(){
        currentScreen="screen13";       
        passwordInput.setVisible(false);
        textInput.setText("");
        buttonWithdrawal.setVisible(false);
        buttonDeposit.setVisible(false);
        textInputLabel.setText("Please enter the amount you want to deposit(whole numbers only)");
        textInput.setVisible(true);
        buttonSubmit.setText("SUBMIT");
        buttonSubmit.setVisible(true);
         buttonDigit1.setEnabled(true);
        buttonDigit2.setEnabled(true);
        buttonDigit3.setEnabled(true);
        buttonDigit4.setEnabled(true);
        buttonDigit5.setEnabled(true);
        buttonDigit6.setEnabled(true);
        buttonDigit7.setEnabled(true);
        buttonDigit8.setEnabled(true);
        buttonDigit9.setEnabled(true);
        buttonDigit0.setEnabled(true);
        buttonCancel.setEnabled(true);
//        jButton12.setEnabled(true);
//        jButton13.setEnabled(false);
//        jButton14.setEnabled(false); 
        jButton12.setVisible(false);
        jButton13.setVisible(false);    
        jButton14.setVisible(false);
        jLabel1.setVisible(false);
        jTextField6.setVisible(false);
    }
    
    public void screen14(){
        currentScreen="screen14";
        passwordInput.setVisible(false);
        textInputLabel.setText("");
        buttonSubmit.setVisible(false);
        textInput.setText("");
        buttonWithdrawal.setText("");
        buttonDeposit.setText("");
        textInputLabel.setText("Your balance is printed on receipt \n Another transaction?");
        textInput.setVisible(false);
        buttonWithdrawal.setText("YES");
        buttonDeposit.setText("NO");
        buttonWithdrawal.setVisible(true);
        buttonDeposit.setVisible(true);
        buttonDigit1.setEnabled(false);
        buttonDigit2.setEnabled(false);
        buttonDigit3.setEnabled(false);
        buttonDigit4.setEnabled(false);
        buttonDigit5.setEnabled(false);
        buttonDigit6.setEnabled(false);
        buttonDigit7.setEnabled(false);
        buttonDigit8.setEnabled(false);
        buttonDigit9.setEnabled(false);
        buttonDigit0.setEnabled(false);
        buttonCancel.setEnabled(false);
//        jButton12.setEnabled(true);
//        jButton13.setEnabled(true);
//        jButton14.setEnabled(false);
        jLabel1.setVisible(true);
        jTextField6.setVisible(true);
        jTextField6.setEditable(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);    
        jButton14.setVisible(false);
    }
    
    public void screen15(){
        jLabel1.setVisible(false);
        passwordInput.setVisible(false);
        jTextField6.setVisible(false);
        currentScreen="screen15";
        textInputLabel.setText("");
        buttonSubmit.setVisible(true);
        buttonSubmit.setText("OK");
        buttonWithdrawal.setText("");
        buttonDeposit.setText("");
        textInputLabel.setText("Please take your receipt & ATM card");
        textInput.setText("Thank you");
        buttonWithdrawal.setText("SUBMIT");
        buttonWithdrawal.setVisible(false);
        buttonDeposit.setVisible(false);
        textInput.setVisible(false);        
        buttonDigit1.setEnabled(false);
        buttonDigit2.setEnabled(false);
        buttonDigit3.setEnabled(false);
        buttonDigit4.setEnabled(false);
        buttonDigit5.setEnabled(false);
        buttonDigit6.setEnabled(false);
        buttonDigit7.setEnabled(false);
        buttonDigit8.setEnabled(false);
        buttonDigit9.setEnabled(false);
        buttonDigit0.setEnabled(false);
        buttonCancel.setEnabled(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);    
        jButton14.setVisible(false);
    }
   
    /**
     * Creates new form terminal
     */
    public view() {
        currentScreen="screen1";
        transaction=null;
        Controller=null;
        account=null;
        passwordAttempts=0;
        fName=null;
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel(); 
        textInput = new javax.swing.JTextField();
        passwordInput = new javax.swing.JPasswordField();        
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        buttonDigit1 = new javax.swing.JButton();
        buttonDigit2 = new javax.swing.JButton();
        buttonDigit3 = new javax.swing.JButton();
        buttonDigit4 = new javax.swing.JButton();
        buttonDigit5 = new javax.swing.JButton();
        buttonDigit6 = new javax.swing.JButton();
        buttonDigit7 = new javax.swing.JButton();
        buttonDigit8 = new javax.swing.JButton();
        buttonDigit9 = new javax.swing.JButton();
        buttonDigit0 = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        buttonWithdrawal = new javax.swing.JButton();
        buttonDeposit = new javax.swing.JButton();
        buttonSubmit = new javax.swing.JButton();
//  buttonSubmit = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textInputLabel = new javax.swing.JLabel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        textInputLabel.setBackground(new java.awt.Color(204, 204, 255));
//        textInputLabel.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
//        textInputLabel.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jTextField1ActionPerformed(evt);
//            }
//        });

        buttonSubmit.setBackground(new java.awt.Color(204, 204, 255));
        buttonSubmit.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        buttonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        textInput.setBackground(new java.awt.Color(204, 204, 255));
        textInput.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        textInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        passwordInput.setBackground(new java.awt.Color(204, 204, 255));
        
        buttonWithdrawal.setBackground(new java.awt.Color(204, 204, 255));
        buttonWithdrawal.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        buttonWithdrawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        buttonDeposit.setBackground(new java.awt.Color(204, 204, 255));
        buttonDeposit.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        buttonDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textInput)
                        .addComponent(passwordInput))                        
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonWithdrawal, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addGap(18, 18, 18)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textInputLabel)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textInputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(buttonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonWithdrawal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(buttonDeposit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonDigit1.setForeground(new java.awt.Color(0, 0, 255));
        buttonDigit1.setText("1");
        buttonDigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonDigit2.setForeground(new java.awt.Color(0, 0, 255));
        buttonDigit2.setText("2");
        buttonDigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonDigit3.setForeground(new java.awt.Color(0, 0, 255));
        buttonDigit3.setText("3");
        buttonDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonDigit4.setForeground(new java.awt.Color(0, 0, 255));
        buttonDigit4.setText("4");
        buttonDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        buttonDigit5.setForeground(new java.awt.Color(0, 0, 255));
        buttonDigit5.setText("5");
        buttonDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        buttonDigit6.setForeground(new java.awt.Color(0, 0, 255));
        buttonDigit6.setText("6");
        buttonDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        buttonDigit7.setForeground(new java.awt.Color(0, 0, 255));
        buttonDigit7.setText("7");
        buttonDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        buttonDigit8.setForeground(new java.awt.Color(0, 0, 255));
        buttonDigit8.setText("8");
        buttonDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        buttonDigit9.setForeground(new java.awt.Color(0, 0, 255));
        buttonDigit9.setText("9");
        buttonDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        buttonDigit0.setForeground(new java.awt.Color(0, 0, 255));
        buttonDigit0.setText("0");
        buttonDigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        buttonCancel.setForeground(new java.awt.Color(0, 0, 255));
        buttonCancel.setText("CANCEL");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(204, 204, 255));
        jTextField8.setText("                 Cash Dispensing Door");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(204, 204, 255));
        jTextField9.setText("                 Deposit Envelope Door");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(204, 204, 255));
//
//        jTextField10.setEditable(false);
//        jTextField10.setBackground(new java.awt.Color(204, 204, 255));
//        jTextField10.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jTextField10ActionPerformed(evt);
//            }
//        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Receipt");
//
//        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
//        jLabel2.setText("ID CardjLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(jTextField8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)                    
                        .addGap(18, 18, 18))                    
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1))
          //                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)         
                            .addComponent(jLabel2))
                    
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(jTextField10)))
                        //.addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonDigit1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDigit7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDigit4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDigit0, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonDigit2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonDigit3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buttonDigit8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonDigit9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buttonDigit5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonDigit6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(buttonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDigit1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDigit2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDigit3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDigit4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDigit5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDigit6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDigit7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDigit8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDigit9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDigit0, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    textInput.setText(textInput.getText()+"2");    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        textInput.setText(textInput.getText()+"4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        textInput.setText(textInput.getText()+"0");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    	
        textInput.setText("");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
        if(currentScreen.equals("screen5")){
            setTransaction("withdrawal");
            screen6();
        }
        
        else if(currentScreen.equals("screen6")){
            account="checking";
            if(transaction.equals("balance")){
                 Controller.getCheckingBalance();
            }
            else if(transaction.equals("withdrawal")){
                System.out.println("withdrawal");
                Controller.checkWithdrawalSlotStatus();
            }
             else if(transaction.equals("deposit")){
                Controller.checkDepositEnvelopeSlot();
            }
            
        }
        else if(currentScreen.equals("screen14")){
            screen5();
        }
        else if(currentScreen.equals("screen10")){
            screen5();
        }
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
        
        if(currentScreen.equals("screen5")){
            setTransaction("deposit");
            screen6(); 
        }
        else if(currentScreen.equals("screen6")){
            account="savings";
            if(transaction.equals("balance")){
            Controller.getSavingsBalance();
            }
            else if(transaction.equals("withdrawal")){
                System.out.println("withdrawal");
                Controller.checkWithdrawalSlotStatus();
            }
            else if(transaction.equals("deposit")){
                Controller.checkDepositEnvelopeSlot();
            }
        }
         else if(currentScreen.equals("screen14")){
            screen15();
        }
         else if(currentScreen.equals("screen10")){
             screen15();          
         }
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        if(currentScreen.equals("screen1")){
            Controller.PANSubmit();            
        }
        else if(currentScreen.equals("screen2")){         
              Controller.PINSubmit();
                
        }
        else if(currentScreen.equals("screen5")){
            setTransaction("balance");
            screen6();
        }
        else if(currentScreen.equals("screen7") || currentScreen.equals("screen9") || currentScreen.equals("screen8") || currentScreen.equals("screen16")){
            if(textInput.getText().matches("^[0-9]+$")){
            Controller.withdrawMoney();
            }
            
            
            else{
            	JOptionPane.showMessageDialog(rootPane, "Please enter valid amount");
                textInput.setText("");                                               
            }
        }
        else if(currentScreen.equals("screen11")){
            screen14();
        }
        else if(currentScreen.equals("screen13")){
            if(textInput.getText().matches("^[0-9]+$")){
            Controller.depositMoney();
            }
            
            else{
            	JOptionPane.showMessageDialog(rootPane, "Please enter valid amount");
               textInput.setText("");
            }
                
        }
        else if(currentScreen.equals("screen4")|| currentScreen.equals("screen15")){
            this.dispose();
        }
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
        textInput.setText(textInput.getText()+"8");
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
        textInput.setText(textInput.getText()+"9");
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        textInput.setText(textInput.getText()+"1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        textInput.setText(textInput.getText()+"3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        textInput.setText(textInput.getText()+"5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        textInput.setText(textInput.getText()+"6");
    }//GEN-LAST:event_jButton6ActionPerformed
    

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        textInput.setText(textInput.getText()+"7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        textInput.setText(textInput.getText()+"8");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        textInput.setText(textInput.getText()+"9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

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
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new view().setVisible(true);
//            }
//        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDigit1;
    private javax.swing.JButton buttonDigit0;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton buttonDigit2;
    private javax.swing.JButton buttonDigit3;
    private javax.swing.JButton buttonDigit4;
    private javax.swing.JButton buttonDigit5;
    private javax.swing.JButton buttonDigit6;
    private javax.swing.JButton buttonDigit7;
    private javax.swing.JButton buttonDigit8;
    private javax.swing.JButton buttonDigit9;
    //private javax.swing.JButton buttonSubmit;
    private javax.swing.JLabel jLabel1;

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JTextField getjTextField6() {
        return jTextField6;
    }

    public void setjTextField6(JTextField jTextField6) {
        this.jTextField6 = jTextField6;
    }
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel textInputLabel;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JTextField textInput;
    private javax.swing.JPasswordField passwordInput;
    public javax.swing.JPasswordField getPasswordInput() {
		return passwordInput;
	}

	public void setPasswordInput(javax.swing.JPasswordField passwordInput) {
		this.passwordInput = passwordInput;
	}

	private javax.swing.JButton buttonWithdrawal;
    private javax.swing.JButton buttonDeposit;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private String currentScreen;
    private controller Controller;
    private String transaction;
    private String account;
    private int passwordAttempts;
    private String fName;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }
    
    public int getPasswordAttempts() {
        return passwordAttempts;
    }

    public void setPasswordAttempts(int passwordAttempts) {
        this.passwordAttempts = passwordAttempts;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCurrentScreen() {
        return currentScreen;
    }

    public void setCurrentScreen(String currentScreen) {
        this.currentScreen = currentScreen;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }
    
    public JButton getButtonDigit1() {
        return buttonDigit1;
    }

    public void setButtonDigit1(JButton buttonDigit1) {
        this.buttonDigit1 = buttonDigit1;
    }

    public JButton getButtonDigit0() {
        return buttonDigit0;
    }

    public void setButtonDigit0(JButton buttonDigit0) {
        this.buttonDigit0 = buttonDigit0;
    }

    public JButton getButtonCancel() {
        return buttonCancel;
    }

    public void setButtonCancel(JButton buttonCancel) {
        this.buttonCancel = buttonCancel;
    }

    public JButton getjButton12() {
        return jButton12;
    }

    public void setjButton12(JButton jButton12) {
        this.jButton12 = jButton12;
    }

    public JButton getjButton13() {
        return jButton13;
    }

    public void setjButton13(JButton jButton13) {
        this.jButton13 = jButton13;
    }

    public JButton getjButton14() {
        return jButton14;
    }

    public void setjButton14(JButton jButton14) {
        this.jButton14 = jButton14;
    }

    public JButton getButtonDigit2() {
        return buttonDigit2;
    }

    public void setButtonDigit2(JButton buttonDigit2) {
        this.buttonDigit2 = buttonDigit2;
    }

    public JButton getButtonDigit3() {
        return buttonDigit3;
    }

    public void setButtonDigit3(JButton buttonDigit3) {
        this.buttonDigit3 = buttonDigit3;
    }

    public JButton getButtonDigit4() {
        return buttonDigit4;
    }

    public void setButtonDigit4(JButton buttonDigit4) {
        this.buttonDigit4 = buttonDigit4;
    }

    public JButton getButtonDigit5() {
        return buttonDigit5;
    }

    public void setButtonDigit5(JButton buttonDigit5) {
        this.buttonDigit5 = buttonDigit5;
    }

    public JButton getButtonDigit6() {
        return buttonDigit6;
    }

    public void setButtonDigit6(JButton buttonDigit6) {
        this.buttonDigit6 = buttonDigit6;
    }

    public JButton getButtonDigit7() {
        return buttonDigit7;
    }

    public void setButtonDigit7(JButton buttonDigit7) {
        this.buttonDigit7 = buttonDigit7;
    }

    public JButton getButtonDigit8() {
        return buttonDigit8;
    }

    public void setButtonDigit8(JButton buttonDigit8) {
        this.buttonDigit8 = buttonDigit8;
    }

    public JButton getButtonDigit9() {
        return buttonDigit9;
    }

    public void setButtonDigit9(JButton buttonDigit9) {
        this.buttonDigit9 = buttonDigit9;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JLabel getTextInputLabel() {
        return textInputLabel;
    }

    public void setTextInputLabel(JLabel textInputLabel) {
        this.textInputLabel = textInputLabel;
    }

    public JButton getButtonSubmit() {
        return buttonSubmit;
    }

    public void setButtonSubmit(JButton buttonSubmit) {
        this.buttonSubmit = buttonSubmit;
    }

    public JTextField getTextInput() {
        return textInput;
    }

    public void setTextInput(JTextField textInput) {
        this.textInput = textInput;
    }

    public JButton getButtonWithdrawal() {
        return buttonWithdrawal;
    }

    public void setButtonWithdrawal(JButton buttonWithdrawal) {
        this.buttonWithdrawal = buttonWithdrawal;
    }

    public JButton getButtonDeposit() {
        return buttonDeposit;
    }

    public void setButtonDeposit(JButton buttonDeposit) {
        this.buttonDeposit = buttonDeposit;
    }

    public JTextField getjTextField7() {
        return jTextField7;
    }

    public void setjTextField7(JTextField jTextField7) {
        this.jTextField7 = jTextField7;
    }

    public JTextField getjTextField8() {
        return jTextField8;
    }

    public void setjTextField8(JTextField jTextField8) {
        this.jTextField8 = jTextField8;
    }

    public JTextField getjTextField9() {
        return jTextField9;
    }

    public void setjTextField9(JTextField jTextField9) {
        this.jTextField9 = jTextField9;
    }
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
