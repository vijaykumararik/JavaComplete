package org;

public class nullpointer {
	void test()  {
		System.out.println();
	}

public static void main(String[] args) {
	nullpointer n=null;
	try {
		n.test();
	}
	catch (NullPointerException e) {
		System.out.println("null pointer exception handeled ");
	}
	try {
		System.out.println(2/0);
	} catch (ArithmeticException e) {
		System.out.println("arithmatic exception handele");
		
	}
	
}
}
