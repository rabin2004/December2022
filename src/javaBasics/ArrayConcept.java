package javaBasics;

public class ArrayConcept {
	
	// Array Concept - data table
	
		// 1 dimensional (1D) Array -> 1 column and multiple rows
			// create 1D array: dataType[] refName = new dataType[numberOfRows];
		
		// 2 dimensional (2D) Array -> multiple columns and multiple rows
			// create 2D array: dataType[][] refName = new dataType[numberOfRows][numberOfColumns];

	public static void main(String[] args) {
		// #1 creating 1D array
//		int[] table1 = new int[5];
		// inserting data
//		table1[0] = 10;
//		table1[1] = 20;
//		table1[2] = 30;
//		table1[3] = 40;
//		table1[4] = 50;
//		table1[5] = 60; // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		
		// #2 creating 1D array
		int[] table1 = {10,20,30,40,50,60,70,80,90,100};
		
		// extracting data
//		System.out.println(table1[1]);
//		System.out.println(table1[0]+table1[2]);
		
//		for(int i=0; i<=2; i++) {
//			System.out.println(table1[i]);
//		}
		
		int rowCountTable1 = table1.length;
		System.out.println(rowCountTable1);
		
		for(int i=0; i<rowCountTable1; i++) {
			System.out.println(table1[i]);
		}
		
		
		// #1 creating 2D array
//		int[][] table2 = new int[3][4];
		// inserting data
		// 1st row
//		table2[0][0] = 1;
//		table2[0][1] = 2;
//		table2[0][2] = 3;
//		table2[0][3] = 4;

		// 2nd row
//		table2[1][0] = 5;
//		table2[1][1] = 6;
//		table2[1][2] = 7;
//		table2[1][3] = 8;

		// 3rd row
//		table2[2][0] = 9;
//		table2[2][1] = 10;
//		table2[2][2] = 11;
//		table2[2][3] = 12;
		
		// #2 creating 2D array
		int[][] table2 = {	{1,2,3,4,99},
							{5,6,7,8,99},
							{9,10,11,12,99},
							{13,14,15,16,99}};
		
		// extracting data
		System.out.println(table2[1][3]);
		
		int rowCountTable2 = table2.length;
		System.out.println(rowCountTable2);
		int columnCountTable2 = table2[2].length;
		System.out.println(columnCountTable2);
		
		// traversing 2D array
		System.out.println("-----------------------------------------------------------------");
		for(int i=0; i<rowCountTable2; i++) { // traversing row
			for(int j=0; j<columnCountTable2; j++) { // traversing column
				System.out.print(table2[i][j]+"\t|\t");
			}
			System.out.println();
			System.out.println("-----------------------------------------------------------------");
		}
	}
	
	// Assignment: 	1. Currency conversion -> multiple currency
				//	2. Salary calculation -> multiple employee
				//	3. Employee entering building -> creating employeDB
				//	4. Login functionality -> multiple set of credentials in DB
				//	5. Registration functionality -> allow registering multiple customer/employee
				// 	6. Library search+take+return book functionality -> DB for search/what is taken/what is return

}
