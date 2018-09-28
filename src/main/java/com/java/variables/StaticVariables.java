package com.java.variables;

public class StaticVariables
{

	static int		x	= 10;
	int				y	= 20;
	static int		i;
	static double	d;
	static boolean	b;

	public static void main(String[] args)
	{
		// if the value of a variable is not varied from object to object then it is not
		// recommended to declare variable as instance variable, we have to declare such
		// type of variable at class level by using static modifier.

		// In case of instance variables, for every object a separate copy will be
		// created but in the case of static variables, a single copy will be created at
		// class level and shared by every object of the class.

		// static variables should be declared within the class directly but outside of
		// any method/block/constructor.

		// static variables will be created at the time of class loading and destroyed
		// at the time of class unloading. Hence, scope of static variable is exactly
		// same as scope of that class file.
		// Refer: Class_Loading_Unloading_Steps from notes package

		// static variables will be stored in method area.

		// We can access static variables either by object reference or class name but
		// recommended to use class name.
		StaticVariables sv = new StaticVariables();
		System.out.println("Object Reference" + sv.x); // object reference: valid
		System.out.println("Class Reference: " + StaticVariables.x); // class name: valid.

		// Within the same class, it's not required to use class name and we can access
		// it directly.
		System.out.println("Without class name: " + x);

		// We can access static variables directly from both, instance and static areas.
		sv.instanceAreaMethod();

		// For static variables, JVM will provide default values and we're not required
		// to perform initialization explicitly.
		System.out.println(i); // Output: 0
		System.out.println(d); // Output: 0.0
		System.out.println(b); // Output: false

		// static variables also known as class level variables or fields.

		// Changing values of static variable
		StaticVariables s1 = new StaticVariables();
		s1.x = 100;
		s1.y = 50;

		StaticVariables s2 = new StaticVariables();
		System.out.println("s2.x=" + s2.x + " s2.y=" + s2.y); // Output: s2.x=100 s2.y=20
	}

	public void instanceAreaMethod()
	{
		System.out.println("Instance area: " + x);
	}

}
