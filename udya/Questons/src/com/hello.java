package com;

public class hello {
public static void main(String[] args) {
	int []a= {1,2,3,4,5,6};
	char[] b=new char[a.length];
	for (int i= 0;  i< b.length; i++) {
		b[i]=(char)(a[i]+96);
		System.out.println(b[i]);	
	}
	System.out.println("+++++++++++++++++++++");
	char []d= {'0','1','2','3','4','5'};
	int []e=new int[d.length];
	for (int i = 0; i < e.length; i++) {
		e[i]=d[i]-48;
		System.out.println(e[i]);
	}
}
}
