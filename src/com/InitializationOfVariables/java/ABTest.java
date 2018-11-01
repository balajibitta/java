package com.InitializationOfVariables.java;

class A {
	
	public  A() {
		super();
		System.out.println("A class Constructor");
	}
}

class B extends A {
	public B() {
		super();
		System.out.println("B class Constructor");
	}
}
public class ABTest {

	public static void main(String[] args) {
		
		B b = new B();
	
		
	}

}
