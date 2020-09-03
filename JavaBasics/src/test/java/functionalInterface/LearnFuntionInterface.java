package functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.testng.annotations.Test;

/*
 * Function Interface has 4 types
 * Predicate - accepts input and returns boolean	// Testing purpose
 * Consumer  - accepts input but not returns output	// Assigning values
 * Supplier  - not accepts input but returns output	// 
 * Function	 - accepts input and returns output  
 */

public class LearnFuntionInterface {

	@Test
	public void demo_Predicate() {
		// assert the length of a given string using Predicate<T>
		// if length is greater than 3, then pass else fail

		Predicate<String> assertText = (input) -> input.length() > 3;
		System.out.println("String Assertion" + assertText.test("Testing"));
	}

	@Test
	public void demo_Consumer() {
		// assign value of a private member in HealthInfo class using Consumer<T>
		HealthInfo patient1 = new HealthInfo();

		Consumer<HealthInfo> patient = (input) -> input.setDisease("Diabetics");

		patient.accept(patient1);
		// value is assigned
		System.out.println(patient1.getDisease());

	}

	@Test
	public void demo_Supplier() {
		// supply a generic value, like Date, random numbers
		Supplier<String> supplier = () -> String.valueOf(Math.random());

		System.out.println(supplier.get());
	}

	@Test
	public void demo_Function() {
		// get a user input, process and return the result using Function interface

		Function<Integer, Integer> function = (input) -> input * input * input;
		System.out.println(function.apply(5));
	}

}
