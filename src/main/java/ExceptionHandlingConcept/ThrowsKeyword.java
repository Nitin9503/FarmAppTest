package ExceptionHandlingConcept;

public class ThrowsKeyword {

	public static void main(String[] args) {
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.add();
		System.out.println("ABC");
		
	}
	
	public void div() throws  ArithmeticException {
		int a = 10/0;
	}

	public void add(){
		try{
		div(); 
		}
		catch(ArithmeticException e){
			
		}
	}
}
