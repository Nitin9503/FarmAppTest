package MethodsConcept;

public class FunctionsConcept {

	
	// why main method is void ==>  because we never write the return statement in main method
	public static void main(String[] args) {
		FunctionsConcept fc = new FunctionsConcept();
		// one objected will be created , fc is the reference variable , refeerring to this object.
		// after creating the object, the copy of all the non static methods will be given to this object.
		
		fc.test();
		
		System.out.println(fc.pqr());
		fc.qa();
		System.out.println(fc.qa());
		fc.dev(30, 3);
		System.out.println(fc.dev(30, 3));

	}

	// Non static methods
	// Does not return anything
	
	
	
	public void test(){// no input and no output method
		System.out.println("test method");
	}
	

	public int pqr(){	 
		int a=10;
		int b =20;
		int c = a+b;
		return c;
	}
	
	public String qa(){//No input and but getting some output.
		System.out.println("QA method");
		
		String s = "Selenium";	
		return s;
		
	}
	
	// a, b is ==> input parameters
	public int dev(int a, int b){
		
		System.out.println("dev method");
		int c = a/b;
		return c;
		
	}
}
