package com.java.exceptionHandling;

import java.io.FileNotFoundException;

public class ExceptionHandlingIntroduction
{
	// 1. An unexpected unwanted event that disturbs normal flow of the program is called an Exception.

	// Example:
	// 1. TyrePunctureException (Custom Exception)
	// 2. SleepingException (Custom Exception)
	// 3. FileNotFoundException

	// 2. It is highly recommended to handle exceptions and main objective of exception handling is graceful
	// termination of the program.

	// 3. Exception handling doesn't mean repairing an exception. We have to provide alternative way to continue rest of
	// the program normally, is the concept of Exception Handling.

	// Example:
	// Our programming requirement is to read data from remote file location. At runtime, if remote file is not
	// available then our program should not be terminated abnormally. We have to provide some local file to continue
	// rest of the program normally. This way of defining alternative is nothing but exception handling.

	public void smapleCode()
	{
		try
		{
			// read data from remote file
		}
		catch (FileNotFoundException e)
		{
			// use local file and continue rest of the program locally.
		}
	}
}
