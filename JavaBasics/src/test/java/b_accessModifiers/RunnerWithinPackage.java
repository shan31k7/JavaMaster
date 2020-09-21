package b_accessModifiers;

import b_accessModifiers.AccessModifiers;

public class RunnerWithinPackage {

	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers();
		
		// public access modifiers
		System.out.println(am.publicVar);
		am.publicMethod();

		// default or blank
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		// protected
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		// private
		// System.out.println(am.aadhaar);
		// am.privateMethod();
	}

}
