package com.java.flowControl.transferStatements;

public class BreakStatement
{

	public static void main(String[] args)
	{
		// We can use break statement in the following places:
		/** 1. Inside Switch > to stop fall-through **/

		int x = 0;
		switch (x)
		{
			case 0:
				System.out.println(0);
				break;
			case 1:
				System.out.println(1);
				break;
			default:
				System.out.println("def");
		}
		// Ouput: 0

		/** 2. Inside Loops > to break loop execution based on some condition **/

		for (int i = 0; i < 5; i++)
		{
			if (i == 2)
				break;
			System.out.println(i);
		}
		// Ouput: 0 1

		/** 3. Inside Labeled Blocks > to break block execution based on some condition **/

		int a = 5;
		l1:
		{
			System.out.println("start L1");
			if (a == 5)
				break l1;
			System.out.println("end L1");
		}
		System.out.println("after L1");
		// Output: start L1 after L1

		// These are only places where we can use break statement. if we're using it anywhere else then we'll get
		// compile time error saying break outside switch or loop.

		// int p = 2;
		// if (p == 2)
		// break; CE: break outside switch or loop
		// System.out.println("After break");

	}

}
