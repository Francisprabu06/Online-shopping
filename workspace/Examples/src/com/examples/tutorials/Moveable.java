package com.examples.tutorials;

interface Moveable {
	int AVGSPEED = 40;
	void move();
}

class Vehicle1 implements Moveable {
	public void move() {
		System.out.println("Average speed is " + AVGSPEED);
	}

	public static void main(String[] arg) {
		Vehicle1 vc = new Vehicle1();
		vc.move();
	}
}
