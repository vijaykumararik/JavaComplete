package com.instance;

public class Test {
public static void main(String[] args) {
	
	Father f=new Son();
	if(f instanceof Son)
	{
		System.out.println("downcast to son");
		Son s=(Son) f;
	}
	else if(f instanceof Daugter)
	{
		System.out.println("downcast to daugter");
		Daugter d=(Daugter)f;
	}
}
}
