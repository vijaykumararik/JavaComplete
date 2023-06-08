package com.collection;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	int id;
	String name;
	double sal;
	public Student(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", sal=" + sal+"]" ;
	}
	
}
public class arryoops {
public static void main(String[] args) {
	ArrayList<Student> a=new ArrayList<Student>();
	Scanner s=new Scanner(System.in);
	System.out.println("enter how many person details u need to enter");
	int size=s.nextInt();
	int p[]=new int[size];
	int id=0;
	String name="";
	double sal=0.0;
	
	for (int i = 0; i < p.length; i++) {
		System.out.println("enetr "+(i+1)+"st person id name and salry");
	      id=s.nextInt();
		 name=s.next();
		 sal=s.nextDouble();
		 a.add(new Student(id,name,sal));
	}
	
	
//	Student s1=new Student(id, name, sal);
//	Student s3=new Student(103, "mikjay", 585.56);
//	a.add(s1);
//	
//	System.out.println(a);
	for (Student c : a) {
		System.out.println(c);
	}
	
}
}
