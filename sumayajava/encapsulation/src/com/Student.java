package com;

public class Student implements College,SON  {
	@Override 
	 public void work()
	{
		System.out.println("iam student");
	}
	@Override
	 public void enjoy()
	{
		System.out.println("enjoy the college life");
	}
	@Override
	 public void enjoy(int a)
	{
		System.out.println("enjoy the college life");
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.enjoy();
		s.work();
		s.enjoy(24);
		
		System.out.println(College.name);
	}
}
