package com.java.interfaces;

//1. Adapter class is a simple Java class that implements an interface with only empty implementation. As all method 
// implementation are empty, this class is of no use to the programmer and hence we should restrict programmer to create object of this
// class. This can be achieved by declaring class as abstract.

interface ListMethods
{
	public void method1();

	public void method2();

	public void method3();
}

public abstract class AdapterClass implements ListMethods
{
	public void method1()
	{

	}

	public void method2()
	{

	}

	public void method3()
	{

	}
}

// 2. If we implement an interface, for and every method of that interface, compulsory we should provide implementation
// whether it is required or not. The problem in this approach is it increases length of the code and reduces
// readability. We can solve this problem by using adapter classes

class Test implements ListMethods
{
	public void method1()
	{
		System.out.println("This is method1 from Test Class");
	}

	public void method2()
	{

	}

	public void method3()
	{

	}
}

// 3. Instead of implementing interface, if we extend adapter class, we have to provide implementation only for required
// methods and we're not responsible to provide implementation for each and every method of that interface so that
// length of the code will be reduced.
class Impl1 extends AdapterClass
{
	public void method3()
	{
		System.out.println("This is method 3");
	}
}

class Impl2 extends AdapterClass
{
	public void method2()
	{
		System.out.println("This is method 2");
	}
}

// Example:
// We can develop a sevlet in 3 ways
// 1. By implementing Servlet interface.
// 2. By extending GenericServlet
// 3. By extending HttpServlet.

// If we implement Servlet interface for each and every method of that interface, we should provide implementation. It
// increases length of the code and reduces readability.

// Instead of implementing, Servlet interface directly, if we extend GenericServlet, we have to provide implementation
// only for service method and for all remaining methods we're not required to provide implementation. Hence, more or
// less GenericServlet acts as adapter class for servlet interface.

// Note: Marker Interface and Adapter Classes simplifies complexity of programming and these are best utilities to the
// programmer and programmers life will be simplified.
