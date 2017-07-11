package com.examples.tutorials;

public class Inheritance {
	public void p1() {
		System.out.println("Parent Method");
	}
}

class Child extends Inheritance {
	public void c1() {
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.c1();
		obj.p1();
	}
}
