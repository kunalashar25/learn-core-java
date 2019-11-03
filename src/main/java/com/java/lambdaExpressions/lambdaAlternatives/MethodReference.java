package com.java.lambdaExpressions.lambdaAlternatives;

public class MethodReference {
	// 1. It is used as an alternative to lambda expressions.

	// 2. Instead of writing lambda expressions again and again, we can provide method reference for code re-usability.

	// 3. In this case, run() method from runnable is using child() method to run.

	// Syntax for static method: className::methodName
	// Syntax for instance method: objectReference::methodName

	// 4. In method reference, exact argument types must be matched. No validation is performed on method name and
	// return type. In below example, run() accepts no arguments and so does method child().

	// 5. In case of method reference, different return type is allowed.

	public static void child() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread :: " + i);
		}
	}

	public void child2() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread :: " + i);
		}
	}

	public static void sum(int x, int y) {
		System.out.println("Sum :: " + (x + y));
	}

	public static void main(String[] args) {
		// using static method
		Runnable r = MethodReference::child; // this statement is alternative to lambda expression.

		Thread t = new Thread(r);
		t.start();

		// using instance method
		MethodReference m = new MethodReference();
		r = m::child2;

		// method with arguments.
		Interf i = MethodReference::sum;
		i.add(10, 20); // i.add will internally call sum method and then will print the output.
		// Output: Sum :: 30
	}
}

interface Interf {
	public void add(int a, int b);
}
