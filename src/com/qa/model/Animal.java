package com.qa.model;

public abstract class Animal {

	// private fields

	protected String name;

	private int age;

	// constructor

	public Animal(String name, int age) {

		this.name = name;
		this.age = age;
	}

	// setters and getters for name and age

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// abstract methods, the animal class doesn't know
	// how to implement these. We need some concrete
	// instalations

	public abstract String sayHello();

	public abstract String move();

	public String toString() {
		return "Name: " + name + "Age: " + age;

	}

}
