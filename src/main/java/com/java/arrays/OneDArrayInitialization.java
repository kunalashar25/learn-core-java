package com.java.arrays;

public class OneDArrayInitialization {

	public static void main(String[] args) {
		// once we create an array, every element is initialized with default
		// values i.e. 0
		int[] x = new int[3];

		System.out.println(x); // it return className @ hashCode in hexaDecimal
		// form. Output: [I@15db9742

		System.out.println(x[0]); // default value will be returned i.e. 0

		// whenever we're trying to print any reference variable internally
		// toString() method will be called which is implemented by default to
		// return the string in the following form: className @
		// hashCode in hexadecimal form.

		// once we create an array, every array element by default initialized
		// with 0. If we're not satisfied with default values then we can
		// override these values with our customized values.
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		// x[3] = 30; RE: java.lang.ArrayIndexOutOfBoundsException: 3
		// x[2.5] = 90; CE: cannot convert from double to int.

		// Note: if we're trying to access array element with out of range index
		// (+ or - int values) then we'll get runtime exception saying
		// ArrayIndexOutOfBoundsException
	}

}
