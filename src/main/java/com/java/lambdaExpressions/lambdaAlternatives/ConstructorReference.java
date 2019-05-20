package com.java.lambdaExpressions.lambdaAlternatives;

public class ConstructorReference
{
	// 1.

	public static void main(String[] args)
	{
		Interf2 i = Sample::new; // Syntax: className::new to refer class constructor
		Sample s1 = i.get(); // Output: Sample Object created.

		Interf3 i2 = Sample::new;
		i2.get("Hello"); // Output: Sample Object created with string: Hello
	}
}

interface Interf2
{
	public Sample get(); // get() methods refers to constructor of Sample class.
}

interface Interf3
{
	public Sample get(String s);
}

class Sample
{
	public Sample()
	{
		System.out.println("Sample Object created.");
	}

	public Sample(String s)
	{
		System.out.println("Sample Object created with string: " + s);
	}
}
