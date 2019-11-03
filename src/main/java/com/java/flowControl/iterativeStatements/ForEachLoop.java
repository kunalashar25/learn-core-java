package com.java.flowControl.iterativeStatements;

public class ForEachLoop {
	// Also known as Enhanced For Loop

	public static void main(String[] args) {
		// Introduced in v1.5

		// It is specially designed to retrieve elements of Arrays and Collections.

		// Example 1: to prints elements of 1D array.
		int[] x = {10, 20, 30, 40};

		for (int x1 : x) {
			System.out.println(x1);
		}

		// Output: 10 20 30 40

		// Example 2: to prints elements of 2D array.
		int[][] y = {{10, 20, 30}, {40, 50}};

		for (int[] y1 : y) {
			for (int y2 : y1) {
				System.out.println(y2);
			}
		}

		// Output: 10 20 30 40 50

		// Example 3: to print elements of 3D array.
		int[][][] z = {{{10, 20}, {30, 40}}, {{50, 60, 70}}, {{80, 90}}};

		for (int[][] z1 : z) {
			for (int[] z2 : z1) {
				for (int z3 : z2) {
					System.out.println(z3);
				}
			}
		}

		// Output: 10 20 30 40 50 60 70 80 90

		// Limitation: By using normal for loop, we can print array elements either in original order or in reverse
		// order but by using for each loop we can print array elements only in original order but not in reverse order.

		/** Iterable Interface **/

		// The target element in for-each loop should be Iterable object.

		// An Object is said to be iterable if and only if corresponding class implements java.lang.iterable interface.

		// Iterable interface was introduced in v1.5 and it contains only one method iterator().

		// Method Signature: public Iterator iterator()

		// All array related classes and collection implemented classes already implements iterable interface.

		// Refer Iterator_vs_Iterable.PNG
	}

}
