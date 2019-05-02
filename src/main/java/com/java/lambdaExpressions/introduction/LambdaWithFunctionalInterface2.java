package com.java.lambdaExpressions.introduction;

public class LambdaWithFunctionalInterface2
{
	public static void main(String[] args)
	{
		Interf2 i = (int a, int b) -> System.out.println("Sum: " + (a + b));
		i.add(5, 10); // Output: Sum: 15

		Interf2 i2 = (a, b) -> System.out.println("Sum: " + (a + b));
		i2.add(10, 15); // Output: Sum: 25
	}
}

// This interface is still an FunctionalInterface as it contains only one abstract method.
interface Interf2
{
	public void add(int a, int b);
	// public void add2(int a, int b); if there are 2 methods in functional interface and if we write lambda expression
	// as (a, b) then compiler won't be able to map it with any method as both methods accept 2 integer parameters.
	// Hence, Functional Interface should contain only one abstract method.
	
	// Hence, lambda expression works with Functional Interface only.
}
