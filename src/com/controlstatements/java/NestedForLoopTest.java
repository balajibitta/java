package com.controlstatements.java;

public class NestedForLoopTest {

	public static void main(String[] args) {
		
		//OuterLoop
		for (int i = 0; i<=2; i++) {
			System.out.println("OL :" +i);
			
		//InnerLoop
			for (int j = 0; j<=2; j++) {
				System.out.println("IL : " +j);
			}
			
		}
		
	}

}
