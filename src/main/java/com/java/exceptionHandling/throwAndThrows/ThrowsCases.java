package com.java.exceptionHandling.throwAndThrows;

import java.io.IOException;

public class ThrowsCases {
	// Case 1: We can use throws keyword for methods and constructors but not for classes.

	// Case 2: We can use throws keyword only for throwable types. If we're trying to use for normal java classes then
	// we'll get compile time error saying incompatible types.

	// Case 3:
}

class case1 throws Exception
		{

public case1()throws Exception
		{

		}

public static void main(String[]args)throws Exception
		{

		}
		}

class case2_1 {
	public void m1() throws case2_1 {
		// CE: incompatibel types. Found case2_1 Required java.lang.Throwable
	}
}

// valid
class case2_2 extends RuntimeException {
	public void m1() throws case2_2 {

	}
}

class case3_1 {
	public static void main(String[] args) {
		throw new Exception(); // checked
	}
}
// CE: unreported exception java.lang.Exception

class case3_2 {
	public static void main(String[] args) {
		throw new Error(); // unchecked.
	}
}
// RE: Exception in thread "main" java.lang.Error

// Within the try block if there is no chance of rising an exception then we can't write catch block for that exception
// otherwise we'll get compile time error saying Exception XXX is never thrown in body of corresponding try statement
// but this rule is applicable only for fully checked exceptions.

class case4_1 {
	public static void main(String[] args) {
		try {
			System.out.println("Hello");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
}
// Output:
// Hello

class case4_2 {
	public static void main(String[] args) {
		try {
			System.out.println("Hello");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
// Output:
// Hello

class case4_3 {
	public static void main(String[] args) {
		try {
			System.out.println("Hello");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
// CE: Exception java.io.IOException is never thrown in body of corresponding try statement

class case4_4 {
	public static void main(String[] args) {
		try {
			System.out.println("Hello");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
// CE: Exception java.lang.InterruptedException is never thrown in body of corresponding try statement

class case4_5 {
	public static void main(String[] args) {
		try {
			System.out.println("Hello");
		} catch (Error e) {
			e.printStackTrace();
		}
	}
}
// Output:
// Hello