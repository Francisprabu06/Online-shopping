package com.examples.tutorials;

class Parent {
	String name;

	public Parent(String n) {
		name = n;
	}

	public class Child extends Parent {
		String name;

		public Child(String n1, String n2) {
			super(n1);
			this.name = n2;
		}

		public void details() {
			System.out.println(super.name + "and" + name);
		}

		public void main(String[] args) {
			Child c1 = new Child("parent", "child");
			c1.details();
		}

	}

}
