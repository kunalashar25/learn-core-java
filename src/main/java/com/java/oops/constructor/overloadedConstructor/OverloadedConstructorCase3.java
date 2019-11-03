package com.java.oops.constructor.overloadedConstructor;

import java.io.IOException;

public class OverloadedConstructorCase3 {
	// Note:
	// 1. If parent class constructor throws any checked exception then compulsory child class constructor should throw
	// the same checked exception or its parent other wise the code won't compile.

	// 2. We canno't handle exception in constructor using try-catch block as first line of any constructor should be
	// this() or super().
}

class Parent4 {
	public Parent4() throws IOException {

	}
}

class Child4 extends Parent4 {
	// CE: unreported exception. java.io.IOException in default constructor
}

class Child5 extends Parent4 {
	public Child5() throws IOException {
		super();
	}
}
