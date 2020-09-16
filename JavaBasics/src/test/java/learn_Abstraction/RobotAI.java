package learn_Abstraction;

// interface is a template for a class, rule book 
	// what are things needed
	// how to implement (optional)
// class is a template for an object 

// Normal interface - can have any number methods
// FunctionalInterface - only one method
	// Predicate
	// Consumer
	// Supplier
	// Function
// Marker interface - does not has any methods or variables, empty interface
	// Annotations


public interface RobotAI { // abstract, default and static methods
	int HANDS = 2; // variable
	int LEGS = 2;

	public void talk(); // method declaration

	public void dance(); // method declaration

	public int sing();	// declaration, what to do
	
	// default methods
	default public void drawing()		// definition, how to do it
	{
		System.out.println("draws with a brush and printer");
	}
	
	// static methods
	static public int printSomething()
	{
		return 6;
	}
	
	// multiple inheritance allowed in java
		// allowed at interface level
		// not allowed at class level
}
