package javaBasics;

public class DataOperationConcept {
	
	// Data operation:
		// 1. Mathematical/Arithmetic operation: -> +,-,*,/
		// 2. Comparative Operation: -> outcome is boolean | numerical dataTypes/primitive dataType
				// equals to -> "=="
				// not equal to -> "!="
				// more than -> ">"
				// less than -> "<"
				// more than or equal to -> ">="
				// less than or equal to -> "<="

	public static void main(String[] args) {
		// creating variable
		int a,b; // created 2 variable with same data type without value assigned
		a = 10; // assigned value
		b = 20; // assigned value
		System.out.println(a+b); // + -> add operator
//		System.out.println("Addition: "+a+b); // + -> place operator
		System.out.println("Addition: "+(a+b));
		
		int c = a+b;
		System.out.println("Addition: "+c);
		c = a-b;
		System.out.println("Substraction: "+c);
		c = a*b;
		System.out.println("Multiply: "+c);
		c = b/a;
		System.out.println("Division: "+c);
		
		// Area of a rectangle
		int length,breath;
		length = 500;
		breath = 350;
		int areaOfRectangle = 2*(length+breath);
		System.out.println("Area of rectangle: "+areaOfRectangle);
		
		int actualRoomTemp, expectedRoomTemp;
		actualRoomTemp = 50;
		expectedRoomTemp = 70;
		
		System.out.println("-------------------------------");
		System.out.println("Turn Heater or Air conditioner: ");
		System.out.println("-------------------------------");
		System.out.println("Do nothing: \t\t\t"+(actualRoomTemp==expectedRoomTemp));
		System.out.println("Either turn heater or AC: \t"+ (actualRoomTemp!=expectedRoomTemp));
		System.out.println("Turn AC: \t\t\t"+ (actualRoomTemp>expectedRoomTemp));
		System.out.println("Turn Heater: \t\t\t"+ (actualRoomTemp<expectedRoomTemp));
		System.out.println("Turn AC or nothing: \t\t"+ (actualRoomTemp>=expectedRoomTemp));
		System.out.println("Turn Heater or nothing: \t"+ (actualRoomTemp<=expectedRoomTemp));
		
	}
	
	// Assignment: 1. Creating variable | 2. Duplicate/assigning/reassigning variable | 3. Mathematical operation: Temperature conversion/currency conversion | 4. Use print concept

}
