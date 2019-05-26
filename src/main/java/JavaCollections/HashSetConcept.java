package JavaCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {

	//Set is interface
	// Three class comes under set interface thore are HashSet, LinkedHashSet and TreeSet.
	
	//HashSet
	// it store the element base on Hashing. 
	//HashSet is class which implements Set interface.
	// Set does not allow duplicate value 
	// Can not access value by index.
	// HashSet does not maintain the order.
	
	//LinkedSet
	//LinkedSet is class which implements Set interface.
	// LinkedSet does maintain the order.
	
	//TreeSet
		//TreeSet is class which implements Set interface.
	// TreeSet maintain the ascending order. 10 20 30 
	
	public static void main(String[] args) {
		
		
		HashSet<String> values = new HashSet<String>();
		values.add("Sachin");
		values.add("Pralhad");
		values.add("Patil");   
		values.add("UK");
		System.out.println(values);
		System.out.println(values.size());
		

		System.out.println(values.remove("UK"));
		System.out.println(values.size());
		
		
		Iterator<String>itr = values.iterator();
		while(itr.hasNext()){// hasnext return the boolean value
			
			System.out.println(itr.next());
		}
		
		ArrayList<String> name  = new ArrayList<String>(values);
		
		System.out.println(name.get(0));
		
		
	}

}
