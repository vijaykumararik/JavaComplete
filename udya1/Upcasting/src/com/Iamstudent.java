package com;

import java.util.Scanner;

public class Iamstudent {
	public static void main(String[] args) {
		

 String []a=new String[4];
 
 Scanner s=new Scanner(System.in);
 System.out.println("enter the statement");
 for(int i=0;i<a.length;i++)
 {
	 a[i]=s.next();
 }
 System.out.println("reversed name");
 for(int i=a.length-1;i>=0;i--)
 {
	 System.out.print(a[i]+" ");
 }
	}
}
