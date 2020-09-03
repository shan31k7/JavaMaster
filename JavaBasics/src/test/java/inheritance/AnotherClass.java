package inheritance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.TreeSet;

public class AnotherClass {

	// checked, compile - throws
	public void fileHandler() throws IOException, FileNotFoundException {
		File file = new File(
				"C:\\Users\\168496\\git\\JenkinsBatch25Aug2020\\JavaBasics\\src\\main\\java\\printValues\\Names.txt");
		FileInputStream fis = new FileInputStream(file);
		System.out.println(fis.read());
		fis.close();
	}

	// run time exception
	public static double divideNumbers(double a, double b) {
		double local = 0;
		try {

			if (b == 0) {
				throw new Exception();
			}
			local = a / b;

		} catch (Exception e) {
			System.out.println("Problem occured, the denominator could be zero");
		}
		return local;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("AnotherClass");
		System.out.println(divideNumbers(89.33, 0));

		// Huge set of records - 1 lakh names
		String[] names = new String[100000];

		for (int i = 0; i < 99999; i++) {
			names[i] = "Mr.Tester";
		}

		// implement set
		// HashSet<String> set = new HashSet<String>();
		TreeSet<String> tset = new TreeSet<String>();

		for (int i = 0; i < 99999; i++) {
			tset.add("Mr.Tester" + i);
		}

		// enhanced for loop
		for (String string : tset) {
			System.out.println(string);
		}

		HashMap<String, String> hmap = new HashMap<String, String>();

		hmap.put("Name", "hello@gmail.com");
		hmap.put("Name1", "hello@gmail.com");

		hmap.put("Name2", "hello@gmail.com");

		hmap.put("Name3", "hello@gmail.com");

		hmap.put("Name4", "hello@gmail.com");

		hmap.put("Name5", "hello@gmail.com");

		hmap.put("Name6", "he@gmail.com");

		System.out.println(hmap.get("Name6"));

	}

}
