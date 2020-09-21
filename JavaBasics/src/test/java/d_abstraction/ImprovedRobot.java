package d_abstraction;

// Author - X
// Incomplete or Abstract
public abstract class ImprovedRobot implements Robot_Interface {

	@Override
	public void talk() {		// defined one method
		System.out.println("Now my Robot can able to talk");
	}

	@Override
	abstract public void dance();	// undefined

	@Override
	abstract public int sing();		// undefined
	

}
