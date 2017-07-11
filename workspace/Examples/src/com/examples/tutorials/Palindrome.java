package com.examples.tutorials;

import java.util.*;
import java.lang.*;

class Palindrome {
	public static void main(String args[]) {
		String chr = "malayalam";
		String reverse = "";
		int len = chr.length();

		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + chr.charAt(i);
		}
		System.out.println("Reversed String is: " + reverse);

		if (chr.equals(reverse)) {
			System.out.println("The Given String is Palindrome");
		} else {
			System.out.println("The Given String is not a Palindrome");
		}
	}
}