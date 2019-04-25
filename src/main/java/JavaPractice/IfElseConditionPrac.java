package JavaPractice;

public class IfElseConditionPrac {

	
	public static void main (String [] args){
		
		int x =4 , y = 5, z =8;
		
		if (y>x){
			
			System.out.println("greter 1");
		}
		if (y<x){
			System.out.println("greter 2");
		}
		else{
			
			System.out.println("not greater 1");
		}
		
		if (y<x){
			System.out.println("greter 2");
		}
		else if(y>x){
			System.out.println("greater 1");
			
		}
		else {
			System.out.println("Hello no 1");
			
		}
		if (y<x){
			System.out.println("greter 2");
		}
		else if(y<x){
			System.out.println("greater 1");
			
		}
		else {
			System.out.println("nono no 1");
			
		}
		
	}
}
