package com.java.accessModifiers.finalPack;

final class FinalClass {
	// if a class is declared as final, we can't extend functionality of that class i.e. inheritance is not possible for
	// final classes.

	static int x = 10;

	public static void main(String[] args) {
		x = 100;
		System.out.println(x); // Output: 100
	}

}

/*
 * class SubClass extends FinalClass {
 *
 * }
 */

// CE: cannot inherit from final FinalClass

// Note:
// Every method present inside final class is always final by default.
// But Every variable present inside final class is need not be final

// The main advantage of final keyword is, we can achieve security and we can provide unique implementation.
// But the main disadvantage of final keyword is, we are missing key benefits of OOPS i.e. Inheritance (because of final
// classes) and Polymorphism (because of final methods). Hence, if there is no specific requirement then it is not
// recommended to use final keyword.