package com.java.oops.dataHiding;

public class DataHidingIntroduction
{

	// 1. Outside person can't access our internal data directly or our internal data should not go out directly, this
	// oops feature is called as Data Hiding.

	// 2. After validation or authentication outside person can access our internal data.

	// Example 1: After providing proper username and password, we can access our gmail information.

	// Example 2: Even though we're valid customer of the bank, we can access our account information and we can't
	// access others information.

	// 3. By declaring data member (variables) as private, we can achieve data hiding.

	// Example:
	private double balance;

	public double getBalance()
	{
		// Validation code to validate user
		return balance;
	}

	// 4. The main advantage of data hiding is Security.

	// Note: It is highly recommended to declare data member (variables) as private.

}
