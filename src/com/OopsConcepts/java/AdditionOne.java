package com.OopsConcepts.java;

public class AdditionOne {

	static int a = 100;
	static int b = 200;
		   
   public static int  add() {
	
	   int result = a+b;
	   //System.out.println(result);
	   //System.out.println("a+b = " +result);
	return result;
	
}
   
   public static void hello() {
	   
	   System.out.println("Do Hardwork and Get a Job As soon as possible");
	
}
	public static void main(String[] args) {
		
		int aresp = a;
		//System.out.println(aresp);
		System.out.println("a = " +aresp);
		
		int bresp = b;
		//System.out.println(bresp);
		System.out.println("b = " +bresp);
		
		int result = add();
		//System.out.println(result);
		System.out.println("result = " +result);
	}

}
