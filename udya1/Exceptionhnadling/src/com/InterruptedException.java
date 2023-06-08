package com;

public class InterruptedException {
public static void main(String[] args) {
	for (int i = 1; i < 6; i++) {
		System.out.println(i);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
}
