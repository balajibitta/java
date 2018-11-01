package com.OopsConcepts.java;

//Encapsulation means -> Binding with data

class Student {
	
	private int rollno;
	private String name;
	
	//Getter and Setter Methods
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class EncapsulationDemoTest {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setRollno(441);
		s.setName("balaji");
		
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		
		
	}

}
