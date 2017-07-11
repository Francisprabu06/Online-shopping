package com.examples.tutorials;

import java.util.Scanner;

public class Consvowel {
	public static void main(String[] args) {
		char[] vowel = { 'a', 'e', 'i', 'o', 'u' };
		while (true) {
			int f = 0;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a String");
			String word = s.next();
			int length = word.length();
			char[] ch = word.toCharArray();
			for (int i = 0; i < length - 2; i++) {
				for (int j = 0; j < 5; j++) {
					if ((ch[i] == vowel[j]) && (ch[i + 1] == vowel[j])
							&& (ch[i + 2] == vowel[j])) {
						f++;
						break;
					}
				}
				if (f == 1)
					break;

			}
			if (f == 1) {
				System.out.println("Hard to pronounce");
			} else {
				System.out.println("Can be pronounced");
			}
		}
	}

}
