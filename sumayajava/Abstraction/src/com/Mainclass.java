package com;

import java.util.Scanner;

public class Mainclass {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter 1:Customer login\n 2:Admin login");
	int choise=s.nextInt();
	System.out.println("enter password");
	int password=s.nextInt();
	Objectcreation o=new Objectcreation();
	User u=o.create(choise,password);
	
	u.login();
	u.logout();
}

}
