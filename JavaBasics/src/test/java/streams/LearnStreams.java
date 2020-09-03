package streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class LearnStreams {

	// stream - abstract - Collections and Array

	public static ArrayList<String> fileHandle() throws FileNotFoundException {
		ArrayList<String> activities = new ArrayList<String>();
		File file = new File(".//Activities.txt");
		Scanner scanner = new Scanner(file);

		while (scanner.hasNextLine()) {
			activities.add(scanner.nextLine());
		}
		scanner.close();
		return activities;
	}

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> activities = fileHandle();

		// filter out the activity "Project Management", , first word

		// collect
		List<String> processed = activities.stream().filter((input) -> input.equalsIgnoreCase("Project Management"))
				.map(input -> input.toLowerCase()).map(input -> input.split(" ")[0]).collect(Collectors.toList());
		System.out.println("Filtered & collect ");
		processed.forEach(i -> System.out.println(i));

		// findAny
		Optional<String> optional = activities.stream().filter((input) -> input.equalsIgnoreCase("Project Management"))
				.map(input -> input.toLowerCase()).map(input -> input.split(" ")[0]).findAny();

		System.out.println("Optional: " + optional.get());

		// forEach
		System.out.println("forEach: " + optional.get());

		activities.parallelStream().filter((input) -> input.equalsIgnoreCase("Project Management"))
				.map(input -> input.toLowerCase()).map(input -> input.split(" ")[0])
				.forEach(i -> System.out.println(i));

	}

}
