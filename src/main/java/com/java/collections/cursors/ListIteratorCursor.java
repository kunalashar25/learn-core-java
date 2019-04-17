package com.java.collections.cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorCursor
{
	// 1. By using ListIterator we can move either to the forward direction or backward direction and hence, it is
	// bidirectional cursor.

	// 2. By using ListIterator we can perform replacement and addition of new objects in addition to read and remove
	// operations.

	// 3. We can create ListIterator by using listIterator() method of List Interface.
	// Method: public ListIterator listIterator();

	// Example: ListIterator ltr = l.listIterator(); >> l is any list object.

	// 4. ListIterator is a child interface of Iterator and hence, all method present in Iterator is by default
	// available to the ListIterator.

	/** Methods **/
	// Forward Movement

	// 1. public boolean hasNext();

	// 2. public Object next();

	// 3. public int nextIndex();

	// Backwards Movement

	// 4. public boolean hasPrevious();

	// 5. public Object previous();

	// 6. public int previousIndex();

	// Extra Operations

	// 7. public void remove();

	// 8. public void add(Object o);

	// 9. public void set(Object o);

	public static void main(String[] args)
	{
		LinkedList list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		System.out.println(list); // Output: [A, B, C, D]

		ListIterator itr = list.listIterator();

		while (itr.hasNext())
		{
			String s = (String) itr.next();
			if (s.equals("A"))
			{
				itr.remove();
			}
			else if (s.equals("B"))
			{
				itr.add("E");
			}
			else if (s.equals("C"))
			{
				itr.set("F");
			}
		}

		System.out.println(list); // Output: [B, E, F, D]
	}
}
