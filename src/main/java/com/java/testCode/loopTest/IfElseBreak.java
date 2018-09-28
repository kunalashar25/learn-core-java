package com.java.testCode.loopTest;

public class IfElseBreak
{

	public static void main(String[] args)
	{
		String demo[] = { "Released", "leased", "leased", "leased", "leased" };

		for (int i = 0; i <= 4; i++)
		{
			if (demo[i].equalsIgnoreCase("Released"))
			{
				System.out.println("breaking");
				// break;
			}
			else
			{

				System.out.println("printing");
			}
		}
	}
}
