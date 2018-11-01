package com.OopsConcepts.java;

class AaOne {
	
	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("instance initializer block");
	}
}

class BbOne extends AaOne {
	
	public void hello() {
		System.out.println("hello");
	}
	
	public BbOne() {
		System.out.println("BbOne class constructor");
	}
	static {
		System.out.println("static block of child class");
	}
	static {
		System.out.println("static block1 of child class");
	}
	{
		System.out.println("instance initializer block of child class");
	}
	
	//{System.out.println("instance initializer block of child class");} ----> we can write instance block in this way also
}

public class StaticAndIstanceBlocksTest {

	public static void main(String[] args) {
		
		BbOne b = new BbOne();
		b.hello();
	
	}

}
