package com;

public class Admin  implements User{

	@Override
	public void login() {
		System.out.println("login by admin is succesful");
	}

	@Override
	public void logout() {
		System.out.println("logout by admin is succesful");
	}

}
