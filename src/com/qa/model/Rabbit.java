package com.qa.model;

public class Rabbit extends Animal {

	public Rabbit(String name, int age) {

		super(name, age);

	}

	@Override
	
	public String sayHello() {
		return "Snuffle Snuffle";
	}

	@Override

	public String move() {
		return "hop hop hop";

	}

	public String toString() {
		return "Rabbit: " + super.toString();
	}
}
