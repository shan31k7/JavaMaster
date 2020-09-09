package basics;

public class StringOperations {

	public static void main(String[] args) {
		//Different String related operations
		
		String welcomeText = "Hi, Hello, How are you, Mr.John";
		
		char a = welcomeText.charAt(0);
		System.out.println(welcomeText.toUpperCase());
		System.out.println(welcomeText.toLowerCase());
		
		System.out.println(welcomeText.length());
		
		//System.out.println(welcomeText.split(","));
		System.out.println(welcomeText.substring(27));
		
		System.out.println(welcomeText.contains("Samuel"));
		
		String value = "Good";
		
		System.out.println(value.equals("good"));
		System.out.println(value.equalsIgnoreCase("good"));

		// String - immutable - not editable at same memory location
		String A = "Babu";
		String B = "Raghu";
		A = A.concat(B);
		
		//StringBuffer, StringBuilder  - mutable - edit at same	
	}
}
