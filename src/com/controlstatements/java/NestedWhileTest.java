package com.controlstatements.java;

public class NestedWhileTest {

	public static void main(String[] args) {
		
		int i=1;
			
		//Outer loop
		while (i<=3) {
			System.out.println("OL : " +i);
			
			//Inner Loop
			int j=2;
			
			while (j<=4) {
				System.out.println("IL : " +j);
				
				//System.out.println(i+ ":" +j);
				j++;
			}
			i++;
		}

	}

}
