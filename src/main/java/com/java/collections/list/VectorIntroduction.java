package com.java.collections.list;

import java.util.Vector;

public class VectorIntroduction
{
	// 1. The underlying data structure is Resizable array or Growable Array.

	// 2. Duplicates are allowed.

	// 3. Insertion Order is preserved.

	// 4. Heterogeneous objects are allowed (Expect TreeSet and TreeMap,every collection supports heterogeneous
	// objects. Heterogeneous means different type of objects).

	// 5. null insertion is possible.

	// 6. It implements Serializable, Cloneable and RandomAccess interface.

	// 7. Every method present in vector class is synchronized and hence, vector object is thread safe.

	/** Constructors **/
	// 1. Vector v = new Vector(); creates an empty vector object with default initial capacity 10. Once Vector reaches
	// its max capacity then a new vector object will be created with below formula:

	// newCapacity = currentCapacity * 2

	// 2. Vector v = new Vector(int initialCapacity); creates an empty vector object with specified initial capacity.

	// 3. Vector v = new Vector(int initialCapacity, int incrementalCapacity);

	// 4. Vector v = new Vector(Collection c); creates any equivalent object for the given collection. This constructor
	// is meant for inter-conversion between collection objects.

	/** Vector Specific Methods **/
	// 1. To add objects:
	// i. add (Object o) -> Collection Specific method
	// ii. add(int index, Object o) -> List Specific method
	// iii. addElement (Object o) -> Vector Specific method

	// 2. To remove objects:
	// i. remove (Object o) -> Collection Specific method
	// ii. removeElement (Object o) -> Vector Specific method
	// iii. remove(int index) -> List Specific method
	// iv. removeElementAt (int index) -> Vector Specific method
	// v. clear() -> Collection Specific method
	// vi. removeAllElements () -> Vector Specific method

	// 3. To get objects:
	// i. Object get(int index) -> List Specific method
	// ii. Object elementAt(int index) -> Vector Specific method
	// iii. Object firstElement() -> Vector Specific method
	// iv. Object lastElement() -> Vector Specific method

	// 4. Other methods:
	// i. int size() >> current size
	// ii. int capacity() >> total capacity to hold elements
	// iii. Enumeration elements()

	public static void main(String[] args)
	{
		Vector v = new Vector<>();
		System.out.println(v.capacity()); // Output: 10

		// adding 10 elements 
		for (int i = 1; i <= 10; i++)
		{
			v.addElement(i);
		}
		
		// verifying capacity
		System.out.println(v.capacity()); // Output: 10
		
		// adding 11th element
		v.addElement("A");
		
		// verifying capacity and size
		System.out.println(v.capacity()); // Output: 20
		System.out.println(v.size()); // Output: 11
	}
}
