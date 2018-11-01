package com.OopsConcepts.java;

class PojoDemo {
	
	private int code = 123;
	private String name = "Balu";
	private char letter = 'B';
	
	public int getCode() {
		
		//System.out.println(code);
		return code;
	}
	
	public String getName() {
		
		//System.out.println(name);
		return name;
	}
	
	public char getLetter( ) {
		
		//System.out.println(letter);
		return letter;
	}
}
public class PojoDemoTest {

	public static void main(String[] args) {
		
		PojoDemo p = new PojoDemo();
		
		System.out.println(p.getCode());
		System.out.println(p.getName());
		System.out.println(p.getLetter());
		
		//System.out.println(p.code);--------------> CompileTime Error
		
		/*p.getCode();
		p.getName();
		p.getLetter();*/
	}

}
