package com.InitializationOfVariables.java;

//
public class ConstructorDemoTest {

	int id ;
	String name;
	
	public ConstructorDemoTest(int id1, String name1) {
		
		id = id1;
		name = name1;
	}
	
	public void hello() {
		System.out.println(id+ " - " +name);
	}

}
class Demo extends ConstructorDemo2 {
	
	int id;
	String name;
	
	public Demo(String name1) {
		
	name = name1;
	
    }
	public void display() {
		System.out.println(this.name);
		System.out.println(super.id+ " - " +super.name);
	}
	
	public static void main(String[] args) {
		
		ConstructorDemoTest cd = new ConstructorDemoTest(10, "balu");
		
	}
}