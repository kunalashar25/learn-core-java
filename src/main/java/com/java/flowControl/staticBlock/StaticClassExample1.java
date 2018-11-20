package com.java.flowControl.staticBlock;

public class StaticClassExample1
{
	static int x=10;
	
	static
	{
		System.out.println(x);
	}
}

// Output:
// 10
// RE: NoSuchMethodError: main