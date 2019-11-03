package com.java.operatorsAndAssignment;

public class TypeCastingOperators {

	public static void main(String[] args) {
		// There are two types of types casting, 1. Implicit type casting 2. Explicit type casting.

		/** Implicit Type Casting **/

		// Compiler is responsible to perform Implicit type casting.

		// It is performed when smaller data type value is assigned to to bigger data type variable.

		// It is also known as widening or upcasting.

		// There is no loss of information in implicit type casting.

		// Example
		int x = 'a';
		System.out.println(x); // Output: 97

		double d = 10;
		System.out.println(d); // Output: 10.0

		/** Explicit Type Casting **/

		// Programmer is responsible for explicit type casting

		// It is required when bigger data type value is assigned to smaller data type variable.

		// it is also known as narrowing or downcasting.

		// There may be a chance of loss of information in explicit type casting.

		// Example
		int a = 130;
		// byte b = a; CE: Possible loss of precision. Found int Required byte
		byte b = (byte) a;
		System.out.println(b); // Output: -126

		/** Internal working of Explicit Type Casting **/

		// Whenever we're assigning bigger data type value to smaller data type variable by explicit type casting, the
		// most significant bit will be lost. We've to consider only least significant bits.

		// int a = 130; => a = 0000....010000010
		// byte b = (byte) a; => 10000010 last 8 bit of a will be added to it and 2's compliment value of last 7 bit
		// will be performed as first bit represent sign.

		// First Compliment value will be 1111101

		// To get 2's compliment value, add 1 to last bit of first compliment. Answer will be, 1111110 i.e. 126

		// So value assigned to byte b is -126

		int a1 = -150;
		byte b1 = (byte) a1;
		System.out.println(b1); // Output: 106 as most significant bit was negative in first compliment and we were
		// passing negative value, so it'll be converted to positive. Hence answer is 106.

		// If we assign floating point values to the integral types by explicit type casting, the digits after decimal
		// point will be lost

		double d1 = 130.456;
		int p = (int) d1;
		System.out.println(p); // Output: 130

		byte by = (byte) d;
		System.out.println(by); // Output: -126

	}

}
