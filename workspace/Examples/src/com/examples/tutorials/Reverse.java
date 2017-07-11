package com.examples.tutorials;

public class Reverse {

	public static void main(String args[]) {

		int num = 15456;

		int remainder, result = 0;

		while (num > 0) {

			remainder = num % 10;

			result = result * 10 + remainder;

			num = num / 10;

		}

		System.out.println("Reverse number is : " + result);

	}

}
