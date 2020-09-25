package c_static_final;

import c_static_final.LearnStatic_Final.InnerClass1;

public class Runner_LearnStatic_Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create object for outer class
		LearnStatic_Final sf = new LearnStatic_Final();

		// create object for instance class
		InnerClass1 inner1object = sf.new InnerClass1();
		inner1object.innermethod1();

		// how to call static inner class
		LearnStatic_Final.InnerClass2 inner2 = new LearnStatic_Final.InnerClass2();
		inner2.innermethod3();	// non static
		LearnStatic_Final.InnerClass2.innermethod2();	// static method

	}

}
