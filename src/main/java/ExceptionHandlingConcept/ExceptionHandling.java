package ExceptionHandlingConcept;

public class ExceptionHandling {

	public static void main(String[] args) {

		//uncaught exception
		/*int i =10/0;
		System.out.println(i);*/
		
		//caught exception
		//Thread.sleep(2000);
		
		
		// 1. try catch block: Why we use try catch block ?
		// When we know this particular line will give you an error and but you dont want terminate the program that we use try catch block
		
		try{
			int i =9/0; //In try block we write that code which can give error. this code will throw an exception.  
		}catch(ArithmeticException e){
			e.printStackTrace();    // catch block store the exception that is thrown by try block.
			System.out.println(e.getMessage());
			
		}
		System.out.println("ABC");
		
	}

	
		
}
