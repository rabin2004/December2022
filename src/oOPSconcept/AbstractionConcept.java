package oOPSconcept;

public abstract class AbstractionConcept {
	
	// Abstraction: -> hiding functionalities and only showing that can be accessed/used
	
	// Abstract method: -> method without implementation block, abstract keyword -> turn class into abstract
	
	abstract void abstractMethod();
	
	abstract void abstractMethod1();
	
	// Abstract class: 
			// 1. can handle abstract method as well as regular method
			// 2. instance/object can't be created
			// 3. abstract method can be implemented by inheriting the class
			// 4. if class inheriting is not implementing abstract method some or none - class inheriting needs to be abstract as well
	
	void test() {
		System.out.println("Regular method");
	}

	public static void main(String[] args) {
//		AbstractionConcept ac = new AbstractionConcept();

	}

}
