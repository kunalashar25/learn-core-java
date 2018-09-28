package com.java.operatorsAndAssignment;

public class NewOperator
{
	public NewOperator()
	{
		System.out.println("NewOperator constructor called");
	}

	public static void main(String[] args)
	{
		// New Operator is used to create a object.

		// Constructor of NewOperator class will be called as soon as it encounters new keyword.

		// Purpose of constructor is to perform initialization of an Object and not to create an Object.

		NewOperator no = new NewOperator(); // Output: NewOperator constructor called

		// In Java, we have only new keyword but not delete keyword because destruction of useless objects is
		// responsibility of Garbage Collector.

	}

}
