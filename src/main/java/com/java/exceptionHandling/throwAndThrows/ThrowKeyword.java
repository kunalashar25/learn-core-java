package com.java.exceptionHandling.throwAndThrows;

public class ThrowKeyword
{
	// 1. Sometimes we can create exception object explicitly. We can handover to the JVM manually, for this we have to
	// use throw keyword.

	// throw new ArithmeticException("/ by zero");

	// 2. Hence, the main objective of throw keyword is to handover our created exception object to the JVM manually.

	// The Result of following two program is exactly same:
}

class Test1
{
	public static void main(String[] args)
	{
		System.out.println(10 / 0);
	}
}
// Output:
// Exception in thread "main" java.lang.ArithmeticException: / by zero
// at com.java.exceptionHandling.throwAndThrows.Test1.main(ThrowKeyword.java:19)

// In this case, main() method is responsible to create exception object and handover to the JVM.

class Test2
{
	public static void main(String[] args)
	{
		throw new ArithmeticException("/ by zero thrown explicitly");
	}
}
// Output:
// Exception in thread "main" java.lang.ArithmeticException: / by zero thrown explicitly
// at com.java.exceptionHandling.throwAndThrows.Test2.main(ThrowKeyword.java:30)

// In this case, programmer is creating exception object explicitly and handover to the JVM manually.

// Note: Best use of throw keyword is for user-defined exceptions or customized exceptions.
