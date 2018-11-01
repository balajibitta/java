package com.controlstatements.java;

public class SwitchTest {

	public static void main(String[] args) {
		
		String browser = "chrome";
		
		switch (browser) 
		{
		case "firefox":
			System.out.println("firefox browser");
			break;

		default:
			System.out.println("default case");
			break;
			
		case "chrome":
			System.out.println("chrome browser");
			break;
			
		case "ie":
			System.out.println("ie browser");
			break;
		}
		
		System.out.println("Out of the Switch");
	}

}
