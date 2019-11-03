package com.java.flowControl.staticControlFlow;

public class StaticClassExample3 {

	static {
		m1();
	}

	public static void m1() {
		System.out.println(x);
	}

	static int x = 10;
}

// Output:
// 0
// RE: NoSuchMethodError: main
