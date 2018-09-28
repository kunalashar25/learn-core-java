package com.java.arrays;

public class LengthVariableVsLengthMethod
{
	/** length vs length() **/

	public static void main(String[] args)
	{
		/* ========= Array ========= */

		/** length **/
		// length is a final variable applicable for arrays. length variable
		// represents the size of the array.

		int[] x = new int[6];
		System.out.println(x.length); // Output: 6

		/** length() **/
		// System.out.println(x.length()); CE: cannot find symbol. Symbol:
		// method length() Location: class int[]

		String[] s1 = { "a", "aa", "aaa" };
		System.out.println(s1.length); // valid as it is referring to array
		// System.out.println(s1.length()); CE: cannot find symbol.
		// System.out.println(s1[0].length); CE: cannot find symbol.
		System.out.println(s1[0].length()); // valid as it is referring to
											// String

		/* ========= String ========= */

		/** length() **/
		String s = "abc";
		System.out.println(s.length()); // Output: 3
		// length() is a final method applicable for String objects. it returns
		// number of characters present in the string

		/** length **/
		// System.out.println(s.length); CE: cannot find symbol. Symbol:
		// variable length Location: class java.lang.String

		// Note: All methods present under final class are final in nature as we
		// cannot create child class of final class.

		// MultiDimensional array
		int[][] a = new int[6][3];
		System.out.println(a.length); // Output: 6
		// In multi-dimensional array length of variable represents only base
		// size i.e. 6 but not total size.

		// There is no direct way to find total length of multi-dimensional
		// array but indirectly we can find as follows:

		System.out.println(a[0].length + a[1].length + a[2].length + a[3].length);
	}

}
