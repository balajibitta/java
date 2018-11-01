package com.InitializationOfVariables.java;

class College {
	//int x, y, z;
	
	 College() {
		System.out.println("Default Constructor");
	}
	 College(int x) {
		System.out.println("A");
	}
	 College(int x, int y, int z) {
		System.out.println("B");
	}
}
class Student extends College {
	
	 /*Student() {
		 
		System.out.println("Default Constructor One");
	}*/
	 Student(int id) {
		 this(1,2);
		System.out.println("D");
	}
	Student (int id, int id1) {
		super(3, 4, 5);
		System.out.println("E");
	}
}
public class ConstructorTest {

	public static void main(String[] args) {
	
		//Student s = new Student();
		//Student s1 = new Student(441);
		Student s2 = new Student(701, 441);
	}

}
