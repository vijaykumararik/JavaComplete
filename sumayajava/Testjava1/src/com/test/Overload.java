package com.test;

public class Overload {
	public static void main(int a) {
		System.out.println("hello iam main with arguments as "+a);
	}
  public static void main() {
		System.out.println("hello iam main without arguments");
	}
  public static void main(String name) {
		System.out.println("hello iam main with arguments as "+name);
	}
	
public static void main(String[] args) {
	main();
	main(100);
	main("vijay");
	
}
}
