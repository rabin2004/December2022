package javaBasics;

public class ConditionConcept {
	
	// Condition -> verification/validation place -> action/s to be performed
		
	// if-else concept:
		// if(condition_1){action-1}
		// else if(condition_2){action-2}
		// else{action-3} -> default
	
	// switch concept: -> input -> multiple case -> break statement for each case -> default case

	public static void main(String[] args) {
//		String employeeDB = "David";
//		String employeeEnteringBuilding = "mike";
		
		// if
//		if(employeeEnteringBuilding.equalsIgnoreCase(employeeDB)) {
//			System.out.println("Access granted!");
//		}
		
		// if & else
//		if(employeeEnteringBuilding.equalsIgnoreCase(employeeDB)) {
//			System.out.println("Access granted!");
//		}else {
//			System.err.println("Access denied!");
//		}
		
		// if , else if & else
//		if(employeeEnteringBuilding.equalsIgnoreCase(employeeDB)) {
//			System.out.println("Access granted!");
//		}else if(employeeEnteringBuilding.isBlank()) {
//			System.err.println("Name is empty. Please enter your name for access.");
//		}else {
//			System.err.println("Access denied!");
//		}
		
		// if & else if - multiple else if
//		if(employeeEnteringBuilding.equalsIgnoreCase(employeeDB)) {
//			System.out.println("Access granted!");
//		}else if(employeeEnteringBuilding.isBlank()) {
//			System.err.println("Name is empty. Please enter your name for access.");
//		}else if(!employeeEnteringBuilding.isBlank()) {
//			System.err.println("Access denied!");
//		}
		
		// using multiple conditions for a block -> 1. And operator - && | 2. Or operator - ||
			// condition_1 && condition_2 -> both condition need to match
			// condition_1 || condition_2 -> any one condition fulfillment is enough
		
//		String username,password,usernameDB,passwordDB;
//		usernameDB = "davidkam12";
//		passwordDB = "dk@1234";
//		System.out.print("Login: ");
//		username = "DavidKam1";
//		password = "";
		
//		if(username.equalsIgnoreCase(usernameDB) && password.equals(passwordDB)) {
//			System.out.println("Successful");
//		}else {
//			System.out.println("Denied");
//		}
		
//		if(username.equalsIgnoreCase(usernameDB) && password.equals(passwordDB)) {
//			System.out.println("Successful");
//		}else if(username.isBlank() || password.isBlank()){
//			System.err.println("Either username or password is invalid. Try again!");
//		}else {
//			System.out.println("Denied");
//		}
		
		// Thermostat
//		int actualRoomTemp, desiredRoomTemp;
//		desiredRoomTemp = 70;
//		actualRoomTemp = 65;
//		System.out.println("Themostat command:");
//		if(desiredRoomTemp==actualRoomTemp) { // outer condition
//			System.out.println("Don't do anything!");
//		}else if(desiredRoomTemp<actualRoomTemp || desiredRoomTemp>actualRoomTemp) {
//			if(desiredRoomTemp<actualRoomTemp) { // inner condition
//				System.out.println("Turn on AC");
//			}else {
//				System.out.println("Turn on Heater");
//			}
//		}
		
		// Switch concept
		// ATM interface - Withdrawal/Deposit/Balance inquiry/Transfer
		System.out.println("TD Bank");
		System.out.println("--------------------------");
		System.out.println("Select following option:");
		System.out.println("--------------------------");
		System.out.println("Withdrawal \nDeposit \nBalance Inquiry \nTransfer");
		String customerSelection = "withdrawal";
		customerSelection = customerSelection.toLowerCase();
		
		switch(customerSelection) {
		case "withdrawal":
			int availableBalance = 10000;
			int amount = 20000;
			System.out.println("Enter the withdrawal amount: "+amount);
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
		
		// if else
//		if(customerSelection.equalsIgnoreCase("withdrawal")) {
//			System.out.println("Enter the withdrawal amount:");
//		}else if(customerSelection.equalsIgnoreCase("deposit")) {
//			System.out.println("Enter the amount to be deposited:");
//		}else if(customerSelection.equalsIgnoreCase("balance inquiry")) {
//			System.out.println("Current Balance: $"+10000);
//		}else if(customerSelection.equalsIgnoreCase("transfer")) {
//			System.out.println("Enter the amount to be transferred:");
//		}else {
//			System.err.println("Invalid selection!");
//		}
		
	}

}
