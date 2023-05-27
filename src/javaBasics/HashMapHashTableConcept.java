package javaBasics;

import java.util.*;
import java.util.Map.Entry;

public class HashMapHashTableConcept {
	
	// HashMap & Hashtable -> is a class | key-value pair

	public static void main(String[] args) {
		// HashMap
		HashMap<Integer, String> hm = new HashMap<Integer,String>(); // <Integer,String> -> <Key,Value>
		
		// insert data/creating entry -> key & value => entry
		hm.put(53, "Danny");
		hm.put(45, "Mike");
		hm.put(101, "Karen");
		
		System.out.println(hm);
		
		// extract value
		System.out.println("Employee with ID 45: "+hm.get(45));
		
		// checking key/value
		System.out.println(hm.containsKey(100));
		System.out.println(hm.containsValue("Mike"));
		
//		System.out.println(hm.remove(101));
//		System.out.println(hm);
		
		System.out.println(hm.remove(101, "Karen"));
		System.out.println(hm);
		System.out.println(hm.remove(101, "Karen"));
		System.out.println(hm);

		Object cloneHM = hm.clone();
		System.out.println(hm.equals(cloneHM));
		hm.put(100, "Dennis");
		System.out.println(hm.equals(cloneHM));

		System.out.println("Number of entries: " + hm.size());

		// all keys
		Set<Integer> keys = hm.keySet();
		System.out.println(keys);
		System.out.println(keys.size());

		// all values
		Collection<String> allValues = hm.values();
		System.out.println(allValues);
		System.out.println(allValues.size());

		// all entries
		Set<Entry<Integer, String>> entries = hm.entrySet();
		System.out.println(entries);
		System.out.println(entries.size());

		// Traversing HashMap
		for (int key : keys) {
			System.out.println(hm.get(key));
		}

		// HashTable
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>(); // <Integer,String> -> <Key,Value>

		// insert data/creating entry -> key & value => entry
		ht.put(53, "Danny");
		ht.put(45, "Mike");
		ht.put(101, "Karen");

		System.out.println(ht);

		// extract value
		System.out.println("Employee with ID 45: " + ht.get(45));

		// checking key/value
		System.out.println(ht.containsKey(100));
		System.out.println(ht.containsValue("Mike"));

//		System.out.println(ht.remove(101));
//		System.out.println(ht);

		System.out.println(ht.remove(101, "Karen"));
		System.out.println(ht);
		System.out.println(ht.remove(101, "Karen"));
		System.out.println(ht);

		Object cloneHT = ht.clone();
		System.out.println(ht.equals(cloneHT));
		ht.put(100, "Dennis");
		System.out.println(ht.equals(cloneHT));

		System.out.println("Number of entries: " + ht.size());

		// all keys
		Set<Integer> keysHt = ht.keySet();
		System.out.println(keysHt);
		System.out.println(keysHt.size());

		// all values
		Collection<String> allValuesHt = ht.values();
		System.out.println(allValuesHt);
		System.out.println(allValuesHt.size());

		// all entries
		Set<Entry<Integer, String>> entriesHt = ht.entrySet();
		System.out.println(entriesHt);
		System.out.println(entriesHt.size());

		// Traversing HashMap
		for (int key : keysHt) {
			System.out.println(hm.get(key));
		}
	}

}
