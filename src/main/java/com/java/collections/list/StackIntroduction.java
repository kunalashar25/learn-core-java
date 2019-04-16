package com.java.collections.list;

import java.util.Stack;

public class StackIntroduction
{
	// 1. It is a child class of Vector.

	// 2. It is specially designed for LIFO i.e. Last In First Out order.

	/** Constructor **/
	// 1. Stack s = new Stack();

	/** Methods **/
	// 1. Object push (Object o) >> to insert an object into the stack.

	// 2. Object pop() >> to remove and return top of the stack.

	// 3. Object peek() >> to return top of the stack without removal

	// 4. boolean empty() >> returns true if stack is empty

	// 5. int search(Object o) >> returns offset if element is present else returns -1. Offset means object position
	// from top of the stack.

	public static void main(String[] args)
	{
		Stack s = new Stack<>();
		s.push("A"); // inserted 1st
		s.push("B"); // inserted 2nd
		s.push("C"); // inserted 3rd

		// printing preserves insertion order. removal order will be in reverse.
		System.out.println(s); // Output: [A, B, C]

		// A was inserted first and is last in stack
		System.out.println(s.search("A")); // Output: 3

		// Z was never inserted and is not present in stack
		System.out.println(s.search("Z")); // Output: -1
	}
}
