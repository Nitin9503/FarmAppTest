package AbstractionAndInterfaceConcept;

public abstract class Shape {
	
	
	Shape(){
		
		System.out.println("Shape class constructor");
	}
	// can not create object of abstract class.
	// its partial abstraction 0 to 100%
	// it can have abstract method or non abstract method...
	// we can not override the method which is declared final

	int color ;
	
	  abstract void drawing();
	  
	  public void fill(){
		  System.out.println("Shape-- fill");
		  
	  }
	  
	  public abstract void test();

}
