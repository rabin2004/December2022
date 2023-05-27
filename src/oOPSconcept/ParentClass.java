package oOPSconcept;

public class ParentClass extends GrandParentClass {
	
	public void parentMethod1() {
		System.out.println("Parent method-1");
	}
	
	public static void parentMethod2() {
		System.out.println("Parent method-2");
	}
	
	void parentMethod3() {
		System.out.println("Parent method-3");
	}
	
	protected void parentMethod4() {
		System.out.println("Parent method-4");
	}
	
	public void overridenMethod() {
		System.out.println("Method overriding - Parent Class");
	}
	
	
	public static void main(String[] args) {
		ParentClass pc = new ParentClass();
		pc.parentMethod1();
		parentMethod2();
		pc.grandParentMethod1();
		grandParentMethod2();

	}

}
