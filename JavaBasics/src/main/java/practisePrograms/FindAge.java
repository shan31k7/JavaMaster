package practisePrograms;

import java.util.Calendar;
import java.util.Scanner;

// Program to find the age of a person
public class FindAge {

	public static void main(String[] args) {

		// int yearOfBirth = 1987; //camelCase //Primitive data type
		// Integer currentYear = 2020; // Wrapper class

		// Read input from user
		System.out.println("Please enter year Of Birth: ");
		Scanner scan = new Scanner(System.in);
		int yearOfBirth = scan.nextInt();

		// find the current year
		Integer currentYear = Calendar.getInstance().get(Calendar.YEAR);

		int age = (currentYear - yearOfBirth);
		System.out.println("Your age is: " + age);

		// if Age is above 18; allow them
		// else we are send them back

		if (age >= 18 && age <= 60) {
			System.out.println("Welcome to the party");
		} else if (age < 18) {
			System.out.println("Sorry, kids are not allowed");
		} else {
			System.out.println("Sorry, grand parents are not allowed");
		}

	}

}
