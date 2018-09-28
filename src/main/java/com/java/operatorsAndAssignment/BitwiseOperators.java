package com.java.operatorsAndAssignment;

public class BitwiseOperators
{
	// Symbol: &,|,^
	// & = AND Returns true if both args are true
	// | = OR Returns true if atleast one arg is true
	// ^ = X-OR (Exclusive OR) Returns true

	public static void main(String[] args)
	{
		/** Applicable for both boolean and integral types **/

		System.out.println(true & false); // Output: false
		System.out.println(true | false); // Output: true
		System.out.println(true ^ false); // Output: true

		/** We can apply this operators for integral types as well **/

		System.out.println(4 & 5); // Output: 4 (4 -> 100, 5-> 101) if we compare bitwise then output will be 100 i.e. 4
		System.out.println(4 | 5); // Output: 5 (4 -> 100, 5-> 101) if we compare bitwise then output will be 101 i.e. 5
		System.out.println(4 ^ 5); // Output: 1 (4 -> 100, 5-> 101) if we compare bitwise then output will be 001 i.e. 1
	}

}
