package com.controlstatements.java;

public class ElseIfTest {

	 int a=100, b=1000;
	
	 public void hello() {
		 int a=50, b=150;
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		
		int a=10, b=20;
		int PracticeHours = 5;
		
		if (PracticeHours>6) {
			System.out.println("Do Hardwork and after that Things will be in your control");
		}
		else if (PracticeHours<=6 && PracticeHours>=4) {
			System.out.println("practice more");
		}
		else if (PracticeHours<=3 && PracticeHours>=6) {
			System.out.println("Doing Good Job");
		}
		else {
			System.out.println("Atleast starts now onwards");
		}
		
		ElseIfTest e = new ElseIfTest();
		e.hello();
		System.out.println(a);
		System.out.println(b);
		System.out.println(e.a);
	}

}
