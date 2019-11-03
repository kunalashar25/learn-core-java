package com.java.collections.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCursor {
	// 1. We can apply Iterator concept for any collection object and hence, it is universal cursor.

	// 2. By using Iterator, we can perform both read and remove operations.

	// 3. We can create Iterator object by using iterator() method of collection interface.
	// Method: public Iterator iterator();

	// Example: Iterator itr = c.iterator(); >> c is any collection object.

	/**
	 * Methods
	 **/
	// 1. public boolean hasNext();

	// 2. public Object next();

	// 3. public void remove();
	public static void main(String[] args) {
		ArrayList l = new ArrayList<>();

		for (int i = 0; i <= 10; i++) {
			l.add(i);
		}

		System.out.println(l); // Output: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

		Iterator itr = l.iterator();

		System.out.println(itr.getClass().getName()); // Output: java.util.ArrayList$Itr 

		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();

			if (i % 2 == 0) {
				System.out.println(i);
			} else {
				itr.remove();
			}
		}

		// Output:
		// 0
		// 2
		// 4
		// 6
		// 8
		// 10

		System.out.println(l); // Output: [0, 2, 4, 6, 8, 10]
	}

	/** Limitations **/
	// 1. By using Enumeration and iterator, we can always move only in forward direction and we can't move in backwards
	// direction. These are unidirectional cursors but not bidirectional cursors.

	// 2. By using Iterator, we can perform only read and remove operations and we can't perform add and replace
	// operations.

	// 3. To overcome above limitations we should go for ListIterator.
}
