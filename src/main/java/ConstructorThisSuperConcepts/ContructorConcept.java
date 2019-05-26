package ConstructorThisSuperConcepts;

public class ContructorConcept {

	public ContructorConcept() {

		System.out.println("Defaut constructor");
	}

	public ContructorConcept(int a) {

		System.out.println("Single parameter constructor");
		System.out.println("The value of a==>" +a);
	}
	
	public ContructorConcept(int i, int j) {

		System.out.println("Double parameter constructor");
		System.out.println("The value of a==>" +i);
		System.out.println("The value of a==>" +j);
	}
	

	public static void main(String[] args) {
		ContructorConcept cc1 = new ContructorConcept();
		
		ContructorConcept cc2 = new ContructorConcept(10);
		
		ContructorConcept cc3 = new ContructorConcept(50,100);
	}

}
