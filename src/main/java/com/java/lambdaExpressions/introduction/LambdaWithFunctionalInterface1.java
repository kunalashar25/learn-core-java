package com.java.lambdaExpressions.introduction;

public class LambdaWithFunctionalInterface1 {
	public static void main(String[] args) {
		// using lambda expression instead of creating new implementation class for interface methods.
		Interf1 i = () -> System.out.println("Hello by lambda");
		i.m1(); // output will be printed from this statement.
	}
}
// Output:
// Hello by lambda

@FunctionalInterface
interface Interf1 {
	public void m1();
}
