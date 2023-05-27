package javaBasics;

public class StringBuilderStringBufferConcept {
	
	// String helper classes -> StringBuilder & StringBuffer class

	public static void main(String[] args) {
		
		// Reverse String
		String customerName = "David";
		
//		int charCount = customerName.length();
//		System.out.println(charCount);
		
		// returning character at a time
//		for(int i = charCount-1; i>=0; i--) {
//			System.out.print(customerName.charAt(i));
//		}
		
//		String reversedCustomerName = "";
//		for(int i = charCount-1; i>=0; i--) {
//			char charATime = customerName.charAt(i);
//			reversedCustomerName = reversedCustomerName+String.valueOf(charATime);
//		}
//		System.out.println(reversedCustomerName);
		
//		int lastIndex = charCount-1;
//		while(lastIndex>=0) {
//			char charATime = customerName.charAt(lastIndex);
//			reversedCustomerName = reversedCustomerName+String.valueOf(charATime);
//			lastIndex--;
//		}
//		System.out.println(reversedCustomerName);
		
//		StringBuilder sb = new StringBuilder(customerName);
//		String reversedCustomerName = sb.reverse().toString();
//		System.out.println(reversedCustomerName);
//		
//		System.out.println(sb.delete(2, 3));
//		
//		System.out.println(sb.insert(2, "V"));
		
		StringBuffer sbu = new StringBuffer(customerName);
		String reversedCustomerName = sbu.reverse().toString();
		System.out.println(reversedCustomerName);
		
		System.out.println(sbu.delete(2, 3));
		
		System.out.println(sbu.insert(2, "V"));

	}

}
