package com.cg.pojo;

public class CustomerDetails {

	private int accountNumber;
	private double balanceBefore=10_000;
	private double amount;
//	private int deposit;
	private String sender;
	private String receiver;
	private String amountTransfer;
	
	
	public CustomerDetails(String sender, String receiver, String amountTransfer) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.amountTransfer = amountTransfer;
	}
	
	public CustomerDetails(int accountNumber, int amount) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
	}

	/*public CustomerDetails(int accountNumber, int deposit) {
		super();
		this.accountNumber = accountNumber;
		this.deposit = deposit;
	}*/

	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalanceBefore() {
		return balanceBefore;
	}
	public void setBalanceBefore(double balanceBefore) {
		this.balanceBefore = balanceBefore;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/*public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}*/
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getAmountTransfer() {
		return amountTransfer;
	}
	public void setAmountTransfer(String amountTransfer) {
		this.amountTransfer = amountTransfer;
	}	
}
