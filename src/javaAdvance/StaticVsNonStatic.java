package javaAdvance;

public class StaticVsNonStatic {
	
	// Static & Non-Static - defines nature of class properties
	
	// Static: -> more close to class
			// Way to access
				// 1. Direct calling
				// 2. Using className
				// 3. Instance/Object reference name - not a preferred way
	
	// Non-Static: -> more close to class instance/object
			// Way to access
				// 1. Instance/Object reference name - only way to access
	
	// Static & Non-static mismatch:
		// 1. Accessing static properties into static & non-static method - any way to access out of 3
		// 2. Accessing non-static properties into non-static method - access directly
		// 3. Accessing non-static properties into static method - need to follow only way to access non-static property

}
