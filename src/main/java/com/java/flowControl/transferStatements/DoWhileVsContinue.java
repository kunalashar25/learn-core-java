package com.java.flowControl.transferStatements;

public class DoWhileVsContinue {
	// Deadly Combination
	public static void main(String[] args) {
		int x = 0;

		do {
			x++;
			System.out.println(x);
			if (++x < 5)
				continue; // control will be sent to while keyword and not to do keyword
			x++;
			System.out.println(x);
		} while (++x < 10);

		// Output: 1 4 6 8 10
	}

}
