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
