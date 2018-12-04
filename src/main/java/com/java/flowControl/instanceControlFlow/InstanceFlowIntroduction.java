package com.java.flowControl.instanceControlFlow;

public class InstanceFlowIntroduction
{
	// 1. When we are executing a java class, first static control flow will be executed.

	// 2. In static control flow, if we are creating an object the following sequence of events will be executed as a
	// part of instance control flow:
	// i. Identification of instance members from top to bottom.
	// ii. Execution of instance variable assignments and instance blocks from top to bottom.
	// iii. Execution of constructor.

	int i = 10;

	{
		m1();
		System.out.println("First Instance Block");
	}

	public InstanceFlowIntroduction()
	{
		System.out.println("Constructor");
	}

	public static void main(String[] args)
	{
		InstanceFlowIntroduction i = new InstanceFlowIntroduction();

		System.out.println("Main");
		InstanceFlowIntroduction i2 = new InstanceFlowIntroduction();
	}

	public void m1()
	{
		System.out.println(j);
	}

	{
		System.out.println("Second Instance Block");
	}

	int j = 20;
}

// Output:
// 0
// First Instance Block
// Second Instance Block
// Constructor
// Main

// Note:

// 1. If we comment InstanceFlowIntroduction i = new InstanceFlowIntroduction(); then output is only Main

// 2. static control flow is one time activity which will be performed at the time of class loading but instance
// control flow is not one time activity and it'll be performed for every object creation.

// 3. Object creation is the most costly operation. If there is no specific requirement then it is not recommended to
// create object.

// Note: Goto Video #62 (21:55) and add step wise image under conceptImages package.