package FinalConceptInJAVA;

public class FinallyConcept {

	//finally is block.... The code inside finally block will be executed whether exception coming or not. 
	// we have to write the finally block with try catch block we can not write it separetly.
	// we can use finally block after try block instead of catch block
	public static void main(String[] args) {
		//test();
		//test1();
		div();
		
	
	}
	
	public static void test(){
	try{
		System.out.println("Inside try block");
		throw new Exception("Sachin");// this line throwing exception
		}catch(Exception e ){
			System.out.println("Inside catch block");	
		}
		finally{
			System.out.println("Inside finally block");	
		}	
		
	}

	public static void test1(){
		try{
			System.out.println("test 1 ===Inside try block");	
		}
		finally{
			System.out.println("test 1 ===Inside finally block");	
		}
	}

	public static void div(){
		try{
			System.out.println("div ===Inside try block");	
			int i = 10/0;
		}catch(Exception e){
			System.out.println("div ===Inside catch block");	
					
		}
		finally{
			System.out.println("div ===Inside finally block");	
		}

		
	}

}
