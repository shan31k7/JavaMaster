package l_functionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.testng.annotations.Test;

/*
 * Function Interface has 4 types
 * Predicate - accepts input and returns boolean	// Compare or Test
 * Consumer  - accepts input but not returns output	// Setters
 * Supplier  - not accepts input but produce output	// Random generator, dates
 * Function	 - accepts input and returns output  
 */

// boiler plate code, code which supposed to used only once.

public class LearnFuntionInterface {

	@Test
	public void demo_Predicate() {
		// assert the length of a given string using Predicate<T>
		// if length is greater than 3, then print true, else print false

		Predicate<String> predicate = (name) -> name.length() > 3;
		System.out.println(predicate.test("Hello my friend"));
	}

	@Test
	public void demo_Consumer() {
		// assign value of a private member in HealthInfo class using Consumer<T>
		HealthInfo patient1 = new HealthInfo();

		Consumer<HealthInfo> patient = (i) -> i.setDisease("Diabetics");

		patient.accept(patient1);
		// value is assigned

		System.out.println(patient1.getDisease());

		ArrayList<Boolean> boolArray = new ArrayList<Boolean>();
		boolArray.add(true);
		boolArray.add(false);
		boolArray.add(true);
		boolArray.add(false);
		boolArray.add(true);
		boolArray.add(false);

		Consumer<Boolean> consumer = (input) -> {
			if (input)
				System.out.println("TRUE");
			else
				System.out.println("FALSE");
		};

		boolArray.forEach(consumer);
	}

	@Test
	public void demo_Supplier() {
		// supply a generic value, like Date, random numbers
		Supplier<String> supplier = () -> {
			System.out.println("Inside Supplier code");
			return String.valueOf(Math.random());
		};
		System.out.println(supplier.get());
	}

	@Test
	public void demo_Function() {
		// get a user input, process and return the result using Function interface

		Function<Integer, String> func = (input) -> {
			long l = input * input * input;
			return String.valueOf(l);
		};

		System.out.println(func.apply(500));
	}

}
