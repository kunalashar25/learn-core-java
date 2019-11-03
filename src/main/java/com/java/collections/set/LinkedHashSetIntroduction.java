package com.java.collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSetIntroduction {
	// 1. It is the child class of HashSet.

	// 2. It is exactly same as HashSet(including constructors and methods) except the following differences:
	// Refer HashSet_vs_LinkedHashSet.PNG

	public static void linkedHashSetDemo() {
		LinkedHashSet h = new LinkedHashSet<>();
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("10");
		h.add("D");
		h.add(null);
		System.out.println(h.add("B")); // Output: false
		System.out.println(h); // Output: [A, B, C, 10, D, null]
		// insertion order is preserved.
	}

	public static void main(String[] args) {
		linkedHashSetDemo();
	}

	// Note: In General, we can use LinkedHashSet to develop cache based applications where duplicates are not allowed
	// and insertion order preserved.
}
