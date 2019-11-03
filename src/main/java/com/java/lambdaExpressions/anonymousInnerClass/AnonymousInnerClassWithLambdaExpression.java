package com.java.lambdaExpressions.anonymousInnerClass;

public class AnonymousInnerClassWithLambdaExpression {
	public static void main(String[] args) {
		Runnable r = () ->
		{
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread : " + i);
			}
		};

		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Parent Thread : " + i);
		}
	}

	// Note:
	// 1. Lambda expression is not as powerful as anonymous inner class.

	// 2. Consider one interface with two abstract method, in this case we won't be able to use lambda expression as it
	// requires exactly one abstract method. Hence, it is better to go for anonymous inner class instead of lambda
	// expressions.
}

// Output:
// Parent Thread : 0
// Child Thread : 0
// Child Thread : 1
// Child Thread : 2
// Child Thread : 3
// Child Thread : 4
// Child Thread : 5
// Child Thread : 6
// Parent Thread : 1
// Child Thread : 7
// Child Thread : 8
// Child Thread : 9
// Parent Thread : 2
// Parent Thread : 3
// Parent Thread : 4
// Parent Thread : 5
// Parent Thread : 6
// Parent Thread : 7
// Parent Thread : 8
// Parent Thread : 9
