package com.controlstatements.java;

class Tesrnary {
	
	int a = 90, b = 100;
	
	public void display() {
		
		System.out.println("Do More Hardwork");
		System.out.println(a);
		System.out.println(b);
	}
}

class Ternary1 extends Tesrnary {
	
	public void result() {
		
		System.out.println("Get a Job as soon as possible");
		
	}
}
public class TernaryTestDemo {

	public static void main(String[] args) {
		
		Ternary1 t = new Ternary1();
		
		/*if (t.a<t.b) {
			System.out.println("Hi");
		} else {
			System.out.println("Hello");
		}*/
		
		String value = (t.a<=t.b)? "Hi" : "Hello"; //---->Ternary operator syntax
		System.out.println(value);
		
		t.display();
		t.result();

	}

}
