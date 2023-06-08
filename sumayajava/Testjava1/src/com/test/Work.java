package com.test;

public class Work implements Operation {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("substraction of two numbers is :" + (a - b));
	}

	@Override
	public void mul(int a, int b) {
		System.out.println("multiflication of two number is: " + (a * b));
	}

	@Override
	public void div(int a, int b) {
		System.out.println("division of two numbers is: " + (a / b));
	}
}
