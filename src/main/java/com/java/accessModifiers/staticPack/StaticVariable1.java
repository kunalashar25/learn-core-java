package com.java.accessModifiers.staticPack;

public class StaticVariable1
{
	// 1. Static is a modifier applicable for methods and variables but not for classes.

	// 2. We can't declare top level class with static modifier but we can declare inner class as static (such type of
	// inner classes are called static nested classes).

	// 3. In the case of instance variables, for every object a separate copy will be created but in the case of static
	// variables a single copy will be created at class level and shared by every object of that class.

	static int	x	= 10;
	int			y	= 20;

	public static void main(String[] args)
	{
		StaticVariable1 s1 = new StaticVariable1();
		s1.x = 100;
		s1.y = 200;

		StaticVariable1 s2 = new StaticVariable1();
		System.out.println(s2.x + "  " + s2.y); // Output: 100 20
	}

	// 4. We can't access instance members directly from static area but we can access them from instance area directly.
	// We can access static members from both instance and static area directly.

	int			a	= 10;
	static int	b	= 20;

	public void m1()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void m2()
	{
		// System.out.println(a); // CE: non static variable a cannot be referenced from a static context
		System.out.println(b);
	}

	// Consider the following declarations:
	// 1. int x = 10;
	// 2. static int x = 10;
	// 3. public void m1() {System.out.println(x);}
	// 4. public static void m1() {System.out.println(x);}

	// Within the same class, which of the declaration we can take simultaneously:
	// A. 1 and 3 >> Valid
	// B. 1 and 4 >> Invalid (CE: non static variable a cannot be referenced from a static context)
	// C. 2 and 3 >> Valid
	// D. 2 and 4 >> Valid

	// Note:
	// 1. We cannot have instance and static variable with same name else we'll get compile time error as variable x is
	// already defined in class StaticVariable1

	// 2. We cannot have instance and static method with same name else we'll get compile time error as m1() is already
	// defined in class StaticVariable1

}
