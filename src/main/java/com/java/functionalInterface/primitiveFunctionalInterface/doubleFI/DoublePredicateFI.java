package com.java.functionalInterface.primitiveFunctionalInterface.doubleFI;

import java.util.function.DoublePredicate;

public class DoublePredicateFI {
	public static void main(String[] args) {
		double[] x = {5.2, 10.5, 15.6, 20.8, 25.0, 30.8};
		DoublePredicate p = i -> i / 2 > 5.8;

		for (double x1 : x) {
			if (p.test(x1))
				System.out.println(x1);
		}
		// Output:
		// 15.6
		// 20.8
		// 25.0
		// 30.8
	}
}
