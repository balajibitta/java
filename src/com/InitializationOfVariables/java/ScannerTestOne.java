package com.InitializationOfVariables.java;

import java.util.Scanner;

public class ScannerTestOne {

	//int rollno;
	//String name;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//ScannerTestOne sc = new ScannerTestOne();
		
		System.out.println("plesae Enter your Name : ");
		String name = input.nextLine();
		System.out.println("The Name is : " +name);
		
		System.out.println("Please Enter your RollNo : ");
		int rollnoFromtheuser = input.nextInt();
		int rollno = 441;
		
		if (rollnoFromtheuser==rollno) {
			System.out.println("The RollNo is : " +rollno);
		} else {
			System.out.println("Access denied!");
		}

	}

}
