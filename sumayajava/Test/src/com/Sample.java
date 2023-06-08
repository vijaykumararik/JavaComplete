package com;

import java.util.Scanner;

public class Sample {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	int n=s.nextInt();
	int rem=0,c=0,k=0,n1=n;
	
	while(n!=0) {
		c++;
		
		n=n/4;
	}
	int a[]=new int[c];
	while(n1!=0) {
	
		rem=n1%4;
	
		a[k]=rem;
		k++;
		n1=n1/4;
	}
	for (int i = a.length-1; i>=0; i--) {
		System.out.print(a[i]);
	}
	
}
}
