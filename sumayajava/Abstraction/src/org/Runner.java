package org;

import java.util.Scanner;

public class Runner {
public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter balence amount present in account");
	 double bal=s.nextDouble();
	 Account a=new Saving(bal);
	 System.out.println("enter amount to be deposite");
	double deposit=s.nextDouble();
	a.deposit(deposit);
	System.out.println("enetr amount amount to be withdrawn ");
	double withdrow=s.nextDouble();
	a.withdraw(withdrow);
	System.out.println("to check balence enter password");
      int key=s.nextInt();
      if(key==123)
      {a.checkBalence();}
	
}
}
