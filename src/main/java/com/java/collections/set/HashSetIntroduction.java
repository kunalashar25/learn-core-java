package com.java.collections.set;

import java.util.HashSet;

public class HashSetIntroduction {
	// 1. The underlying data structure is Hashtable.

	// 2. Duplicate objects are not allowed.

	// 3. Insertion order is not preserved and it is based on hashcode of objects.

	// 4. null insertion is possible (only once and duplicates are not allowed).

	// 5. Heterogeneous objects are allowed.

	// 6. Implements Serializable and Cloneable but not RandomAccess interface.

	// 7. It is the best choice if our frequent operation is search operation.

	// Note: In HashSet, duplicates are not allowed. If we're trying to insert duplicates then we won't get any compile
	// time or runtime errors and add() method simply returns false.

	public static void addExample() {
		HashSet h = new HashSet<>();
		System.out.println(h.add("A")); // Output: true
		System.out.println(h.add("A")); // Output: false
	}

	/** Constructors **/
	// 1. HashSet h = new HashSet(); creates an empty HashSet object with default initial capacity 16 and default
	// fill-ratio (load Factor) 0.75.

	// 2. HashSet h = new HashSet(int initialCapacity); creates an empty HashSet object with specified initial capacity
	// and default fill-ratio (load Factor) 0.75.

	// 3. HashSet h = new HashSet(int initialCapacity, float fillRatio); creates an empty HashSet object with specified
	// initial capacity and specified fill-ratio.

	// 4. HashSet h = new HashSet(Collection c); creates an equivalent HashSet for the given collection. This
	// constructor is meant for inter-conversion between collection objects.

	/**
	 * Fill Ratio or Load Factor
	 **/
	// 1. After filling a particular ratio a new HashSet object will be created, this ratio is called Fill Ratio or Load
	// Factor.

	// Example: Fill Ratio 0.75 means, after filling 75% ratio of initial capacity, a new HashSet object will be
	// created.
	public static void hashSetDemo() {
		HashSet h = new HashSet<>();
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("10");
		h.add("D");
		h.add(null);
		System.out.println(h.add("B")); // Output: false
		System.out.println(h); // Output: [null, A, B, C, D, 10]
		// insertion order is not preserved.
	}

	public static void main(String[] args) {
		addExample();

		hashSetDemo();
	}

}
