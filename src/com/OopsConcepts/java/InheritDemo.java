package com.OopsConcepts.java;

class DemoTest {
	
	int a = 100;
	public void hello() {
		
		System.out.println("Hello Method");
	}
	public void display() {
		
		System.out.println("Display Method");
	}
}

class ChildDemoTest extends DemoTest {
	
	int b = 200;
	static int c = 300;
	
	public void childMethod() {
		
		System.out.println("Child Method");
	}
}
public class InheritDemo {

	public static void main(String[] args) {
		
		ChildDemoTest cd = new ChildDemoTest();
		
		System.out.println("a = " +cd.a);
		System.out.println("b = " +cd.b);
		System.out.println("c = " +cd.c);
		
		cd.hello();
		cd.display();
		cd.childMethod();

	}

}
