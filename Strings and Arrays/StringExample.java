
public class StringExample {
	public static void main(String[] args) {
		String firstName = "Sarwasvi";
		String lastName = "Ingoley";
		System.out.println("Are both string equal: " + firstName.equals(lastName));
		System.out.println("firstName length: " + firstName.length());
		System.out.println("Letter i's first position: " + firstName.indexOf('i'));
		String fullName=firstName.concat(lastName);
		System.out.println("Full name: " + fullName);
		System.out.println("Character at 9th position is: "+fullName.charAt(9));
	    System.out.println("First Name to lowercase: " + firstName.toLowerCase());
	    System.out.println("Last Name to uppercase: " + lastName.toUpperCase());
	    System.out.println("Substring between 2 to 7 in full name: " + fullName.substring(2,7));
	    System.out.println("Firt 5 characters in firstName: "+firstName.substring(5));  
		
	}

}
