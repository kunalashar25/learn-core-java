package com.java.exceptionHandling.tryCatch;

public class TryAndMultipleCatchBlock
{

	// 1. The way of handling an exception is varied from exception to exception. Hence, for every exception type it is
	// highly recommended to take separate catch block i.e. try with multiple catch block is always possible and
	// recommended to use.

	static int		a	= 10;
	static String	b	= "0";

	public static void main(String[] args)
	{
		try
		{
			System.out.println(a / Integer.parseInt(b));
		}
		catch (NumberFormatException e)
		{
			e.printStackTrace();
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	/** Output if b = "" **/
	// java.lang.NumberFormatException: For input string: ""

	/** Output if b = "0" **/
	// java.lang.ArithmeticException: / by zero

	// Note:
	// 1. If try with multiple catch blocks present then the order of catch block is very important. We have to take
	// child
	// exception first and then parent otherwise we'll get compile time error saying:
	// Unreachable catch block for exceptionName. It is already handled by the catch block for Exception

	// 2. We can't declare two catch blocks for the same exception otherwise we'll get compile time error.
}
