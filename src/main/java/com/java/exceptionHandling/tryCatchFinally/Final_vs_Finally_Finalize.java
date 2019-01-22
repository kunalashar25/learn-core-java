package com.java.exceptionHandling.tryCatchFinally;

public class Final_vs_Finally_Finalize
{
	/** final **/
	// 1. final is a modifier applicable for classes, method and variables.

	// 2. If a class is declared as final then we can't extend that class i.e. we can't create child class for that
	// class i.e. inheritance is not possible for final classes.

	// 3. If a method is final then we can't override that method in child class.

	// 4. If a variable is declared as final then we can't perform re-assignment for that variable.

	/** finally{ } **/
	// 1. It is a block always associated with try-catch to maintain cleanup code.

	// 2. The speciality of finally block is it'll be executed always irrespective of whether exception is raised or
	// not and whether handled or not handled.

	/** finalize() **/
	// 1. It is a method always invoked by garbage collector just before destroying an object to perform cleanup
	// activities.

	// 2. Once finalize() method completes immediately garbage collector destroys that object.

	// Note:
	// 1. finally block is responsible to perform cleanup activities related to try block i.e. whatever resources were
	// opened as a part of try block will be closed inside finally block.

	// 2. Whereas finalize() method is responsible to perform cleanup activities related to object i.e. whatever
	// resources associated with object will be deallocated before destroying an object by using finalize() method.
}
