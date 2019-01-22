package com.java.exceptionHandling.introduction;

public class DefaultExceptionHandlingIntroduction
{

	// 1. Inside a method if any exception occurs the method in which it is raised is responsible to create exception
	// object by including the following information:
	// i. Name of Exception.
	// ii. Description of Exception.
	// iii. Location at which exception occurred (stack trace).

	// 2. After creating exception object, method hand-overs that object to the JVM.

	// 3. JVM will check whether the method contains any exception handling code or not. If the method doesn't contains
	// exception handling code then JVM terminates that method abnormally and removes the corresponding entry from the
	// stack.

	// 4. Then JVM identifies caller method and checks whether caller method contains any handling code or not.

	// 5. If the caller method doesn't contains any handling code then JVM abnormally terminates that caller method as
	// well and removes corresponding entry from the stack.

	// 6. This process will be continued until main() method and if the main() method also doesn't contain handling code
	// then JVM abnormally terminates main() method as well and removes corresponding entry from the stack.

	// 7. Then JVM hand-overs responsibility of exception handling to DefaultExceptionHandler, which is a part of JVM.

	// 8. DefaultExceptionHandler prints exception information in the following format and terminates program
	// abnormally:
	// Exception in thread "threadName" Name of Exception : Description Stack Trace

	public static void main(String[] args)
	{
		doStuff();
	}

	public static void doStuff()
	{
		doMoreStuff();
	}

	public static void doMoreStuff()
	{
		System.out.println(10 / 0);
	}
}

// Output:
// Exception in thread "main" java.lang.ArithmeticException: / by zero
// at
// com.java.exceptionHandling.defaultexceptionHandling.DefaultExceptionHandlingIntroduction.doMoreStuff(DefaultExceptionHandlingIntroduction.java:17)
// at
// com.java.exceptionHandling.defaultexceptionHandling.DefaultExceptionHandlingIntroduction.doStuff(DefaultExceptionHandlingIntroduction.java:12)
// at
// com.java.exceptionHandling.defaultexceptionHandling.DefaultExceptionHandlingIntroduction.main(DefaultExceptionHandlingIntroduction.java:7)

