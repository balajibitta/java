package com.InitializationOfVariables.java;

class DemoA{

	int id = 441;
	String name = "balu";
	
	
	public void hello() {
		System.out.println(id+ " - " +name);
	}
}
class DemoB extends DemoA {
	
	int id = 701;
	String name = "balaji";
	
	public void hello() {
		
		System.out.println(this.id+ " - " +this.name);
		//System.out.println(super.id+ " - " +super.name);
		super.hello();
	}
}
public class ThisSuperTestDemo {

	public static void main(String[] args) {
		
		DemoB d = new DemoB();
		d.hello();

	}

}
