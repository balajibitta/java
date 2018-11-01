package com.OopsConcepts.java;

import java.awt.GraphicsEnvironment;

public class TestDemo2 {

	int a = 10;
	static int b = 100;
	
	public void greetings() {
		
		System.out.println("Gud9t");
	}
	public static void display() {
		
		System.out.println("Welcome to Selenium Practice well and get a job");
	}
	
	public static void main(String[] args) {
		
		TestDemo2 testDemo2 = new TestDemo2();
		
		//System.out.println(b);
		System.out.println("The value of b is :" +b);
		System.out.println("The value of a is :" +testDemo2.a);
		
		display();
		testDemo2.greetings();
	}
}
