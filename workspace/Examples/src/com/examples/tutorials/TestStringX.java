package com.examples.tutorials;

public class TestStringX {

	public static void main(String[] args) {

		String str = "Program";
		char[] chars = new char[str.length()];
		int	x=str.length();
		for (int i = 0; i < x; i++) {
			chars[i] = str.charAt(i);
			chars[x - 1 - i] = str.charAt(str.length() - i - 1);
			for (int j = 0; j < x; j++) {
				if (j == i || j == (x - 1 - i)) {
					continue;
				}
				chars[j] = ' ';
			}
			System.out.println(new String(chars));
		}

	}
}
