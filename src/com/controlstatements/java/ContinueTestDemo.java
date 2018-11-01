package com.controlstatements.java;

// Continue---->It is a keyword. we should use this keyword inside looping statements

public class ContinueTestDemo {

	public static void main(String[] args) {
		
		/*for (int i = 0; i<=10; i++) {
		 
			if (i==6) {
				continue;
			}
			System.out.println(i);
	}*/
			int i = 2;
			
		/*while (i<=8) {
			i++;
			
			if (i==6) {
				continue;
			}
			System.out.println(i);
		}*/
			
			do {
				i++;
				if (i==6) {
					continue;
				}
				System.out.println(i);
			} while (i<=8);

		System.out.println("Out of the for loop");
	}

}
