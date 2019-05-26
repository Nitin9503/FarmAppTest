package PolymorphisamConcept;

public class MethodOverLoadingConcept {

	public static void main(String[] args) {

		MethodOverLoadingConcept mc = new MethodOverLoadingConcept();
		mc.add(10, 20);
		mc.add(10, 20, 30);
		mc.add(20.20, 30.30);
		mc.add(20.20, 10);
		mc.add(10, 10.10);
		mc.add(10,20, 30.03);

	}

	public void add(int a, int b) {

		int c = a + b;
		System.out.println("Sum of two numbers==>" + c);
	}

	public void add(double a, int b) {

		double c = a + b;
		System.out.println("Sum of two numbers==>" + c);
	}
	public void add(int a, double b) {

		double c = a + b;
		System.out.println("Sum of two numbers==>" + c);
	}
	public void add(double a, double b) {

		double c = a + b;
		System.out.println("Sum of two numbers==>" + c);
	}
	
	public void add(int a, int b, int c) {

		int d= a + b +c;
		System.out.println("Sum of two numbers==>" + c);
	}
	
	public void add(int a, int b, double c) {

		 c = a + b;
		System.out.println("Sum of two numbers==>" + c);
	}

}
