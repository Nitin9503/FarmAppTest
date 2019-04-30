package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String args[]) {
		int name[] = new int[3];			  	// This is static array where is size fixed, we can not add / remove the value once we defined size.To overcome this problem we go for Dynamic array.											
													 

		ArrayList ar = new ArrayList(); 			// It is non generic array which support // before java 1.5 , In non generic array we can add any data type value as String , Integer ,
														//Double as we are not parametrize any specific data type.
													// ArrayList is class and it has many useful methods.
													// This is Dynamic array where is not fixed , we can add / remove the n no. of value/element from the array.
		ar.add("Sachin");   						 // ar.add method to add value/element to array
		ar.add('A');
		ar.add(10);
		ar.add(10.10);

		System.out.println("Valeu in array==>" +ar) ;  // array name (ar) for print all value present in array.
		
		System.out.println("Value from array by index==>" +ar.get(2)) ;  // array name ar.get(2) method to print specific value from array by using index value.
		System.out.println("********************************");
		for (int i=0; i<ar.size(); i++){ 				// Print value of array using from loop
			
			System.out.println("Print value one by one==>" +ar.get(i));
		}
		
		System.out.println("********************************");
		ar.remove(2);            						 // The use of ar.remove(2) method to remove value/element from array using index value.
		System.out.println("Value in array==>" +ar) ; 
		
		System.out.println("Print the size of array==>" +ar.size());  // Print the size of array
		
		ar.set(0, "Rahul");                                     // The use of ar.set(0, "Rahul") method to change the value of element by using index value.
		ar.set(1, "B");
		System.out.println("********************************");
		for (int i=0; i<ar.size(); i++){ 						// Print value of array using from loop
			
			System.out.println("Print value one by one==>" +ar.get(i));
		}
		for( Object st :ar){
			System.out.println("(New )Print value one by one==>" +st);
		}
		ar.set(0, 20);
		ar.set(1, 10);
		ar.set(2, 30);
		System.out.println("Value in array==>" +ar) ;
		Collections.sort(ar);                                 // while sorting the value the value should be similar data type only like as all value should be integer value only if there are difference
		System.out.println("Value in array==>" +ar) ;												//data types value then compiler will throw exception "Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String	
		System.out.println("********************************");
		for (int i=0; i<ar.size(); i++){ // Print value of array using from loop
			
			System.out.println("Print value one by one==>" +ar.get(i));
		}
		
		ar.clear();                                       // The use of ar.clear(); method to remove all the value/element from array.
		System.out.println("********************************");
		System.out.println("Valeu in array==>" +ar) ;  // array name (ar) for print all value present in array.
		
		
		System.out.println("************* Objects *******************");
	//	ArrayList<E> ar4 = new ArrayList<E>();  // To store any data value 
	
		
		// Employee class object 
		
		Employee emp1 = new Employee("Mukesh", 21, 60.60);   // How to store user defined class in array list
		Employee emp2 = new Employee("Rakesh", 42, 61.60); 
		Employee emp3 = new Employee("Rajesh", 63, 62.60); 
		
		
		ArrayList<Employee> ar5 = new ArrayList<Employee>();   //  For object array we can not use for loop, we have to go for iterator
		ar5.add(emp1);
		ar5.add(emp2);
		ar5.add(emp3);

		Iterator<Employee> it = ar5.iterator();
		
		while(it.hasNext()){
			
			Employee emp =it.next();
			System.out.println(emp.name);
			System.out.println(emp.rollNo);
			System.out.println(emp.percentage);
		}
		
		System.out.println("********************************");
		
		System.out.println("********************************");
		for(Employee em : ar5){
			System.out.println(em.name);
			System.out.println(em.rollNo);
			System.out.println(em.percentage);
			
		}
		
		System.out.println("********************************");
		
		System.out.println("********************************");
		
		ArrayList<String> ar1 = new ArrayList<String>();  // This arraylist is generic where parametrized the data type , Now String data type value can be added.
		ar1.add("Rohit");
		ar1.add("Testing");
		ar1.add("Selenium");
		ar1.add("Java");
		
		for (String i: ar1){     //Print the value from array using for each loop
			System.out.println("Print the value using for each loop==>" +i);
			
		}
		
		Collections.sort(ar1);
		System.out.println("**************** Collections ****************");
		for (String i: ar1){     //Print the value from array using for each loop
			System.out.println("Print the value using for each loop==>" +i);
			
		}
		
		Collections.sort(ar1, Collections.reverseOrder());
		for (String i: ar1){     //Print the value from array using for each loop
			System.out.println("Print the value using for each loop==>" +i);
			
		}
	
		System.out.println("********************************");
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(100);
		ar2.add(200);
		ar2.add(300);
		ar2.add(400);
	
		
		System.out.println("********************************");
		ArrayList<Integer> ar3 = new ArrayList<Integer>(); 
		ar3.add(5);
		ar3.add(6);
		ar3.add(7);
		ar3.add(400);
		
		ar2.addAll(ar3);  									// The use of ar2.addAll(ar3) method to add one array to another array.
		System.out.println("size of array after adding array==>" +ar2.size());
		for (int i: ar2){    									 //Print the value from array using for each loop
			System.out.println("Print the value using for each loop==>" +i);
			
		}
		System.out.println("********************************");
		ar2.removeAll(ar3);      						// The of of ar2.removeAll(ar3) method to remove one array from another array			
		
		System.out.println("size of array after adding array==>" +ar2.size());
		for (int i: ar2){     //Print the value from array using for each loop
			System.out.println("Print the value using for each loop==>" +i);
			
		}
		System.out.println("**************  retainAll ******************");
		
		ArrayList<Integer> ar6 = new ArrayList<Integer>();
		ArrayList<Integer> ar7 = new ArrayList<Integer>();
		ar6.add(100);
		ar6.add(200);
		ar6.add(300);
		ar6.add(400);
	
		ar7.add(800);
		ar7.add(900);
		ar7.add(1100);
		ar7.add(400);
		ar6.retainAll(ar7);                    //   The use of this ar2.retainAll(ar3) method to find common value from both array.                                                                                                                                                                         
		for (int i: ar6){     //Print the value from array using for each loop
			System.out.println("Print the value using for each loop==>" +i);
			
		}
	}

	
}
