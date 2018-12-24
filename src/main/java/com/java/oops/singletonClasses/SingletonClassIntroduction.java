package com.java.oops.singletonClasses;

public class SingletonClassIntroduction
{
	// 1. For any Java class if we're allowed to create only one object then such type of class is called Singleton
	// class.

	// Example: Runtime, BusinessDeligate, ServiceLocator, etc

	/** Advantage of Singleton Class **/
	// 1. If several people have same requirement then it is not recommended to create separate object for every
	// requirement.

	// 2. We have to create only one object and we can reuse same object for every similar requirement so that
	// performance and memory utilization will be improved.

	// 3. This is the central idea of Singleton classes.

	// Example: Only one runtime object is created and and r1,r2,r3 are referring to the same object.
	Runtime										r1	= Runtime.getRuntime();
	Runtime										r2	= Runtime.getRuntime();
	Runtime										r3	= Runtime.getRuntime();

	/** How to create Singleton Classes? **/

	// We can create our own singleton classes for this we have to use private constructor and private static
	// variable and public factory method.

	// Approach 1
	private static SingletonClassIntroduction	s1	= new SingletonClassIntroduction();

	private SingletonClassIntroduction()
	{

	}

	public static SingletonClassIntroduction getSingletonClass()
	{
		return s1;
	}

	// Note: Runtime class is internally implemented by using this approach.
}

// Approach 2
class Singleton
{
	private static Singleton s = null;

	private Singleton()
	{

	}

	public static Singleton getSingletonClass()
	{
		if (s == null)
		{
			s = new Singleton();
		}
		return s;
	}
}

// At any point of time for above class we can create only one object. Hence, above class is Singleton Class.

// Q: Class is not final but we're not allowed to create child classes. How is it possible?
// Ans: By declaring every constructor as private we can restrict child class creation.

class Parent
{
	private Parent()
	{

	}
}

class Child extends Parent
{
	// it is impossible to create child class for Parent class.
}