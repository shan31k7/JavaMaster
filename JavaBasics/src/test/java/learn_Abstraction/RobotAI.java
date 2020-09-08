package learn_Abstraction;

// interface is a template for a class
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

	public void talk(); // method declare

	public void dance(); // method declare

	public int sing();	
	
	// default methods
	default public void drawing()
	{
		System.out.println("draws with a brush and printing");
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
