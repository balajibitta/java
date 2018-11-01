package com.OopsConcepts.java;

class BaseTest {
	int a = 100;
	
	public void login() {
		System.out.println("login()");
	}
	
	public void logout() {
		System.out.println("logout()");	
	}
}

class Kids extends BaseTest {
	
	public void toys() {
		System.out.println("Toys + Plates + Clothes");
	}
	
	public void clothes() {
		System.out.println("Between Age 1 to 10");
	}
}

class Women extends BaseTest {
	
	public void arments() {
		
		System.out.println("Jowelleries");
	}
}
public class FlipkartInheritTest {

	public static void main(String[] args) {
		
		BaseTest b = new BaseTest();
		 int aresp = b.a;
		 //System.out.println(aresp);
		 System.out.println("a = " +aresp);
			b.login();
			b.logout();
			
	    Kids k = new Kids();
	    	k.login();
	    	k.logout();
	    	k.toys();
	    	k.clothes();
	    	
	    Women w = new Women();
	    	w.login();
	    	w.logout();
	    	w.arments();
	    	
	    /*BaseTest b1 = new BaseTest();
	    	b1.login();
	    	b1.logout();
	    	b1.toys();-----------------------> Compiletime Error*/ 
	    
		
	}

}
