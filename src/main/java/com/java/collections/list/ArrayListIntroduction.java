package com.java.collections.list;

import java.util.ArrayList;

public class ArrayListIntroduction
{
	// 1. The underlying data of array list structure is Resizable array or Growable Array.

	// 2. Duplicates are allowed.

	// 3. Insertion Order is preserved.

	// 4. Heterogeneous objects are allowed (Expect TreeSet and TreeMap,every collection supports heterogeneous
	// objects. Heterogeneous means different type of objects).

	// 5. null insertion is possible.

	/** Constructors in ArrayList **/
	// 1. Below statement creates an empty ArrayList object with default initial capacity of 10.

	// ArrayList l1 = new ArrayList();

	// Once ArrayList reached its max capacity then a new ArrayList object will be created with below formula
	// newCapacity = (currectCapacity*3/2) + 1

	// Example:
	// For 11th element, new capacity will be 16
	// For 17th element, new capacity will be 25
	// For 26th element, new capacity will be 38 and so on.

	// 2. Below statement creates an empty ArrayList object with specified initial capacity i.e. 1000

	// ArrayList l2 = new ArrayList(1000);

	// 3. Creates and equivalent ArrayList object for the given collection.

	// ArrayList l3 = new ArrayList<>(l1);

	/** Examples **/
	public static void main(String[] args)
	{
		// Example 1:
		ArrayList l1 = new ArrayList();
		l1.add("A");
		l1.add("10");
		l1.add("A");
		l1.add(null);
		System.out.println(l1); // Output: [A, 10, A, null]

		l1.remove(2);
		System.out.println(l1); // Output: [A, 10, null]

		l1.add(2, "M");
		System.out.println(l1); // Output: [A, 10, M, null]

		// Note: in this case we'll get compile time warning to compile code via -xlint as we're not using generics
		// while creating ArrayList.

	}

}
