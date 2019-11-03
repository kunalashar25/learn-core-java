package com.java.oops.polymorphism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PolymorphismIntroduction {
	// 1. One name but multiple forms is called polymorphism.

	// Example 1: method name is same but we can apply for different types of arguments (overloading concept).

	// Example 2: method signature is same but in parent class we have one type of implementation and in child class
	// another implementation (overriding concept).

	// 2. Usage of parent reference to hold child object is concept of polymorphism.

	// Example
	static List<String> l1 = new ArrayList<String>();

	static List<String> l2 = new LinkedList<String>();

	public static void main(String[] args) {
		// 3. Parent class reference can be used to hold child objects but by using that reference we can call only the
		// methods available in parent class and we can't call child specific methods.

		Parent p = new Child();
		p.m1();
		// p.m2(); CE: cannot find symbol method m2() at location: class Parent

		// 4. By Using child reference, we can call both parent and child class methods
		Child1 c = new Child1();
		c.m1();
		c.m2();

		/** When we should opt for Parent reference to hold child object **/

		// 1. If we don't know type of object at runtime then we should go for parent reference.

		// Example: The first element present in ArrayList can be any type, may be student object or customer object or
		// string object or String buffer object. Hence, the return type of get method is object, which can hold any
		// object type.

		Object o = l2.get(0);

		// Refer Image: Parent_vs_child_ObjectCreation.PNG
		// Refer Image: Pillars_Of_Oops.PNG
	}

}

class Parent {
	public void m1() {
		System.out.println("Parent m1");
	}
}

class Child extends Parent {
	public void m2() {
		System.out.println("Child m2");
	}
}

class Child1 extends Parent {
	public void m1() {
		System.out.println("Child m1");
	}

	public void m2() {
		System.out.println("Child m2");
	}
}
