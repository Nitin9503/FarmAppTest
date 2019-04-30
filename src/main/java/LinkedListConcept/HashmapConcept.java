package LinkedListConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashmapConcept {

	public static void main(String[] args) {

		// HashMap is class implements 	Map Interface.
		// HashMap store an element based on Key and Value pair.
		// it contains only unique element.
		// it does not maintain order
		// it may have one null key and multiple null values	
		// You can access the value based on key.
		// we can store different data type value as Integer, String and others.
		// The values are not stored and return value based on index.
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// add value into HashMap.
		hm.put(0, "Sachin");
		hm.put(2, "Mayur");
		hm.put(5, "Patil");
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
		System.out.println("Print the all from HashMap==> " +hm);
		for(int i = 0; i<hm.size(); i++){
			System.out.println("************************************"); // it may have one null key and multiple null values	
			System.out.println("Print the key value==> " +hm.get(i));
			
		}
		//value method if you want to print only value.		

		for (String st : hm.values()){
			System.out.println("Print the Values==> " +st);			
		}
		
		for (Entry en : hm.entrySet()){
			
			System.out.println(en.getKey() +" "+ en.getValue());
		}
		
		HashMap<Integer, Employee> hm1 = new HashMap<Integer, Employee>();
		Employee emp1 = new Employee("Rakesh", 10, 20.20);
		Employee emp2 = new Employee("Hardik", 20, 30.20);
		Employee emp3 = new Employee("Vikas", 30, 40.20);
		

		hm1.put(1, emp1);	
		hm1.put(2, emp2);
		hm1.put(3, emp3);
		
		for(Entry<Integer, Employee> en : hm1.entrySet()){
	
			int in = en.getKey();
			Employee em = en.getValue();
			System.out.println(in);
			
			System.out.println(em.name +" "+ em.percentage +" " + em.rollNo);
		}
		
		

		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();

		HashMap<Integer, String> hm3 = new HashMap<Integer, String>();

		HashMap<Integer, String> hm4 = new HashMap<Integer, String>();

	}

}
