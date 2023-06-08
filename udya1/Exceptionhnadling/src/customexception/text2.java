  package customexception;

import java.util.Scanner;

public class text2 {
public static void main(String[] args) {
	 
	 int balance=20000;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter ammount to be withdrown");
	 int withdrow=sc.nextInt();
	 if(withdrow<=balance)
	 {
		 System.out.println("withdrown successful");
	 }
	 else {
		try {
			throw new InsufficentBalenceException();
		}
		catch (InsufficentBalenceException e) {
			System.out.println("insufficent balance ");
		}
	}
}
}
