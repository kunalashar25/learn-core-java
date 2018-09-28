package com.java.operatorsAndAssignment;

public class BitwiseComplimentOperator
{
	// Symbol: ~
	public static void main(String[] args)
	{

		/** Applicable only for integral and not for boolean type **/

		// We can apply this operator only for integral types but not for boolean type, if we're trying to apply for
		// boolean type then we'll get compile time error.

		// Example:
		// System.out.println(~true); CE: The operator ~ is undefined for the argument type(s) boolean

		System.out.println(~4); // Output: -5

		// Note: 4 is of int type and int size is 4bytes i.e. 32 bit. So 4 will be represented in 32 bits with first
		// being indicating sign i.e. + or -. Positive sign is indicated by 0 and Negative by 1. Rest all bits will
		// represent number. Positive numbers will be represented directly in the memory whereas negative numbers will
		// be represented indirectly in the memory in 2's compliment form

		// 4 = 00000000000000000000000000000100
		// ~4 = 11111111111111111111111111111011

		// After 1st compliment ~4 will become 00000000000000000000000000000100
		// For 2's compliment add one to the last bit, so it will become 00000000000000000000000000000101 i.e. 5
		// Hence answer of ~4 is -5.
	}

}
