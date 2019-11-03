package com.java.exceptionHandling.tryCatch.customizedExceptionHandling;

public class WithoutTryCatch {
	public static void main(String[] args) {
		System.out.println("Statement 1");

		System.out.println(10 / 0);

		System.out.println("Statement 3");
	}
}

// Output:
// Statement 1
// Exception in thread "main" java.lang.ArithmeticException: / by zero
// at com.java.exceptionHandling.customizedExceptionHandling.WithoutTryCatch.main(WithoutTryCatch.java:9)
