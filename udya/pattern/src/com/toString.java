package com;

import java.util.Scanner;

public class toString {
public static void main(String[] args) {
	  
//	char[]c= {'a','e','i','o','u'};
//	String s = String.copyValueOf(c);
//	System.out.println(s);
//	String a =new String(c);
//	System.out.println(a);
Scanner s1=new Scanner(System.in);
System.out.println("enter size of array");
int size=s1.nextInt();
char []e=new char[size];
System.out.println("enter "+size+" elements of array");
for (int i = 0; i <size ; i++) {
	e[i]=s1.next().charAt(0);	
}
  System.out.println("charector array to string value is");
  String newstring =new String(e);
  System.out.println(newstring);


}


}
