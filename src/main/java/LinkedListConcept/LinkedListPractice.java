package LinkedListConcept;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListPractice {

	public static void main(String args[]) {

		LinkedList li = new LinkedList();
		li.add(10);
		li.add("Sachin");

		LinkedList<String> li1 = new LinkedList<String>();

		// add
		li1.add("Krishna");
		li1.add("Selenium");
		li1.add("Java");
		li1.add("Automation");

		// print all content
		System.out.println("content of linkedlist ==>" + li1);

		System.out.println("size of linkedlist ==>" + li1.size());
		System.out.println("*****************************************");

		// add first and last element into linkedlist using addfirst and addlast
		// method.
		li1.addFirst("Torenzo");
		li1.addLast("Technologies");

		System.out.println("content of linkedlist ==>" + li1);

		// print specific element value using get method.
		System.out.println("value of specific element ==>" + li1.get(0));

		// print size of linkedlist
		System.out.println("size of linkedlist ==>" + li1.size());
		
		System.out.println("*****************************************");
		// remove first and last element from linkedlist using removefirst and
		// removelast method.
		li1.removeLast();
		li1.removeFirst();

		System.out.println("content of linkedlist ==>" + li1);

		System.out.println("size of linkedlist ==>" + li1.size());
		
		System.out.println("*****************************************");
		// remove specific index value using remove method
		li1.remove(2);
		System.out.println("content of linkedlist ==>" + li1);

		System.out.println("*****************************************");
		// set the value in linkedlist using set method.
		li1.set(2, "OTP");
		System.out.println("content of linkedlist ==>" + li1);
		System.out.println("*****************************************");

		// we can print all value linkedlist using below way.

		// for loop
		System.out.println("************** Print value using for loop**************");
		for (int i = 0; i < li1.size(); i++) {
			System.out.println("value  ==>" + li1.get(i));

		}
		System.out.println("************** Print value using for each loop**************");
		// for each loop
		for (String st : li1) {
			System.out.println("value  ==>" + st);
		}

		System.out.println("************** Print value using while loop**************");
		// while loop

		int num = 0;
		while (num <li1.size()) {
			System.out.println("value  ==>" + li1.get(num));
			num++;
		}

		System.out.println("************** Print value using iterator loop**************");
		// iterator

		Iterator<String> it = li1.iterator();

		while (it.hasNext()) {

			System.out.println("value  ==>" + it.next());
		}

		System.out.println("************** Linkedlist value using user defined class  **************");
		
		LinkedList<Employee> li5 = new LinkedList<Employee>();
		
		Employee emp1 = new Employee("Sachin", 10, 10.10);
		Employee emp2 = new Employee("Kiran", 11, 20.10);
		Employee emp3 = new Employee("Mayur", 12, 30.10);
		li5.add(emp1);
		li5.add(emp2);
		li5.add(emp3);
	
		Iterator<Employee> it1 = li5.iterator();
		
		
		System.out.println("************** Linkedlist value using user defined class  **************");
		while(it1.hasNext()){
			System.out.println("************** Linkedlist value using user defined class  **************");
		Employee emp = it1.next();
		System.out.println(emp.name);
		System.out.println(emp.rollNo);	
		System.out.println(emp.percentage);

		}
		
		
		
		
	}

}
