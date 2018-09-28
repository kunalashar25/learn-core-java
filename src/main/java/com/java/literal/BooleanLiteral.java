package com.java.literal;

public class BooleanLiteral
{

	public static void main(String[] args)
	{
		// only allowed values for boolean DataTypes are true and false.

		boolean a = true; // valid

		// boolean b = 0; CE: Incompatible types: Found int Required boolean;

		// boolean b = True; CE: Cannot find symbol variable True.

		// boolean b = "true"; CE: Incompatible types: Found java.lang.String
		// Required boolean

		int x = 0;

		// CE: Incompatible types
		/*
		 * if(x) { System.out.println("hello"); }
		 * 
		 * while (x) { System.out.println("hello"); }
		 */
	}

}
