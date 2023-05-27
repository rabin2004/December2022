package javaAdvance;

public class VariableTypes {
	
	// Object: entity that has properties (state & behavior) -> instance of a class
		// Variable: state
		// Method: behavior
	
	// Variable Types:
		// 1. Instance/Non-static Variable: defined inside the class but outside any method, non-static nature (no static keyword)
		// 2. Class/Static Variable: defined inside the class but outside any method, static nature (static keyword)
		// 3. Local Variable: defined inside a method
	
	// Parameters -> like variable defined inside method signature
	
	int c, d; // instance variable
	
	static int x, y; // class variable
	
	void test() { // non-static method
		int a = 10; // local variable
		int b = 20; // local variable
		System.out.println(a+b);
		
		c = 50;
		d = 100;
		System.out.println(c-d);
	}

	public static void main(String[] args) { // static method
//		System.out.println(a+b); // cannot be resolved to a variable
		
		int a = 10; // local variable
		int b = 20; // local variable
		System.out.println(a+b);
		
		VariableTypes vt = new VariableTypes(); // instance/object of this class
//		c = 150; // Cannot make a static reference to the non-static field
		vt.c = 200;
		vt.d = 500;
		System.out.println(vt.c-vt.d);
		
		// Accessing Static variable
		// 1. Direct calling
		x = 1000;
		y = 101;
		System.out.println(x+y);
		// 2. Using className
		VariableTypes.x = 2000;
		VariableTypes.y = 500;
		System.out.println(VariableTypes.x+VariableTypes.y);
		// 3. Instance/Object reference name - not a preferred way
//		vt.x = 800; // should be accessed in a static way
//		vt.y = 900;
//		System.out.println(vt.x+vt.y);
		
	}

}
