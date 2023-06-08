package com;

public class Son implements Parent1 {

	@Override
	public void display() {
		
		System.out.println("display method in son");
	}
	@Override
	public void test() {
		
		System.out.println("test in son");
	}
	@Override
	public  void run()
	{
		System.out.println("run in son");
	}
 
	
	
}
