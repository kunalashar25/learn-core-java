package com.java.flowControl.staticAndInstanceControlFlow;

public class StaticAndInstanceControlFlow3 {
	private static String m1(String num) {
		System.out.println(num);
		return num;
	}

	static String m = m1("1");

	{
		m = m1("2");
	}

	static {
		m = m1("3");
	}

	public static void main(String[] args) {
		Object o = new StaticAndInstanceControlFlow3();
	}
}

// Output:
// 1
// 3
// 2

// Note: From static area we can't access instance members directly because while executing static area JVM may not
// identify instance members. In-order to access instance variable, we need to create a class object.

class Test {
	int x = 10;

	public static void main(String[] args) {
		System.out.println(x);

		Test t = new Test();
		System.out.println(t.x);
	}
}
