 package com;
public class Trowskeword {
	
	public static void div() throws ArithmeticException
	{
		System.out.println(10/0);
	}
public static void main(String[] args) {
	
	System.out.println("start");
	try {
		div();
	} catch (ArithmeticException e) {
		System.out.println("exception is handling");
	}
	
	System.out.println("end");
}
}
