package m_streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LearnStreams {
	// Array - small set of data
	// Collections - store huge set of data
	// processing - filter, change it format,
	// filtering
	// modifying, extracting
	// summarize average, count, max, min
	// output in any form (List, Set, Map, Queue)
	// Stream is like SQL (where, group)

	// gives flexibility to design your filter
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

		// filter out the activity "Project Management", make it to upper case, split it
		// by space and
		// print first word
		// create a new list with the results

		List<String> filtered = activities.parallelStream()
				.filter((input) -> input.equalsIgnoreCase("Project Management")).map((input) -> input.toUpperCase())
				.map((input) -> input.split(" ")[0]).collect(Collectors.toList());

		
		filtered.forEach((i) -> System.out.println(i));
		// reduce
		Long count = activities.parallelStream()
				.filter((input) -> input.equalsIgnoreCase("Project Management")).map((input) -> input.toUpperCase())
				.map((input) -> input.split(" ")[0]).collect(C);
		/*
		 * List<String> filtered = activities.stream().filter((input) ->
		 * input.equalsIgnoreCase("Project Management")) .map((input) ->
		 * input.toUpperCase()).map((input) ->
		 * input.split(" ")[0]).collect(Collectors.toList());
		 * 
		 * List<String> filtered1 = activities.stream().filter((input) ->
		 * input.equalsIgnoreCase("Project Management")) .map((input) -> { input =
		 * input.toUpperCase(); input = input.split(" ")[0]; return input;
		 * }).collect(Collectors.toList());
		 */

		// distinct values
		// streams are lazy
		activities.stream().distinct().collect(Collectors.toList());
		activities.stream().collect(Collectors.toSet());

		// grouping and finding occurences
		System.out.println("Grouping");
		Map<String, Long> groupbyCount = activities.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		groupbyCount.forEach((value, count) -> System.out.println(value + " > " + count));

		// stream, collect - mandatory
		// filter, map, reduce - optional
		activities.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.forEach((str, count) -> System.out.println(str + " occured " + count + "times"));

		System.out.println("Integer filter with Optional");
		ArrayList<Integer> value = new ArrayList<Integer>();
		value.add(34);
		value.add(44);
		value.add(555);
		value.add(333);
		value.add(77);
		value.add(888);
		System.out.println("Filtering the numbers");

		Optional<Integer> processed = value.stream().filter((j) -> j < 10).findFirst();
		System.out.println(processed.orElse(-1));

		// Minimum
		System.out.println("Minum value" + value.stream().min(Comparator.naturalOrder()));
		System.out.println("Maximum value" + value.stream().max(Comparator.naturalOrder()));

		// Method reference
		// pass by value - primitive types
		// pass by reference - Objects
		// pass by Method
		// filtered.forEach(i-> System.out.println(i));
		filtered.forEach(System.out::println);

		// normal collections as nested collection

		Set<String> names = new HashSet<String>();

		names.add("Raju");
		names.add("Raju1");
		names.add("Raju2");
		names.add("Ramu");
		names.add("Raju3");
		names.add("Raju4");
		names.add("Raju5");
		names.add("Raju6");
		names.add("Raju7");
		names.add("Raju8");
		// map - convert from one form to another
		// flatmap - String - "array of character"
		// List<String> flatmap = names.stream().flatMap((i) -> Stream.of().collect(Collectors.toList());

	}

}
