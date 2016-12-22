package com.qa.model;

public class Dog extends Animal {

	public Dog() {

		super(name, age);

	}

	@Override

	public String sayHello() {

		return "Oh hello! You're back! Hello ! Hello ! I missed you! Hello!";

	}

	@Override

	public String move() {

		return "RUUUUUUUUUUUUN!";
	}

	public String toString() {

		return "Dog: " + super.toString();
	}
}
