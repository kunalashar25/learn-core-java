package com.java.functionalInterface.primitiveFunctionalInterface.intFI;

import java.util.function.ObjIntConsumer;

public class ObjIntConsumerFI
{
	// accept one argument as Object type and second argument is of int type.

	public static void main(String[] args)
	{
		ObjIntConsumer<String> i = (s, d) -> System.out.println(s + d);

		i.accept("Hello ", 234); // Output: Hello 234
	}
}
