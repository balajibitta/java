package com.OopsConcepts.java;

class Parent {
	
	public void hello() {
		
		System.out.println("hello");
	}
	
	public void display() {
		
		System.out.println("display");
	}
}

class Child extends Parent {
	
	@Override
	public void hello() {
		
		System.out.println("Hello");
	}
	
	public void greetings() {
		
		System.out.println("Greetings");
	}
}

public class OverridingTest {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.hello();
		p.display();
		
		Child cd = new Child();
		cd.hello();
		cd.display();
		cd.greetings();
		
		Parent p1 = new Child();
		p1.hello();
		p1.display();
		
		
		

	}

}
