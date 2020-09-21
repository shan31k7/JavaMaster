package b_accessModifiers;

public class AccessModifiers {
	// define the life time of instance variables and methods
	// public - accessible within project
	// black - accessible within package
	// protected - accessible within class and subclass within package
	// private - accessible within class

	public char publicVar = '1';
	private long privateVar = 3434_3434_33434l;
	double defaultVar = 25000.50;
	protected float protectedVar = 5.5f;

	public void publicMethod() {
		System.out.println("This is public method");
	}

	private void privateMethod() {
		System.out.println("This is private method");
	}

	void defaultMethod() {
		System.out.println("This is private method");
	}

	protected void protectedMethod() {
		System.out.println("This is protected method");
	}
}