package com;

import java.util.Scanner;

public class Arrys {
 public static void main(String[] args) {
	
	 Arrys a=new Arrys();
	 Scanner s =new Scanner(System.in);
	 System.out.println("enter the size of arry");
	 int size=s.nextInt();
	 int[] d=new int[size];
	 System.out.println("enter elements "+size+"of arry");
	 for(int i=0;i<size;i++) {
		 d[i]=s.nextInt();
		
	 }
	 System.out.println("elements in array are");
	 for(int i=0;i<size;i++) {
		  System.out.println(d[i]);
	 }
	 int max=d[0];
	 for(int i=0;i<d.length;i++)
	 {
		 if(d[i]>max)
		 {
			 max=d[i];
		 }
	 }
	 System.out.println("largest in array is "+max);
	 

	
	 
	 
	 }
}
