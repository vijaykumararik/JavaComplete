package com.test;

import java.util.Objects;

public class Student {
	String StudentName;
	int StudentId;
    String StudentEmailAddress;
	long StudentContactNumber;
	
	public Student(String studentName, int studentId, String studentEmailAddress, long studentContactNumber) {
		
		StudentName = studentName;
		StudentId = studentId;
		StudentEmailAddress = studentEmailAddress;
		StudentContactNumber = studentContactNumber;
	}

	@Override
	public String toString() {
		return "Student [Name=" + StudentName + ", Id=" + StudentId + ", EmailAddress="
				+ StudentEmailAddress + ", ContactNumber=" + StudentContactNumber + "]";
	}
	public void  show_student_details()
	{
		System.out.println("Student Name=" + StudentName + "\n Id=" + StudentId + "\n EmailAddress="
				+ StudentEmailAddress + "\n ContactNumber=" + StudentContactNumber );
	}
	@Override
	public int hashCode() {
		return this.StudentId;
		}
	
	@Override
	public boolean equals(Object obj) {
		
		
		return this.StudentId==obj.hashCode();
	}		
	
	
}
