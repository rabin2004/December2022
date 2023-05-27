package practicePkg;

public class Assignment_1 {

	public static void main(String[] args) {
		// Temperature conversion -> C->F | F->C
		int tempC, tempF; // creating variables
		tempC = 50;
		tempF = (tempC*9/5)+32;
		System.out.println(tempC+"C to temperature in F: "+tempF+"F");
		
		tempF = 100;
		tempC = (tempF-32)*5/9;
		System.out.println(tempF+"F to temperature in C: "+tempC+"C");
		
		
		// Tax calculation
		float biweeklySalary, salaryOnhand, taxNYC, taxFederal, taxNYstate;
		biweeklySalary = 6500f;
		taxNYC = 0.08f; 
		taxFederal = 0.05f;
		taxNYstate = 0.04f;
		
		float taxNYCpaid = biweeklySalary*taxNYC;
		float taxFederalpaid = biweeklySalary*taxFederal;
		float taxNYstatepaid = biweeklySalary*taxNYstate;
		salaryOnhand = biweeklySalary-taxNYCpaid-taxFederalpaid-taxNYstatepaid;
		
		System.out.println("--------------------------------");
		System.out.println("Biweekly pay: \t\t"+biweeklySalary);
		System.out.println("Tax NYC: \t\t"+taxNYCpaid);
		System.out.println("NY State Tax: \t\t"+taxNYstatepaid);
		System.out.println("Federal Tax: \t\t"+taxFederalpaid);
		System.out.println("Salary Deposited: \t"+salaryOnhand);
		System.out.println("--------------------------------");
		
	}

}
