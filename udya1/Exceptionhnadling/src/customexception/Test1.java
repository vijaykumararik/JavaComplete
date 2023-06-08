package customexception;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		String id = sc.nextLine();
		System.out.println("enter password");
		int password = sc.nextInt();
		if (id.equals("admin")) {
			if (password == 121) {
				System.out.println("login succesful");
			} else {
				try {
					InvalidpasswordException obj = new InvalidpasswordException();
					throw obj;
				} catch (InvalidpasswordException e) {
					System.out.println("invalid password entered");
				}
			}
		} else {

			try {
				InvalidpasswordException obj = new InvalidpasswordException();
				throw obj;
			} catch (InvalidpasswordException e) {
				System.out.println("invalid id entered");
			}
		}

	}
}
