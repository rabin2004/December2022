package javaBasics;

import java.util.*;

public class ArrayListConcept {
	
	// ArrayList - a class, data table, 1D format

	public static void main(String[] args) {
		
//		ArrayList al = new ArrayList(); // raw type/non-parameterized
	
		// inserting data
//		al.add("Jones");
//		al.add(1000);
//		al.add(true);
		
		ArrayList<String> al = new ArrayList<String>(); // parameterized
		al.add("Jones");
		al.add("Nancy");
		al.add("Micheal");
		
		System.out.println("Number of rows: "+al.size());
		System.out.println(al);
		al.add("Jacky");
		System.out.println("Number of rows: "+al.size());
		System.out.println(al);
		
		// to add into specific
		al.add(1, "Joan");
		System.out.println(al);
		
		// remove data
//		al.remove(2);
//		System.out.println(al);
//		al.remove("Jacky");
//		System.out.println(al);
		
		// to extract data
		System.out.println("3rd row value "+ al.get(2));
		
		// to check if data is present
		System.out.println("Is Nancy present? "+al.contains("Nancy"));
		System.out.println("Is Mike present? "+al.contains("Mike"));
		
		// index of a data
		System.out.println("Index of row for Micheal: "+al.indexOf("Micheal"));
		System.out.println("Row number for Micheal: "+(al.indexOf("Micheal")+1));
		
//		System.out.println(al);
//		System.out.println("Is arrayList empty? "+al.isEmpty());
//		al.clear();
//		System.out.println(al);
//		System.out.println("Is arrayList empty? "+al.isEmpty());
		
		Object cloneList = al.clone();
		System.out.println("Are they same? "+cloneList.equals(al));
		al.add("Barry");
		System.out.println("Are they same? "+cloneList.equals(al));

		// Traversing ArrayList
		// 1. for loop
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i)+" ");
		}
		
		System.out.println();
		
		// 2. while loop
		int i = 0;
		while(i<al.size()) {
			System.out.print(al.get(i)+" ");
			i++;
		}
		
		System.out.println();
		
		// 3. for each loop
		for(String customer: al) {
			System.out.print(customer+" ");
		}
		
		System.out.println();
		
		// 4. iterator concept
		Iterator<String> it = al.iterator();
//		System.out.println("Is there next row? "+it.hasNext());
//		System.out.println("1st row value: "+it.next());
//		System.out.println("Is there next row? "+it.hasNext());
//		System.out.println("2nd row value: "+it.next());
//		System.out.println("Is there next row? "+it.hasNext());
//		System.out.println("3rd row value: "+it.next());
//		System.out.println("Is there next row? "+it.hasNext());
//		System.out.println("4th row value: "+it.next());
//		System.out.println("Is there next row? "+it.hasNext());
//		System.out.println("5th row value: "+it.next());
//		System.out.println("Is there next row? "+it.hasNext());
//		System.out.println("6th row value: "+it.next());
//		System.out.println("Is there next row? "+it.hasNext());
//		System.out.println("7th row value: "+it.next()); // NoSuchElementException
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
	
	// Assignment: 	1. Employee DB 2D - Array -> insert detail of each customer from 2D Array to ArrayList and traverse
				//	2. Library book information 2D - Array -> insert detail of each customer from 2D Array to ArrayList <- book search

}
