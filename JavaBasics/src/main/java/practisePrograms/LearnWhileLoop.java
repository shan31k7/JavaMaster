package practisePrograms;

import java.util.Scanner;

public class LearnWhileLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String text = scan.nextLine();

		while (!text.equalsIgnoreCase("end")) {
			text = scan.nextLine();
			System.out.println("You entered: " + text);
		}

	}

}
