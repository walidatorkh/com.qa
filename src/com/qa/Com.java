package com.qa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.qa.model.Animal;

//import com.qa.model.Camel;
//import com.qa.model.Cat;
//import com.qa.model.Dog;
//import com.qa.model.Dolboeb;
//import com.qa.model.Jopa;
//import com.qa.model.Papuas;
//import com.qa.model.Pizdyuk;
//import com.qa.model.Rabbit;
//import com.qa.model.Tarakan;

public class Com extends Animal {
    public Com(String name, int age) {
		super(name, age);
    }
    Collection<String> col = new ArrayList<>();

	System.out.println("is empty " + col.isEmpty());
	
	System.out.println("+========================================");

	col.add(new Dog[0])


//	public static void main(String[] args) {
//		ArrayList<String> animal = new ArrayList<String>();	//	Animal String[] = new Object[10];
//		
//	    animal.addAll((Collection<? extends String>) new Dog();
//		animal.add = Cat();
//		Animal[2] = Camel;
//		Animal[3] = Dolboeb;
//		Animal[4] = Jopa;
//		Animal[5] = Papuas;
//		Animal[6] = Pizdyuk;
//		Animal[7] = Rabbit;
//		Animal[8] = Tarakan;
//		System.out.println(Animal[]);
		//Object Dog, Camel, Jopa, Cat, Dolboeb, Papuas, Pizdyuk, Rabbit, Tarakan;
//		col = new Dog();
//		col = new Cat();
//		col = new Camel();
//		col = new Dolboeb();
//		col = new Jopa();
//		col = new Papuas();
//		col = new Pizdyuk();
//		col = new Rabbit();
//		col = new Tarakan();
		
		System.out.println(col.isEmpty());
		//Collection<Integer> col = new ArrayList<>();
		//Object[] obs = col.toArray();
		
		//System.out.println("is empty " + col.isEmpty());
		//List<Integer> list = new ArrayList<>();
		//list.add(index, element);
		System.out.println();
	}


	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String move() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
