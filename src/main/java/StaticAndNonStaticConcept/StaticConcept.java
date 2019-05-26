package StaticAndNonStaticConcept;

public class StaticConcept {

	String name = "Krishna"; // Non-static global variable
	static String lastName = "Yadav"; // Static gloabal variable.

	public static void main(String[] args) {
		// How to class static method and static variables.

		// 1. Direct calling.
		sub();

		// 2. Calling by class name.
		StaticConcept.sub();
		// 1. Direct calling.
		System.out.println("lastName=>" + lastName);
		// 2. Calling by class name.
		System.out.println("lastName=>" + StaticConcept.lastName);

		// How to class static method and static variables.
		
		StaticConcept obj = new StaticConcept();
		obj.add();
		System.out.println("Name=>" + obj.name);
		
		//Can i access methods or variable by using reference variable?yes.
		// But that is not good practice.
		obj.sub();
		
		

	}

	public void add() {

		System.out.println("Hello addition");
	}

	public static void sub() {

		System.out.println("Hello substarction");
	}

}
