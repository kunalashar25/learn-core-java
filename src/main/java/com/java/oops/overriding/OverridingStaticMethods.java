package com.java.oops.overriding;

public class OverridingStaticMethods {

}

// 1. We can't override a static method as non-static otherwise we'll get compile time error.

// 2. If both parent and child class method are static then we won't get any compile time error.It seems overriding
// concept applicable for static methods but it is not overriding, it is method hiding.

class P3 {
	public static void m1() {

	}

	public static void m2() {

	}
}

class C3 extends P3 {
	/*
	 * public void m1() { }
	 */

	// CE: m1() in C3 cannot override m1() in P3; overriding method is static

	public static void m2() {

	}
}