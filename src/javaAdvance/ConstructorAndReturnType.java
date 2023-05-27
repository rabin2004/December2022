package javaAdvance;

public class ConstructorAndReturnType {
	
	// Constructor: 
				// 1. special method carry name of the class
				// 2. constructor don't need to be called directly
				// 3. constructor will be called every time object/instance of the class is created
				// 4. constructor creation is not mandatory
				// 5. if constructor isn't created, a default constructor will be assigned whenever object/instance created
				// 6. Constructor can be overloaded as well
				// 7. assigning value instance variables/some code that needs to be executed first
				// 8. no return type
		
		// creating object/instance of a class:
					// className refName = new className(); // className() -> constructor of a class
		
		// Creating method: Basic requirements: 
				// 1. return type (at least void - if returning nothing)
				// 2. method signature -> methodName()
				// 3. method block/code block -> {code}
	
	int a,b;
	
	ConstructorAndReturnType(){ // non-parameterized constructor
		System.out.println("I am in constructor method");
	}
	
	ConstructorAndReturnType(int a, int b){ // constructor overloading - parameterized constructor
		this.a = a;
		this.b = b;
	}
	
	void test() {
		System.out.println("Test method");
	}
	
	int add() {
//		System.out.println(a+b);
		return a+b; // return type
	}
	
	int substract() {
//		System.out.println(a-b);
		return a-b;
	}
	
	int divide() {
//		System.out.println(a/b);
		return a/b;
	}
	
	int multiply() {
//		System.out.println(a*b);
		return a*b;
	}
	
	void printResult(int result) {
		System.out.println("Result: "+result);
	}
	
	void printResult(String input) {
		switch(input) {
		case "add": 
			printResult(add());
			break;
		case "substract":
			printResult(substract());
			break;
		case "divide":
			printResult(divide());
			break;
		case "multiply":
			printResult(multiply());
			break;
		}
	}
	
	public static void main(String[] args) {
//		ConstructorAndReturnType car = new ConstructorAndReturnType();
//		car.test();
		
		// before using  constructor to assign instance variable
//		car.a = 10;
//		car.b = 20;
//		car.add();
		
		// after using constructor to assign instance variable
		ConstructorAndReturnType car1 = new ConstructorAndReturnType(500, 111);
//		car1.add();
//		car1.substract();
//		car1.printResult(car1.add());
//		car1.printResult(car1.multiply());
		
//		car1.printResult("add");
		car1.printResult("divide");
		
	}

}
