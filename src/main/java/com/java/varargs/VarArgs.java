package com.java.varargs;

public class VarArgs
{
	public static void main(String[] args)
	{
		// var-args methods: Variable number of arguments methods.

		// Until v1.4, we can't declare a method with variable number of arguments. If there is a change in number of
		// arguments compulsory we should go for new method. It increases length of the code and reduces readability.

		// To overcome this problem, SUN people introduced var-args methods in v1.5. According to this, we can declare a
		// method which can take variable number of arguments, such types of methods are called var-arg methods.

		// We can declare a var-arg method as below

		// We can call this method by calling any number of int values including zero number of arguments.
		VarArgs v = new VarArgs();
		v.m1();
		v.m1(8);
		v.m1(1, 2, 3);
		v.m1(15, 99, 82, 73, 55);

		// Internally var-arg parameter will be converted into 1D array. Hence, within var-arg method we can
		// differentiate values by using index.
	}

	// method declaration
	// exactly three dots has to be provided and has to be kept together else we'll get compile time error.
	void m1(int... x)
	{
		int c = 0;
		for (int a : x)
		{
			c = c + a;
		}
		System.out.println("Number of args: " + x.length);
		System.out.println("Total sum: " + c);
	}

	/** Loop Holes **/
	// Case 1: Which of following are var-arg method declaration are valid?
	void a(int... a) // Valid
	{
	}

	void b(int... b) // Valid
	{
	}

	void c(int... c) // Valid
	{
	}
	// void d(int d...){} >> invalid
	// void e(int. ..e){} >> invalid
	// void f(int .f..){} >> invalid

	// Note: Three dots should be together and before variable.

	// Case 2: We can mix var-arg parameter with normal parameter
	void d(int a, int... x)
	{

	}

	void e(String str, double... d)
	{

	}

	// Case 3: If we mix normal parameter with var-arg parameter then var-arg parameter should be last parameter.
	// void f(double... d, String s){} CE: The variable argument type double of the method f must be the last parameter

	// Case 4: Inside var-arg method, we can take only one var-arg parameter and we can't take more than one var-arg
	// parameter
	// void g(int... a, double... d){}

	// Case 5: Inside a class, we can't declare var-arg method and corresponding 1D array method simultaneously
	// otherwise
	// we'll get compile time error.

	// void m1(int[] x){} CE: Cannout declare both m1(int[]) and m1(int...) in VarArgs

	// Case 6: In general, var-arg method will get least priority i.e. if no other method matched then only var-arg
	// method
	// will get the chance. It is exactly same as default case inside Switch.
	// Refer: VarArgs_Case6_Example.java for code
}
