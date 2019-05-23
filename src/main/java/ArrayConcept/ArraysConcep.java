package ArrayConcept;

public class ArraysConcep {

	public static void main(String[] args) {
		
		
		int student_id[] = {10, 20, 30, 40};

		
		for(int i=0; i<student_id.length; i++){
			System.out.println(student_id[i]);
		}
		
		for (int a:student_id){
			System.out.println(a);
		}
		
		int j=0;
		while( j<student_id.length){
			
			System.out.println(student_id[j]);
			j++;
		}
		
	
	}

}
