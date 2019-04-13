package com.java.collections.list;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

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

	// ArrayList l3 = new ArrayList(Collection c);

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

	// 4. Usually we can use collections to hold and transfer objects from one location to another location (container).
	// To provide support for this requirement every collection class by default implements serializable and cloneable
	// interfaces.

	// 5. ArralList and Vector classes implements RandomAccess interface so that any random element can be accessed with
	// the same speed.

	// 6. RandomAccess interface is present in java.util package and it doesn't contain any methods. It is a marker
	// interface, where required ability will be provided automatically by the JVM.

	public static void interviewQuestions()
	{
		ArrayList l1 = new ArrayList<>();
		LinkedList l2 = new LinkedList<>();

		System.out.println(l1 instanceof Serializable); // Output: true
		System.out.println(l1 instanceof Cloneable); // Output: true
		System.out.println(l1 instanceof RandomAccess); // Output: true

		System.out.println(l2 instanceof Serializable); // Output: true
		System.out.println(l2 instanceof Cloneable); // Output: true
		System.out.println(l2 instanceof RandomAccess); // Output: false
	}

	// 7. ArrayList is the best choice if our frequent operation is retrieval operation because ArrayList implement
	// RandomAccess interface.

	// 8. ArrayList is the worst choice if our frequent operation is insertion/deletion of objects in middle index.

	// Refer Image ArrayList_vs_Vector.PNG for Differences between ArrayList and Vector.

	/** How to get Synchronized version of ArrayList Object? **/
	// By Default ArrayList is non-synchronized but we can get synchronized version of ArrayList object by using
	// synchronizedList() method of Collections class.

	// Method Signature: public static List synchronizedList(List l)

	// Example
	public void synchronizedListExample()
	{
		ArrayList list = new ArrayList<>();
		List l1 = Collections.synchronizedList(list);
	}

	// Similarly, we can get synchronized version of Set and Map objects by using the following methods of Collections
	// class:
	// Method Signature: public static Set synchronizedSet(Set s)
	// Method Signature: public static Map synchronizedMap(Map m)
}
