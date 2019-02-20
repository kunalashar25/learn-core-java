package com.java.exceptionHandling.customizedExceptions;

public class CustomizedExceptions
{
	// 1. Sometimes to meet programming requirements we can define our own exceptions, Such type of exceptions are
	// called, customized or user-defined exceptions.

	// Examples:
	// TooYoungException
	// TooOldException
	// InsufficientFundException

	public static void main(String[] args)
	{
		int age = 18;

		if (age < 18)
		{
			throw new TooYoungException("too young");
		}
		else if (age > 60)
		{
			throw new TooOldException("too old");
		}
		else
		{
			System.out.println("Your age is " + age);
		}
	}
}

// Output
// Age = 18: Your age is 18
// Age = 12: Exception in thread "main" com.java.exceptionHandling.customizedExceptions.TooYoungException: too young
// Age = 65: Exception in thread "main" com.java.exceptionHandling.customizedExceptions.TooOldException: too old
