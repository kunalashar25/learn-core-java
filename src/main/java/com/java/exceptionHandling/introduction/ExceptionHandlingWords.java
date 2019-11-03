package com.java.exceptionHandling.introduction;

public class ExceptionHandlingWords {
	/** Exception Propagation **/
	// Inside a method if an exception is raised and if we're not handling that exception then
	// exception object will be propagated to caller then caller method is responsible to handle exception. This process
	// is called exception propagation

	/**
	 * Rethrowing Exception
	 **/
	// We can use this approach to convert one exception type to another exception type.

	// Example
	public void m1() {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			throw new NullPointerException();
		}
	}
}
