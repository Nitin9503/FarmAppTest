package JavaPractice;

public class VariableConcept {

	
	int i = 10 ; //instance variable.
	static double b = 10.10; // static variable
	
	public static void main(String[] args) {
		
		// int is data type and a is variable which store the value, The variable is assigned with data type.
		//There are three type of variable i.e local , instance and static.
		// There are two types of data type i.e primitive and non primitive.
		//
		
		int name = 10;  // Here name is variable.
		
		//Local Variable ==> A variable which is defined inside the method body is called as Local variable. we can access the variable into the that method only.
		// A local variable can not be defined as "static".
		
		//Instance Variable ==> A variable which is defined immediate after the class is called as Instance variable. it is not defined inside the method body.
		
		// Static variable ==> A variable which is declared as static is called as static variable. it can not be local variable.
		// for static variable memory allocation happens only once.
		
		
		
		

	}

	public void localVariable(){
		
		String name = "Sachin";  // local variable
	}
}
