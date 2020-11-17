package com.cognixia.jump.corejava;

import com.cognixia.corejava.classes.Animal;
import com.cognixia.corejava.classes.Dog;

public class NatureDriver {

	public static void main(String[] args) {
		
		// Default constructor - when it's not defined in the class
		Animal animal = new Animal();
		Animal animal2 = new Animal("Reptile", 1.0, 1, true, true);
		Animal animal3 = new Animal("Mamal");
		Animal animal4 = new Animal("Fish");
		
		System.out.println("First animal type: " + animal.getType());
		System.out.println(animal2.getType());
		animal.setType("Bird");
		System.out.println("First animal type: " + animal.getType());
		
		animal3.sound("Woof");
		String storage = animal3.getType();
		System.out.println(Animal.count);
		Animal.printAnimals();
		//System.out.println(animal3.count);
		
		// Inheritance
		Dog dog = new Dog();
		dog.setType("Maltese"); 
		System.out.println(dog.getType());
		
		Dog dog1 = new Dog("Maltese", "dog", 10, 1, true, true);
		System.out.println(dog1.getType());
		
		dog1.sound("woof");
		animal2.sound("bark");
	}

}
