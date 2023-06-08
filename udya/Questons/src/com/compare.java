package com;

public class compare {
	public static void main(String[] args) {

		String url = ".com";
		if (url==".com") {
			System.out.println("commercial website");
		} else if (url==".org") {
			System.out.println("organisational website ");
		} else if (url.equals(".in")) {
			System.out.println("indian website");
		} else {
			{
				System.out.println("invalid ");
			}
		}

	}
}
