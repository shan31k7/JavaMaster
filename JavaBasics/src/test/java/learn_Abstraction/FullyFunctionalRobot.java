package learn_Abstraction;

/*
 * this is for github
 */
public class FullyFunctionalRobot extends ImprovedRobot {
	
	// concrete class
	@Override
	public void dance() {
		System.out.println("Learnt to dance");
	}

	@Override
	public int sing() {
		System.out.println("Learnt to sing");
		return 0;
	}

}
