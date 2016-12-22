package com.qa.model;

public class Pizdyuk extends Animal {

	public Pizdyuk(String name, int age) {
		super(name, age);
	}

	@Override

	public String sayHello() {
		return " pizdyukovina pizdyukovina pizdyukovina";
	}

	@Override

	public String move() {
		return "pizdyk pizdyk pizdyk";
	}

	public String toString() {
		return "Pizdyuk: " + super.toString();
	}
}
