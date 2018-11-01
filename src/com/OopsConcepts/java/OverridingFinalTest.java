package com.OopsConcepts.java;

class A {
	
	int a = 100;
	
	public void hello() {
		System.out.println("Do Hardwork");
	}
	
	public void display() {
		System.out.println("And Get a Job As soon as possible");
	}
}

final class B extends A {
	
	@Override
	 public void hello( ) {
		System.out.println("Do More Practice");
	}
	
	final public void display() {
		System.out.println("Remove Lazyness");
	}
}
public class OverridingFinalTest {

	public static void main(String[] args) {
		
		B b = new B();
		
		b.hello();
		b.display();
		
		
		A a = new A();
		
		a.hello();
		a.display();
	
		
		

	}

}
