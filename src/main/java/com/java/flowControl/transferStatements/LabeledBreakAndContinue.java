package com.java.flowControl.transferStatements;

public class LabeledBreakAndContinue {

	public static void main(String[] args) {
		// We can use labeled break and continue to break or continue a particular loop in nested loops

		l1:
		for (int i = 0; i < 3; i++) {
			l2:
			for (int j = 0; j < i; j++) {
				for (int k = 0; k < j; k++) {
					System.out.println(k);
					// break l1; to break out of l1 loop
					// break l2; to break out of l2 loop
					break; // to break out of current loop
				}
			}
		}

		// Example

		k1:
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j)
					break; // change keywords here
				System.out.println("i= " + i + " j= " + j);
			}
		}

		// change below keyword to observe change in output:
		// Output with break:
		// i= 1 j= 0
		// i= 2 j= 0
		// i= 2 j= 1

		// Output with break k1:
		// No Output

		// Output with continue:
		// i= 0 j= 1
		// i= 0 j= 2
		// i= 1 j= 0
		// i= 1 j= 2
		// i= 2 j= 0
		// i= 2 j= 1

		// Output with continue k1:
		// i= 1 j= 0
		// i= 2 j= 0
		// i= 2 j= 1

	}

}
