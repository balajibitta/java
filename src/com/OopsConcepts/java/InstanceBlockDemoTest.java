package com.OopsConcepts.java;

class Aa{
	
	Aa(){  //----------->Constructor
		System.out.println("parent class constructor invoked");
	}
}
class B2 extends Aa{
	
	B2(){
		super();
		System.out.println("child class constructor invoked");
	}

	{
		System.out.println("instance initializer block is invoked");
		}

}

public class InstanceBlockDemoTest {

	public static void main(String[] args) {
		B2 b=new B2();
		//B2 b1=new B2();
	}

}
