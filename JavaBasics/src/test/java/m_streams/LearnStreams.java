package m_streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableList;

public class LearnStreams {

	ArrayList<String> activities;
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

	@BeforeClass
	public void intialize() throws FileNotFoundException {
		activities = fileHandle();
	}

	// Filter, map, collect
	@Test
	public void filterMapCollect() {
		// filter only activity "Project Management",
		// make it to upper case, split it by space
		// print first word
		// create a new list with the results

		List<String> filtered = activities.parallelStream()
				.filter((input) -> input.equalsIgnoreCase("Project Management")).map((input) -> input.toUpperCase())
				.map((input) -> input.split(" ")[0]).collect(Collectors.toList());

		filtered.forEach((i) -> System.out.println(i));
	}

	@Test
	public void distinctMinMax() throws FileNotFoundException {
		// distinct values
		// streams become lazy if collect is missed
		activities.stream().distinct().collect(Collectors.toList()).forEach(i -> System.out.println(i));
		activities.stream().collect(Collectors.toSet()).forEach(i -> System.out.println(i));

		List<Integer> value = ImmutableList.of(34, 55, 666, 7777, 43453, 76776, 23423);
		// Minimum, Maximum
		System.out.println("Minimum value: " + value.stream().min(Comparator.naturalOrder()).get());
		System.out.println("Maximum value: " + value.stream().max(Comparator.naturalOrder()).get());
	}

	@Test
	public void streamsGroupBy() {
		// grouping and finding occurences
		System.out.println("Grouping");
		Map<String, Long> groupbyCount = activities.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		groupbyCount.forEach((value, count) -> System.out.println(value + " > " + count));
	}

	@Test
	public void optional() {
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
	}

	@Test
	public void flatMap() {
		// Map = transform from one form to another
		// flatmap = tranform and flatten.
		String[][] values = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };

		Stream<String[]> streaming = Arrays.stream(values);
		Stream<String> flattened = streaming.flatMap((i) -> Arrays.stream(i));
		// filter, map, collect, reduce
		flattened.collect(Collectors.toList()).forEach((i) -> System.out.print(i + " "));
	}

	@Test
	public void methodReference() {
		// Method reference
		// pass by value - primitive types
		// pass by reference - Objects
		// pass by Method

		// using lambda
		activities.forEach((i) -> System.out.println(i));

		// using Method reference
		activities.forEach(System.out::println);		// static

		// we should use Object reference if the methods are non static
	}

	@Test
	public void reduce() {
		// reduce the multiple values to single value
		// filter values less than 50 and add them
		Integer[] intvalues = { 15, 33, 40, 3322, 333 };

		Integer sum = Arrays.stream(intvalues).filter(i -> (i < 50)).reduce(0, (a, b) -> a + b).intValue();
		System.out.println(sum);
	}
}
