package ConstructorThisSuperConcepts;

public class SuperB extends SuperA {
	
	String color = "Read";
	String lang = "";

	public SuperB(){
		super(10);
		System.out.println("child class constructor");
		
	}
	
	public void call(){
	
		super.receive();
		System.out.println("Call method");
		super.receive();
		System.out.println("Color from parent" +super.color);
		System.out.println("Color child" +super.color);
		
		System.out.println("Color from parent" +super.tool);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperB sb = new SuperB();
		sb.call();
	}

}
 