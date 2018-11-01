package com.OopsConcepts.java;

public class TestDemo4 {

	int a = 100;
	static int b = 200;
	
	public void display() {
		
		System.out.println("Do More Practice on Selenium and Get a Job");
		
	}
	public static void main(String[] args) {
		
		TestDemo4 testDemo4 = new TestDemo4();
		
		int c = testDemo4.a;
		int d = testDemo4.b;
		//int d1 = TestDemo4.b;
		System.out.println("c = " +c);
		System.out.println("d = " +d);
		
		testDemo4.display();
	}
}
