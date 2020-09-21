package a_basics;

import java.time.LocalDate;
import java.util.Scanner;

// Program to find the age of a person
public class FindAge {
	// attributes
	static int currentYear;
	static int yearOfBirth;
	
	public FindAge()
	{
		
	}
	
	public FindAge(int a)
	{
		
	}
	
	// methods
	public static void main(String[] args) {
		currentYear = LocalDate.now().getYear();

		checkEligibility(currentYear, readDateOfBirth());
		// checkEligibility(2020, 1990);
	}

	public static int readDateOfBirth() {
		// Read DOB from user and find current year
		System.out.println("Please enter your, year Of Birth: ");
		Scanner scan = new Scanner(System.in);
		int yearOfBirth = scan.nextInt();
		scan.close();
		return yearOfBirth;
	}

	public static void checkEligibility(int currentYear, int yearOfBirth) {
		int age = (currentYear - yearOfBirth);
		System.out.println("Your age is: " + age);

		// Eligible for Bachelor's Party
		if (age >= 18 && age <= 60) {
			System.out.println("Welcome to the party");
		} else if (age < 18) {
			System.out.println("Sorry, kids are not allowed");
		} else {
			System.out.println("Sorry, grand parents are not allowed");
		}
	}
}
