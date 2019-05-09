package StringConcept;

public class StringConcept {

	public static void main(String[] args) {
	
		String firstName  = "Sachin";
		String middleName  = "Pralhad";
		String lastName  = "Patil";
		
		String str = lastName.concat(firstName);
		
		System.out.println("lastName.concat(firstName);" +str);
				
		System.out.println(firstName +" "+lastName );
		
		firstName.length();
		
		System.out.println("firstName.length();" +	firstName.length());
		
		System.out.println("firstName.charAt(3);" +	firstName.charAt(3));
		
		
		lastName=firstName;
		System.out.println("lastName.equals(firstName);" +	lastName.equals(firstName));
		
		System.out.println("lastName.equalsIgnoreCase(firstName)" +	lastName.equalsIgnoreCase(firstName));
		
		
		
		System.out.println("firstName.indexOf(4)" +	firstName.indexOf('a'));
		
		
		System.out.println("firstName.substring(0)" +	firstName.substring(3));
		
	}

}
