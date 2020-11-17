package com.cognixia.jump.corejava;

import java.util.Scanner;

class BurgerJoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Cook cook = new Cook("John", 2, 30);
		
		Burger burger = new Burger(true, true, true, true, true, false, true, false);
		System.out.println(cook.getName());
		System.out.println("Hi, would you like cheese? 1 = yes, 0 = no");
		int newCheese = input.nextInt();
		
		
		
		System.out.println(burger.isHasCheese());
		System.out.println(" would you like tomatoe? 1 = yes, 0 = no");
		int newTomatoe =input.nextInt();
		System.out.println(" would you like onions? 1 = yes, 0 = no");
		int newOnions = input.nextInt();
		System.out.println(" would you like lettuce? 1 = yes, 0 = no");
		int newLettuce = input.nextInt();
		System.out.println(" would you like mustard? 1 = yes, 0 = no");
		int newPaste = input.nextInt();
		System.out.println(" would you like ketchup? 1 = yes, 0 = no");
		int newKetchup = input.nextInt();
		System.out.println(" would you like chili? 1 = yes, 0 = no");
		int newChili = input.nextInt();
		System.out.println(" would you like pickles? 1 = yes, 0 = no");
		int newPickles = input.nextInt();
		
		Burger newBurger = new Burger();
		if(newCheese == 1) { 
		 newBurger.setHasCheese(true);
		}
		else {
			newBurger.setHasCheese(false);
		}
		if(newTomatoe == 1) {
			newBurger.setHasTomatoes(true);
		}
		else {
			newBurger.setHasTomatoes(false);
		}
		 if(newOnions == 1) {
			 newBurger.setHasOnions(true);	 
		}
		 else {
			 newBurger.setHasOnions(false);
		}	 
		 if(newLettuce == 1) {
			 newBurger.setHasLettuce(true);
		 }
		 else {
			 newBurger.setHasLettuce(false);
		 }
		 if(newMustard == 1) {
			 newBurger.setHasMustard(true);
		 }
		 else {
			 newBurger.setHasMustard(false);
		 }
		 if(newKetchup == 1) {
			 newBurger.setHasKetchup(true);
		 }
		 else {
			 newBurger.setHasKetchup(false);
		 }
		 if(newChili == 1) {
			 newBurger.setHasChili(true);
		 }
		 else {
			 newBurger.setHasChili(false);
		 }
		 if(newPickles == 1) {
			 newBurger.setHasPickles(true);
		 }
		 else {
			 newBurger.setHasPickles(false);
		 }
			 
		 }
	}


