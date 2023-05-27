package practicePkg;

import java.util.*;

public class Assignment_4 {

	public static void main(String[] args) {
		String employeeEntering;
		ArrayList<String> employeeDB = new ArrayList<String>();
		employeeDB.add("Jones");
		employeeDB.add("Nancy");
		employeeDB.add("Micheal");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name: ");
		employeeEntering = scan.nextLine();

//		if (employeeDB.contains(employeeEntering)) {
//			System.out.println("Access Granted!");
//		} else {
//			System.err.println("Access Denied!");
//			System.out.println("Enter name again: ");
//			employeeEntering = scan.nextLine();
//		}
		
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
