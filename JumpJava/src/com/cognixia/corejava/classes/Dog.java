package com.cognixia.corejava.classes;

public class Dog extends Animal {
	
	private String breed;
	
	public Dog() {
		super("", 0, 0, true, false);
		this.breed = "";
	}

	public Dog(String breed) {
		super("", 0, 0, true, false);
		this.breed = breed;
	}
	
	public Dog(String breed, String type, double weight, double height, boolean isDomestic, boolean isPredator) {
		super(type, weight , height, isDomestic, isPredator);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	//Methods
	// method override - runtime polymorphism
	
	@Override
	public void sound(String noise) {
		System.out.println("A dog goes: " + noise);
	}	

   //Method overloading - compile time polymorphism
   public void sound(String alarmNoise, String grunt) {
	   
   }
