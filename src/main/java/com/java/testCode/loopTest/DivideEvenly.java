package com.java.testCode.loopTest;

public class DivideEvenly
{

	public static void main(String[] args)
	{
		float i = 10;
		int split = 14;
		float sum = 0;
		float[] j = new float[split];

		for (int k = 1; k <= split; k++)
		{

			if (k == split)
			{
				j[k - 1] = i - sum;
			}
			else
			{
				j[k - 1] = i / split;
				sum = sum + j[k - 1];
			}

			System.out.println("j[" + (k - 1) + "] = " + j[k - 1]);
		}

	}

}
