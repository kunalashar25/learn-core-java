package com.java.lambdaExpressions.multiThreadingExample;

public class MultiThreadingBasicExample
{
	public static void main(String[] args)
	{
		Test t = new Test();
		Thread th = new Thread(t);
		th.start();
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Main Thread : " + i);
		}
	}
}

class Test implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Child Thread : " + i);
		}
	}
}

// Output: Output cannot be predicted in Multithreading as both thread will run simultaneously.
//Main Thread : 0
//Child Thread : 0
//Child Thread : 1
//Main Thread : 1
//Child Thread : 2
//Child Thread : 3
//Child Thread : 4
//Child Thread : 5
//Child Thread : 6
//Child Thread : 7
//Child Thread : 8
//Child Thread : 9
//Main Thread : 2
//Main Thread : 3
//Main Thread : 4
//Main Thread : 5
//Main Thread : 6
//Main Thread : 7
//Main Thread : 8
//Main Thread : 9
