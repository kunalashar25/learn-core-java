package com.java.testCode.loopTest;

public class SplitCount
{

	public static void main(String[] args)
	{
		int split = 5;

		int quan = 10;

		for (int i = 1; i <= split; i++)
		{

			if (split == 1)
			{
				System.out.println(quan);
			}
			else if (i < split)
			{
				System.out.println(1);
			}
			else if (i == split)
			{
				System.out.println(quan - split);
			}
		}
	}
}
