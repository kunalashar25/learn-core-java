package com.java.lambdaExpressions.anonymousInnerClass;

public class AnonymousInnerClassIntroduction
{
	// 1. An inner class without any name is called Anonymous Inner Class.

	// 2. Syntax: Thread t = new Thread() { // some code };
	// In this example, a class is created by extending Thread class i.e. a child class for Thread is created and object
	// t belongs to child class. This child class has no name. This type of class is known as Anonymous Inner Class.

	// Example for interface: // Runnable r = new Runnable() { // some code };
	// In this case, we're not creating interface object but instead we're creating an child class that implements
	// Runnable interface.

	public static void main(String[] args)
	{
		// anonymous inner class implementing Runnable interface. It is an object of interface implementation class.
		Runnable r = new Runnable() {
			public void run()
			{
				for (int i = 0; i < 10; i++)
				{
					System.out.println("Child Thread : " + i);
				}
			}
		};

		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 10; i++)
		{
			System.out.println("Parent Thread : " + i);
		}
	}
}

// Output:
// Parent Thread : 0
// Child Thread : 0
// Parent Thread : 1
// Parent Thread : 2
// Parent Thread : 3
// Parent Thread : 4
// Parent Thread : 5
// Parent Thread : 6
// Child Thread : 1
// Parent Thread : 7
// Child Thread : 2
// Parent Thread : 8
// Child Thread : 3
// Parent Thread : 9
// Child Thread : 4
// Child Thread : 5
// Child Thread : 6
// Child Thread : 7
// Child Thread : 8
// Child Thread : 9
