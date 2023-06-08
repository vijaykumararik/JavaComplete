package org;

import java.util.Scanner;

public class Runnerclg {
 
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		College c=new College();
		System.out.println("enetr your password to set and get value");
		int password=s.nextInt();
		double setvalue;int getvalue;
		if(password==1997)
		{ 
			System.out.println("enetr amount(revenue) need to be set");
			setvalue=s.nextDouble();
		c.setRevenue(setvalue);
		System.out.println("enter 1 to see present revenue");
		getvalue=s.nextInt();
		if(getvalue==1) {
	   double d=c.getRevenue();
	   System.out.println(d);}
		}else
		{
			System.out.println("invalid password");
		}
	}
}
