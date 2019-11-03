package com.java.operatorsAndAssignment;

public class ShortCircuitOperators {
	// Symbol: &&, ||
	public static void main(String[] args) {
		// These are exactly same as bitwise operators(&,|) except the differences specific in
		// image: Bitwise_Vs_ShortCircuit_Operator.PNG

		System.out.println(false & true);
		System.out.println(false && true);

		// Example 1
		int x = 10, y = 15;

		if (++x < 10 && ++y > 15) {
			x++;
		} else {
			y++;
		}
		System.out.println("x is " + x + " y is " + y);

		// Output with & is x is 11 y is 17
		// Output with && is x is 11 y is 16

		int x1 = 10, y1 = 15;

		if (++x1 < 10 || ++y1 > 15) {
			x1++;
		} else {
			y1++;
		}
		System.out.println("x is " + x1 + " y is " + y1);

		// Output with | is x1 is 12 y1 is 16
		// Output with || is x1 is 12 y1 is 16

		// Example 2
		int a = 10;

		if (++a < 10 && (a / 0 > 10)) {
			System.out.println("hello");
		} else {
			System.out.println("Hi");
		}

		// Ouput is Hi as second condition will never be evaluated with &&

		int a1 = 10;

		if (++a1 < 10 & (a1 / 0 > 10)) {
			System.out.println("hello");
		} else {
			System.out.println("Hi");
		}

		// Output: Exception in thread "main" java.lang.ArithmeticException: / by zero as second parameter is also
		// evaluated when & is used.

	}

}
