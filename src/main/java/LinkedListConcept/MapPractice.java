package LinkedListConcept;

import java.util.HashMap;

public class MapPractice {

	public static void main(String[] args) {

		// HashMap store an element based on Key and Value pair and you can
		// access the value using key.
		// we can store different data type value as Integer, String and others.
		// The values are not stored and return value based on index.
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// add value into HashMap.
		hm.put(1, "Sachin");
		hm.put(2, "Mayur");
		hm.put(3, "Bhup");
		hm.put(4, "Kiran");
		
		//Print the all from HashMap.
		System.out.println("Print the all from HashMap==> " +hm);

		// get the value
		System.out.println("Get the value from HashMap using key==>" +hm.get(3));
		
		//Print the size of HashMap.
		System.out.println("Print the size of HashMap==>" +hm.size());
		
		// Remove the value from HashMap based on key
		hm.remove(3);
		
		// Replace the value based on key 
		hm.replace(2, "Automation");
		System.out.println("Print the all from HashMap==> " +hm);

		
		// keyset method if you want to print only key value
		for (int st : hm.keySet()){
			System.out.println("Print the key value==> " +st);			
		}
	
		//value method if you want to print only value.
		

		for (String st : hm.values()){
			System.out.println("Print the Value of value==> " +st);			
		}
		
		
		
		
		
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();

		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();

		HashMap<Integer, String> hm3 = new HashMap<Integer, String>();

		HashMap<Integer, String> hm4 = new HashMap<Integer, String>();

	}

}
