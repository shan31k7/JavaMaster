package inheritance;

import static java.lang.Math.*;

public class OuterClass {

	int a;

	public int validate() {
		return 88;
	}

	public void printRandomNumber() {
		System.out.println(random());
	}

	public class Innerclass {
		int innera;

		public int innerValidate() {
			return 89;
		}
	}

	public static void main(String[] args) {
		System.out.println("Inside main method");

		OuterClass outer = new OuterClass();
		OuterClass.Innerclass inner = outer.new Innerclass();

		inner.innerValidate();

	}

	/*
	 * static { System.out.println("Good morning !!!" + "Inside static block"); }
	 */

}

//1000 Outerclass objects - 1000 innerclass
//1000 outerclass objects - share 1 copy of innerclass
