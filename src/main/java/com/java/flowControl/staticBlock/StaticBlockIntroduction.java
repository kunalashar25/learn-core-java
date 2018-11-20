package com.java.flowControl.staticBlock;

public class StaticBlockIntroduction
{

	// 1. Static blocks will be executed at the time of class loading. Hence, at the time of class loading if we want to
	// perform any activity we have to define that inside static block.

	// Example 1: At the time of java class loading the corresponding native libraries should be loaded. Hence, we have
	// to define this activity inside static block
	static
	{
		System.loadLibrary("native library path");
	}

	// Example 2: After loading every DB driver class, we have to register driver class with a driver manager but inside
	// DB driver class there is a static block to perform this activity and we're not responsible to register
	// explicitly.

	// Note: Within a class we can declare any number of static blocks but all these static blocks will be executed from
	// top to bottom.
	
	// Q1. Without writing main() method is it possible to print some statements in console?
	// Ans: Yes, by using static block
}
