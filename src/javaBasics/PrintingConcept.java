package javaBasics;

public class PrintingConcept { // class body
	
	// println() Vs print():
		// println() -> print in a line, move cursor to next line | can be empty
		// print() -> print statement where ever cursor is at, will keep cursor at the end | can't be empty
	
	// System.out.println() -> sysout+ctrl+spacebar

	public static void main(String[] args) {// main method body -> if main method is present - can be run as Java application
		System.out.println("Java session!!");
		System.out.println("Programming language");
		System.out.println();
		System.out.println("Shortcut -> sysout+ctrl+spacebar ");
		
		System.out.print("Printing concept");
		System.out.print("Learning println() VS print()");
//		System.out.print(); // is not applicable
		System.out.print("no shortcut");
		
		// error printing
//		System.err.println("Something went wrong. Try again!!");
//		System.err.print("Invalid credential. Please try again!!");
		
		// to make long code visible
		System.out.println();
		System.out.println("Something went wrong. Try again!! Something went wrong. Try again!! "
				+ "Something went wrong. Try again!! Something went wrong. Try again!! "
				+ "Something went wrong. Try again!! Something went wrong. Try again!! "
				+ "Something went wrong. Try again!! Something went wrong. Try again!! "
				+ "Something went wrong. Try again!!");
		
		System.out.println("-----------------------------------------------------------");
		
		// \n -> break console output to next line
		System.out.println("Something went wrong. Try again!! \nSomething went wrong. Try again!! "
				+ "\nSomething went wrong. Try again!! \nSomething went wrong. Try again!! "
				+ "\nSomething went wrong. Try again!! \nSomething went wrong. Try again!! "
				+ "\nSomething went wrong. Try again!! \nSomething went wrong. Try again!! "
				+ "\nSomething went wrong. Try again!!");
		
//		System.out.println("Name"+"Phone"+"Email"+"Address");
		System.out.println("Name"+"       "+"Phone"+"            "+"Email"+"                "+"Address");
		System.out.println("Jack"+"       "+"245235423"+"        "+"jk@gmail.com"+"         "+"NYC");
		System.out.println("Mike"+"       "+"345235423"+"        "+"mk@gmail.com"+"         "+"LA");
		System.out.println("Tom"+"        "+"745235423"+"        "+"to@gmail.com"+"         "+"SFO");
		
		// \t -> tab space
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Name"+"\t\t"+"Phone"+"\t\t\t"+"Email"+"\t\t\t"+"Address");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Jack"+"\t\t"+"245235423"+"\t\t"+"jk@gmail.com"+"\t\t"+"NYC");
		System.out.println("Mike"+"\t\t"+"345235423"+"\t\t"+"mk@gmail.com"+"\t\t"+"LA");
		System.out.println("Tom"+"\t\t"+"745235423"+"\t\t"+"to@gmail.com"+"\t\t"+"SFO");

	}

}
