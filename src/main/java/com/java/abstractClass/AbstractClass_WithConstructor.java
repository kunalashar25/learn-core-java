package com.java.abstractClass;

public abstract class AbstractClass_WithConstructor {
	// Q. We can't create object for abstract class but it can still contain constructor?
	// Ans. Abstract class constructor will be executed whenever we're creating child class object to perform
	// initialization of child class object.

	String firstName;
	String lastName;
	int age;
	String address;

	// This constructor will work for every child object creation.
	public AbstractClass_WithConstructor(String firstName, String lastName, int age, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
	}

}

class Student1 extends AbstractClass_WithConstructor {
	int rollNo;

	public Student1(String firstName, String lastName, int age, String address, int rollNo) {
		super(firstName, lastName, age, address);
		this.rollNo = rollNo;
	}

	public static void main(String[] args) {
		Student1 s = new Student1("A", "B", 10, "Mumbai", 1);
	}
}

class Teacher1 extends AbstractClass_WithConstructor {
	String subject;

	public Teacher1(String firstName, String lastName, int age, String address, String subject) {
		super(firstName, lastName, age, address);
		this.subject = subject;
	}

	public static void main(String[] args) {
		Teacher1 t = new Teacher1("A", "B", 10, "Mumbai", "English");
	}
}

// In this case, a constructor is created in abstract class. So we don't need to write code for abstract class
// properties in child classes. Only a single call to super class constructor will do.

// Whenever we're creating child class object, parent object won't be created, just parent class constructor will be
// executed for the child object purpose only.
