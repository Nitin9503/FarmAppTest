package JavaCollections;

import java.util.HashMap;
import java.util.Map;

public class HashmapConcept {

	public static void main(String[] args) {
		
     //Hashmap is class which implements map interface.
		// Hashmap contains key and value pair.
		 //map contains only unique key.
		//map is easy to perform operation like insert,update and delete
		// only one null key allowed and multiple null value allowed
		HashMap<String, String> names = new HashMap<String, String>();
		
		names.put("firstname", "Sachin");
		names.put("middlename", "pralhad");
		names.put("lastname", "patil");
		names.put("villagename", "UK");
		names.put("taluka", "parola");
		names.put("firstname", "Sachin");
		
		names.put("abc", "");
		names.put("xyz", "");
		
		System.out.println(names);
		
		System.out.println(names.get("firstname"));

		System.out.println(names.size());
	
		
		for (Map.Entry<String, String> m:names.entrySet()){
			
			//System.out.println(m);
			System.out.println(m.getKey() +" "+m.getValue());
		}
		
	}

}
