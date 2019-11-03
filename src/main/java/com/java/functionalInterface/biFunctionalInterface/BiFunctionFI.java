package com.java.functionalInterface.biFunctionalInterface;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionFI {
	public static void main(String[] args) {
		// Example 1
		BiFunction<Integer, String, Employee> f1 = (no, name) -> new Employee(no, name);

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(f1.apply(100, "ABC"));
		list.add(f1.apply(101, "PQR"));
		list.add(f1.apply(102, "LMN"));
		list.add(f1.apply(103, "XYZ"));

		for (Employee e : list) {
			System.out.println("Number : " + e.number + " | Name : " + e.name);
		}
		// Output:
		// Number : 100 | Name : ABC
		// Number : 101 | Name : PQR
		// Number : 102 | Name : LMN
		// Number : 103 | Name : XYZ

	}
}

class Employee {
	int number;
	String name;

	public Employee(int number, String name) {
		this.number = number;
		this.name = name;
	}
}
