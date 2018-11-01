package com.InitializationOfVariables.java;

import java.util.Scanner;

// per class we can create any no.of objects

public class ScannerTestDemo {

	int rollno;
	String name;
	static String course = "";
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	ScannerTestDemo sc = new ScannerTestDemo();
		
		System.out.println("Enter your RollNo : ");
		System.out.println("Enter your Name : ");
		System.out.println("Enter your CourseName : ");
		
		/*sc.rollno = 441;
		sc.name = "balaji";
		course = "Java & Selenium";*/
		
		sc.rollno = input.nextInt();
		sc.name = input.next();
		course = input.next("java");
		
		System.out.println("RollNO is : " +sc.rollno);
		System.out.println("Name is : " +sc.name);
		System.out.println("CourseName is : " +course);
		
	ScannerTestDemo sc1 = new ScannerTestDemo();
		
		System.out.println("Enter your RollNo : ");
		System.out.println("Enter your Name : ");
		System.out.println("Enter your CourseName : ");
		
		sc1.rollno = input.nextInt();
		sc1.name = input.next();
		course = input.next("selenium");
		
		System.out.println("RollNO is : " +sc1.rollno);
		System.out.println("Name is : " +sc1.name);
		System.out.println("CourseName is : " +course);
		
	    /*System.out.println("Enter your Name : ");
		sc.name = "balaji";                          ---------------> Through object
		System.out.println("Name is : " +sc.name);*/
	}

}
