package d_abstraction;

import java.util.List;

// Abstraction - interfaces, abstract class
// Inheritance - interface level and classes level
// Polymorphism - overload or override applicable (only methods, not operators)
// Encapsulation - private attributes, public methods

// HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH

// Interface, like a class, can have methods and variables (terms involved)
// It is the blueprint of a class
// Interfaces specify "what to do" and "how to do part" is optional


// Normal interface - can have any number methods
// FunctionalInterface - only one unimplemented method, many implemented methods
// Predicate
// Consumer
// Supplier
// Function
// Marker interface - does not has any methods or variables, empty interface
// Annotations

/*WebDriver - interface - 10 methods
ChromeDriver - class implements Webdriver
InternetExplorerDriver
GeckoDriver - 
SafariDriver
MicroEdgeDriver*/

public interface Robot_Interface { // abstract, default and static methods
	int HANDS = 2; // variable
	int LEGS = 2;

	abstract public void talk(); // method declaration

	abstract public void dance(); // method declaration

	abstract public int sing(); // declaration, what to do

	// default methods - Java 8
	default public void drawing() // definition, how to do it
	{
		System.out.println("draws with a brush");
	}

	// static methods - Java 8
	static public int printSomething() {
		return 6;
	}

	List<Integer> a = null;

	// multiple inheritance allowed in java
	// allowed at interface level
	// not allowed at class level
}
