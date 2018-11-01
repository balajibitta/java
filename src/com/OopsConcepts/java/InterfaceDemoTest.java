package com.OopsConcepts.java;

import com.OopsConcepts.java.Ab.Bb;

interface Ab {
	
	int a = 100;
	String name = "balaji";
	
	abstract void hello();
	
	interface Bb {
		int a = 200;
		String name = "selenium";
		
		abstract void display();
	}
}

class AbImpl implements Ab,Ab.Bb {

	@Override
	public void hello() {
		System.out.println("practice More");
		
	}

	@Override
	public void display() {
		System.out.println("practice well");
		
	}
	
}
public class InterfaceDemoTest {

	public static void main(String[] args) {
		
		System.out.println(Ab.name);
		System.out.println(Ab.a);
		System.out.println(Bb.a);
		System.out.println(Bb.name);
		
		AbImpl a = new AbImpl();
		
		a.hello();
		a.display();
		//System.out.println(a.name);
		//System.out.println(Ab.name);
		//System.out.println(a.a);
		//System.out.println(Ab.a);
	}

}
