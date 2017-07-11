package com.examples.tutorials;

import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		Set<Integer> ar1 = new HashSet<Integer>();
		ar1.add(34);
		ar1.add(3);
		ar1.add(55);
		Collections.addAll(ar1, 66, 84, 2, 6, 102, 23);
		System.out.println("First Input :" + ar1);
		Set<Integer> ar2 = new HashSet<Integer>();
		ar2.add(3);
		ar2.add(75);
		Collections.addAll(ar2, 56, 2, 23, 108, 33, 49);
		System.out.println("Second Input :" + ar2);
		Set<Integer> temp;
		ar1.equals(ar2);
		if (ar1==ar2){
			temp=ar1;
		System.out.println(ar1);
		}
	}

}
