package javaAdvance;

import oOPSconcept.ParentClass;

public class ChildClass2 extends ParentClass{
	
	public void childMethod1() {
		System.out.println("Child method-1");
	}
	
	public static void childMethod2() {
		System.out.println("Child method-2");
	}

	public static void main(String[] args) {
		ChildClass2 cc = new ChildClass2();
		cc.childMethod1();
		childMethod2();
		cc.parentMethod1();
		parentMethod2();
		cc.grandParentMethod1();
		grandParentMethod2();

		// default Vs protected
//		cc.parentMethod3(); // default -> not visible
		cc.parentMethod4(); 

	}

}
