package com.InitializationOfVariables.java;

public class ConstructorDemo2 {

	int id;
	String name;
	float a;
	public ConstructorDemo2(int id1, String name1) {
		
		id = id1;
		name = name1;
	}
	
	public ConstructorDemo2() {
		
		System.out.println("Default Constructor");
	}
	
public ConstructorDemo2(float a1) {
		
		a = a1;
	}
public void display() {
	System.out.println(id+ " - " +name);
	
}
public void display1() {
	System.out.println(a);
}


public static void main(String[] args) {
	
	ConstructorDemo2 cd = new ConstructorDemo2();
	
	ConstructorDemo2 cd1 = new ConstructorDemo2(441, "balaji");
	//System.out.println(cd1.id+ " - " +cd1.name);
	
	ConstructorDemo2 cd2 = new ConstructorDemo2(10.01f);
	//System.out.println(cd2.a);
	cd1.display();
	cd2.display1();
	
}
	
}
