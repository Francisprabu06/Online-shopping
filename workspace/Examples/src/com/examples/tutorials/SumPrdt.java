package com.examples.tutorials;

public class SumPrdt {

	public static void main(String args[]) {

		int num = 6;

		int temp = num, result = 0;

		while (temp > 0) {

			result = result + temp;

			temp--;

		}

		System.out.println("Sum of Digit for " + num + " is : " + result);

		temp = num;

		result = 1;

		while (temp > 0) {

			result = result * temp;

			temp--;

		}

		System.out.println("Product of Digit for " + num + " is : " + result);

	}

}
