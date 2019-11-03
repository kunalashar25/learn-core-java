package com.java.accessModifiers.abstractPack;

public abstract class AbstractClass {

	// For any java class, if we're not allowed to create an object (because of partial implementation of methods), such
	// type of class we have to declare with abstract modifier i.e. for abstract classes instantiation is not possible.

	public static void main(String[] args) {
		// AbstractClass ac = new AbstractClass(); CE:AbstractClass is abstract; cannot be instantiated
	}

	/** Abstract Class v/s Abstract Method **/

	// 1. If a class contains atleast one abstract method then compulsory class must be declared as abstract otherwise
	// we'll get compile time error.

	// Explanation: If a class contains atleast one abstract method then implementation is not complete and hence it is
	// not recommended to create object. To restrict object instantiation/creation, compulsory we must declare class as
	// abstract.

	// 2. Even though class doesn't contain any abstract method, still we can declare class as abstract. if we don't
	// want instantiation i.e. abstract class can contain 0 number of abstract methods as well.

	// Example 1: HttpServlet class is abstract but it doesn't contain any abstract methods.

	// Example 2: Every AdapterClass is recommended to declare as abstract but it doesn't contain any abstract method.

}

// Examples:

class P {
	// public void m1(); CE: missing method body, or declare abstract

	// public abstract void m1(){} CE: abstract method cannot have a body

	// public abstract void m1(); CE: P is not abstract and does not override abstract method m1() in P
}

// if we're extending abstract class then for each and every abstract method of parent class we should provide
// implementation otherwise we've to declare child class as abstract. In this case, next level child class is
// responsible to provide implementation.

abstract class A {
	public abstract void m1();

	public abstract void m2();
}

/*
 * class B extends A { public void m1() { }
 *
 * CE: B is not abstract and does not override abstract method m2() in A }
 */

/**
 * final v/s abstract
 **/
// 1. Abstract methods we should override compulsory in child classes to provide implementation where as we can't
// override final methods. Hence, final abstract combination is illegal combination for methods.

// 2. For final classes we can't create child class where as for abstract classes we should create child class to
// provide implementation. hence, final abstract combination is illegal for classes.

// 3. Abstract class can contain final method whereas final class cannot contain abstract method.

// Note:
// It is highly recommended to use abstract modifier because it promotes several OOPs features like inheritance and
// polymorphism.