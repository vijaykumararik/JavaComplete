package com;

import java.util.Scanner;

public class New {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a[]=new int[5];
	for (int i = 0; i < a.length; i++) {
		a[i]=s.nextInt();
	}
	int c=0,c1=0,c2=0;
     c=a[1]-a[0];
     c1=a[2]-a[1];
     c2=a[3]-a[2];
     if(c==c1) {
    	 c=c1;
     }else if(c2==c1) {
    	 c=c2;
     }
     
	for (int i = 0; i < a.length-1; i++) {
		if(a[i+1]-a[i]!=c) {
			System.out.println(a[i]+c);
			break;
		
		}
	}
}
}
