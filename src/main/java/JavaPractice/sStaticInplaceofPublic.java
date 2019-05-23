package JavaPractice;

public class sStaticInplaceofPublic {

	public static String name = "Krishna";
	protected static String middle = "Govind";
	 static String From = "UK";
	 private static String dist = "Jalgaon";
	
	public static void main(String[] args) {
		test();
		System.out.println(10+20+" "+"Hello");
		System.out.println("Hello" +" "+10+20);
		
		sStaticInplaceofPublic obj = new sStaticInplaceofPublic();
		System.out.println(obj);
	}

	static public void test(){
		System.out.println("Hello");
	}
}
