package com.java.oops.overriding;

public class OverrridingAccessModifiers
{

}

// 1. In overriding the following modifiers won't keep any restrictions: synchronized, native, strictfp

/** Valid Examples **/
// parent method: non-final > child method: final
// parent method: abstract > child method: non-abstract
// parent method: synchronized > child method: non-synchronized
// parent method: native > child method: non-native
// parent method: strictfp > child method: non-strictfp

/** Invalid Examples **/
// parent method: final > child method: non-final/final

// 2. While overriding we can't reduce scope of access modifier but we can increase the scope.
class P1
{
	public void m1()
	{

	}
}

class C1 extends P1
{
	/*
	 * void m1() { }
	 */

	// CE: m1() in C1 cannot override m1() in P1; attempting to assign weaker access privileges; was public
}