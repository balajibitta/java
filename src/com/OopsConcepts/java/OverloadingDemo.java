package com.OopsConcepts.java;

class DemoOne {
	
int a,b;
	
	public void add(int a, int b) {
		
		int c = a+b;
		//System.out.println(c);
		System.out.println("c = " +c);
	}
	public void add(float a, float b) {
		
		float c = a+b;
		System.out.println("c = " +c);
	}
	public void add(double a, double b) {
		
		double c = a+b;
		System.out.println("c = " +c); 
	}
	public void add() {
		
		System.out.println("No Arguments in add() Method");
	}
}
public class OverloadingDemo {

	public static void main(String[] args) {
			
			DemoOne d = new DemoOne();
			
			d.add();
			d.add(10, 20);
			d.add(100f, 20f);
			d.add(101.0, 200.5);
			
		}
	}

