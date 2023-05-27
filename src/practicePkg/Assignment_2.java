package practicePkg;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		
		// Employee entering building
		String employeeDB, employeeEntering;
		employeeDB = "David";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name: ");
		employeeEntering =  scan.nextLine();
		
		for(int i=1; i<=3; i++) {
			if(employeeEntering.equalsIgnoreCase(employeeDB)) {
				System.out.println("Access Granted!");
				break;
			}else {
				System.err.println("Access Denied!");
				System.out.println("Enter name again: ");
				employeeEntering =  scan.nextLine();
			}	
		}
		scan.close();

	}

}
