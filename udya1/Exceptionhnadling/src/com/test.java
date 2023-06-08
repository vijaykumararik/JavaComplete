package com;

import java.util.Scanner;

public class test {
 public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter two number");
	 int a=s.nextInt();
	 int b=s.nextInt();
	 int[]c= {2,3,4};
	 try {
		 System.out.println(c[4]);
		 System.out.println(a/b);
	} 
	 catch (ArithmeticException e) {
	 System.out.println("second value can notbe 0");
	 }
	 catch (Exception e) {
		System.out.println("array index will not more then size");
	}
		

}
}
