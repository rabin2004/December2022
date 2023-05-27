package oOPSconcept;

import java.util.*;

public class UnderstandingEncapsulation {
	
	static void printDetails(String ssn, String dob) {
		System.out.println("Verify details:");
		String lastFourOfSSN = "*******"+ssn.substring(5); // 123456789
		String birthYear = dob.substring(6); // mm/dd/yyyy
		System.out.println("Last Four: "+lastFourOfSSN);
		System.out.println("Birth Year: "+birthYear);
	}

	public static void main(String[] args) {
		EncapsulationConcept ec = new EncapsulationConcept();
		Scanner scan = new Scanner(System.in);
		System.out.println("SSN: ");
		ec.setSSN(scan.nextLine());
		System.out.println("DOB: ");
		ec.setDob(scan.nextLine());
		scan.close();
		
		printDetails(ec.getSSN(),ec.getDob());
		

	}

}
