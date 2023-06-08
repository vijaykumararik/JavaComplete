package org;

public class Castring {

	public static void main(String[] args) {
		System.out.println("casting from byte to short");
		byte a=10;
		 short b=a;
		 System.out.println(a+" "+b);
		 System.out.println("casting from  short to byte");
		 short c=20;
		 byte d= (byte)c;
		 System.out.println(d+" "+c);
		 System.out.println("casting from  int to float");
		 int e=123;
		 float f=e;
		 System.out.println(e+" "+f);
		 System.out.println("casting from  float to int");
		 float g=1235.6f;
		 int h=(int)g;
		 System.out.println(g+" "+h);
		 System.out.println("casting from  double to int");
		 double i=123567.67;
		 long j=(long)i;
		 System.out.println(i+" "+j);
		 System.out.println("casting from char into double");
		 char k='$';
		 double l= (double)k;
		 System.out.println(l+" "+k);
		 int m=12;
		 char n=(char)m;
		 System.out.println(m+" "+n);
		 
	}
}
