package com.OopsConcepts.java;

abstract class AbstractDemo1 {

	static int a =10, b=20;
	
	
	 static int hello() {
		int c = a+b;
		System.out.println("hello");
		return c;
	}
	public static void main(String[] args) {
	
		//AbstractDemo1.hello();
		
		int cresp = AbstractDemo1.hello();
		System.out.println(cresp);
	}

}
