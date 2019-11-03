package com.java.operatorsAndAssignment;

public class EqualityOperators {
	// == , !=

	public static void main(String[] args) {

		/** We can apply equality operators for every primitive type including boolean type **/
		System.out.println(10 == 20); // Output: false
		System.out.println('a' == 'b'); // Output: false
		System.out.println('a' == 97.0); // Output: true
		System.out.println(false == false); // Output: true

		/** We can apply equality operators for object types also **/
		// For object references r1,r2
		// r1==r2 returns true, if and only if both the references pointing to the same object (reference comparison or
		// address comparison).

		// Example 1: we created 2 objects and 3 reference variables.
		EqualityOperators e1 = new EqualityOperators();
		EqualityOperators e2 = new EqualityOperators();
		EqualityOperators e3 = e1;
		System.out.println(e1 == e2); // Output: false
		System.out.println(e1 == e3); // Output: true

		// Example 2:
		// If we apply equality operators for object types then compulsory there should be some relation between
		// argument types (either parent/child or child/parent or same type) otherwise we'll get compile time error
		// saying incomparable types.

		Thread t = new Thread();
		Object o = new Object();
		String s = new String("Test");

		System.out.println(t == o); // Output: false
		System.out.println(o == s); // Output: false
		// System.out.println(s == t); CE: Incompatible operand types String and Thread

		// Q. What is difference between == operator and .equals() method?
		// Ans. == operator is meant for reference comparison whereas .equals() is used for content comparison.
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		String s3 = "ABCD";
		String s4 = "ABCD";
		System.out.println(s1 == s2); // Output: false
		System.out.println(s1.equals(s2)); // Output: true
		System.out.println(s3 == s4); // Output: true

		// For any object reference r, r == null is always false but null == null is always true.
		String r = new String("ABC");
		System.out.println(r == null); // Output: false

		String str = null;
		System.out.println(str == null); // Output: true

		System.out.println(null == null); // Output: true

	}

}
