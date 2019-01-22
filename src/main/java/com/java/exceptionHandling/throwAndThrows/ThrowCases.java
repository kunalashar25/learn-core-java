package com.java.exceptionHandling.throwAndThrows;

public class ThrowCases
{
	// Case 1:
	// throw e; if e refers null then we'll get NullPointerException.

	// Case 2:
	// After throw statement we're not allowed to write any statement directly otherwise we'll get compile time error
	// saying unreachable statement.

	// Case 3:
	// We can use throw keyword only for throwable types. If we're trying to use for normal java objects, we'll get
	// compile time error saying incompatible types.

}

class Case1_1
{
	static ArithmeticException e = new ArithmeticException();

	public static void main(String[] args)
	{
		throw e;
	}
}
// Output:
// Exception in thread "main" java.lang.ArithmeticException
// at com.java.exceptionHandling.throwAndThrows.Case1_1.<clinit>(ThrowCases.java:12)

class Case1_2
{
	static ArithmeticException e;

	public static void main(String[] args)
	{
		throw e;
	}
}
// Output:
// Exception in thread "main" java.lang.NullPointerException
// at com.java.exceptionHandling.throwAndThrows.Case1_2.main(ThrowCases.java:29)

class Case2_1
{
	public static void main(String[] args)
	{
		System.out.println(10 / 0);
		System.out.println("Hello");
	}
}
// Output:
// Exception in thread "main" java.lang.ArithmeticException: / by zero
// at com.java.exceptionHandling.throwAndThrows.Case2_1.main(ThrowCases.java:44)

class Case2_2
{
	public static void main(String[] args)
	{
		throw new ArithmeticException();
		System.out.println("Hello");
	}
}
// Output:
// CE: Unreachable code.

class Case3_1
{
	public static void main(String[] args)
	{
		throw new Case3_1();
	}
}
// Output:
// Exception in thread "main" java.lang.Error: Unresolved compilation problem:
// No exception of type Case3_1 can be thrown; an exception type must be a subclass of Throwable

class Case3_2 extends RuntimeException
{
	public static void main(String[] args)
	{
		throw new Case3_2();
	}
}
// Output:
// Exception in thread "main" com.java.exceptionHandling.throwAndThrows.Case3_2
// at com.java.exceptionHandling.throwAndThrows.Case3_2.main(ThrowCases.java:82)
