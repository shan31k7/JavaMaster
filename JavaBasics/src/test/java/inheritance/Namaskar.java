package inheritance;

public interface Namaskar {
	
	public void standupandSalute();
	
	default public void standUP(int i)
	{
		System.out.println("Inside Namaskar interface");
	}


}
