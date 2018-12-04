package com.java.flowControl.instanceControlFlow;

public class InstanceControlFlow_ParentToChild
{
	int i = 10;

	{
		m1();
		System.out.println("Parent Instance");
	}

	public InstanceControlFlow_ParentToChild()
	{
		System.out.println("Parent Constructor");
	}

	public static void main(String[] args)
	{
		InstanceControlFlow_ParentToChild i = new InstanceControlFlow_ParentToChild();
		System.out.println("Parent Main");
	}

	public void m1()
	{
		System.out.println(j);
	}

	int j = 20;
}

class Child extends InstanceControlFlow_ParentToChild
{
	int x = 100;

	{
		m2();
		System.out.println("Child First Instance");
	}

	public Child()
	{
		System.out.println("Child Constructor");
	}

	public static void main(String[] args)
	{
		Child c = new Child();
		System.out.println("Child Main");
	}

	public void m2()
	{
		System.out.println(y);
	}

	{
		System.out.println("Child Second Instance");
	}

	int y = 200;
}

// Whenever we're creating child class object the following sequence of events will be performed automatically as a part
// of instance control flow:

// 1. Identification of instance members from Parent to Child.
// 2. Execution of instance variable assignments and instance blocks only in parent class.
// 3. Execution of parent constructor.
// 4. Execution of instance variable assignments and instance blocks in child class.
// 5. Execution of child constructor.

// Output:
// 0
// Parent Instance
// Parent Constructor
// 0
// Child First Instance
// Child Second Instance
// Child Constructor
// Child Main

// Note: Goto Video #62 (1:00:02) and add step wise image under conceptImages package.