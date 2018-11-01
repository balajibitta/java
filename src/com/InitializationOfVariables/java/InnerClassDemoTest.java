package com.InitializationOfVariables.java;

import com.InitializationOfVariables.java.ATest.BTest;

class ATest {  //------------> Outer Class
	int a = 100;
	
	public int getA() {
		System.out.println("getA - " +a);
		return a;
	}
	
	static class BTest {   // Inner Class
		
		int a=200;
		public int getA() {
			System.out.println("getA - " +this.a);
			return a;
		}		
	} // static Inner class closed
	
	public void hello() {
		System.out.println("do more practice");
	}
}//Outer Class closed
public class InnerClassDemoTest {

	public static void main(String[] args) {
	
		ATest at = new ATest();
		
		at.getA();
		at.hello();
				
		ATest.BTest  ab = new ATest.BTest();

		ab.getA();
	}

}
