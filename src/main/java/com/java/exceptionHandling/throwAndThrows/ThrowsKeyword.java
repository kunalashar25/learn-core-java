package com.java.exceptionHandling.throwAndThrows;

import java.io.PrintWriter;

public class ThrowsKeyword
{
	// 1. In our program, if there's a possibility of rising checked exception then compulsory we should handle that
	// checked exception otherwise we'll get compile time error saying unreported exception XXX; must be caught or
	// declared to be thrown.

	// Example 1
	public static void main(String[] args)
	{
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.print("Hello");
	}
	// Output:
	// Exception in thread "main" java.lang.Error: Unresolved compilation problem:
	// Unhandled exception type FileNotFoundException
}

class Throws1
{
	public static void main(String[] args)
	{
		Thread.sleep(2000);
	}
	// Output:
	// Exception in thread "main" java.lang.Error: Unresolved compilation problem:
	// Unhandled exception type InterruptedException
}

// We can handle this compile time error by using the following two ways:
// 1. By using try-catch block.
// 2. By using throws keyword.

// We can use throws keyword to delegate responsibility of exception handling to the caller (another method or JVM) then
// caller method is responsible to handle that exception.

class Throws2
{
	public static void main(String[] args) throws InterruptedException
	{
		Thread.sleep(2000);
	}
}