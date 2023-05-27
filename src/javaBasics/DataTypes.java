package javaBasics;

public class DataTypes {
	// Types: 1. Primitive Data types 		2. Reference/Object(Class) data types
	
		// Primitive Data Types: predefined data types | no class to refer to
			// numerical values:
			// 1.byte: small whole number 
			// 2.short: bigger than byte, whole number 
			// 3.int: integer, bigger than short, whole number 
			// 4.long: biggest whole number, "L" or "l"
			// 5.float: small decimal values, "f" or "F"
			// 6.double: big decimal values, "d" or "D"
			
			// Non-numerical values:
			// 7. boolean: true or false -> condition
			// 8. char: character, single alphabet or numerical values -> '1' or 'A' or 'a'
			
		// Reference/Object(Class) data types: -> have class to refer to
			// String: any values (alphabetic, numerical or special characters or combination or space), "123values@(^*@^    "
			
			
		// creating data/Creating variables: 1. DataTypes 2. ReferenceName 3. Value

	public static void main(String[] args) {
		byte byteData = 5;
		System.out.println(byteData);
//		short shortData = 100; // warning -> The value of the local variable shortData is not used
		int integerData = 1000;
		System.out.println(integerData);
		long longData = 10000000l;
		System.out.println(longData);
		float floatData = 1.55F;
		System.out.println(floatData);
		double doubleData = 1.999999d;
		System.out.println(doubleData);
		
		boolean result1 = true;
		boolean result2 = false;
		System.out.println("Is Water colorless? "+result1);
		System.out.println("If "+result2+". Then what is the color of water?");
		
		char charData1 = '1'; 
		System.out.println("Susan is "+charData1+"st this term.");
		
		// #1 way of creating String variable - regular variable creation
		// created variable with value assigned
		String customerName = "David Myron";
		String emailAdd = "dm2009@gmail.com";
		String optionalComment = "      ";
		
		//re-assign value to the same variable
		customerName = "Micheal Jones";
		emailAdd = "mk@gmail.com";
		optionalComment = "Deliver properly!";
		
		System.out.println("Welcome "+customerName+"!");
		System.out.println("Verification code sent to: "+emailAdd);
		System.out.println("Special comment provided: "+optionalComment);
		
		// not allowed to use same reference name
//		String customerName = "Tina Moore"; // duplicate variable
//		int customerName = 100; // duplicate variable
		
		
		
	}

}
