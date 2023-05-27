package oOPSconcept;

public class EncapsulationConcept {
	
	// Encapsulation: medicine inside a capsule - data hiding
	
	// Requirement:
			// 1. private variable
			// 2. public getter & setter method each variable
	
	private String ssn, dob;
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}

	public String getSSN() {
		return ssn;
	}
	
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

}
