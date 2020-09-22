package j_exceptions;

import java.util.Scanner;

public class RunnerCustomException {

	public static void main(String[] args) {

		// use the custom exception

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your input: ");
		String input = scanner.nextLine();

		try {
			if (input.equalsIgnoreCase(""))
				throw new Learn3_CustomException();
			// throws - declaration
			// throw - actually throwing
		} catch (Learn3_CustomException e) {
			System.out.println("Inside custom exception");
		}

	}

}
