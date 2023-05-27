package javaBasics;

import java.util.Scanner;

public class ScannerConcept {
	
	// Scanner concept -> accept user input
		// Scanner - class, create instance/object

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		String firstName = scan.next(); // string, won't accept space which will be treated as end of scanning for that data
//		String customerName = scan.nextLine(); // string, accept space (multiple words/sentence, until hitting enter)
		// .. various datatype can be scanned in
 		
//		System.out.println("Welcome "+firstName);
//		System.out.println("Name: "+customerName);
//		scan.close();
		
		// ATM interface - Withdrawal/Deposit/Balance inquiry/Transfer
				System.out.println("TD Bank");
				System.out.println("--------------------------");
				System.out.println("Select following option:");
				System.out.println("--------------------------");
				System.out.println("Withdrawal \nDeposit \nBalance Inquiry \nTransfer");
				System.out.println("--------------------------");
				System.out.println("Type in desired option:");
				String customerSelection = scan.next();
				System.out.println("--------------------------");
				customerSelection = customerSelection.toLowerCase();
				
				switch(customerSelection) {
				case "withdrawal":
					int availableBalance = 10000;
					System.out.println("Enter the withdrawal amount: ");
					int amount = scan.nextInt();
					if(amount<=availableBalance) {
						System.out.println("Cash dispensing...");
					}else if(amount>availableBalance) {
						System.err.println("Insufficient amount. Please try with lower amount");
					}else {
						System.err.println("Invalid amount entered.");
					}
					break;
				case "deposit":
					System.out.println("Enter the amount to be deposited:");
					break;
				case "balance inquiry":
					System.out.println("Current Balance: $"+10000);
					break;
				case "transfer":
					System.out.println("Enter the amount to be transferred:");
					break;
				default:
					System.err.println("Invalid selection!");
				}
				scan.close();
	}
	// Assignment: 	1. Out of 3 integer numbers find out the largest and smallest number
				//	2. Temperature conversion/currency conversion/salary calculation/Thermostat scenario/Employee entering building

}
