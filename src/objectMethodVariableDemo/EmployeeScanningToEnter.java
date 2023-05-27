package objectMethodVariableDemo;

import java.util.Scanner;

public class EmployeeScanningToEnter {
	
	public String scanEmployee() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name: ");
		String employeeEntering = scan.nextLine();
		scan.close();
		
		return employeeEntering;
	}
	
	public static void main(String[] args) {
		EmployeeValidation ev = new EmployeeValidation();
		EmployeeScanningToEnter ese = new EmployeeScanningToEnter();
			
		ev.validationOfEmployeeEnteringBuilding(ese.scanEmployee());
	}

}
