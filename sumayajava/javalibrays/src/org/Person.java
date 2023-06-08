package org;

public class Person {
 void test() throws ArrayIndexOutOfBoundsException
 {
	 System.out.println(100/0);
 }
 public static void main(String[] args) {
	Person p=new Person();
	 try {
		p.test();
	} catch (ArithmeticException e) {
		System.out.println("this handeled");
	}
}
}
