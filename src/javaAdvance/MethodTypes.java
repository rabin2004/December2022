package javaAdvance;

public class MethodTypes {
	
	// Object: entity that has properties (state & behavior) -> instance of a class
			// Variable: state
			// Method: behavior/functionality
	
	// Basic requirement of creating method:
			// 1. Return type: what will method return? - if not returning anything at least "void"
			// 2. Method signature: methodName()
			// 3. Method block/code block/implementation block -> {code}
	
	// Parameters -> like variable defined inside method signature -> methodName(dataType refName)
				//	-> parameters will allow method to accept value of that dataType

	// Method Types - based on parameter
		// 1. method without parameter
		// 2. Parameterized method with single parameter:
		// 3. Parameterized method with multiple parameter (same type or different type)
	

	// Method overloading: -> multiple method with same name but different method signature
	
	void test() { // method without parameter
		// code
		String msg = "Something went wrong";
		System.err.println(msg);
	}
	
//	void test() { // duplicate method
//		
//	}
	
	void errorPrinting(String msg) {
		System.err.println(msg.toUpperCase());
	}
	
	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	void add(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
	}
	
	void mathOperation(double a, double b, String op) {
		switch(op.toLowerCase()){
		case "add":
			System.out.println(a+b);
			break;
		case "substract":
			System.out.println(a-b);
			break;
		case "multiply":
			System.out.println(a*b);
			break;
		case "divide":
			System.out.println(a/b);
			break;
		default:
			System.err.println(op+": Invalid operation");	
		}
	}

	public static void main(String[] args) {
		MethodTypes mt = new MethodTypes();
//		mt.test();
//		
//		mt.errorPrinting("Invalid credentials!");
//		mt.errorPrinting("Try again later!");
//		
		mt.add(100, 5);
		mt.add(90, 40);
		mt.add(1, 7, 24, 237);
		mt.add(23, 324, 32432);
		
		mt.mathOperation(10.55, 20.11, "multiply");
		mt.mathOperation(10.55, 20.11, "scientific calculation");
	}
	
	// Assignment: 	- 1 app with following features
		// 	1. Currency conversion
		//	2. Salary calculation
		//	3. Employee entering building
		//	4. Login functionality
		//	5. Registration functionality
		//	6. One main class for execution - name of app
}
