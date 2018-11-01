package com.OopsConcepts.java;

class Demo2 {
	
	private int a = 100;
	
	public void hello() {
		//int aresp = a;
		System.out.println("a = " +a);
		System.out.println("Do HardWork and");
		
	}
}

 class Demo3 extends Demo2 {
	
	private int b = 200;
    
	public void display() {
		System.out.println("b = " +b);
	}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		
		//System.out.println("a = " +a);------->This a integer is private not access inside main method
		
		Demo3 d = new Demo3();
		d.hello();
		d.display();

	}

}
