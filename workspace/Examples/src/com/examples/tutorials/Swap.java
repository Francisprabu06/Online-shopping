package com.examples.tutorials;

public class Swap {

	public static void main(String args[]) {

		int num1 = 133;

		int num2 = 565;

		System.out.println("\n***Before Swapping***");

		System.out.println("Number 1 : " + num1);

		System.out.println("Number 2 : " + num2);

		

		num1 = num1 + num2;

		num2 = num1 - num2;

		num1 = num1 - num2;

		System.out.println("\n***After Swapping***");

		System.out.println("Number 1 : " + num1);

		System.out.println("Number 2 : " + num2);

	}

}
