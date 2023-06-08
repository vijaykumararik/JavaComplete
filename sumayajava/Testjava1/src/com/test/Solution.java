package com.test;
	import java.util.Scanner;

	public class Solution {

		public static void main(String[] args) {

			Operation p = new Work();
			
				Scanner s = new Scanner(System.in);
				System.out.println("enter two numbers");
				int a = s.nextInt();
				int b = s.nextInt();
				System.out.println("enter 1:Addition\n 2:Substraction\n 3:Multiplication" + "\n 4:division \n 5:exit");
				int n = s.nextInt();
				switch (n) {
				case 1:
					System.out.println("Addtion of two numbers is:" + p.add(a, b));
					;
					break;
				case 2:
					p.sub(a, b);
					break;
				case 3:
					p.mul(a, b);
					break;
				case 4:
					p.div(a, b);
					break;
				default:
					System.out.println("invalid input");
					break;
				}

			}

		}

	

