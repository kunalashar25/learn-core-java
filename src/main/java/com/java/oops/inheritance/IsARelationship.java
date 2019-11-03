package com.java.oops.inheritance;

public class IsARelationship {
	// 1. Is-A-Relationship is also known as inheritance.

	// 2. The main advantage of Is-A relationship is code re-usability.

	// 3. By using extends keyword we can implement Is-A-Relationship.

	/**
	 * Loop Holes
	 **/

	public static void main(String[] args) {
		// Case 1:
		Parent p1 = new Parent();
		p1.method1();
		// p1.method2(); CE: cannot find symbol. Symbol: method2() Location: class Parent

		// Case 2:
		Child c1 = new Child();
		c1.method1();
		c1.method2();

		// Case 3: most important concept
		Parent p2 = new Child();
		p2.method1();
		// p2.method2(); CE: cannot find symbol. Symbol: method2() Location: class Parent

		// Case 4:
		// Child c2 = new Parent(); CE: incompatible types. Found: Parent Required: Child.
	}

	/** Conclusions **/
	// 1. Whatever methods parent has is by default available to the child class and hence from child reference we can
	// call both parent and child class methods.

	// 2. Whatever method child has by default not available to the child and hence on parent reference we can't call
	// child specific methods.

	// 3. Parent reference can be used to hold child object but by using that reference we can't call child specific
	// methods but we can call the methods present in parent class. This concept is called Polymorphism.

	// 4. Parent reference can be used to hold child object but child reference cannot be used to hold parent object.

	// NOTE: the most common methods which are applicable for any type of child, we have to define in Parent class. The
	// specific methods which are applicable for a particular child, we have to define them in child class.

}

class Parent {
	void method1() {
		System.out.println("Parent method 1");
	}
}

class Child extends Parent {
	void method2() {
		System.out.println("Child method 2");
	}
}

/**
 * Examples
 **/
// 1. Total Java API is implemented based on inheritance concept.

// 2. The most common methods which are applicable for any java object are defined in Object class and hence, every
// class in java is a child class of Object class either directly or indirectly so that Object class methods
// by default available to every java class without re-writing. Due to this Object class acts as root for all java
// classes.

// 3. Throwable class defines the most common methods which are required for every Exception and Error classes.
// Hence, this class acts as root for Java Excpetion hierarchy.