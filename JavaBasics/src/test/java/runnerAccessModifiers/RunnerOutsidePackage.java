package runnerAccessModifiers;

import accessModifiers.AccessModifiers;

public class RunnerOutsidePackage {

	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers();

		// public access modifiers
		System.out.println(am.publicVar);
		am.publicMethod();

		// default
		// System.out.println(am.defaultVar);
		// am.defaultMethod();

		// protected
		// System.out.println(am.protectedVar);
		// am.protectedMethod();

		// private
		// System.out.println(am.privateVar);
		// am.privateMethod();
	}

}
