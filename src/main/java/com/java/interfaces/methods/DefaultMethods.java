package com.java.interfaces.methods;

public class DefaultMethods implements I {
	// 1. Default method concept is implemented to extend interface support by adding new default methods at later phase
	// so that interface implementing class won't be affected by adding new methods to the interface.

	// 2. default keyword used against method1, denotes that method implementation is provided by default.

	@Override
	public void method2() {
		// TODO Auto-generated method stub
	}

	// 3. We can override interface default method as per our requirement.
	public void method1() {
		System.out.println("Method overrided.");
	}

	// Note:
	// Inside class we cannot use default keyword for methods as it has different meaning inside class. For e.g. default
	// in switch case. Interface default methods must be marked as public in implementation classes.
}

interface I {
	default void method1() {
		System.out.println("Default Method.");
	}

	void method2();

	// You cannot create method with name hashCode as hashCode() method is already present in Object class. In short,
	// object class methods cannot be created as default methods inside interface.
	// default int hashCode() { return 10; }

}

class testCommonMethod implements Left, Right {

	// if there are 2 default method with same name in different interface then we can simply override that method in
	// implementation class to resolve compilation error.
	public void commonMethod() {
		System.out.println("class Method");

		// to use default Left interface method
		Left.super.commonMethod(); // Output: Left Method

		// to use default Right interface method
		Right.super.commonMethod(); // Output: Right Method
	}

	public static void main(String[] args) {
		testCommonMethod t = new testCommonMethod();
		t.commonMethod(); // Output: class Method
	}
}

interface Left {
	default void commonMethod() {
		System.out.println("Left Method");
	}
}

interface Right {
	default void commonMethod() {
		System.out.println("Right Method");
	}
}
