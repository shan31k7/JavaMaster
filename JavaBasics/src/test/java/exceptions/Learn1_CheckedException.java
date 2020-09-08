package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.Test;

/*	unlikely Event which can stop the normal flow of execution;
 * 
 * 	- meaningful information to end user
 * 	- collect information for further debugging
 * 
 * Checked Exceptions also called as "Design time exceptions"
 * exception which can be expected
 * we shall handle by declaring the Exception using "throws" keyword
 * 			or using try and catch blocks
 */
public class Learn1_CheckedException {

	// File handling
	@Test
	public void fileHandle() throws FileNotFoundException, IOException {
		File file = new File(".//Activities.txt");
		Scanner scanner = new Scanner(file);

		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	}

	// File handling
	@SuppressWarnings("resource")
	@Test
	public void fileHandle2() {

		Scanner scanner = new Scanner(System.in);
		try {
			File file = new File(".//Activities11.txt");
			scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}

		} 
		
		catch (FileNotFoundException e) {
			System.out.println("No such file exists in this directory");
			e.printStackTrace();
		}  
		
		catch (Exception q) {
			System.out.println("Something went wrong, pleae try after sometime");
		}finally {
			// connection - close the connection
			scanner.close();
		}
	}

}
