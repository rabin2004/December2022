package javaBasics;

public class StringManipulation {

	public static void main(String[] args) {
		// # 1 way of creating String variable
		String employeeDB,employeeEnteringBuilding;
		employeeDB = "Chris";
		employeeEnteringBuilding = "Chris";
		
		System.out.println("Allow to enter the building: \t"+(employeeEnteringBuilding==employeeDB));
		System.out.println("Deny entry to the building: \t"+(employeeEnteringBuilding!=employeeDB));
		
		// #2 way of creating String variable - Object creation way
		String employeeEnteringBuilding2 = new String("Chris");
		System.out.println("Allow to enter the building: \t"+(employeeEnteringBuilding2==employeeDB));
		System.out.println("Deny entry to the building: \t"+(employeeEnteringBuilding2!=employeeDB));

	// compare String
		// equals() -> boolean, case sensitive
		// equalsIgnoreCase() -> boolean, case insensitive
		System.out.println("Allow to enter the building: \t"+(employeeEnteringBuilding.equals(employeeDB)));
		System.out.println("Deny entry to the building: \t"+(!employeeEnteringBuilding.equals(employeeDB)));
		System.out.println("Allow to enter the building: \t"+(employeeEnteringBuilding2.equals(employeeDB)));
		System.out.println("Deny entry to the building: \t"+(!employeeEnteringBuilding2.equals(employeeDB)));
		
		employeeEnteringBuilding = "chris";
		System.out.println("Allow to enter the building: \t"+(employeeEnteringBuilding.equals(employeeDB)));
		System.out.println("Allow to enter the building: \t"+
		(employeeEnteringBuilding.equalsIgnoreCase(employeeDB)));
		
		// compareTo() -> integer output - Zero->same|non-zero->different, case sensitive
		// compareToIgnoreCase() -> integer output - Zero->same|non-zero->different, case insensitive
		System.out.println("Allow to enter the building: \t"+(employeeEnteringBuilding.compareTo(employeeDB)));
		System.out.println("Allow to enter the building: \t"+
		(employeeEnteringBuilding.compareToIgnoreCase(employeeDB)));
		
		// length() -> to count number of characters in String
		String errorMsg = "Something went wrong. Please try again after 14:00 EST!";
		System.out.println("Length of error message: "+errorMsg.length());
		
		// toUpperCase()
		// toLowerCase()
		String upperCasedErrorMsg = errorMsg.toUpperCase();
		System.out.println(errorMsg);
		System.err.println(upperCasedErrorMsg);
		String lowerCasedErrorMsg = upperCasedErrorMsg.toLowerCase();
		System.err.println(lowerCasedErrorMsg);
		
		// indexOf() -> to index of a char/character sequence
			// index - starts from zero | position - starts from one => index = position-1 | position = index+1
		// 1st occurrence
		System.out.println("Index of letter w: "+errorMsg.indexOf('w'));
		System.out.println("Position of letter w: "+(errorMsg.indexOf('w')+1));
		System.out.println("Index of word Please: "+errorMsg.indexOf("Please"));
		System.out.println("Position of word Please: "+(errorMsg.indexOf("Please")+1));
		
		// lastIndexOf() -> last occurrence
		System.out.println("Last occurrence of w: "+errorMsg.lastIndexOf('w'));
		
		// multiple occurrence
		System.out.println("1st occurrence of e: "+errorMsg.indexOf('e'));
		System.out.println("Last occurrence of e: "+errorMsg.lastIndexOf('e'));
		
		System.out.println("2nd occurrence of e: "+errorMsg.indexOf('e', 4));
		System.out.println("2nd occurrence of e: "+errorMsg.indexOf('e', errorMsg.indexOf('e')+1));
		
		System.out.println("3rd occurrence of e: "+errorMsg.indexOf('e', 12));
		System.out.println("3rd occurrence of e: "+errorMsg.indexOf('e', 
				errorMsg.indexOf('e', errorMsg.indexOf('e')+1)+1));
		
		System.out.println("4th occurrence of e: "+errorMsg.indexOf('e', 25));
		System.out.println("4th occurrence of e: "+errorMsg.indexOf('e', errorMsg.indexOf('e', 
				errorMsg.indexOf('e', errorMsg.indexOf('e')+1)+1)+1));
		
		// charAt() -> character at a specific index
		System.out.println("Character at index 15: "+errorMsg.charAt(15));
		System.out.println("Character at position 15: "+errorMsg.charAt(14));
		
		// replace() -> replacing all matching char/character sequence
		System.out.println(errorMsg.replace('e', 'E'));
		System.out.println(errorMsg.replace("wrong", "bad"));
		System.out.println(errorMsg.replace("e", ""));
		
		// validation methods -> isEmpty()->will only consider no character for true/isBlank()->will consider no character and blank for true
		String a = "Chris";
		String b = "     ";
		String c = "";
		System.out.println("Number of character in a: "+a.length());
		System.out.println("Number of character in b: "+b.length());
		System.out.println("Number of character in c: "+c.length());
		System.out.println(a.isEmpty());
		System.out.println(b.isEmpty());
		System.out.println(b.isBlank());
		System.out.println(c.isEmpty());
		System.out.println(c.isBlank());
		
		// contains() - boolean output, case sensitive
		System.out.println(errorMsg.contains("try"));
		System.out.println(errorMsg.contains("TRY"));
		System.out.println(errorMsg.contains("Micheal"));
		
		// trim() - remove white spaces from the front and back of the string
		String firstName = "    david    ";
		String lastName = "    tang     ";
		firstName = firstName.trim();
		lastName = lastName.trim();
		System.out.println("Welcome "+firstName.toUpperCase()+" "+lastName.toUpperCase());
		
		// substring(beginningIndex) - capture string from that index
		// substring(beginningIndex,endIndex) - capture string from beginning to 1 index before endIndex
		String erroMsg = "Something went wrong. Please try again later! "
				+ "\nFor further help contact customer service for further help @ 49823476823";
		
		String partialErrorMsg = erroMsg.substring(erroMsg.indexOf("For"));
		System.out.println(partialErrorMsg);
		
		String middleSectionErrorMsg = erroMsg.substring(erroMsg.indexOf('P'), erroMsg.indexOf("!")+1);
		System.out.println(middleSectionErrorMsg);
		
		String cusInitial = (firstName.substring(0, 1)+lastName.substring(0,1)).toUpperCase();
		System.out.println("Your initial: "+cusInitial);
		
		// concat() -> join string together
		System.out.println("Welcome ".concat(firstName.concat(" ").concat(lastName).toUpperCase()));
		cusInitial = firstName.substring(0,1).concat(lastName.substring(0, 1)).toUpperCase();
		System.out.println("Your initial: "+cusInitial);
		
		// split() -----> will be covered after Array/Loop concept ????
		
		
	}
	// Assignment: 1. Mathematical operation with comparative operation: Temperature conversion/currency conversion/salary calculation/Thermostat scenario/Employee entering building
				// 2. String manipulation
				// 3. Customer entering details -> manipulation and reflect manipulated data as output

}
