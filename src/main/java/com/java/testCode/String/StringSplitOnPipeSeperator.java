package com.java.testCode.String;

import org.apache.commons.lang3.StringUtils;

public class StringSplitOnPipeSeperator
{

	public static void main(String[] args)
	{
		// We cannot split string on | by using below method. We need to use
		// StringUtils to achieve the same.

		String a = "abc|pqr";

		String[] b = a.split("|");

		System.out.println(b[0]);

		// if we split above string on | separator then output will be
		// [a, b, c,|, p, q, r]

		a = "abc|pqr";

		b = StringUtils.split(a, "|");
		System.out.println(b[0]); // Output: abc

	}

}
