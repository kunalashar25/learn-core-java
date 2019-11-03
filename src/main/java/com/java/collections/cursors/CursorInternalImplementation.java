package com.java.collections.cursors;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorInternalImplementation {
	// 1. Enumeration, Iterator and ListIterator are interface, how can we create object of an interface?

	// 2. Below statements doesn't create interface objects. They create interface implemented class object.

	// 3. Use object.getClass().getName() to find implemented class name. Example: java.util.Vector$1, before $ sign is
	// outer class name and after $ sign is inner class name.

	// 4. Example: java.util.Vector$1, $1 means anonymous inner class present inside Vector class.

	// 5. Example: java.util.Vector$Itr, Iterator interface implemented class name is Itr and Itr is present inside
	// Vector class.

	// 6. Example: java.util.Vector$ListItr, ListIterator interface implemented class name is ListItr and ListItr is
	// present inside Vector class.

	public static void main(String[] args) {
		Vector v = new Vector<>();
		Enumeration e = v.elements();
		System.out.println(e.getClass().getName()); // Output: java.util.Vector$1

		Iterator itr = v.iterator();
		System.out.println(itr.getClass().getName()); // Output: java.util.Vector$Itr

		ListIterator ltr = v.listIterator();
		System.out.println(ltr.getClass().getName()); // Output: java.util.Vector$ListItr
	}
}
