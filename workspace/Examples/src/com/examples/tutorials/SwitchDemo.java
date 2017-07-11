package com.examples.tutorials;

public class SwitchDemo {

	public static void main(String args[]) {

		int marks = 60;

		switch (marks / 10) {
		case 1:

			System.out.println("Very Poor");

			break;
		case 2:

			System.out.println("Poor");

			break;
		case 3:

			System.out.println("Work Hard");

			break;
		case 4:

			System.out.println("Good");

			break;
		case 5:

			System.out.println("Very Good");

			break;
		case 6:

			System.out.println("Excellent");

			break;
		default:

			System.out.println("Invalid value Entered");

		}

	}

}
