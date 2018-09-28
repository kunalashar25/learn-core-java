package com.java.interfaces.namingConflicts;

public interface VariableNamingConflicts
{

}

// Two interfaces can contain a variable with a same name and there may be a chance of variable naming conflicts but we
// can solve this problem by using interface names.

interface Left
{
	int a = 10;
}

interface Right
{
	int a = 20;
}

class varaible implements Left, Right
{
	public static void main(String[] args)
	{
		// System.out.println(a); CE: reference to a is ambiguous
		System.out.println(Left.a); // Output: 10
		System.out.println(Right.a); // Output: 20
	}
}
