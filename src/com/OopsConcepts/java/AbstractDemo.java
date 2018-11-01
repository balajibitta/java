package com.OopsConcepts.java;

abstract class Test1 {
	
	abstract public  void m1(); 
	abstract public void m2();
	
	public  void m3() {
		System.out.println("m3");
	}
	
	public void m4() {
		System.out.println("m4");
	}
	public static void m5() {
		System.out.println("m5");
	}
}

class Test2 extends Test1 {

	public  void m1() {
		System.out.println("m1");	
	}

	public void m2() {
		System.out.println("m2");
		
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		
		Test2 t2 = new Test2();
		
		t2.m1();
		t2.m2();
		t2.m3();
		t2.m4();
		
		Test2.m5();
		
	}

}
