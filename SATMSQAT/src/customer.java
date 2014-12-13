/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohit_motiani
 */
  public class customer{
	private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPan() {
        return Pan;
    }

    public void setPan(String Pan) {
        this.Pan = Pan;
    }

    public String getPin() {
        return Pin;
    }

    public void setPin(String Pin) {
        this.Pin = Pin;
    }

    public int getTransactionCountWithdrawal() {
        return transactionCountWithdrawal;
    }

    public void setTransactionCountWithdrawal(int transactionCountWithdrawal) {
        this.transactionCountWithdrawal = transactionCountWithdrawal;
    }

    public int getTransactionCountDeposit() {
        return transactionCountDeposit;
    }

    public void setTransactionCountDeposit(int transactionCountDeposit) {
        this.transactionCountDeposit = transactionCountDeposit;
    }

    public int getCheckingAmount() {
        return checkingAmount;
    }

    
    public void setCheckingAmount(int checkingAmount) {
        this.checkingAmount = checkingAmount;
    }

    public int getSavingsAmount() {
        return savingsAmount;
    }

    public void setSavingsAmount(int savingsAmount) {
        this.savingsAmount = savingsAmount;
    }
	private String Pan;
	private String Pin;
	private int transactionCountWithdrawal;
        private int transactionCountDeposit;
	private int checkingAmount;
	private int savingsAmount;
	
	public customer(String first_name, String pan, String pin, int t_c_w, int t_c_d, int check, int save)
	{
		this.firstName = first_name;
		this.Pan = pan;
		this.Pin = pin;
		this.transactionCountWithdrawal = t_c_w;
                this.transactionCountDeposit = t_c_d;
		this.checkingAmount= check;
		this.savingsAmount = save;
	}
}
