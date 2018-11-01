package com.InitializationOfVariables.java;

class Person {
	
	int id;
	String name;
	
	public Person(int id1, String name1) {
		
		//this.id = id;
		//this.name = name;
		
		id = id1;
		name = name1;
	}
	public Person() {
		System.out.println("Default Constructor");
	}
	public void display() {
		
		System.out.println(id+ " - " +name);
	}
}
public class ConstructorDemo1 {

	public static void main(String[] args) {
		
		Person p = new Person(441,"balaji");
		//System.out.println(p.id+ " - " +p.name);
		Person p1 = new Person();
		p.display();
	}

}
