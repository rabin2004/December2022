package tftApp;

import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeAccess {
	
	public void employeeEnteringBuilding() {
		String employeeEntering;
		ArrayList<String> employeeDB = new ArrayList<String>();
		employeeDB.add("Jones");
		employeeDB.add("Nancy");
		employeeDB.add("Micheal");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name: ");
		employeeEntering = scan.nextLine();
		
		while(true) {
			if (employeeDB.contains(employeeEntering)) {
				System.out.println("Access Granted!");
				break;
			} else {
				System.err.println("Access Denied!");
				System.out.println("Enter name again: ");
				employeeEntering = scan.nextLine();
			}
		}
		
		scan.close();

	}

}
