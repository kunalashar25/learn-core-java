package com.java.operatorsAndAssignment;

public class ArithmeticOperators {

	public static void main(String[] args) {

		// ArithmeticOperators are +, -, *, /, %

		// If we apply any arithmetic operator between two variables a and b, the result type is always:
		// max(int, type of a, type of b)

		/** Type Conversion post Arithmetic Operations - Addition **/
		// Refer: Literals.PNG
		// byte + byte = int;
		// byte + short = int;
		// short + short = int;
		// byte + long = long;
		// long + double = double;
		// float + long = float;
		// char + char = int;
		// char + double = double;

		// Examples
		System.out.println('a' + 'b'); // Output: 195 (int)
		System.out.println('a' + 0.89); // Output: 97.89 (double)

		/** Type Conversion post Arithmetic Operations - Division **/

		// In Integral arithmetic (byte/short/int/long) there is no way to represent infinity. Hence, if infinity is a
		// result, we'll get arithmetic exception in integral arithmetic

		// Example:
		System.out.println(10 / 0); // RE: Exception in thread "main" java.lang.ArithmeticException: / by zero

		// But in floating point arithmetic (float/double) there is a way to represent infinity. For this Float and
		// Double classes contains the following two constants. Hence, even though result is infinity, we won't get any
		// ArithmeticException in floating point Arithmetic.
		// POSITIVE_INFINITY
		// NEGATIVE_INFINITY

		// Example
		System.out.println(10 / 0.0); // Output: Infinity
		System.out.println(-10.0 / 0); // Output: -Infinity

		// NaN (Not a Number): In Integral arithmetic (byte/short/int/long) there is no way to represent undefined
		// results. Hence, if the result is undefined we'll get runtime exception saying
		// ArithmeticException: / by zero

		// Example
		System.out.println(0 / 0);// RE: Exception in thread "main" java.lang.ArithmeticException: / by zero

		// But in floating point arithmetic (float/double) there is a way to represent undefined results, for this Float
		// and Double classes contains NaN constant. Hence, if the result is undefined we won't get any arithmetic
		// exception in floating point arithmetic
		System.out.println(0.0 / 0); // Output: NaN

		System.out.println(-0 / 0.0); // Output: NaN (There is no such thing as -NaN. So answer will be NaN)

		// For any x value including NaN, the following expressions returns false:
		int x = 10;
		System.out.println(x < Float.NaN); // Output: false
		System.out.println(x <= Float.NaN); // Output: false
		System.out.println(x > Float.NaN); // Output: false
		System.out.println(x >= Float.NaN); // Output: false
		System.out.println(x == Float.NaN); // Output: false
		System.out.println(Float.NaN == Float.NaN); // Output: false

		// For x value including NaN, the following expression returns true:
		System.out.println(x != Float.NaN); // Output: true
		System.out.println(Float.NaN != Float.NaN); // Output: true

		/** Arithmetic Exceptions **/
		// It is Runtime Exception and not Compile Time Error

		// it is possible only in integral arithmetic but not in floating point arithmetic as in floating point we'll
		// get
		// Infinity/-Infinity/NaN as output

		// The only operator which cause Arithmetic Exceptions are / and %
	}

}
