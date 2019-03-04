package com.java.exceptionHandling.tryCatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources
{
	// 1. Until 1.6v it is highly recommended to write finally block to close resources which are open as a part of try
	// block.
	public void m1()
	{

		BufferedReader br = null;

		try
		{
			br = new BufferedReader(new FileReader("input.txt"));
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
		finally
		{
			if (br != null)
			{
				try
				{
					br.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	// 2. The problem in this approach are:
	// i. Compulsory programmer is required to close the resources inside finally block.It increases complexity of
	// programming.
	// ii. We have to write finally block and hence it is increases length of the code and reduces readability.

	// 3. To overcome above problems SUN introduced try with resources in 1.7v

	// 4. The main advantage of try with resources is whatever resources we've opened as a part of try block will be
	// closed automatically once control reaches end of try block either normally or abnormally and hence, we're not
	// required to close explicitly. We're not required to write finally block.

	public void m2()
	{
		// try with single resource
		try (BufferedReader br = new BufferedReader(new FileReader("input.txt")))
		{

		} // br will be automatically closed here
		catch (Exception e)
		{

		}
	}

	/** Conclusions **/
	// 1. We can declare multiple resources in try but these resources should be separated with semicolon.
	// Syntax: try(R1;R2;R3)

	// 2. All Resources should be auto closable resources.

	// 3. A resource is said to be auto closable if and only if corresponding class implements java.lang.AutoClosable
	// interface.

	// 4. All IO related resources, DB related resources and network related resources are already implement
	// auto closable interface.

	// 5. AutoClosable interface came in java 1.7v and it contains only one method i.e. close().

	// 6. All Resource reference variables are implicitly final and hence within the try block we can't perform
	// reassignment otherwise we'll get compile time error.

	public void m3()
	{
		// try with single resource
		try (BufferedReader br = new BufferedReader(new FileReader("input.txt")))
		{
			br = new BufferedReader(new FileReader("output.txt")); // CE: auto-closable resource br may not be assigned
		} // br will be automatically closed here
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
