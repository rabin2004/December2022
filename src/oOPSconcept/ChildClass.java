package oOPSconcept;

public class ChildClass extends ParentClass {
	
	public void childMethod1() {
		System.out.println("Child method-1");
	}
	
	public static void childMethod2() {
		System.out.println("Child method-2");
	}
	
	public void overridenMethod() {
		System.out.println("Method overriding - Child Class");
	}

	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		cc.childMethod1();
		childMethod2();
		cc.parentMethod1();
		
		parentMethod2();
		cc.grandParentMethod1();
		grandParentMethod2();
		
		// default Vs protected
		cc.parentMethod3();
		cc.parentMethod4();
		
		// method overriding
		cc.overridenMethod();
		
		// Polymorphism
		ParentClass pc = new ChildClass();
//		pc.childMethod1();
		pc.parentMethod1();
		pc.grandParentMethod1();
		pc.overridenMethod();
		
		GrandParentClass gpc = new ChildClass();
//		gpc.childMethod1();
//		gpc.parentMethod1();
		gpc.grandParentMethod1();
		gpc.overridenMethod();

	}

}
