package com.java.interfaces;

interface Inter {
	void m1();

	void m2();
}

abstract class InterfaceRules implements Inter {

	public void m1() {
		System.out.println("This is m1");
	}
}

class ServiceProvider extends InterfaceRules {
	public void m2() {
		System.out.println("This is m2");
	}
}

/**
 * Rules
 **/

// 1. Whenever we're implementing an interface, we have to provide implementation for each and every method of that
// interface otherwise we have to declare class as abstract class. Then next level child class is responsible to
// provide implementation.

// 2. Every interface method is always public and abstract whether we're declaring or not. Hence, whenever we're
// implementing an interface method, compulsory we should declare them as public otherwise we'll get compile time
// error.

/** Extends v/s Implements **/
// 1. A class can extend only 1 class at a time.

// 2. An interface can extend any number of interfaces simultaneously.

interface A {

}

interface B {

}

interface C extends A, B {

}

// 3. A class an implement any number of interfaces simultaneously.

// 4. A class can extend another class and can implement any number of interfaces simultaneously.

class D extends ServiceProvider implements A, B {

}

/** Which of the following is Valid? **/

// 1. A class can extend any number of classes at a time? >> Invalid

// 2. A class can implement only one interface at a time? >> invalid

// 3. An Interface can extend only one interface at a time? >> Invalid

// 4. An Interface can implement any number of interfaces simultaneously? >> Invalid

// 5. A class can extend another class or can implement an interface but not both? >> Invalid

// Note 1: The following expression 'X extends Y' is true when both X and Y are either classes or interfaces.

// Note 2: The following expression 'X extends Y,Z' is true when both X,Y and Z are interfaces.

// Note 3: The following expression 'X implements Y,Z' is true when both X is a class and Y and Z are interfaces.

// Note 4: The following expression 'X extends Y implements Z' is true when both X and Y are classes and Z is an
// interfaces.

// Note 5: The following expression 'X implements Y extends Z' is always compile time error as extends is written after
// implements.