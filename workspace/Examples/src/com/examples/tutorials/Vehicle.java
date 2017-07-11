package com.examples.tutorials;

public class Vehicle {
	String vehicletype;
}

class Car extends Vehicle {
	String modeltype;

	public void showdetail() {
		vehicletype = "car";
		modeltype = "sports";
		System.out.println(modeltype + " " + vehicletype);
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.showdetail();
	}
}