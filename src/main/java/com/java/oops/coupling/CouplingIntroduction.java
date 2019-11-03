package com.java.oops.coupling;

public class CouplingIntroduction {
	// 1. The degree of dependency between the components is called coupling.

	// 2. If dependency is more, then it is considered as tightly coupling and if dependency is less, than it is
	// considered as loosely coupling.
}

// Tightly Coupling Example:
class A {
	static int i = B.j;
}

class B {
	static int j = C.k;
}

class C {
	static int k = D.m1();
}

class D {
	public static int m1() {
		return 10;
	}
}

// The above components are said to be tightly coupled with each other because dependency between the components is
// more.

// Tightly coupling is not a good programming practice because it has several serious disadvantages.
// 1. Without affecting remaining components, we can't modify any component and hence, enhancement will be difficult.

// 2. It suppresses reusability.

// 3. It reduces maintainability of the application.

// Hence, we have to maintain dependency between the components as less as possible.
