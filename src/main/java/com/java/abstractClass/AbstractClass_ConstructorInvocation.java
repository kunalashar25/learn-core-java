package com.java.abstractClass;

public class AbstractClass_ConstructorInvocation extends AbstractClass1
{
	public AbstractClass_ConstructorInvocation()
	{
		System.out.println(this.hashCode()); // Output: 366712642
	}

	public static void main(String[] args)
	{
		AbstractClass_ConstructorInvocation c = new AbstractClass_ConstructorInvocation();
	}
}

abstract class AbstractClass1
{
	public AbstractClass1()
	{
		System.out.println(this.hashCode()); // Output: 366712642
	}
}

// Hashcode of Parent and Child class is same i.e. only one object is created i.e. child object. Parent class
// constructor is invoked w.r.t child class reference using this.hashCode().

// Q. Inside interface every method is always abstract and we can take only abstract method in abstract class also then
// what is the difference between interface and abstract class i.e. is it possible to replace interface with abstract
// class?

// Ans. We can replace interface with abstract class but it is not a good programming practice. if everything is
// abstract
// then it is highly recommended to go for interface.

// Case 1: if we write it using abstract class:
abstract class X
{

}

class Test extends X
{
	public static void main(String[] args)
	{
		Test t = new Test();
	}
}

// We cannot extend any other class while extending abstract class and hence we canno't have benefit of inheritance.
// Object creation will take time as it'll execute child and parent class constructor as well.

// Case 2: if we write it using interface:

interface A1
{

}

class B implements A1
{
	public static void main(String[] args)
	{
		B b = new B();
	}
}

// We can extend/implement more than one class/interface. hence, inheritance benefit is possible in this case.
// Object creation won't take much time as only single constructor will be invoked.
