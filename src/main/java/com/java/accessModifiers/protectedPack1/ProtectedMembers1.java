package com.java.accessModifiers.protectedPack1;

public class ProtectedMembers1 {
	// The most misunderstood modifier in java.

	// if a member declared as protected then we can access that member anywhere with-in the current package but only in
	// child classes outside package.
	// protected = <default> + child

	// We can access protected members anywhere within the current package either by using parent reference or by using
	// child reference. See ProtectedMembers2.java

	// But we can access protect members in outside package only in child classes and we should use child reference
	// only i.e. parent reference cannot be used to access protected members from outside package. See
	// ProtectedMembers3.java

	// We can access protected members from outside package only in child classes and we should use that child class
	// reference only.

	protected void method1() {
		System.out.println("This is method1 from accessModifiers.protectedPack");
	}

}
