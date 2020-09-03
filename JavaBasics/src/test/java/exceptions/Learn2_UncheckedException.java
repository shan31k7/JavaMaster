package exceptions;

import java.util.Scanner;

/*
 * UnChecked Exceptions also called as "Runtime exceptions"
 * exception which can be unexpected
 * we shall handle using try and catch block
 */
public class Learn2_UncheckedException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your input: ");
		String input = scanner.nextLine();

		// use the custom exception
		try {
			if (input.equalsIgnoreCase(""))
				throw new Learn3_CustomException();
		} catch (Learn3_CustomException e) {
			System.out.println("Inside custom exception");
		}
		
		System.out.println("program ends");
		printFirstChar(input);
		scanner.close();

	}

	public static void printFirstChar(String s) {
		// print first character of a String
		try {
			System.out.println(s.charAt(0));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("User input is Empty");
		} catch (Exception e) {
			System.out.println("Something went wrong. please again with differnt input");
		} finally {
			// closing an open connection db conn, thrid par, file
		}

	}
}
