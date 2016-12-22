package com.qa.model;

public class Tarakan extends Animal {

	public Tarakan(String name, int age) {
		super(name, age);
	}

	@Override

	public String sayHello() {
		return "salut zasrancy";
	}

	@Override

	public String move() {
		return "upizdovaliwe tarakaniwe!";
	}

	public String toString() {
		return "Tarakan: " + super.toString();
	}
}
