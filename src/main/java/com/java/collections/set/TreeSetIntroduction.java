package com.java.collections.set;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetIntroduction {
	// 1. The underlying data structure is BalancedTree.

	// 2. Duplicate objects are not allowed.

	// 3. Insertion order not preserved.

	// 4. Heterogeneous objects are not allowed otherwise we'll get runtime exception saying ClassCastException.

	// 5. null insertion is possible (only once).

	// 6. TreeSet implements Serializable and Cloneable interfaces but not RandomAccess interface.

	// 7. All objects will be inserted based on some sorting order. It may be default natural sorting order or
	// customized sorting order.

	/**
	 * Constructors
	 **/

	public void noArgConst() {
		TreeSet t = new TreeSet();
		// Above statement creates empty TreeSet object.
		// Elements in this object will be stored as per default natural sorting order
	}

	public void comparatorArgConst() {
		Comparator comparator = null; // comparator is used to define custom sorting order.
		TreeSet t = new TreeSet(comparator);
		// Element in this object will be stored as per customized sorting order.
	}

	public void collectionArgConst() {
		Collection c = null;
		TreeSet t = new TreeSet(c);
		// used for inter-object conversion from collection object to treeSet.
	}


	/**
	 * Examples
	 */

	public static void example1_noArgConst() {
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
		System.out.println(t);
	}

	public static void example2_noArgConst() {
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
		t.add(new Integer(20));
		System.out.println(t);
	}

	// Null Acceptance Scenario
	// 1. If we're trying to insert null for non-empty treeSet then we'll get NullPointerException.
	// 2. For empty treeSet object, we can enter null as first value but as soon as we enter second value, it'll
	// compare 1st and 2nd value and again we'll get NullPointerException.

	public static void example3_noArgConst() {
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
		t.add(null);
		System.out.println(t);
	}

	public static void main(String[] args) {
		example1_noArgConst(); // Output: [A, B, L, Z, a]

		example2_noArgConst();
		// Output: java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer

		example3_noArgConst(); // Output: NullPointerException
	}

	//start from 24:04
}
