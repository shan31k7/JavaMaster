package e_inheritance;

// inheritance at interface level
public interface BetterGreetings extends Greetings, Namaskar {

	public void sayWhatsApp();

	default public void standUP(int i)
	{
		System.out.println("Inside BetterGreetings interface");
	}
}
