package com.java.oops.overriding;

public class OverridingRules
{

}

// 1. Method names and argument types must be same i.e. method signatures must be same.

// 2. In Overriding, return types must be same but this rule is applicable until 1.4v only. From 1.5v onwards, we
// can take covarient return types. According to this, child class method return type need not be same as parent
// method return type. Its child type also allowed.
class Parent1
{
	public Object mehtod1()
	{
		return null;
	}

	private void m1()
	{
		System.out.println("m1 from parent");
	}
}

class Child extends Parent1
{
	public String method1()
	{
		return null;
	}

	private void m1()
	{
		System.out.println("m1 from child");
	}
}

// 3. Covarient return type concept applicable only for Object types but not for primitive types.

// Consider below example:
/** Valid Examples **/

// Parent class return type: Object > Child class return type: Object or String or StringBuffer
// Parent class return type: Number > Child class return type: Number or Integer or Float
/** Invalid Examples **/
// Parent class return type: String > Child class return type: Object
// Parent class return type: double > Child class return type: int

// 4. Parent class private methods not available to the child and hence, overriding concept not applicable for private
// methods.

// 5. Based on our requirement, we can define exactly same private method in child class as defined in parent class. It
// is valid but not overriding parent class method.

// 6. We can't override parent class final method in child classes. If we're trying to override then we'll get compile
// time error.

// 7. Parent class abstract methods we should override in child class to provide implementation.

abstract class P
{
	public abstract void m1();
}

class C extends P
{
	public void m1()
	{
		System.out.println("abstract method m1 implementation");
	}
}

// 8. We can override non-abstract method as abstract. The main advantage of this approach is, we can stop the
// availability of parent method implementation to the next level child classes.

class A
{
	public void m1()
	{

	}
}

abstract class B extends A
{
	public abstract void m1();
}