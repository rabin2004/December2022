package javaBasics;

public class LoopConcept {
	
	// Loop Concept - repeat action without repeating codes
	
	// Basic requirement for designing loop: 
				// 1. counter variable (starting point)
				// 2. condition (for how many times/end point)
				// 3. increment/decrement - pattern of execution
	
	// 2 types of loop:
	// for: -> for(1;2;3){action-1}
	
	// while: -> 1; while(2){action-1; 3;}
	
	// infinite loop -> loop never stops executing

	public static void main(String[] args) {
		
		// before loop
//		String name = "David";
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
		
		// after loop
//		for(int i=1; i<=5; i=i+1) {
//			System.out.println(name);
//		}
		
		// print 1-100
		for(int i=1; i<=100; i++) { // i=i+1 -> i++
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int a = 1;
		while(a<=100) {
			System.out.print(a+" ");
			a++;
		}
		
		System.out.println();
		
		// print 100-1
		for(int i=100; i>=1; i--) { // i=i-1 -> i--
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int b = 100;
		while(b>=1) {
			System.out.print(b+" ");
			b--;
		}
		

	}

}
