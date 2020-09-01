package practisePrograms;

public class StringOperations {

	public static void main(String[] args) {
		//Different String related operations
		
		String welcomeText = "Hi, Hello, How are you, Mr.John";
		
		System.out.println(welcomeText.toUpperCase());
		System.out.println(welcomeText.toLowerCase());
		
		System.out.println(welcomeText.length());
		
		//System.out.println(welcomeText.split(","));
		System.out.println(welcomeText.substring(27));
		
		System.out.println(welcomeText.contains("Samuel"));
		
		String value = "Good";
		
		System.out.println(value.equals("good"));
		System.out.println(value.equalsIgnoreCase("good"));

		
	}

}
