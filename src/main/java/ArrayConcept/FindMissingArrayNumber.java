package ArrayConcept;

public class FindMissingArrayNumber {

	public static void main(String[] args) {
		{
	        String[] my_array = {"Arjun", "Sachin", "Pratik", "Arjun", "Sachin"};
	        System.out.println(my_array.length);
	        System.out.println(my_array[0]);
	 
	        for (int i = 0; i < my_array.length-1; i++)
	        {
	            for (int j = i+1; j < my_array.length; j++)
	            {
	                if ((my_array[i] == my_array[j]) && (i != j))
	                {
	                    System.out.println("Duplicate Element : "+my_array[j]);
	                }
	            }
	        }
	    }    
	 }

	}


