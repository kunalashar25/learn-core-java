package com.java.accessModifiers.staticPack;

public class Instance_vs_Static_Method {
	// 1. Inside method implementation, if we're using at-least one instance variable then that method talks about a
	// particular object. Hence, we should declare method as instance method.

	// 2. Inside method implementation, if we're not using any instance variable then this method is not related to a
	// particular object. Hence, we have to declare such type of method as static method irrespective of whether we're
	// using static variables or not.

	String name;
	int rollNo;
	int marks;
	static String collegeName;

	// 1. We're using at-least one instance variables. Hence this method will be instance method.
	public String getStudentInfo() {
		return name + " " + rollNo;
	}

	// 2. No instance variable is used. Hence this method will be static method.
	public static String getCollegeInfo() {
		return collegeName;
	}

	// 3. No instance variable is used. Hence this method will be static method.
	public static int getAverage(int x, int y) {
		return (x + y) / 2;
	}

	// 4. We're using at-least one instance variables. Hence this method will be instance method.
	public String getCompleteInfo() {
		return name + " " + rollNo + " " + marks + " " + collegeName;
	}

	// For static method implementation should be available where as for abstract methods implementation is not
	// available. Hence, abstract static combination is illegal for methods.
}
