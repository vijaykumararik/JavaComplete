package com;

import java.util.Scanner;

 class Solution1 {
  public static void main(String[] args) {
	  
	       Scanner scan=new Scanner(System.in);
	       Cpon C=new Cpon();
	       for(int i=1;i<=5;i++)
	    	{
	    		System.out.println("enter the number");
		    	int n=scan.nextInt();
		    	
		    	C.cpon1(n);
	    	}
		    	
		    	scan.close();   
}
}
