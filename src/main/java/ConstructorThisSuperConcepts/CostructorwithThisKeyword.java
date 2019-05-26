package ConstructorThisSuperConcepts;

public class CostructorwithThisKeyword {

	
	public CostructorwithThisKeyword(){
		System.out.println("Default constaructor");
		
	}
	String name;
	int RollNO ;
	
	String name1;
	int seat;
	
	public void add(String name1, int seat){
		this.name1=name;
		this.seat=seat;
		System.out.println("name=>" +name1);
		System.out.println("RollNO=>" +seat	);
		
		
	}
	
	public void test(){
	
		System.out.println("HELLO"	);
	}
	public CostructorwithThisKeyword(String name, int RollNO){
		this();
		this.test();
		
		//name1 = name;
	//	RollNO1 = RollNO;
		this.name = name;
		this.RollNO = RollNO;
		System.out.println("name=>" +name);
		System.out.println("RollNO=>" +RollNO	);
		this.test();
	}
	public static void main(String[] args) {
		CostructorwithThisKeyword obj = new CostructorwithThisKeyword("Sachin", 10);
		obj.add("Patil", 10);
		
	}

}
 