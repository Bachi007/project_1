package com.bankApp.model;

public class bankModel {
	private int accNumber;
	private int accBalance;
	private String accHolderName;
	private String accPassword;
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public int getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(int accBalance) {
		this.accBalance = accBalance;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getAccPassword() {
		return accPassword;
	}
	public void setAccPassword(String accPassword) {
		this.accPassword = accPassword;
	}
	
	public void depositAmount(int amount) {
		this.accBalance +=amount;
	}
	
	public void withdrawAmount(int amount) {
		this.accBalance -=amount;
	}
	
	@Override
	public String toString() {
		return "bankModel [accNumber=" + accNumber + ", accBalance=" + accBalance + ", accHolderName=" + accHolderName
				+ ", accPassword=" + accPassword + "]";
	}
	
	
}
