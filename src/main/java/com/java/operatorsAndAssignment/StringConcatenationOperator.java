package com.java.operatorsAndAssignment;

public class StringConcatenationOperator // (+)
{
	public static void main(String[] args)
	{
		// The only overloaded operator in java is + operator. Sometime it acts as Arithmetic Operator and Sometime it
		// acts as String Concatenation Operator.

		System.out.println(10 + 20); // Output: 30
		System.out.println("ab" + "cd"); // Output: abcd

		// If atleast one argument is String type then + operator acts as Concatenation operator and if both arguments
		// are number type then + Operator acts as Arithmetic Addition Operator.

		// Examples:
		String a = "MyLab";
		int b = 10, c = 20, d = 30;
		System.out.println(a + b + c + d); // Output: MyLab102030
		// Initially a + b is evaluated and result will be MyLab10 + c + d.

		System.out.println(b + c + d + a); // Output: 60MyLab
		// Initially b + c is evaluated and result will be 30 + d + a.

		System.out.println(b + c + a + d); // Output: 30MyLab30
		System.out.println(b + a + c + d); // Output: 10MyLab2030

		// Consider the following declarations:

		// a = b + c + d; CE: Incompatible Types. Found: int Required: java.lang.String
		a = a + b + c;
		System.out.println(a); // Output: MyLab1020

		// b = a + c + d; CE: Incompatible Types. Found: java.lang.String Required: int
		b = b + c + d;
		System.out.println(b); // Output: 60
	}
}
