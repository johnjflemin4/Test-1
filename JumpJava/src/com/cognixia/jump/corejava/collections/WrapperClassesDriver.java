package com.cognixia.jump.corejava.collections;

public class WrapperClassesDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
	//must be protected in objects	
		int i;
		short s;
		long l;
		byte b;
		float f;
		double d;
		char c;
		boolean bo;
		
         //Wrapper classes are the solution!
		// reference the prim var from above
		
		
		// autobox means i was able to make object just using =
		
		Integer I = i;
		Short S = s;
		Long L = l;
		Byte B = b;
		Float F = f;
		Double D = d;
		Character C = c;
		Boolean Bo = bo;
		
		String input ="5";
		String input2 = "false";
		
		//Convert the String to Integer, and the from Integer to int
		int NewInt = Integer.valueOf(input);
		boolean newBool = Boolean.valueOf(input2);
		
		System.out.println(!newBool);
		System.out.println(NewInt + 1);
		
		
		
		

	}

}
