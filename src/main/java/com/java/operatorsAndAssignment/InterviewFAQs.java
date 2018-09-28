package com.java.operatorsAndAssignment;

public class InterviewFAQs
{
	public InterviewFAQs()
	{
		// TODO Auto-generated constructor stub
	}

	public InterviewFAQs(int number)
	{
		System.out.println(number);
	}

	public InterviewFAQs(String text)
	{
		System.out.println(text);
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		/** new v/s newIstance() **/
		// We can use new operator to create an object if we know class name at the beginning,

		// Example
		InterviewFAQs i = new InterviewFAQs();
		NewOperator no = new NewOperator();

		// newInstance() is a method present in class Class

		// We can use newInstance() to create object if we don't know class name at the beginning and it's available
		// dynamically at runtime

		String[] args1 = new String[] { "InterviewFAQs", "Customer" };

		// Object o = Class.forName(args1[0]).newInstance();
		// System.out.println("Object Created for " + o.getClass().getName());

		// In case of new operator, based on our requirement we can invoke any constructor.

		// Example
		InterviewFAQs faq1 = new InterviewFAQs();
		InterviewFAQs faq2 = new InterviewFAQs(10);
		InterviewFAQs faq3 = new InterviewFAQs("java");

		// But newInstance() method internally calls no argument constructor. Hence, to use newInstance() method
		// compulsory corresponding class should contain no argument constructor, Otherwise we'll get runtime exception
		// saying, InstantiationException

		// While using new operator at runtime if corresponding class file is not available then we'll get runtime
		// exception saying, NoClassDefFoundError : ClassName

		// Example
		InterviewFAQs faq4 = new InterviewFAQs();

		// At runtime if InterviewFAQs.class file is not available then we'll get runtime exception saying
		// NoClassDefFoundError : ClassName, which is unchecked exception

		// While using newInstance() method at runtime if the corresponding .class file is not available then we'll get
		// runtime exception saying, ClassNotFoundException: ClassName, which is checked exception

		// Example
		// Object o1 = Class.forName(args1[0]).newInstance();

		// Differences between new and newInstance. Refer: newOperatorVsnewInstanceMethod.png

		/** ClassNotFoundException v/s NoClassDefFoundError **/

		// For hard-coded class names, at runtime if the corresponding .class file is not available then we'll get
		// runtime exception saying NoClassDefFoundError, which is unchecked exception.

		// For dynamically provided class names, at runtime if the corresponding .class file is not available then we'll
		// get runtime exception saying, ClassNotFoundException: ClassName, which is checked exception

		/** instanceof v/s isInstance() **/

		// instanceof is an operator in java, we can use instanceof to check whether the given object is of particular
		// type or not and we know the type at the beginning.

		// Example:
		Thread t = new Thread();
		System.out.println(t instanceof Runnable); // Output: true
		System.out.println(t instanceof Object); // Output: true

		// isInstance() method is present in java.lang.Class. We can use this method to check whether the given object
		// is of particular type of not and we don't know the type at the beginning and it is available dynamically at
		// run time.

		String[] args2 = new String[] { "Runnable", "String" };
		System.out.println(Class.forName(args2[0]).isInstance(t)); // Output: true
		System.out.println(Class.forName(args2[1]).isInstance(t)); // Output: false

		// isInstance() method is a method equivalent of instanceof operator,
	}
}