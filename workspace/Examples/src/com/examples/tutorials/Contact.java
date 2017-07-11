package com.examples.tutorials;

import java.util.ArrayList;

public class Contact {
	String first_name;
	String last_name;
	String phone_no;

	public Contact(String fn, String ln, String pn) {
		first_name = fn;
		last_name = ln;
		phone_no = pn;
	}

	public String toString() {
		return first_name + " " + last_name + "(" + phone_no + ")";
	}

	public static void main(String[] args) {
		Contact c1 = new Contact("Francis", "prabu", "8220318148");
		Contact c2 = new Contact("Ms", "dhoni", "8220318149");
		Contact c3 = new Contact("virat", "khozli", "8220318150");
		ArrayList<Contact> al = new ArrayList<Contact>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		System.out.println(al);
	}
}
