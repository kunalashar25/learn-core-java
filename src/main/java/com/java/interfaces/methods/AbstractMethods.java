package com.java.interfaces.methods;

public interface AbstractMethods {
	// Every method present inside interface is always public and abstract whether we're declaring or not.

	void m1();

	// public: To make this method available to every implementation class.

	// abstract: Implementation class is responsible to provide implementation.

	// Hence, inside interface the following method declarations are equal/same:
	// void m1();
	// public void m1();
	// abstract void m1();
	// public abstract void m1();

	// As every interface method is always public and abstract, we can't declare interface method with the following
	// modifiers:
	// private
	// protected
	// static
	// final
	// synchronized
	// strictfp
	// native

	/** Which of the following method declarations are allowed inside interface? **/
	// 1. public void m1(){} >> Invalid

	// 2. private void m1(); >> Invalid

	// 3. protected void m1(); >> Invalid

	// 4. static void m1(); >> Invalid

	// 5. public abstract native void m1(); >> Invalid

	// 6. abstract public void m1(); >> Valid
}
