package com.cognixia.jump.corejava.eceptions;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionsDriver {
	
	//java ea ExceptionDriver
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int input, answer = 0;
		System.out.println("Type a number: ");

	try {
	    input = scan.nextInt();
	    answer = 10 / input;
	    System.out.println(answer);

} catch(InputMismatch Exception e) {
	System.out.println("Something went wrong");
	//e.printStackTrace();
	catch(ArithmeticException e) {
		System.out.println(e.getmessage());
		// same thing as e.printStackTrace
		System.out.println("Illegal operation, you " + e.getmessage());
		e.printStackTrace();
	}
	finally {
}
	
}
	
	
