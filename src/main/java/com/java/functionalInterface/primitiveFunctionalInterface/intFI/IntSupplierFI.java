package com.java.functionalInterface.primitiveFunctionalInterface.intFI;

import java.util.function.IntSupplier;

public class IntSupplierFI
{
	// represent supplier of int values.
	
	public static void main(String[] args)
	{
	    IntSupplier i = ()-> Integer.MAX_VALUE;
	    
	    System.out.println(i.getAsInt()); // Output: 2147483647
	}
}
