package com.java.oops.overriding;

public class OverridingVarArgMethods {
	// 1. We can override var-arg method with another var-arg method only. If we're trying to override with normal
	// method then it'll become overloading but not overriding.

	public static void main(String[] args) {
		Parent2 p1 = new Parent2();
		p1.m1(10); // Output: Parent

		Child1 c = new Child1();
		c.m1(10); // Output: Child

		Parent2 p2 = new Child1();
		p2.m1(10); // Output: Parent
	}
}

class Parent2 {
	public void m1(int... x) {
		System.out.println("Parent");
	}
}

class Child1 extends Parent2 {
	public void m1(int x) {
		System.out.println("Child");
	}
}

// In the above program if we replace child method with var-arg method then it'll become overriding. In this case, the
// output will be:
// Output: Parent
// Output: Child
// Output: Child
// Output: Parent