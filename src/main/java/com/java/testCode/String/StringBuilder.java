package com.java.testCode.String;

import org.apache.commons.lang3.text.StrBuilder;

public class StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// test string
		String str = "SpecialChar$%#^&amp;^%#^&amp;^&amp;*";

		System.out.println("Initial String " + str);

		StrBuilder sb = new StrBuilder(str);
		sb.replaceAll("amp;", "");

		System.out.println("final string " + sb);

	}

}
