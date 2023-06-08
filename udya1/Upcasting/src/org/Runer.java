package org;

import java.util.Scanner;

public class Runer {
public static void main(String[] args) {
	
	Scanner sca=new Scanner(System.in);
	System.out.println("enter your choise\n 1:coffe\n 2:Tea");
	int choise=sca.nextInt();
	Test t=new Test();
	 Drink d=t.moring(choise);
	 if(d instanceof Coffe)
	 {
		 System.out.println("at morning drinking coffe");
	 }
	 else if(d instanceof Tea)
	 {
		 System.out.println("at morning Drinking tea");
	 }
	 else {
		 System.out.println("invalid ");
	}
}
}
