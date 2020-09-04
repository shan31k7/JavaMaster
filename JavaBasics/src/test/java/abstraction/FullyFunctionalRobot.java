package abstraction;



/*
 * this is for github
 */
public class FullyFunctionalRobot extends ImprovedRobot {
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
