package LinkedListConcept;

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

	}

}
