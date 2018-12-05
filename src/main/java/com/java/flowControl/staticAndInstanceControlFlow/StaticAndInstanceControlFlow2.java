package com.java.flowControl.staticAndInstanceControlFlow;

public class StaticAndInstanceControlFlow2
{
	private static String m1(String num)
	{
		System.out.println(num);
		return num;
	}

	public StaticAndInstanceControlFlow2()
	{
		m = m1("1");
	}

	{
		m = m1("2");
	}

	String m = m1("3");

	public static void main(String[] args)
	{
		Object o = new StaticAndInstanceControlFlow2();
	}
}

// Output:
// 2
// 3
// 1
