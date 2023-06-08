package com.javabeanclass;

public class Student3 {
 
	 private int marks;
	 public Student3(int a) {//we use the constructor to intialise the value but we can
		 //do it only once if we want to intialise agin we need to create object
		 //thats why we use seter method
		 this.marks=marks;
		 System.out.println("with in constructor");
	 }
	 public void setMarks(int marks) {
		 if(marks>=0)//here we can protect the data and validate the data
		 {
			 this.marks=marks;
		 }
		 else {
			System.out.println("invalid initialisation ");
		}
	}
	 public int getMarks() {
		return marks;
	}
}
