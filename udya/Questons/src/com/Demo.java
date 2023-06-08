package com;

public class Demo {
public static void main(String[] args) {
	String s=new String("hello iam vijay");
	System.out.println(s);
	char []c=s.toCharArray();
	System.out.println("to char array");
	for (int i = c.length-1; i >=0; i--) {
		System.out.print(c[i]+" ");
	}
	System.out.println("\n toString back");
//	String s1=new String(c);
	String s1=String.copyValueOf(c);
	System.out.println(s1);
	
}
}
