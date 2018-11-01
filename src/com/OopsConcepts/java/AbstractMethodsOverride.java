package com.OopsConcepts.java;

// We can override "abstract methods" in the child classes by removing abstract modifier to that child classes 
	//and providing method body with implementations.....

abstract class AbsOne {
	
	public void balanceEnquiry() {
		System.out.println("Balance Enquiry");
	}
	
	abstract void pinChange( );
	abstract void miniStatement();
	
	public void hello() {
		System.out.println("Please Do Hardwork");
	}
}
  class AbsTwo extends AbsOne {

	public void cashDeposite() {
		System.out.println("Cash Deposite");
		
	}
	@Override
	void pinChange() {
		System.out.println("Pin Change");	
	}
	@Override
	void miniStatement() {
			System.out.println("MiniStatement");
	}
	
	public void display() {
		System.out.println("Practice well and Get a Job");
		
	}
}

 class AbsThree extends AbsTwo {

	public void cashWithDraw() {
		System.out.println("Cash Withdraw");
	}
}
  class AbstractMethodsOverride {

	public static void main(String[] args) {
		
		AbsThree a = new AbsThree();
		
		a.balanceEnquiry();
		a.hello();
		a.cashDeposite();
		a.pinChange();
		a.display();
		a.miniStatement();
		a.cashWithDraw();
		
			//( Or )
		
		AbsTwo t = new AbsTwo();
		
		t.balanceEnquiry();
		t.cashDeposite();
		t.display();
		t.hello();
		t.cashDeposite();
		t.pinChange();
		//t.cashWithDraw(); 
		
	}
 }


