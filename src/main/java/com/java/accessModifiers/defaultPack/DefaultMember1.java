package com.java.accessModifiers.defaultPack;

public class DefaultMember1 {

	// If a member declared as default then we can access that member only within that current package i.e. from we
	// can't access from outside package. Hence, default access is also known as package level access.

	void method1() {
		System.out.println("This is method1 from accessModifiers.defaultPack");
	}
}
