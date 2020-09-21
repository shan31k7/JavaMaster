package a_basics;

import java.util.Arrays;

// Read 5 marks and calculate Average

public class LearnArrays {

	public static void main(String[] args) {

		int[] marks = new int[5]; // size of the array

		// variable name, identifier, reference
		// instance, objects

		// index, subscript
		marks[0] = 65;
		marks[1] = 75;
		marks[2] = 25;
		marks[3] = 95;
		marks[4] = 95;
		// marks[5] = 32; // runtime exceptions

		// print the values
		System.out.println("Given values:");
		for (int i = 0; i < 5; i = i + 1) // design time, if you know of iterations
		{
			System.out.println(marks[i]);
		}

		int k = 0;
		while(true) // run time, if you know of iterations
		{
			System.out.println(marks[k]);
			if(k==4) break;
			k++;
		}

		// Sort and print values
		Arrays.sort(marks);
		System.out.println("After sorting the values:");
		for (int j : marks) {
			System.out.println(j);
		}

		// Add each of the array values
		int sum = 0;
		for (int j : marks) {
			sum = sum + j;

			// break - break the loop
			// continue - skip the current iteration
		}

		// Print the average
		System.out.println("Average: " + (sum) / 5);
	}
}