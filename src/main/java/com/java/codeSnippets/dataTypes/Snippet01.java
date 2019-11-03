package com.java.codeSnippets.dataTypes;

public class Snippet01 {
	public static void main(String[] args) {
		DataTypes d = new DataTypes();
		d.show();
	}
}

class DataTypes {
	boolean b1;
	byte b2;
	short s;
	int i;
	long l;
	float f;
	double d;
	String str;
	DataTypes dt;

	void show() {
		System.out.println(b1); // Output: false
		System.out.println(b2); // Output: 0
		System.out.println(s); // Output: 0
		System.out.println(i); // Output: 0
		System.out.println(l); // Output: 0
		System.out.println(f); // Output: 0.0
		System.out.println(d); // Output: 0.0
		System.out.println(str); // Output: null
		System.out.println(dt); // Output: null
	}

}

/**
 * Reasoning
 **/
// As all variables are declared at instance level, JVM will assign default values to all the instance variables.
