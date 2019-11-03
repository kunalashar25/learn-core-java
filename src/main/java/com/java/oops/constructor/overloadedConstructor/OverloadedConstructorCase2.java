package com.java.oops.constructor.overloadedConstructor;

public class OverloadedConstructorCase2 {
	// See below parent-child relationship to view constructor invocation
}

// 1. Valid Parent-Child code
class Parent1 {

}

class Child1 extends Parent1 {

}

// 2. Valid Parent-Child code
class Parent2 {
	public Parent2() {

	}
}

class Child2 extends Parent2 {

}

// 3. Invalid Parent-Child code
class Parent3 {
	public Parent3(int i) {

	}
}

class Child3 extends Parent3 {
	// CE: Cannot find symbol. Symbol: Constructor Parent3() Location: class Parent 3

	// Parent class contains parameterized constructor and child class doesn't have any constructor. So when a default
	// constructor is created for child class by compiler it tries to invoke default constructor of parent but parent
	// doesn't have any default constructor. Hence, we'll get compile time error as above.

	// Note: Best programming practice is to create one default constructor whenever one creates parameterized
	// constructor.
}