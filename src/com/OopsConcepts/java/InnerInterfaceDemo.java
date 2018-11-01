package com.OopsConcepts.java;

interface Aone {    // Outer Interface
	
	abstract void a();
	abstract void b();
	
	interface Bone {  //Inner Interface
		
		abstract void c();
		abstract void d();	
		
	} //Inner interface closed
} // Outer interface closed

class AoneImpl implements Aone {

	@Override
	public void a() {
		System.out.println("OUTER : a");
		
	}

	@Override
	public void b() {
		System.out.println("OUTER : b");
		
	}
	
}

class BoneImpl implements Aone.Bone {

	@Override
	public void c() {
		System.out.println("INNER : c");
		
	}

	@Override
	public void d() {
		System.out.println("INNER : d");
		
	}
	
}

class ABoneImpl implements Aone, Aone.Bone {

	@Override
	public void c() {
		System.out.println("INNER : c");
		
	}

	@Override
	public void d() {
		System.out.println("INNER : d");
		
	}

	@Override
	public void a() {
		System.out.println("OUTER : a");
		
	}

	@Override
	public void b() {
		System.out.println("OUTER : b");
		
	}
	
}
public class InnerInterfaceDemo {

	public static void main(String[] args) {
		
		ABoneImpl ab = new ABoneImpl();
		
		ab.a();
		ab.b();
		ab.c();
		ab.d();
		
		/*AoneImpl a = new AoneImpl();
		
		a.a();
		a.b();
		
		BoneImpl b = new BoneImpl();
		
		b.c();
		b.d();*/

	}

}
