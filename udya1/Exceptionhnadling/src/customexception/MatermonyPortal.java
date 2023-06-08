package customexception;

import java.util.Scanner;

public class MatermonyPortal {
public static void main(String[] args) {
	 
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the age");
	int age=sc.nextInt();
	if(age>=21)
	{
		System.out.println("get marry soon");
	}
	else {
		try {
			throw new AgeInvalidException("have patience your not 21");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
}
