package abstraction;

public interface RobotAI { // abstract and default methods
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
	
	// multiple inheritance allowed in java
		// allowed at interface level
		// not allowed at class level

}
