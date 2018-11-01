package com.InitializationOfVariables.java;

public class ConstructorDemo {

	int a;
	int b;
	String name;
	
	public  ConstructorDemo(int a1, int b1, String str) {
		
		a=a1;
		b=b1;
		name = str;
		
	}
	public ConstructorDemo() {
		System.out.println("Default Constructor");
	}
	public static void main(String[] args) {
		
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd1 = new ConstructorDemo(10,20,"java");
		
		int result = cd1.a+cd1.b;
		System.out.println(result);
		
		ConstructorDemo cd2 = new ConstructorDemo(30,40, "selenium");

	}

}
