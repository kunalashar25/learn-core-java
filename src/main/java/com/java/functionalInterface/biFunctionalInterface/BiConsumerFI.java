package com.java.functionalInterface.biFunctionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerFI {
	public static void main(String[] args) {
		// Example 1
		Student[] s = {new Student("ABC", 65), new Student("PQR", 92), new Student("LMN", 22)};

		BiConsumer<Student, Integer> c1 = (stu, m) -> stu.marks = stu.marks + m;
		for (Student s1 : s) {
			c1.accept(s1, 5);
		}

		for (Student s1 : s) {
			System.out.println("Name : " + s1.name + " | Updated Marks: " + s1.marks);
		}
		// Output:
		// Name : ABC | Updated Marks: 70
		// Name : PQR | Updated Marks: 97
		// Name : LMN | Updated Marks: 27

	}
}

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}
