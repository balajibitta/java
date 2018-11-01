package com.OopsConcepts.java;

public class Student1 {

	/*int rollno;
	String name;*/
	
	private int rollno;
	private String name;
	
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
	
	public static void main(String[] args) {
	
		Student1 st = new Student1();
		
		//st.name = "balaji";
		//st.rollno = 441;
		
		st.setName("balaji");
		st.setRollno(441);
		
		System.out.println(st.getName());
		System.out.println(st.getRollno());
		
	}
	
}
