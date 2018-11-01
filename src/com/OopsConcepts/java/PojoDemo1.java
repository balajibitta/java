package com.OopsConcepts.java;

public class PojoDemo1 {

	private int a = 100;
	private int code = 123;
	private String name = "balu";
	
	/*public int getCode() {
		
		return code;
		
	}
	
	public String getName() {
		
		return name;
		
	}*/
	public static void main(String[] args) {
		
		PojoDemo1 p = new PojoDemo1();
		
		//System.out.println("a = " +a);------->This a integer is private not access inside main method
		//System.out.println(p.getCode());
		System.out.println(p.code);
		//System.out.println(p.getName());
		System.out.println(p.name); //---------------->This is not Pojo Mechanism
	}

}
