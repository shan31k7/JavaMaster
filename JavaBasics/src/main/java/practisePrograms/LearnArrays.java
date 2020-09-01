package practisePrograms;

import java.util.Scanner;

public class LearnArrays {

	public static void main(String[] args) {
		char[] name = { 'G', 'o', 'o', 'g', 'l', 'e' };

		System.out.println(name[0]);

		int[] marks = new int[5];

		/*
		 * marks[0] = 98; marks[1] = 33; marks[2] = 66; marks[3] = 100; marks[4] = 12;
		 */
		// marks[5] = 32;

		System.out.println("Please enter marks for all 5 subjects: ");
		Scanner scan = new Scanner(System.in);
		// for ( start; condition; increment/decrement)
		for (int i = 0; i < 5; i = i + 1) {
			marks[i] = scan.nextInt();
		}

		// CTRL + A
		// CTRL + I
		// CTRL + SHIFT + F
		int sum = 0;
		for (int i : marks) {
			sum = sum + i;
		}
		System.out.println("Average: " + (sum) / 5);

	}

}
