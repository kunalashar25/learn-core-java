package com.java.flowControl.staticBlock;

public class StaticBlockExample2
{
	static StaticBlockExample2 s = new StaticBlockExample2();
	{
		System.out.println("Hello");

		System.exit(0);
	}

}
