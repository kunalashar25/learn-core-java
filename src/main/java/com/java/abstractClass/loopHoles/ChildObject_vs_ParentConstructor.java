package com.java.abstractClass.loopHoles;

public class ChildObject_vs_ParentConstructor extends Person {
	int rollNo;
	int marks;

	public ChildObject_vs_ParentConstructor(String name, int age, int rollNo, int marks) {
		super(name, age);
		this.rollNo = rollNo;
		this.marks = marks;
		System.out.println(this.hashCode()); // Output: 366712642
	}

	public static void main(String[] args) {
		ChildObject_vs_ParentConstructor c = new ChildObject_vs_ParentConstructor("Java", 8, 101, 456);
		System.out.println(c.hashCode()); // Output: 366712642

	}

}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(this.hashCode()); // Output: 366712642
	}

}

// Whenever we're creating child class object, automatically Parent constructor will be executed to perform
// initialization for the instance variables which are inherited from Parent. Parent object is not created.

// In the above program, both parent and child constructor executed for child object initialization only.

// Whenever we're creating child class object. parent constructor will be executed but parent object won't be created.

// In the above example, we created only child class object but both parent and child constructor got executed for that
// child class object.