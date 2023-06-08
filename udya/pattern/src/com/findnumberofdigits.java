package com;

import java.util.Scanner;

public class findnumberofdigits {
public static void main(String[] args) {
//	long n=565l;
//	int i=0;
//	while(n>0)//(n!=1)
//	{
//		n=n/10;
//		i++;
//	}
//	System.out.println(i);
	Scanner s=new Scanner(System.in);
	System.out.println("enter number ");
	int n=s.nextInt();
	int d=n%10;
	if(d==0)
	{
		System.out.println("given number last digit is zero");
	}
	else if(d==5)
	{
		System.out.println("given number last digit is five");
	}
	else 
		{
			if(d%2==0)
			{
				System.out.println("given number last digit is even ");
			}
			else {
				{
					System.out.println("given number last digit is odd ");
				}
			}
		}
	
}
}
