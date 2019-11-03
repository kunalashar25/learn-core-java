package com.java.arrays;

import com.google.common.primitives.Booleans;

public class BooleanArray {

	public static void main(String[] args) {
		boolean test[] = {true, true, true};

		if (Booleans.asList(test).contains(false)) {
			System.out.println("Yes");
		} else
			System.out.println("No");

	}

}
