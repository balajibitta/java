package com.OopsConcepts.java;

// Interface cotains only abstract methods, we should implement that interface only child classes
	//are responsible to provide implementations.

interface ATM {
	
	abstract void cashWithDraw();
	abstract void miniStatement();
	abstract void balanceEnquiry();
	abstract void pinChange();
}

abstract class AtmImplement implements ATM {
	
	public void cashWithDraw() {
		System.out.println("CashWithdraw");
	}
	public void miniStatement() {
		System.out.println("miniStatement");
	}
	public void pinChange() {
		System.out.println("pinChange");
	}
	/*public void mobileRegistration() {
		System.out.println("mobileRegistration");
	}*/
}

 class AtmTest extends AtmImplement {
	
	public void balanceEnquiry() {
		System.out.println("balanceEnquiry");
	}
	/*public void fastCash() {
		System.out.println("fastCash");
	}*/
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		
		AtmTest test = new AtmTest();
			
		test.cashWithDraw();
		test.balanceEnquiry();
		test.miniStatement();
		test.pinChange();
		
		//test.fastCash();
		//test.mobileRegistration();
		
//or we can create object by using interface reference, so that we can access only
		//interface specific methods
		
		/*ATM atm = new AtmTest();
		
		atm.cashWithDraw();
		atm.balanceEnquiry();
		atm.miniStatement();
		atm.pinChange();*/
		
		
	}

}
