package com;

public class stacktrace {
public static void main(String[] args) {
	System.out.println("start1");
	try {
		System.out.println(2/0);
	} catch (ArithmeticException e) {
		e.printStackTrace();
	}
	System.out.println("end1");
		int []a= {2,3,4};
		System.out.println("start2");
	try {
			System.out.println(a[11]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	finally {
		System.out.println("end2");
	}
}
}
