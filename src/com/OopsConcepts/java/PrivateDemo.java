package com.OopsConcepts.java;

class Test {
	
	private static int a=10;
	
	public void greetings() {
		
		System.out.println("Do HardWork And Get a Job");
		
	}

	public static int getA() {
		return a;
	}

	public static void setA(int a) {
		Test.a = a;
	}
}
public class PrivateDemo {

	public static void main(String[] args) {
		
		Test test = new Test();
		System.out.println(test.getA());
		test.greetings();
	}
}

