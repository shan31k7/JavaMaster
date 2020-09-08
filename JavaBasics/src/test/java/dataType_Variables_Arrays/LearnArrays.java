package dataType_Variables_Arrays;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

public class LearnArrays implements Serializable {

	public static void main(String[] args) {
		char[] name = { 'G', 'o', 'o', 'g', 'l', 'e' }; // declaring with values

		System.out.println(name[0]);

		int[] marks = new int[5]; // size of the array

		marks[0] = 35;
		marks[1] = 35;
		marks[2] = 35;
		marks[3] = 35;
		marks[4] = 35;
		// marks[5] = 32;

		System.out.println("Please enter marks for all 5 subjects: ");
		Scanner scan = new Scanner(System.in);
		
		// intialization; condition; increment/decrement the loop counter
		for (int i=0; i < 5; i = i + 1) {
			marks[i] = scan.nextInt();
		}

		int sum = 0;
		Arrays.sort(marks);
		System.out.println("After sorting the values:");
		for(int j: marks)
		{
			System.out.println(j);
		}

		
		// iterate each object inside the Array/collections
		for (int j : marks) {
			sum = sum + j;
		}

		/*int j = 0;
		while (j < 5) {
			if (j == 3) {
				System.out.println(marks[j]);
				j++;
				break; // terminate
			} else
				continue; // skip the iteration
		}*/
		System.out.println("Average: " + (sum) / 5);
	}
}