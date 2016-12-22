package com.qa.model;

public class Camel extends Animal {

	public Camel(String name, int age) {
		super(name, age);

	}

	@Override

	public String sayHello() {
		return "I'm camel XA-xA!";

	}

	@Override

	public String move() {
		return "kovylyau kak mogu";
	}

	public String toString() {
		return "Camel: " + super.toString();
	}
}
