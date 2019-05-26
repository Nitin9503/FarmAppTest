package ExceptionHandlingConcept;

public class ThrowKeyword {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		
		
		
		try {
			throw new Exception("Sachin exception");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("HI");

	}

}
