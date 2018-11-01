package com.controlstatements.java;

public class IfElseTestDemo {

	static int a = 10;
	static float b=10.5f;
	
	public static void main(String[] args) {
		
		//int a = 10, b = 20;
		
		/*if (a>b) {
			
			System.out.println("if-block");
		}
		else {
			System.out.println("else-block");
		}*/
		
		if (a==b) 
			System.out.println("if-block");
		
		else 
			System.out.println("else-block");
		
		
		System.out.println("a = " +a);
		System.out.println("b = " +b);
	}

}
