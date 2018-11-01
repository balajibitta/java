package com.OopsConcepts.java;

class Demo1 {
	
	static int a = 100;
	static int b = 200;
		   int c = 10;
		   
    public static int add() {
    	
    	int c = a+b;
		return c;	
	}
    
    public int addOne() {
    	
    	int c = a+b+this.c;
		return c;
		
	}
}
public class DemoTestOne {

	public static void main(String[] args) {
		
		Demo1 demo = new Demo1();
		
		int aresp = demo.a;
		//System.out.println(aresp);
		System.out.println("a = " +aresp);
		
		int bresp = demo.b;
		System.out.println("b = " +bresp);
		
		int addresp = demo.add();
		System.out.println("c = " +addresp);
		
		int addOneresp = demo.addOne();
		System.out.println("c = " +addOneresp);
		
		//System.out.println(aresp+ "-" +bresp+ "-" +addresp+ "-" +addOneresp+ "");
	}

}
