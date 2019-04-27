package JavaPractice;

public class Jabaarray {

	public static void main(String args[]) {

		int a[]; // array declaration
		a = new int[5]; // array instatation.

		a[0] = 12; // array initialization.
		a[1] = 13;
		a[2] = 14;
		a[3] = 15;

		System.out.println("size of array==>" + a.length);

		System.out.println("a value==>" + a[3]);

		for (int i = 0; i < a.length; i++) {

			System.out.println("values==>" + a[i]);
		}

		String name[] = { "SAchin", "Arjun", "Bhup", "Mayur", "Bhoi" };

		for (String i : name) {
			System.out.println("name==>" + i);

		}
		for (int i = 0; i < name.length; i++) {

			System.out.println("values==>" + name[i]);
		}
		String name1[] = new String[6];
		
		name1[0] ="SAchin";
		name1[1] ="Arjun";
		name1[2] ="Bhup";
		name1[3] ="Mayur";
		for (String j : name1) {
			System.out.println("name==>" + j);

		}
	
		Object name3[] = new Object[5];
		name3[0]="rahul";
	
		System.out.println("array value1==>" +name3[0]);	 
		Object name2[] = {"Sachin", 10, "patil", 'A'};
			
		System.out.println("array value==>" +name2[0]);
		for (int j=0 ; j<name2.length; j++){
			System.out.println("array value==>" +name2[j]);
		}
	
	}

}
