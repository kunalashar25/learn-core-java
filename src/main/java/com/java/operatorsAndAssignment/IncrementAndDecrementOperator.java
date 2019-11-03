package com.java.operatorsAndAssignment;

public class IncrementAndDecrementOperator {
	static int x = 1;
	static int y = 0;

	public static void main(String[] args) {
		/** Two Types of Increment Operators **/
		// 1. PreIncrement
		y = ++x;

		// 2. PostIncrement
		y = x++;

		/** Two Types of Decrement Operators **/
		// 1. PreDecrement
		y = --x;

		// 2. PostDecrement
		y = x--;

		// Case 1:
		// We can apply increment/decrement operators only for variables but not for constant values. If we're trying to
		// apply for constant values then we'll get compile time error, Unexpected Type. Required variable Found value.

		// Example
		// y = ++10;
		// y = ++ (++x); ++x will become 11 and then new statement will be y = ++ 11; Hence compile time error.

		// Case 2:
		// Nesting of increment/decrement operators is not allowed. We'll get compile time error, Unexpected Type.
		// Required
		// variable Found value.

		// Example
		// y = ++ (++x); ++x will become 11 and then new statement will be y = ++ 11; Hence compile time error.

		// Case 3:
		// For final variables we can't apply increment/decrement operators

		// Example
		// final int x = 10;
		// x++;
		// System.out.println(x); compile time error. We cannot assign value to final variable x.

		// Case 4:
		// We can apply increment/decrement operators for every primitive type except boolean

		int a = 10;
		a++;
		System.out.println(a); // Output: 11

		char c = 'a';
		c++;
		System.out.println(c); // Output: b

		double d = 10.5;
		d++;
		System.out.println(d); // Output: 11.5

		boolean bo = true;
		// b++; CE: operator ++ cannot be applied to boolean.

		// Case 5: Difference between b++ and b = b+1

		// if we apply any arithmetic operator between two variables a and b the result type is always
		// max(int,type of a, type of b)

		// Example 1:
		byte a1 = 10;
		byte a2 = 20;
		// byte a3 = a1 + a2; CE: Possible loss of precision, Found int Required byte
		// output of above sum will be int as max(int,byte,byte) will be int and we cannot assign int to byte variable.

		// To handle above scenario we can do type casting to byte and then assign it to a3
		byte a3 = (byte) (a1 + a2);
		System.out.println(a3); // Output: 30

		// Example 2:
		byte b1 = 10;
		// b1 = b1 + 1; CE: cannot convert from int to byte
		// max(int,byte,int) will be int and cannot be assigned to byte variable b
		b1 = (byte) (b1 + 1);
		System.out.println(b1); // Output: 11

		// In case of increment/decrement operator, internal type casting will be performed automatically.

		// Example 3:
		byte b2 = 10;
		b2++; // internal type casting is performed i.e. b2 = (type of b2) (b2+1);
		System.out.println(b2); // Output: 11
	}

}
