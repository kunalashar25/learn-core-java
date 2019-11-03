package com.java.varargs;

public class VarArgs_Case6_Example {
	public static void m(int... x) {
		System.out.println("this is var-arg method");
	}

	public static void m(int x) {
		System.out.println("this is normal method");
	}

	public static void main(String[] args) {
		m(); // output: this is var-arg method
		m(10, 20); // output: this is var-arg method
		m(10);// output: this is normal method
	}
}
