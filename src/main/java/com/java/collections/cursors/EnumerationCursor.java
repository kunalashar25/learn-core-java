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
}
