package com.java.testCode.exceptionHandling;

public class TryFinallyTest
{

	public static void main(String[] args)
	{

		try
		{
			int a = 10;
			int b = a / 0;

			System.out.println(b);
		}
		finally
		{
			System.out.println("This is finally");
		}
	}
}

// Output:
/*
 * This is finally 
 * Exception in thread "main" java.lang.ArithmeticException: / by zero 
 * at com.java.testCode.exceptionHandling.TryFinallyTest.main(TryFinallyTest.java:12)
 */
