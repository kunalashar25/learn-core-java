package com.java.abstractClass;

public abstract class AbstractClass_NoConstructor {
	String firstName;
	String lastName;
	int age;
	String address;
}

class Student extends AbstractClass_NoConstructor {
	int rollNo;

	public Student(String firstName, String lastName, int age, String address, int rollNo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.rollNo = rollNo;
	}

	public static void main(String[] args) {
		Student s = new Student("A", "B", 10, "Mumbai", 1);
	}
}

class Teacher extends AbstractClass_NoConstructor {
	String subject;

	public Teacher(String firstName, String lastName, int age, String address, String subject) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.subject = subject;
	}

	public static void main(String[] args) {
		Teacher t = new Teacher("A", "B", 10, "Mumbai", "English");
	}
}

// In this case, we're assigning values for abstract class from child classes, consider an abstract class with 100
// properties then we have to provide values to all those properties from child class constructor and need to repeat the
// same for all the child classes. This is increase lines of code. To avoid this scenario, we can have constructor in
// abstract class.
