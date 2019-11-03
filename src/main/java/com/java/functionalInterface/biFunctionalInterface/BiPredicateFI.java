package com.java.functionalInterface.biFunctionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateFI {
	// 1. Bi Functional Interface are used when user need to provide two input argument. Rest functionality is same as
	// Predicate Functional Interface.

	// public boolean test(T1 t1, T2 t2);

	public static void main(String[] args) {
		// Example 1
		BiPredicate<Integer, Integer> p1 = (a, b) -> (a + b) % 2 == 0;
		System.out.println(p1.test(10, 20)); // Output: true
		System.out.println(p1.test(10, 15)); // Output: false
	}
}
