package com.OopsConcepts.java;

public class TestDemo3 {

	static int a= 10;
	static int b = 20;
	
	public void greetings() {
		
		System.out.println("Gud9t");
	}
	public static void display() {
		
		System.out.println("Do HardWork and Get Job On Selenium");
	}
	public static void main(String[] args) {
		
		TestDemo3 testDemo3 = new TestDemo3();
		
		int c = TestDemo3.a;
		int d = TestDemo3.b;
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		
		display();
		testDemo3.greetings();
	}
}
