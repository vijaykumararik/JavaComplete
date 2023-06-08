package com;

import java.util.Scanner;

public class Personmain {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter Employee Id");
	int eId=s.nextInt();
	s.nextLine();
	System.out.println("enter Employee NAME");
	String eName=s.nextLine();
	System.out.println("enter employee salary");
	double eSalary=s.nextDouble();
	Person p=new Person(eId, eName, eSalary);
	Person p1=new Person(eId, eName, eSalary);
	System.out.println(p.toString());
	
}
}
