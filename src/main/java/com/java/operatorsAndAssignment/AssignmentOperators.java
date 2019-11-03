package com.java.operatorsAndAssignment;

public class AssignmentOperators {

	public static void main(String[] args) {
		// There are 3 types of Assignment Operators
		// 1. Simple Assignment Operator
		// 2. Chain Assignment Operator
		// 3. Compound Assignment Operator

		/** Simple Assignment Operator **/
		int x = 10;

		/** Chain Assignment Operator **/
		int a, b, c, d;
		a = b = c = d = 20;
		System.out.println(a + ".." + b + ".." + c + ".." + d); // Output: 20..20..20..20

		// We can't perform chained assignment directly at the time of declaration
		// int p = q = r = s = 20; CE: cannot find Symbol. Variable q Location: class AssignmentOperators

		/** Compound Assignment Operator **/

		// Sometimes assignment operator mixed with some other operator, such type of assignment operators are called
		// Compound Assignment Operators.

		int p = 10;
		p += 20;
		System.out.println(p); // Output: 30

		// Various types of Compound Assignment Operators in Java
		// += , -= ,*= ,/= , %=
		// &= , |= , ^=
		// >>= (Right Shift) , >>>= (Unsigned Right Shift) , <<= (Left Shift)

		// In case of Compound Assignment Operators internal type casting will be performed automatically

		// Example:
		byte m = 10;
		// m = m + 1; CE: POssible loss of Precision. Found int Required byte
		m++; // internally it'll be converted to: m = (byte) (m + 1)
		System.out.println(m); // Output: 11

		// loop hole in case of Compound Assignment Operators
		byte l = 10;
		l += 1; // internally it'll be converted to: l = (byte) (l + 1)
		System.out.println(l); // Output: 11

		byte n = 127;
		n += 3;
		System.out.println(n); // Output: -126

		// Mixture of Chain and Compound Assignment Operators
		a = b = c = d = 20;
		a += b -= c *= d /= 2;
		System.out.println(a + ".." + b + ".." + c + ".." + d); // Output: -160..-180..200..10
	}

}
