package com.java.accessModifiers.abstractPack;

public abstract class AbstractMethod {

	// Abstract modifier is applicable for classes and methods but not for variables.

	/**
	 * Abstract Methods
	 **/

	// Even though we don't know about implementation still we can declare a method with abstract modifier i.e. for
	// abstract methods only declaration is available but not implementation. Hence, abstract method declaration should
	// ends with ';'.

	// Example:
	// public abstract void method1(); >> Valid Syntax
	// public abstract void method1() {}; >> Invalid Syntax

	// Child class is responsible to provide implementation for parent class abstract methods.

	// If class contains any abstract methods then class must be declared as abstract
	public abstract void method1();

	// By declaring abstract method in the parent class we can provide guidelines to the child classes such that which
	// methods compulsory child has to implement.

	// Abstract method never talks about implementation, if any modifier talks about implementation then it forms
	// illegal combination with abstract modifier.

	// Following are various illegal combination of modifiers for methods w.r.t abstract:
	// abstract final, abstract native, abstract synchronized, abstract static, abstract private, abstract strictfp.

	// Example
	// abstract final void method2(); CE: illegal combination of modifiers: abstract and final

}

class MethodImpl extends AbstractMethod {
	public void method1() {
		System.out.println("Method 1");
	}
}
