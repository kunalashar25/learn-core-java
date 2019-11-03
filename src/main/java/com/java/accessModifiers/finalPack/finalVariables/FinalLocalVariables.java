package com.java.accessModifiers.finalPack.finalVariables;

public class FinalLocalVariables {
	// 1. Sometimes to meet temporary requirements of a programmer we have to declare variables inside a
	// method or block or constructor, such types of variables are called local variables or temporary variables or
	// stack variables or automatic variables

	// 2. For local variables, JVM won't provide any default values. Compulsory we should perform initialization
	// explicitly before using that local variable i.e. if we're not using then it is not required to perform
	// initialization for local variable.

	public static void main(String[] args) {
		int x; // Valid for local variable.
		System.out.println("Hello");
		// System.out.println(x); CE: variable x might not have been initialized.
	}

	// 3. Even though local variable is final, we have perform initialization before using it. If we're not using it
	// then there is no need to perform initialization even though it is final.

	public void test1() {
		final int x; // Valid for local variable.
		System.out.println("Hello");
		// System.out.println(x); CE: variable x might not have been initialized.
	}

	// 4. The only applicable modifier for local variable is final. If we apply any other modifier then we'll get
	// compile time error.

	public void test2() {
		/*
		 * CE: illegal start of expression public int x; private int y; protected int z; static int p; transient int q;
		 * volatile int r;
		 */
	}

	// Note:
	// If we're not declaring any modifier then by default it is <default> modifier but this rule is applicable only for
	// instance and static variables but not for local variables.

	/**
	 * Formal Parameters of a method
	 **/

	// Formal Parameters of a method simply acts as local variables of that method. Hence, formal parameter can be
	// declared as final. If formal parameter declared as final, then within a method we can't perform reassignment.
	public void test3(final int x, final int y) {
		// x = 10; CE: cannot assign value to final variable x
		// y = 20; CE: cannot assign value to final variable y
		System.out.println(x + " " + y);
	}

}
