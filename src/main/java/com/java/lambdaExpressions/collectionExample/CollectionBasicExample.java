package com.java.lambdaExpressions.collectionExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionBasicExample
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(25);
		list.add(10);
		list.add(15);
		list.add(0);
		list.add(5);
		System.out.println(list); // Output: [25, 10, 15, 0, 5]

		Collections.sort(list, new MyComparator());
		System.out.println(list); // Output: [0, 5, 10, 15, 25]
	}
}

class MyComparator implements Comparator<Integer>
{
	public int compare(Integer i1, Integer i2)
	{
		return (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0;
	}
}
