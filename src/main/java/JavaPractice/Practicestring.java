package JavaPractice;

public class Practicestring {
	
	public static void main (String args[]){
		
		String name = "Jalgaon";
		int len = name.length();
		
		System.out.println("len==>" +len);
		
		String msg = "Hello Sachin How are you there";
	  int value =	msg.indexOf("you");
		System.out.println("msg==>" +value);
		
		String firstName = "Sachin"; // declaration , intilazation
		String lastName = "Patil";
		String fullName = firstName + " " +  lastName ;
		System.out.println(fullName);
		String firstName1 = "Sachin"; // declaration , intilazation
		String lastName2 = "Patil";
		String fullName2 = firstName1.concat(lastName2);
		System.out.println(firstName1. concat(lastName2));
		
		System.out.println("fullName2==>" +fullName2);
	
	}

}
