package basics_Day1;
import java.util.Arrays;
import java.util.Scanner;

public class LearnArrays {

	public static void main(String[] args) {
		char[] name = { 'G', 'o', 'o', 'g', 'l', 'e' }; // declaring with values

		System.out.println(name[0]);

		int[] marks = new int[5]; // size of the array

		marks[0] = 98;
		marks[1] = 33;
		marks[2] = 66;
		marks[3] = 100;
		marks[4] = 12;
		// marks[5] = 32;

		System.out.println("Please enter marks for all 5 subjects: ");
		Scanner scan = new Scanner(System.in);
		int i = 0;
		for (; i < 5; i = i + 1) {
			marks[i] = scan.nextInt();
		}

		int sum = 0;
		Arrays.sort(marks);
		System.out.println(marks);
		
		for (int j : marks) {
			sum = sum + j;
		}

		int j = 0;
		while (j < 5) {
			if (j == 3) {
				System.out.println(marks[j]);
				j++;
				break; // terminate
			} else
				continue; // skip the iteration
		}
		System.out.println("Average: " + (sum) / 5);
	}
}