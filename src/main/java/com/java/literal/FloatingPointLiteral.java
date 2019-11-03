package com.java.literal;

public class FloatingPointLiteral {

	public static void main(String[] args) {
		// by default floating point literal is of double type. Hence, we can't
		// assign directly to the float variable but we can specify floating
		// point literal as float type by suffixed with small or capital 'F'.

		// float f = 123.456; compile time error: Found double Required float

		float f = 123.456F;
		System.out.println(f);

		double d = 123.456;
		System.out.println(d);

		// we can specify floating point literals only in decimal form and we
		// can't specify in octal and hexadecimal forms

		// we can assign integral literal directly to floating point variables
		// under that integral literal can be specific either in
		// decimal/octal/hexadecimal forms.

		// double d = 0786; CE: Integer number too large.

		double d1 = 0XFace; // valid

		double d2 = 0786.0; // valid

		// double d = 0XFace.0; CE: Invalid hex literal number.

		// int a = 10.0; CE: possible loss of precision
		// we can't assign floating point literals to integral types

		// we can specify floating point literal even in exponential form
		// (scientific notation)
		double d3 = 1.2e3;
		System.out.println(d3);

		// float f1 = 1.2e3; CE: possible loss of precision Found double
		// Required float.

		float f1 = 1.2e3f; // valid

	}

}
