package k_lambdaExpression;

interface Hello {
	public void sayHello(String name);
}

// ------------------------------------

class Salute implements Hello {
	@Override
	public void sayHello(String name) {
		System.out.println("Hello " + name + " !!");
	}
}

//------------------------------------

public class Learn1_LambdaDemo {
	public static void main(String[] args) {
		// Hello hello = new Hello();
		/*
		 * Salute salute = new Salute(); salute.sayHello("Raju");
		 */

		// put the implementation inside

		Hello hello1,hello2; // interface reference

		hello1 = new Hello() {  //Anounymous inner class
			public void sayHello(String name) {
				System.out.println("Hello " + name + " !!");
			}
		};

		hello1.sayHello("Raju");

		// ---------------------------------------
		
		// Lamdba expression
		hello2 = (String name) -> {  //Lambda expression
			System.out.println("Hello " + name + " !!");
		};
		
		hello2.sayHello("Raju");
	}
}