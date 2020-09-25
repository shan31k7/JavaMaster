package j_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.testng.annotations.Test;

/*	unlikely Event which can stop the normal flow of execution;
 * purpose of exception handling:
 * 	- meaningful information to end user
 * 	- collect information for debugging
 * 
 * Checked Exceptions also called as "Design time exceptions"
 * 
 *  - declaring the Exception using "throws" keyword
 * 	- using try and catch blocks
 */
public class Learn1_CheckedException {

	// File handling
	@Test
	public void fileHandle() {
		File file;
		Scanner scanner;

		try {
			file = new File(".//Activities4545.txt");
			scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("No such file exists in the given path");
		}
	}

	// File handling
	@Test(description = "testcase")
	public void fileHandle2() {
		fileHandle();

	}

}
