package com.OopsConcepts.java;

public class TestDemo5 {
	
	int a=100;
	static int b = 200;
	int c = 100;
	static int d;
	int e;
	
	public void hello() { 
		System.out.println("b = " +b);
		
		int result = a+b;
		System.out.println("result = " +result);
		int f = a+e;
		System.out.println("f = " +f);
	}
	
	public static void display() {
		TestDemo5 t = new TestDemo5();
		
		//System.out.println("a = " +.a);
		
		 int d = t.a+t.c;
			System.out.println("d =" +d);
			
			int result = t.a+d;
			  System.out.println("Result = " +result);
			  
		System.out.println("Do HardWork and get a job as soon as possible");
	}

	public static void main(String[] args) {
		
	  TestDemo5 t = new TestDemo5();
	  
	  t.hello();
	  display();
	}

}
