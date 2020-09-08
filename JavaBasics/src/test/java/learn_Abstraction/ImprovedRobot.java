package learn_Abstraction;

public abstract class ImprovedRobot implements RobotAI {

	@Override
	public void talk() {		// defined one method
		System.out.println("Now my Robot can able to talk");
	}

	@Override
	abstract public void dance();	// undefined

	@Override
	abstract public int sing();		// undefined
	

}
