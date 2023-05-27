package tftApp;

import java.util.Scanner;

public class SalaryCalculation {
	float salaryOnhand, biweeklySalaries, taxNYCpaid, taxFederalpaid, taxNYstatepaid;
	
	String[][] emplpoyeeSalaryDB() {
		String[][] employeeDetails = {	{"Micheal","6000"},
										{"John","4000"},
										{"Nancy","3000"},
										{"Danny", "7000"}};
		return employeeDetails;
	}
	
	void salaryBreakDownPrint(int i) {
		System.out.println("--------------------------------");
		System.out.println("Pay check break down: "+emplpoyeeSalaryDB()[i][0].toUpperCase());
		System.out.println("Biweekly pay: \t\t"+biweeklySalaries);
		System.out.println("Tax NYC: \t\t"+taxNYCpaid);
		System.out.println("NY State Tax: \t\t"+taxNYstatepaid);
		System.out.println("Federal Tax: \t\t"+taxFederalpaid);
		System.out.println("Salary Deposited: \t"+salaryOnhand);
		System.out.println("--------------------------------");
	}
	
	String captureEmployeeName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name: ");
		String employeeName = scan.nextLine();
		scan.close();
		return employeeName;
	}
	
	
	public void salaryTaxBreakDown() {
		float taxNYC, taxFederal, taxNYstate;
		taxNYC = 0.08f; 
		taxFederal = 0.05f;
		taxNYstate = 0.04f;
		
		String employeeName = captureEmployeeName();
		
		for(int i=0; i<emplpoyeeSalaryDB().length; i++) {
			if(employeeName.equalsIgnoreCase(emplpoyeeSalaryDB()[i][0])) {
				biweeklySalaries = Float.valueOf(emplpoyeeSalaryDB()[i][1]);
				taxNYCpaid = biweeklySalaries*taxNYC;
				taxFederalpaid = biweeklySalaries*taxFederal;
				taxNYstatepaid = biweeklySalaries*taxNYstate;
				salaryOnhand = biweeklySalaries-taxNYCpaid-taxFederalpaid-taxNYstatepaid;
				salaryBreakDownPrint(i);
			}
		}
	}

}
