package com.test;

public class BankAccount {

	String bankName;
	String ownerName;
	long contactNumber;
	private double balance;

	 public void show_account_details() {
		System.out.println("bankname:" + bankName + "\n ownername:" + ownerName);
		System.out.println("Contact number:" + contactNumber);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void withdraw( double withdraw)
	{
		balance=balance-withdraw;
		System.out.println("amonut withdrawn is:"+withdraw);
	}
	public void deposit(double deposit)
	{
		
		balance=balance+deposit;
		System.out.println("amount deposited id:"+deposit);
	}
	public void  checkbalance()
	{
		System.out.println("account balence is:"+balance);
	}
}
