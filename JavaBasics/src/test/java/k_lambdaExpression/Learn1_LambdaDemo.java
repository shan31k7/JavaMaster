package k_lambdaExpression;

// annonymity
// implement a class, method - single time use - annonymous
// to eliminate the boiler plate code 

interface Hello {
	public void sayHello(String name);
}

// ------------------------------------

// Method 1 - implement interface with a class
class Salute implements Hello {
	@Override
	public void sayHello(String name) {
		System.out.println("Hello " + name + " !!");
	}
}

//------------------------------------

public class Learn1_LambdaDemo {
	public static void main(String[] args) {

		Salute sal = new Salute();
		sal.sayHello("Method 1");

		// Method 2 - Implemented interface as inner class
		Hello hello = new Hello() {
			public void sayHello(String name) {
				System.out.println("Hello " + name + " !!");
			}
		};

		hello.sayHello("Method 2");

		// Method 3 - using Lambda expression
		Hello hello2 = (name) -> System.out.println("Hello " + name + " !!");
		hello2.sayHello("Method 3");

	}
}