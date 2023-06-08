package com.test;

public class MainStudent_Details {

	public static void main(String[] args) {
		Student s=new Student("vijay", 121, "vijay@123", 9636352232l);
           s.show_student_details();
           Student s1=new Student("kijay", 121, "kiijay@123", 5636352232l);
           s1.show_student_details();
           System.out.println(s.equals(s1));
           Student s2=new Student("ajay", 123, "uyijay@123", 4536352232l);
           s2.show_student_details();
           System.out.println(s1.equals(s2));
	}

}
