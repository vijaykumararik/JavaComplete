package com;

import java.util.Scanner;

public class Getnumber2 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter String");
		 String a=s.nextLine();
		char []c=a.toCharArray();
		int[]b=new int[c.length];
		int j=c.length-1;
		for (int i = 0; i < c.length; i++) {
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'){
				b[j]=0;
				j--;
			}
			else 
			{
				b[j]=1;
				j--;
			}		
		}
		int sum=0,k=2;
		for (int i = 1; i < b.length; i++) {
			sum=sum+b[i]*k;
			k*=2;
		}
		sum=sum+b[0];
		System.out.println(" integer value is "+sum);
		
	}
}
