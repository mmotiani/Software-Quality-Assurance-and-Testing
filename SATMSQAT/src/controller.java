
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohit_motiani
 */
public class controller {
private view View;
private model Model;
private customer Customer;
    public customer getCustomer() {
	return Customer;
}

public void setCustomer(customer customer) {
	Customer = customer;
}

	private Component rootPane;
public controller(view View,model Model){
    this.View=View;
    this.Model=Model;
    Customer=null;
}
    
 public void PANSubmit(){
     String PAN = View.getTextInput().getText();
     ArrayList<customer> listCustomer= Model.getListCustomer();
     boolean customerFound=false;
     for(customer Customer:listCustomer){
     if(Customer.getPan().equals(PAN)){
         System.out.println("PANSubmit");
         this.Customer=Customer;
             View.screen2();
             customerFound=true;
             break;
     }
    }
     if(!customerFound){
          View.screen4();
     }
 }

 public void PINSubmit(){
     String PIN = View.getPasswordInput().getText();       
         if(Customer.getPan().equals(this.Customer.getPan())){             
             if(PIN.equals(this.Customer.getPin())){
                 View.setfName(this.Customer.getFirstName());
                 View.screen5();
             }
             else{
                 if(View.getPasswordAttempts()>=2){
                     View.screen4();
                 }
                 else{
                     View.setPasswordAttempts(View.getPasswordAttempts()+1);
                     View.screen2();
                 }
                     
             }
         }     
 }
 
 public void getCheckingBalance(){
     View.getjTextField6().setText("$"+Integer.toString(Customer.getCheckingAmount()));
     JOptionPane.showMessageDialog(rootPane, "Your Balance is: $"+Integer.toString(Customer.getCheckingAmount()));
     View.screen14();
 }
 
 public void getSavingsBalance(){
     View.getjTextField6().setText("$"+Integer.toString(Customer.getSavingsAmount()));
     JOptionPane.showMessageDialog(rootPane, "Your Balance is: $"+Integer.toString(Customer.getSavingsAmount()));
     View.screen14();
 }

 public void checkWithdrawalSlotStatus(){
     if(Model.getisCashDispenserDoorReady()==true){
         View.screen7();
     }
     else{
         View.screen10();
     }
 }
 
 public void withdrawMoney(){
        String account=View.getAccount();
        System.out.println(View.getTextInput().getText());
        int amount=Integer.parseInt(View.getTextInput().getText());
         
         if(amount%10!=0){
            JOptionPane.showMessageDialog(rootPane, "Enter the amount in Multiple of 10");
           View.screen7();
        }
       
        else if(amount>Model.getAvailableBalaceInMachine()){
             View.screen9();
        }
        else if(account.equals("checking")){            
            if(amount>Customer.getCheckingAmount()){
                View.screen8();
            }
            else{
                Customer.setCheckingAmount(Customer.getCheckingAmount()-amount);
                System.out.println("inwithdrawmoney");
                Customer.setTransactionCountWithdrawal(Customer.getTransactionCountWithdrawal()+1);
                  View.getjTextField6().setText(Integer.toString(Customer.getCheckingAmount()));
                View.screen11();
            }
        }
         
        else if(account.equals("savings")){
             if(amount>Customer.getSavingsAmount()){
                View.screen8();
            }
            else{
                Customer.setSavingsAmount(Customer.getSavingsAmount()-amount);
                Customer.setTransactionCountDeposit(Customer.getTransactionCountWithdrawal()+1);
                View.getjTextField6().setText(Integer.toString(Customer.getSavingsAmount()));
                View.screen11();
            }
        }
 }
 
 public void checkDepositEnvelopeSlot()
 {
     if(model.isDepositEnvelopedoorReady()==false){
         View.screen12();
     }
     else{
         View.screen13();
     }
 }
 
 public void depositMoney(){
         String account=View.getAccount();        
        int amount=Integer.parseInt(View.getTextInput().getText()); 
        
        
     if(account.equals("checking")){
           
                Customer.setCheckingAmount(Customer.getCheckingAmount()+amount);                
                Customer.setTransactionCountWithdrawal(Customer.getTransactionCountDeposit()+1);
                  View.getjTextField6().setText(Integer.toString(Customer.getCheckingAmount()));
                View.screen14();            
        }
        else if(account.equals("savings")){          
            
                Customer.setSavingsAmount(Customer.getSavingsAmount()+amount);
                Customer.setTransactionCountDeposit(Customer.getTransactionCountDeposit()+1);
                View.getjTextField6().setText(Integer.toString(Customer.getSavingsAmount()));
                View.screen14();
            
        }
 }
}