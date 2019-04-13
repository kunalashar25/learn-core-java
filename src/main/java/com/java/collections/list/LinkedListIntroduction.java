package com.java.collections.list;

import java.util.LinkedList;

public class LinkedListIntroduction
{
	// 1. The underlying data structure is doubly linked list or circular linked list.

	// 2. Insertion order is preserved.

	// 3. Duplicate objects are allowed.

	// 4. Heterogeneous objects are allowed (Expect TreeSet and TreeMap,every collection supports heterogeneous
	// objects. Heterogeneous means different type of objects).

	// 5. null insertion is possible.

	// 6. LinkedList implements Serializable and Cloneable interfaces but not RandomAccess interface/

	// 7. LinkedList is the best choice if our frequent operation is insertion/deletion in middle index.

	// 8. LinedList is the worst choice if our frequent operation is retrieval operation.

	/** Constructors in LinkedList **/

	// 1. Below constructor creates an empty LinkedList object.

	// LinkedList l = new LinkedList();

	// 2. Below constructor creates an equivalent LinkedList object for the given collection.

	// LinkedList l = new LinkedList(Collection c)

	/** LinkedList class specific methods **/
	// 1. Usually we can use LinkedList to develop Stacks and Queues, to provide support for this requirement LinkedList
	// class defines the following specific methods:
	
	// i. void addFirst (Object o)
	// ii. void addLast (Object o)
	// iii. Object getFirst ()
	// iv. Object getLast ()
	// v. Object removeFirst ()
	// vi. Object removeLast ()
	
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList<>();
		l.add("A");
		l.add(30);
		l.add(null);
		l.add("B");
		
		System.out.println(l); // Output: [A, 30, null, B]
		
		l.set(0, "C");
		System.out.println(l); // Output: [C, 30, null, B]
		
		l.add(0, "D");
		System.out.println(l); // Output: [D, C, 30, null, B]
		
		l.removeLast();
		System.out.println(l); // Output: [D, C, 30, null]
		
		l.addFirst("E");
		System.out.println(l); // Output: [E, D, C, 30, null]
	}
}
