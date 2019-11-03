package com.java.functionalInterface;

import java.util.function.Consumer;

public class ConsumerFI {
	// 1. It is used to consume an input and perform some actions without returning any output. Return type is void.

	// 2. public void accept(T t)

	// 3. Consumer chaining is possible using andThen() method
	// c1.andThen(c2).andThen(c3).accept(inputParam);

	public static void main(String[] args) {
		// Example 1
		Consumer<String> c1 = s -> System.out.println(s);
		c1.accept("Test"); // Output: Test
		c1.accept("Home"); // Output: Home

		// Example 2: Refer Student class from FunctionFI.java
		Consumer<Student1> c2 = s ->
		{
			System.out.println("Student Name: " + s.name);
			System.out.println("Student Marks: " + s.marks);
			System.out.println("------------------");
		};
		Student1[] s = {new Student1("ABC", 65), new Student1("PQR", 92), new Student1("LMN", 22)};
		for (Student1 s1 : s) {
			c2.accept(s1);
		}
		// Output:
		// Student Name: ABC
		// Student Marks: 65
		// ------------------
		// Student Name: PQR
		// Student Marks: 92
		// ------------------
		// Student Name: LMN
		// Student Marks: 22
		// ------------------
	}
}

class Student1 {
	String name;
	int marks;

	public Student1(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}
