package com.test;

import java.util.Scanner;

public class MainAccount {
public static void main(String[] args) {
	BankAccount b=new BankAccount();
	Scanner s=new Scanner(System.in);
	System.out.println("enetr intial balence of account ");
	double balence=s.nextDouble();
	b.setBalance(balence);
	System.out.println("enter ammount to be withdrwan");
	double witdraw=s.nextDouble();
	b.withdraw(witdraw);
	System.out.println("enetr ammount to be deposit");
	double deposit=s.nextDouble();
	b.deposit(deposit);
	System.out.println("to check balence enetr password");
	int password=s.nextInt();
	if(password==1997)
	{
		System.out.println("balence is :"+b.getBalance());
	}
	else 
		{
			System.out.println("invalid password");
		}
	
	
}
}
