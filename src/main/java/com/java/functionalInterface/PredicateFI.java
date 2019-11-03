package com.java.functionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateFI {
	// 1. Predicate interface is used to perform conditional checks.

	// 2. It contains only one abstract method and always returns boolean.
	// public abstract boolean test(T t)

	public static void main(String[] args) {
		// Example 1
		Predicate<Integer> p1 = i -> i % 2 == 0;
		System.out.println(p1.test(10)); // Output: true
		System.out.println(p1.test(13)); // Output: false

		// Example 2
		Predicate<String> p2 = s -> s.length() > 5;
		System.out.println(p2.test("Hello")); // Output: false
		System.out.println(p2.test("HelloWorld")); // Output: true

		// Example 3
		String[] str = {"hi", "Hello", "Welcome", "Testing"};
		for (String s : str) {
			if (p2.test(s)) {
				System.out.println(s);
			}
		}
		// Output:
		// Welcome
		// Testing

		// Example 4
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Emp1", 10000));
		empList.add(new Employee("Emp2", 20000));
		empList.add(new Employee("Emp3", 30000));
		empList.add(new Employee("Emp4", 40000));

		Predicate<Employee> p3 = e -> e.salary > 25000;

		for (Employee e : empList) {
			if (p3.test(e)) {
				System.out.println(e.name);
			}
		}
		// Output:
		// Emp3
		// Emp4

		// Example 5: Predicate Joining
		int[] x = {0, 10, 15, 13, 78, 35, 62};
		Predicate<Integer> p4 = i -> i % 2 == 0;
		Predicate<Integer> p5 = i -> i > 30;

		System.out.println("Even numbers greater than 30");
		for (int i : x) {
			if (p4.and(p5).test(i)) {
				System.out.println(i);
			}
		}
		// Output:
		// Even numbers greater than 30
		// 78
		// 62

		System.out.println("Even numbers or number greater than 30");
		for (int i : x) {
			if (p4.or(p5).test(i)) {
				System.out.println(i);
			}
		}
		// Output:
		// Even numbers or number greater than 30
		// 0
		// 10
		// 78
		// 35
		// 62

		System.out.println("Negate p4 i.e. get odd numbers");
		for (int i : x) {
			if (p4.negate().test(i)) {
				System.out.println(i);
			}
		}
		// Output:
		// Negate p4 i.e. get odd numbers
		// 15
		// 13
		// 35
	}
}

class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}