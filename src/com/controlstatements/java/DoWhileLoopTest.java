package com.controlstatements.java;

// do-while--->Java do while loop is used to execute a block of statements continuously until the given condition is true.
//do while loop in java is similar to while loop except that the condition is check after the statements are executed,
//so do while loop guarantees the loop execution at least once.

public class DoWhileLoopTest {

	static int a = 100, b = 10;
	
	public static void main(String[] args) {
		
		int result = a+b;
		int i = 5;
		
		do {
			System.out.println(i);
			i++;
		} while (i<=10);
		
		System.out.println("result = " +result);
	}

}
