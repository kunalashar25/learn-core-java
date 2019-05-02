package com.java.lambdaExpressions;

public class MultiThreadingWithLambdaExpression
{
	public static void main(String[] args)
	{
		Runnable r = () ->
		{
			for (int i = 0; i < 10; i++)
			{
				System.out.println("Child Thread : " + i);
			}
		};

		Thread th = new Thread(r);
		th.start();
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Main Thread : " + i);
		}
	}
}
// Output:
//Main Thread : 0
//Child Thread : 0
//Child Thread : 1
//Child Thread : 2
//Child Thread : 3
//Child Thread : 4
//Child Thread : 5
//Main Thread : 1
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