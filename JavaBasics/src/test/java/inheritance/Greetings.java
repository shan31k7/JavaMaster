package inheritance;
	// multiple inheritance
public interface Greetings {

	public void sayHello();
	
	default public void standUP(int i)
	{
		System.out.println("inside Greetings interface");
	}
	
}
