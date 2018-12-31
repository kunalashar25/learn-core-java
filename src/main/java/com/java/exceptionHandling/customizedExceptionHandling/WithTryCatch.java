package com.java.exceptionHandling.customizedExceptionHandling;

public class WithTryCatch
{
	// 1. It is highly recommended to handle exceptions.

	// 2. The code which may rise an exception is called Risky Code and we have to define that code inside try block and
	// corresponding handling code should be defined inside catch block.

	public static void main(String[] args)
	{
		System.out.println("Statement 1");

		try
		{
			System.out.println(10 / 0); // risky code
		}
		catch (ArithmeticException e)
		{
			System.out.println(10 / 2); // handling code
		}

		System.out.println("Statement 3");
	}
}

// Output:
// Statement 1
// 5
// Statement 3
