package com.java.interfaces.methods;

public class StaticMethods implements Interf {
	// 1. Interface static method are not available to implementation classes by default.

	// 2. Interface static method should be called by using interface name only.

	// 3. If we're creating a utility class with all static methods then it is recommended to use interface instead of
	// using class as interface is light-weight when compared with class. Performance will be improved with interface.

	public static void main(String[] args) {
		// ways to call interface static method
		Interf.m1(); // Only Valid approach to use interface static method

		// m1(); >> Invalid
		// StaticMethods.m1(); >> Invalid
		// StaticMethods s = new StaticMethods();
		// s.m1(); >> invalid
	}
}
// Output: Interface static method

interface Interf {
	public static void m1() {
		System.out.println("Interface static method");
	}

	// from 1.8v we can have static method in interface. Hence, we can have main method in interface as well and we can
	// execute this interface via main() method.
	public static void main(String[] args) {
		System.out.println("interface main method");
	}

	// If we execute interface main() method then output will be:
	// Output: interface main method
}
