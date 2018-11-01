package com.controlstatements.java;

// Ternary Operators-----> By using this "Ternary operators" 
	//we can write/execute any statement without using If-Else statement.

public class TernaryTest {

	static int a = 90, b = 100;
	
	public static void main(String[] args) {
		
		//int a = 90, b = 100;
		
		String value = (a>=b)? "Hi" : "hello";//---> Syntax of ternary Operator
		
		System.out.println(value);
		
		System.out.println(a);
		System.out.println(b);

	}

}
