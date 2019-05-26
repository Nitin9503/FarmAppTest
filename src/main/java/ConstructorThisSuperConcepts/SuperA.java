package ConstructorThisSuperConcepts;

public class SuperA {

	String color = "Blue";
	String tool = "";
	
	public SuperA() {
		System.out.println("Parent class constructor");
	}

	public SuperA(int i) {
		tool = "JAVA";
		System.out.println("Single parameter constructor" + i);
	}

	public void receive() {

		System.out.println("receive method");
	}
}
