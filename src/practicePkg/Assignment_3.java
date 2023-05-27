package practicePkg;

public class Assignment_3 {

	public static void main(String[] args) {
		
//		float salaryOnhand, taxNYC, taxFederal, taxNYstate;
//		float[] biweeklySalaries = {6000f, 4000f, 3000f};
//		String[] employee = {"Micheal", "John", "Nancy"};
//		taxNYC = 0.08f; 
//		taxFederal = 0.05f;
//		taxNYstate = 0.04f;
//		
//		for(int i=0; i<biweeklySalaries.length || i<employee.length; i++) {
//			float taxNYCpaid = biweeklySalaries[i]*taxNYC;
//			float taxFederalpaid = biweeklySalaries[i]*taxFederal;
//			float taxNYstatepaid = biweeklySalaries[i]*taxNYstate;
//			salaryOnhand = biweeklySalaries[i]-taxNYCpaid-taxFederalpaid-taxNYstatepaid;
//			
//			System.out.println("--------------------------------");
//			System.out.println("Pay check break down: "+employee[i].toUpperCase());
//			System.out.println("Biweekly pay: \t\t"+biweeklySalaries[i]);
//			System.out.println("Tax NYC: \t\t"+taxNYCpaid);
//			System.out.println("NY State Tax: \t\t"+taxNYstatepaid);
//			System.out.println("Federal Tax: \t\t"+taxFederalpaid);
//			System.out.println("Salary Deposited: \t"+salaryOnhand);
//			System.out.println("--------------------------------");
//		}
		
		float salaryOnhand, taxNYC, taxFederal, taxNYstate;
		String[][] employeeDetails = {	{"Micheal","6000"},
										{"John","4000"},
										{"Nancy","3000"},
										{"Danny", "7000"}};
		taxNYC = 0.08f; 
		taxFederal = 0.05f;
		taxNYstate = 0.04f;
		
		for(int i=0; i<employeeDetails.length; i++) {
			float biweeklySalaries = Float.valueOf(employeeDetails[i][1]);
			float taxNYCpaid = biweeklySalaries*taxNYC;
			float taxFederalpaid = biweeklySalaries*taxFederal;
			float taxNYstatepaid = biweeklySalaries*taxNYstate;
			salaryOnhand = biweeklySalaries-taxNYCpaid-taxFederalpaid-taxNYstatepaid;
			
			System.out.println("--------------------------------");
			System.out.println("Pay check break down: "+employeeDetails[i][0].toUpperCase());
			System.out.println("Biweekly pay: \t\t"+biweeklySalaries);
			System.out.println("Tax NYC: \t\t"+taxNYCpaid);
			System.out.println("NY State Tax: \t\t"+taxNYstatepaid);
			System.out.println("Federal Tax: \t\t"+taxFederalpaid);
			System.out.println("Salary Deposited: \t"+salaryOnhand);
			System.out.println("--------------------------------");
		}
	
	}

}
