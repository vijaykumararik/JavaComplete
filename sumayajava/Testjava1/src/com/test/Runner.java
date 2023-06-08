package com.test;

public class Runner implements Wattsappv1,Wattsappv2 {

	@Override
	public void videoCall() {
		System.out.println("video call is done");
		
	}

	@Override
	public void textMessage() {
		System.out.println("text message sent");
		
	}

}
