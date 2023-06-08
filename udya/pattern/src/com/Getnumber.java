package com;

import java.util.Collection;
import java.util.Collections;
import java.util.*;

public class Getnumber {

	public static void main(String[] args) {
		 
		Scanner s=new Scanner(System.in);
		System.out.println("enter the Stirng ");
		String a=s.nextLine();
		char[] b =new char[a.length()];int j=0;
	   for(int i=0;i<a.length();i++)
	   {
		   if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='o'||a.charAt(i)=='i'||a.charAt(i)=='u')
		   {
			   
			   b[j]=0;
			   j++;
		   }
		   else {
			   b[j]=1;
			   
			   j++;
		   }
	        }
	   System.out.println(tostring(b));
	}

	public static String tostring(char[] a) {
		String s2=new String(a);
		return s2;
	}

	
	
	}

