package com.examples.tutorials;

import java.util.Scanner;

public class EquiTri {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number you Want");
		int numofrows = sc.nextInt();
		int rowCount = 1;
		System.out.println("Here is your pramid");
		for (int i = numofrows; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= rowCount; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
			rowCount++;
		}

	}
}
