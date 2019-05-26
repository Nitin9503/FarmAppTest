package FinalConceptInJAVA;

public class FinalizeConcept {

public void finalize(){
		
		System.out.println("Finalize method");
	}
	
	//finalize is the method we use it when we want remove the object which have no reference variable they are just null.
	public static void main(String[] args) {
		FinalizeConcept obj1 = new FinalizeConcept();
		FinalizeConcept obj2 = new FinalizeConcept();
		 
		obj1=null;
		obj2=null;
		
		System.gc();  // it will garbage collector to remove the object that have no reference variable.
	}
	
	

}
