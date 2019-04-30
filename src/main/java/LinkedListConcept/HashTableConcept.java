package LinkedListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		
		// It is similar to HashMap ,but it is synchronized
		// Store the value based on key and value.
		// key ==> hashcode==> jvm provide the hashcode.
		
		Hashtable ht = new Hashtable();   // Non generic hashtable as any data type value can be used, We have not parametrized any data type.
		
		Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();   // It is generic hashtable so we can store only specific data type value in it.
		
		ht.put(1, "Sachin");
		ht.put('A', "Automation");
		ht.put(2, "Selenium");
		ht.put('B', "TestNG");
		ht.put("C", "Maven");
		
		//Print the value of hashtable
		System.out.println("Print the value of hashtable=>" +ht);
		
		//Print the size of hashtable
		System.out.println("Print the size of hashtable=>" +ht.size());
		
		//get the value 
		System.out.println("Get the value=>" +ht.get("C"));
		System.out.println("Get the value=>" +ht.get(2));
		
		// Remove the value from HashTable based on key
		ht.remove(2);
		System.out.println("Print the value of hashtable=>" +ht);
		
		// Replace 
		ht.replace('B', "QTP");
		System.out.println("Print the value of hashtable=>" +ht);
		
		Enumeration e =	ht.elements();
	
		while (e.hasMoreElements()){
		
			System.out.println("Hello=>" +e.nextElement());
			}
		Enumeration e1 =ht.keys();
	
		while (e1.hasMoreElements()){
		
		System.out.println("Hello=>" +e1.nextElement());
		}
	
		
	}

}
