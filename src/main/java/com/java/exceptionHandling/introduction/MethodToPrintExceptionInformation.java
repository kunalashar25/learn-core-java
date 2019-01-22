package com.java.exceptionHandling.introduction;

public class MethodToPrintExceptionInformation
{
	// Throwable class defines the following methods to print exception information:
	// i. printStackTrace() > Name of Exception : Description and Stack Trace
	// ii. toString() > Name of Exception : Description
	// iii. getMessage() > Description

	public static void main(String[] args)
	{
		try
		{
			System.out.println(10 / 0);
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
	}
}

/** Output for statement e.printStackTrace() **/
// java.lang.ArithmeticException: / by zero
// at com.java.exceptionHandling.MethodToPrintExceptionInformation.main(MethodToPrintExceptionInformation.java:14)

/** Output for statement System.out.println(e) and System.out.println(e.toString()) **/
// java.lang.ArithmeticException: / by zero

/** Output for statement System.out.println(e.getMessage()) **/
// / by zero

// Note: Internally DefaultExceptionHandler will use printStackTrace() method to print exception information to the
// console.