package com.java.lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionWithLambdaExpression
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(25);
		list.add(10);
		list.add(15);
		list.add(0);
		list.add(5);
		list.add(30);
		System.out.println(list); // Output: [25, 10, 15, 0, 5, 30]
		
		Comparator<Integer> c = (i1,i2)-> (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0;
		
		Collections.sort(list, c);
		
		System.out.println(list); // OUtput: [0, 5, 10, 15, 25, 30]
	}
}
