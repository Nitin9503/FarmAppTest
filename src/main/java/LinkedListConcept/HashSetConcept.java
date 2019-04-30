package LinkedListConcept;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {

	
	public static void main(String args[]){
		
	
		
		
		HashSet h = new HashSet();
		h.add(10);
		h.add("Sachin");
		
		
		
		HashSet<String> h1 = new HashSet<String>();
		h1.add("Automation");
		h1.add("UK");
		h1.add("USA");
		h1.add("Austrilia");
		h1.add("England");
		h1.add("India");
		h1.add(null);
		System.out.println("Content in the hashset=>" +h1);
		
		System.out.println("size of hashset=>" +h1.size());
	
	      Iterator<String> it=    h1.iterator();
	
	      while(it.hasNext()){
	    	  System.out.println(it.next());
	      }
	      
	      HashSet<Employee> h2 = new HashSet<Employee>();
	      Employee emp1 = new Employee("Sachin", 10, 10.10);
	      Employee emp2 = new Employee("Bhushan", 20, 20.10);
	      Employee emp3 = new Employee("Pradip", 30, 30.10);
	      
	      h2.add(emp1);
	      h2.add(emp2);
	      h2.add(emp3);
	      
	     Iterator<Employee> it1 = h2.iterator();
	     
	     while(it1.hasNext()){
	    	 
	    	Employee emp = it1.next();
	    	
	    	System.out.println(emp.name +" "+ emp.percentage +" "+ emp.rollNo);
	     }
	     
	     for (Employee em : h2){
	    	 
	    	 System.out.println(em.name +" "+ em.percentage +" "+ em.rollNo); 
	     }
	      
	}
}
