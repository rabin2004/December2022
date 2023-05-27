package javaAdvance;

import javaBasics.DifferentPkgClass;

public class AccessModifierBasics {
	
	// Access modifier: creating restriction around class access & properties of class
	
	// Types of access modifier: for class properties (variables/method)
		// 1. Public: available through out -> within the class|between classes of same package|also different package
		// 2. Private: only be available within the class
		// 3. Default: if no access modifier keyword -> within the class | from same package | not from different package even class is inherited/subclass
		// 4. Protected: within the class | from same package | not from different package until inheritance comes into play
	
	// default VS protected -> ??? -> Inheritance: super/sub class
	
	// Types of access modifier: for class
		// 1. public: calling class/creating instance or object of class -> from same package/different package
		// 2. final: -> from same package | can't access final class from different package
		// 3. abstract: -> OOPS concept: Abstraction - ?????
		// 4. default: -> from same package | can't access final class from different package
	
	// final Vs default class -> ????

	// final: for variables
		// -> can't be uninitialized/blank
		// -> can't be reassigned
	
	public String msg;
	
	final String finalMsg = "Final final message"; // The blank final field finalMsg may not have been initialized
	
	public void printMsg() {
		System.out.println(msg);
	}
	
	private void printMsgPrivate() {
		System.out.println(msg);
	}
	
	void printMsgDefault() {
		System.out.println(msg);
	}
	
	protected void printMsgProtected() {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		AccessModifierBasics amb = new AccessModifierBasics();
		SamePkgClass spc = new SamePkgClass();
		DifferentPkgClass dpc = new DifferentPkgClass();
		// public
			// same class
		amb.msg = "public access modifier - same class";
		amb.printMsg();
			// same package
		spc.msg = "public access modifier - same package";
		spc.printMsg();
			// different package
		dpc.msg = "public access modifier - different package";
		dpc.printMsg();
		
		// private
			// same class
		amb.msg = "private access modifier - same class";
		amb.printMsgPrivate();
			// same package
//		spc.printMsgPrivate();
			// different package
//		dpc.printMsgPrivate(); 
		
		// default	
			//same class
		amb.msg = "default access modifier - same class";
		amb.printMsgDefault();
			// same pkg
			spc.printMsgDefault();
			// different pkg
//		dpc.printMsgDefault();

		// protected
			// same class
		amb.msg = "protected access modifier - same class";
		amb.printMsgProtected();
			// same pkg
		spc.printMsgProtected();
			// different pkg
//		dpc.printMsgProtected();
		
		// final variable
//		amb.finalMsg = "changing value"; // The final field AccessModifierBasics.finalMsg cannot be assigned
		System.out.println(amb.finalMsg);
		
	}
	
	
	// Assignment: 	Library app - using access modifier/constructor/return type concepts as well
				// 1. Login logic feature
				// 2. Search/Order/Return book feature
				// 3. Registration feature
	
}
