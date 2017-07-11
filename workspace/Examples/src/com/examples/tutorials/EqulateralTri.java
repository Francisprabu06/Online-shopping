package com.examples.tutorials;

public class EqulateralTri {

	public static void main(String[] args) {
		int num = 10;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <=i; j++) {
				if ((i * j) > num) {
					System.out.print("*");
					System.out.print(" ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}
