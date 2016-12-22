package com.qa.model;

public class Papuas extends Animal {

	public Papuas(String name, int age) {
		super(name, age);
	}

	@Override

	public String sayHello() {
		return "uxa uxa uxa";
	}

	@Override

	public String move() {
		return "pryg skok & pryg skok ";

	}

	public String toString() {
		return "Papuas: " + super.toString();
	}
}
