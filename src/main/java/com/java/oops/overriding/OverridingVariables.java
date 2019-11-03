package com.java.oops.overriding;

public class OverridingVariables {
	// 1. Variable resolution is always taken care by compiler based on referenced type irrespective of whether the
	// variable is static or non-static.

	// 2. Overriding concept applicable only for methods but not for variables.

	public static void main(String[] args) {
		Parent3 p = new Parent3();
		System.out.println(p.x); // Output: 888

		Child3 c = new Child3();
		System.out.println(c.x); // Output: 999

		Parent3 p1 = new Child3();
		System.out.println(p1.x); // Output: 888
	}
}

class Parent3 {
	int x = 888;
}

class Child3 extends Parent3 {
	int x = 999;
}
