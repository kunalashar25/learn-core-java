package com.java.exceptionHandling;

public class TopExceptions
{
	// 1. Based on the person who is rising an exception, all exceptions are divided into two types:
	// i. JVM Exceptions.
	// ii. Programmatic Exceptions.

	/** JVM Exception **/
	// The exception which are raised automatically by JVM whenever a particular events occurs are called JVM
	// exceptions.
	// Examples: ArithmeticException, NullPointerException, etc.

	/** Programmatic Exceptions **/
	// The exceptions which are raised explicitly either by programmer or by API developer to indicate that something is
	// wrong are called programmatic exceptions.
	// Examples: TooOldException, TooYoungException, IllegalArgumentException, etc.

	/** Top 10 Exception **/

	// 1. ArrayIndexOutOfBoundsException
	// i. It is a child class of RuntimeException and hence it's unchecked exception.
	// ii. Raised automatically by JVM whenever we're trying to access Array elements without out of range index.

	// Example
	public void m1()
	{
		int[] x = new int[4];
		System.out.println(x[0]);
		System.out.println(x[10]); // Exception
		System.out.println(x[-5]); // Exception
	}

	// 2. NullPointerException
	// i. It is a child class of RuntimeException and hence it's unchecked exception.
	// ii. Raised automatically by JVM whenever we're trying to perform any operation on null.

	// Example
	public void m2()
	{
		String s = null;
		System.out.println(s.length()); // Exception
	}

	// 3. ClassCastException
	// i. It is a child class of RuntimeException and hence it's unchecked exception.
	// ii. Raised automatically by JVM whenever we're trying to typecast parent object to child type.

	// Example
	public void m3()
	{
		Object o = new Object();
		String s = (String) o; // Exception

		Object o1 = new String("String");
		String s1 = (String) o1; // Valid
	}

	// 4. StackOverflowError
	// i. It is a child class of Error and hence it's unchecked exception.
	// ii. Raised automatically by JVM whenever we're trying to perform recursive method call.

	// Example
	public static void m4_1()
	{
		m4_2();
	}

	public static void m4_2()
	{
		m4_1();
	}

	// 5. NoClassDefFoundError
	// i. It is a child class of Error and hence it's unchecked exception.
	// ii. Raised automatically by JVM whenever JVM unable to find required .class file.

	// Example
	// java Test
	// if Test.class file is not available then we'll get runtime exception saying NoClassDefFoundError : Test

	// 6. ExceptionInInitializerError
	// i. It is a child class of Error and hence it's unchecked exception.
	// ii. Raised automatically by JVM if any exceptions occurs while executing static variable assignments and static
	// blocks.

	// Examples
	static int x = 10 / 0; // Error

	static
	{
		String s = null;
		System.out.println(s.length()); // Error
	}
	
	// 7. IllegalArgumentException
	// start from #77
}
