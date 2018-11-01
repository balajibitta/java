package com.OopsConcepts.java;

public class EncapsulationTest {

	public static void main(String[] args) {
		
		Student1 s1 = new Student1();
		
		s1.setRollno(701);
		s1.setName("balaji");
		
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());

	}

}
