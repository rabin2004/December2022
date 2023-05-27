package objectMethodVariableDemo;

public class EmployeeValidation {
	EmployeeDB edb = new EmployeeDB();
	
	public void validationOfEmployeeEnteringBuilding(String employeeEntering) {
		while(true) {
			if (edb.employeeDetails().contains(employeeEntering)) {
				System.out.println("Access Granted!");
				break;
			} else {
				System.err.println("Access Denied!");
			}
		}
	}
	

}
