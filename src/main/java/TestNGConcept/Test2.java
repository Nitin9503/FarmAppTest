package TestNGConcept;

import org.testng.annotations.Test;

public class Test2 extends Test1 {
	
	@Test
	public void add(){
		System.out.println("addition from test2");
		
	}
	@Test
	public void mul(){
		
		System.out.println("mul from test2");

	}
	@Test
	public void div(){
		System.out.println("div from test2");

		
	}


}
