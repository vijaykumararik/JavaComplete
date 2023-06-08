package org;

import java.security.AlgorithmConstraints;

public class Account {
 private double bal;
public void setBal(double bal) {
	if(bal>=0) {
	this.bal = bal;
	}else {
		IllegalArgumentException el=new IllegalArgumentException();
		throw el;
	}
}
public double getBal() {
	
	return bal;
}
public static void withdrow(double amount ,Account a1)
{
	double bal=a1.getBal();
	bal=bal-amount;
	a1.setBal(bal);
}
public static void deposit(double amount ,Account a1)
{
	double bal=a1.getBal();
	bal=bal+amount;
	a1.setBal(bal);
}
public static void cheakbal(Account a1)
{
	double bal=a1.getBal();
	System.out.println("balence is:"+bal);
}
 public static void main(String[] args) {
	 Account a1=new Account();
	Account.deposit(2000, a1);
	Account.cheakbal(a1);
	Account.withdrow(1000, a1);
	Account.cheakbal(a1);
	Account.withdrow(2000, a1);
	Account.cheakbal(a1);
}
}
