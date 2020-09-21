package m_streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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

	// Collections - store huge set of data
	// processing - filter, change it format,

	// what to do ? but gives flexibility to design your filter
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

		// filter out the activity "Project Management", upper case, split it and
		// print first word

		List<String> filtered = activities.stream().filter((input) -> input.equalsIgnoreCase("Project Management"))
				.map((input) -> input.toUpperCase()).map((input) -> input.split(" ")[0]).collect(Collectors.toList());

		List<String> filtered1 = activities.stream().filter((input) -> input.equalsIgnoreCase("Project Management"))
				.map((input) -> {
					input = input.toUpperCase();
					input = input.split(" ")[0];
					return input;
				}).collect(Collectors.toList());

		// distinct values
		activities.stream().distinct().collect(Collectors.toList());
		activities.stream().collect(Collectors.toSet());

		// orElse
		activities.stream().filter((input) -> input.equalsIgnoreCase("Project Management and Leadership"))
				.map((input) -> {
					input = input.toUpperCase();
					input = input.split(" ")[0];
					return input;
				}).collect(Collectors.toList());

		// grouping and finding occurences
		System.out.println("Grouping");
		Map<String, Long> groupbyCount = activities.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		groupbyCount.forEach((value,count) -> System.out.println(value + " > " + count));
		
		
		ArrayList<Integer> value = new ArrayList<Integer>();

		value.add(34);
		value.add(44);

		value.add(555);

		value.add(333);

		value.add(77);
		value.add(888);
		System.out.println("Filtering the numbers");
		Optional<Integer> filter = value.stream().filter(i -> i > 5000).findFirst();
		System.out.print(filter.orElse(0));

		System.out.println("Minum value" + value.stream().min(Comparator.naturalOrder()));

		// Method reference
		// pass by value - primitive types
		// pass by reference - Objects
		// pass by Method
		// filtered.forEach(i-> System.out.println(i));
		filtered.forEach(System.out::println);

		// findAny
		/*
		 * Optional<String> optional = activities.stream().filter((input) ->
		 * input.equalsIgnoreCase("Project Management")) .map(input ->
		 * input.toLowerCase()).map(input -> input.split(" ")[0]).findAny();
		 * 
		 * System.out.println("Optional: " + optional.get());
		 */
		// forEach
		/*
		 * System.out.println("forEach: " + optional.get());
		 * 
		 * activities.parallelStream().filter((input) ->
		 * input.equalsIgnoreCase("Project Management")) .map(input ->
		 * input.toLowerCase()).map(input -> input.split(" ")[0]) .forEach(i ->
		 * System.out.println(i));
		 */
		
		
		// flat map - 
		
		// nested collections
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
		
		//List<String> flatmap = names.stream().flatMap(i -> Stream.of(i.charAt(0)).
		
		

	}

}
