package com.java.lambdaExpressions.introduction;

public class LambdaIntroduction {
	// 1. Lambda Expression is an anonymous function with no name, no return type and no modifiers. They're represented
	// by using -> symbol.

	// 2. Curly braces are mandatory when more than 1 line is present in lambda function.

	// 3. Compiler can guess variable type automatically in few cases. Hence we don't need to provide variable type.

	// 4. return keyword should always be specified inside curly braces. You can return any value without using return
	// keyword as well if you have a single line of code.

	// 5. For single parameter expression, there is no need to provide round braces, they're optional but for zero or
	// more than 1 parameter, round braces is mandatory.

	// Example 1
	public void m1() {
		System.out.println("Hello");
	}

	// Example 2
	public void m2(int a, int b) {
		System.out.println(a + b);
	}

	// Example 3
	public void m3(int n) {
		System.out.println(n * n);
	}

	// Example 4
	public int m4(String s) {
		return s.length();
	}

	public static void main(String[] args) {
		// equivalent lambda expression for Example 1
		() -> System.out.println("Hello");

		// equivalent lambda expression for Example 2
		(a, b) -> System.out.println(a + b);

		// equivalent lambda expression for Example 3
		(int n) -> {
			return n * n;
		}; // curly braces are mandatory with return keyword.
		(int n) -> n * n; // no need for return keyword for single statement.
		(n) -> n * n; // compiler can guess return type automatically.
		n -> n * n; // no need of round braces for single parameter.

		// equivalent lambda expression for Example 4
		s -> s.length();
	}

}
