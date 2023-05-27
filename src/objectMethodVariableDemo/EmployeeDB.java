package objectMethodVariableDemo;

import java.util.ArrayList;

public class EmployeeDB {
	
	public ArrayList<String> employeeDetails() {
		ArrayList<String> employeeDB = new ArrayList<String>();
		employeeDB.add("Jones");
		employeeDB.add("Nancy");
		employeeDB.add("Micheal");
		return employeeDB;
	}

}
