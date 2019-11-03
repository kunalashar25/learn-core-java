package com.java.interfaces.namingConflicts;

public interface MethodNamingConflicts {

}

/**
 * Method Naming Conflicts
 **/

// Case 1: If 2 interfaces contains a method with same signature and same return type then in the implementation
// class, we've to provide implementation for only one method. See Example 1.

// Example 1

interface Left1 {
	public void method1();
}

interface Right1 {
	public void method1();
}

class example1 implements Left1, Right1 {
	public void method1() {

	}
}

// Case 2: If 2 interfaces contains a method with same name but different argument types then in the implementation
// class, we've to provide implementation for both methods and these methods acts as overloaded methods.See Example 2.

// Example 2

interface Left2 {
	public void method1();
}

interface Right2 {
	public void method1(int i);
}

class example2 implements Left2, Right2 {
	public void method1() {

	}

	public void method1(int i) {

	}
}

// Case 3: If two interfaces contains a method with same signature but different return types then it is impossible to
// implement both interfaces simultaneously (If return types are not covarient).

// Example 3

interface Left3 {
	public void method1();
}

interface Right3 {
	public int method1();
}

/*
 * class example3 implements Left3, Right3 { public int method1() {
 *
 * }
 *
 * public void method1() {
 *
 * } }
 */

// Note: We can't write any java class which implements both interfaces simultaneously

// Q. Can a java class can implement any number of interfaces simultaneously?
// Ans. Yes, except above case.
