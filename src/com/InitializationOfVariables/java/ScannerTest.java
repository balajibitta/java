package com.InitializationOfVariables.java;

import java.util.Scanner;

// "Through Console"---->We can perform initialization of variables through console as well. To do that 
	//in java.util package we have a class called "Scanner class".

public class ScannerTest {

	//int a;
	//String name;
	
	public static void main(String[] args) {
						
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter your name");
		String name = sc.nextLine();
		System.out.println("Name is : " +name);
		
		System.out.println("Please Enter RollNo");
		int rollno = sc.nextInt();
		System.out.println("The RollNo is : " +rollno);
	}

}
