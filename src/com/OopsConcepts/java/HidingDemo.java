package com.OopsConcepts.java;

class ParentDemo {
	public static void job() {
		
		System.out.println("Do More Practice");
	}
}

class ChildDemo extends ParentDemo {
	public static void job() {
		
		System.out.println("Do HordWork and Get a Job As Soon As Possible");
	}
}
public class HidingDemo {

	public static void main(String[] args) {
		
		/*ParentDemo pd = new ParentDemo();
		pd.job();*/
		
		ChildDemo cd = new ChildDemo();
		cd.job();

	}

}
