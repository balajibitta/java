package com.controlstatements.java;

import java.util.Iterator;

public class ForLoopTest {

	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) {
			System.out.println(i + "hi"); //-----> Syntax-1
		}
		
		/*int i=1;
		for ( ;i<=5; ) {                  //---------->Syntax-2
			System.out.println(i + "hi");
			i++;
			//break;
		}*/
		System.out.println("Out of the for-loop");
	}

}
