package com;

import java.util.Scanner;

public class Solution {
 public static void main(String[] args) {
	
	Test t=new Test();
	Scanner s=new Scanner(System.in);
	System.out.println("enter choice 1 for Laptop and 2 for Mobiles");
	int choice=s.nextInt();
    Electronics e=t.shoping(choice);
    if(e instanceof Laptop) {
    	System.out.println("buying Laptop");
    }
    else if(e instanceof Mobiles) {
    	System.out.println("buying mobile");
    }
    else {
    	System.out.println("invalid ");
    }
	
}
}
