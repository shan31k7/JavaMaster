package a_basics;

public class StringOperations {

	public static void main(String[] args) {
		// Different String related operations
		String welcomeText = "Hi, Hello, How are you, Mr.John";
		String text = new String("Hello");
		
		System.out.println("Given Text: " + welcomeText + "\n");

		// pick a character
		System.out.println("First letter: " + welcomeText.charAt(0));

		// Upper or Lower case
		System.out.println("Uppercase: " + welcomeText.toUpperCase());
		System.out.println("Lowercase: " + welcomeText.toLowerCase());

		// Length
		System.out.println("Length: " + welcomeText.length());

		// Split based on comma
		System.out.println("Split based on comma: ");
		String[] parts = welcomeText.split(",");
		for (String str : parts) {
			System.out.println(str);
		}

		// Fetch a substring
		System.out.println("Extract Substring: " + welcomeText.substring(27, 31));

		// Find a substring
		System.out.println("Find text 'John': " + welcomeText.contains("John"));
		System.out.println("Find text 'Samuel': " + welcomeText.contains("Samuel"));

		// Compare two strings
		System.out.println("Compare 'GOOD' with 'good' using Equals method: " + "GOOD".equals("good"));
		System.out.println(
				"Compare 'GOOD' with 'Good' using EqualsIgnoreCase method: " + "GOOD".equalsIgnoreCase("Good"));

		// String - immutable - not editable at same memory location
		String A = "Angel";
		String B = "Basha";
		A.concat(B);
		System.out.println("After String Concat: " + A);

		// StringBuffer, StringBuilder - mutable - edit at same location
		StringBuffer buffer1 = new StringBuffer("Angel");
		StringBuffer buffer2 = new StringBuffer("Basha");
		buffer1.append(buffer2);
		System.out.println("After StringBuffer Append: " + buffer1);

	}
}
