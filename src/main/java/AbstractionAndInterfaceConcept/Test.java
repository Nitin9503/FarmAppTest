package AbstractionAndInterfaceConcept;

public class Test extends Shape {

	
	Test() {

		System.out.println("Test class constructor");
	}

	public static void main(String[] args) {
		/*Shape s = new Test();
		s.drawing();
		s.fill();*/

		
		Test ts = new Test();
		ts.color=10;
	}

	@Override
	void drawing() {
		System.out.println("Test---drawing");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

}
