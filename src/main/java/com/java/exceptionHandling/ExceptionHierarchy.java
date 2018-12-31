package com.java.exceptionHandling;

public class ExceptionHierarchy
{
	// 1. Throwable class acts as root for java exception hierarchy.

	// 2. Throwable class defines two child classes i.e. Exception and Error.

	/** Exception **/

	// 1. Most of the time exceptions are caused by our program and these are recoverable.

	// For example: if our program requirement is to read data from a remote file. At runtime if remote file is not
	// available then we'll get runtime exception saying FileNotFoundException

	// 2. If FileNotFoundException occurs we can provide local file and continue with rest of the program normally.

	// Refer program from ExceptionHandlingIntroduction for reference.

	/** Error **/

	// 1. Most of the time errors are not caused by our program and these are due to lack of system resources.

	// 2. Errors are non-recoverable.

	// For Example: if OutOfMemoryError occurs, being a programmer we can't do anything and the program will be
	// terminated abnormally. System admin or server admin is responsible to increase heap memory.

	// Refer ExceptionHierarchy.png
}