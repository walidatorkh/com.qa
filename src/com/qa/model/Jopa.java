package com.qa.model;

public class Jopa extends Animal {

	public Jopa(String name, int age) {
		super(name, age);
	}

	@Override

	public String sayHello() {
		return "puk puk puk";
	}

	@Override

	public String move() {
		return "bzdex bzdex bzdex";
	}

	public String toString() {
		return "Jopa: " + super.toString();

	}
}
