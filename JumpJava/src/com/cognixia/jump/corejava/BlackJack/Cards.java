package com.cognixia.jump.corejava.BlackJack;

public class Cards {

	//Card suits and value
	//Can only access private variables from this class

	private int suit;
	private int value;
	private static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	private static String[] values = {"Ace", "one", "two", "three", "four", "five", "six" , "seven", "eight", "nine", "ten", "Jack", "Queen", "King"};
	
	
	Cards(int suit, int values)
	{
		this.suit = suit;
		this.value = values;
	
	}
	
	public String cardString()
	{
		return values[value]+" of "+suits[suit];
	}
	
	
	public int getValue()
	{
		return value;
	}

	public int getSuit()
	{
		return suit;
	}

}