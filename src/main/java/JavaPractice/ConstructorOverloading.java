package JavaPractice;

public  class ConstructorOverloading   {

	String str1;
	String str2;

	

	public  ConstructorOverloading(String name, String village) {
		System.out.println(name);
		System.out.println(village);

	}

	public ConstructorOverloading(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		ConstructorOverloading obj = new ConstructorOverloading("Sachin", "UK");
		ConstructorOverloading obj1 = new ConstructorOverloading(10, 20);
		
	}

}
