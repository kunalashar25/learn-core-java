package com.java.flowControl.transferStatements;

public class ContinueStatement {

	public static void main(String[] args) {
		// 1. We can use continue statement inside loops to skip current iteration and continue for the next iteration.

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				continue; // will transfer control to for loop if i % 2 ==0
			System.out.println(i);
		}
		// Output: 1 3 5 7 9

		// 2. We can use continue statement only inside loops. If we're using any where else we'll get compile time
		// error saying continue outside of loop.

		// Example
		// int a = 2;
		// if (a == 2)
		// continue; CE: continue outside of loop
	}

}
