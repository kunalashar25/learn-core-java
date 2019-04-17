package com.java.collections.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor
{
	// 1. We can use enumeration to get objects one by one from legacy collection object.

	// 2. We can create enumeration object by using elements() method of vector class.

	/** Methods **/
	// 1. public boolean hasMoreElements();

	// 2. public Object nextElement();

	public static void main(String[] args)
	{
		Vector v = new Vector<>();
		for (int i = 0; i <= 10; i++)
		{
			v.addElement(i);
		}

		System.out.println(v); // Output: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

		Enumeration e = v.elements();
		
		System.out.println(e.getClass().getName()); // Output: java.util.Vector$1

		while (e.hasMoreElements())
		{
			Integer i = (Integer) e.nextElement();

			if (i % 2 == 0)
			{
				System.out.println(i);
			}
		}

		// Output:
		// 0
		// 2
		// 4
		// 6
		// 8
		// 10
	}

	/** Limitations **/
	// 1. We can apply Enumeration concept only for legacy classes and it is not a universal cursor i.e. it can only be
	// applied to legacy classes like Vector and Stack.

	// 2. By using enumeration, we can get only read access and we can't perform remove operation.
	
	// 3. To Overcome above limitations we should go for Iterator cursor.
}
