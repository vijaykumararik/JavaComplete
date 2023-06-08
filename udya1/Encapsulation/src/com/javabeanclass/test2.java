package com.javabeanclass;

import java.util.Scanner;

public class test2 {
public static void main(String[] args) {
	
	Employee2 e =new Employee2();
	Scanner s =new Scanner(System.in);
	System.out.println("enter name to update in to data base and enter id");
	String s1=s.nextLine();
	int a1=s.nextInt();
	e.setId(a1);
	e.setName(s1);
	System.out.println("name: "+e.getName()+" age: "+e.getId());
}
}
