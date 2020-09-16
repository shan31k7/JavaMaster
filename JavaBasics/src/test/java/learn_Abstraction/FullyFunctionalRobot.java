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
	
    /*multiple inheritance:
     * 
     *  class extends class1,class2                                                            - not allowed
        interface extends interface1, interface2 - allowed
        
        interface1 - public void dance(Steps a)
        interface2 - public void dance(Steps b)
        interface - must override dance method again

        class implements interface1,interface2                  - allowed
        class extends class1 implements interface             - allowed*/


}
