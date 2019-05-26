package InheritenceConcept;

public class ChildClass extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reference variable play important role
		// Creating object and reference variable of childclass.
		// Methods can be invoked from both classes
		ChildClass obj1= new ChildClass();
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.div();
		
		// Creating object of child class and reference variable of baseclass.
		// Only Baseclass method can be invoked
		BaseClass obj2= new ChildClass();
		obj2.add();
		obj2.sub();
		
		// Creating object of base class and reference variable of baseclass.
		// Only base method can be invoked
		BaseClass obj3= new BaseClass();
		obj3.add();
		obj3.sub();
	
		
		// Creating object of base class and reference variable of childclass.
		// This type object creation not possible as parent class can not acquire property of childclass
		//ChildClass obj3= new BaseClass();
		//obj2.add();
		
		

	}
	
	public void div() {

		System.out.println("Division operation");
	}

	public void mul() {

		System.out.println("Multiplication operation");
	}


}
