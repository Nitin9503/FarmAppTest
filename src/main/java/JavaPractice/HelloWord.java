package JavaPractice;

public class HelloWord {

	
	//compile javac MyClass.java.
	// Run  java MyClass 
	public static void main(String [] args){
		
		

		
		
		
		String firstName = "Sachin"; // declaration , intilazation
		String lastName = "Patil";
		String fullName = firstName + " " +  lastName ;
		System.out.println(fullName);
		int x = 5;
		int y = 6;
		String school = ""; //declaration
		school = "NES"; // intilazation
		System.out.println(school);
		System.out.println(x + " " + y);
		System.out.println(x + y);
		int  w = 80 , z = 11 ;
		
		String name1 = "Sachin", name2 = "patil";
		System.out.println(name1 + " " +name2);
		
		
		byte myNum = 100;
		System.out.println(myNum);
		
		
		short myNum1 = 5000;
		System.out.println(myNum1);
		
		float myNum2= 5.75f;
		System.out.println(myNum2);
		
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);     // Outputs true
		System.out.println(isFishTasty);
		
		char myGrade = 'B';
		System.out.println(myGrade);
		
		char a = 65, b = 66, c = 67;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		String greeting = "Hello World";
		System.out.println(greeting);
		
		
		int x1 =10;
		int x2 =8;
		
		if (x1!=x2){
			System.out.println("Here");
			
		}
		else{
			System.out.println("There");
		}
	}
}
