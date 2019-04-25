package JavaPractice;

public class ForloopPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// for loop 
		for (int i=0; i<=5; i++){
			
			System.out.println(i);
		}
		
		// for each loop
		
		int a[] = {1, 2, 3, 4 ,5};
		for (int b : a){
			System.out.println(b);
		}
		
		char c[] = {'A', 'B', 'C', 'D' , 'E'};
		for (char d : c){
			System.out.println(d);
		}
	
	int j = 0 ;
    while (j < 10) {
      if (j == 4) {
        j++;
        continue;
      }
      System.out.println(j);
      j++;
    }  
}
}
