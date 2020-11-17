package com.cognixia.corejava.abstactAndinterfaces;

public interface GameCharacter {
	
	//Attributes - they are always public static final
	
	int Max_Speed = 100;
	
	//Methods they are always abstract
	public int move(int x, int y);
	public int jump(int strength);
	public int attack(int strength);
	public int run(int dexterity);
	public int defend(int vitality);
	public String speak(String message);
	
	

}
