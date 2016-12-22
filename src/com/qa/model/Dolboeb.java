package com.qa.model;

public class Dolboeb extends Animal {

	public Dolboeb(String name, int age) {
		super(name, age);
	}

	@Override

	public String sayHello() {
		return "dolben YA!";

	}

	@Override

	public String move() {
		return "dolboeb ueben";
	}

	public String toString() {
		return "Dolboeb: " + super.toString();
	}
}
