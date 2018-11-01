package com.controlstatements.java;

// Break---> we should use "break" inside only for, for-each, while, do-while and switch, and if we are use
	//any where else we will get compile time error.

public class BreakTestDemo {

	public static void main(String[] args) {
		
		for (int i = 0; i<=10; i++) {
			//System.out.println(i);
			
			if (i==6) {
				break;
			}
			
			System.out.println(i);
			
			/*else if (i<=5 && i==3) {
				System.out.println(i);
			}*/
				
			}
		System.out.println("out of the for loop");
		}
		
	}


