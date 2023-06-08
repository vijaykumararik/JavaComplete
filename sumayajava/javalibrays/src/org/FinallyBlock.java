package org;

public class FinallyBlock {
 static void test(int a)
 {
	 try {
		 System.out.println(100/a);
	 }
	 finally {
		System.out.println("iam finally block");
	}
		
 }
 public static void main(String[] args) {
	test(10);
	test(20);
	test(0);
	test(20);
	test(0);
}
}
