package com;

public class Customer implements User {

	@Override
	public void login() {
		System.out.println("login succesful");
		
	}

	@Override
	public void logout() {
		System.out.println("logout succesfull");
		
	}

}
