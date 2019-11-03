package com.java.literal;

public class DecimalLiteral {

	public static void main(String[] args) {
		// for integral data types we can have literal values in below types.
		// by default every integral literal is of int type but we can specify
		// explicitly as long type by suffixed with small or capital 'L'

		/** Decimal Literal - Base 10 */
		// any constant value which can be assigned to the variable is called
		// Literal. In this case 10 is a literal.

		int x = 10;
		System.out.println(x);

		/** Octal Form - Base 8 */
		// if number is preceded with 0 then it is considered as Octal form.
		// allowed digits 0-7

		int y = 010;
		System.out.println(y);

		/** Hexadecimal Form - Base 16 */
		// if number is preceded with 0x/0X then it is considered as Hexadecimal
		// form. Allowed digits 0-9 and a-f or A-F
		// java is not case sensitive in this case.

		int z = 0X1A;
		System.out.println(z);

		long q = 0X1AL;
		System.out.println(q);

		/** JAVA 1.7 Enhancements **/

		/** Binary Form **/
		// For integral data types until 1.6 v we can specify literal value in
		// following ways: decimal/octal/hexadecimal but from 1.7v onwards we
		// can specify literal value even in Binary form also. Allowed digits
		// are 0 and 1. Literal value should be prefixed with '0B' or '0b'.

		int b = 0B1111;
		System.out.println(b);

		/** usage of underscore symbol in numeric literals **/
		// from 1.7v onwards we can use underscore symbol between digits of
		// numeric literals. the main advantage of this approach is readability
		// of code will be improved.

		// This is applicable only for .java files,
		// during compilation java will automatically remove underscore symbol
		// and there will be no underscore symbol entry in .class file.

		// we can use more than 1 underscore symbol also between the digits

		double d = 123456.789;
		double d1 = 1_23_456.7_8_9;
		double d2 = 123_456.7_8_9;
		double d3 = 1__2___3_4____56.7_8_9;

		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);

		// we can use underscore symbol only between the digits. if used
		// anywhere else we'll get compile time error.

		/*
		 * double d = _123456.789; double d = 123456_.789; double d = 123456._789; double d = 123456.789_;
		 */

	}

}
