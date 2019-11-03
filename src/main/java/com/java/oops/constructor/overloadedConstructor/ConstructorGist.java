package com.java.oops.constructor.overloadedConstructor;

public class ConstructorGist {
	/** Which of the following is valid? **/

	// 1. The main purpose of constructor is to create an object?
	// Ans: Invalid (to initialize an object)

	// 2. The main purpose of constructor is to perform initialization of an object?
	// Ans: Valid

	// 3. The name of the constructor need not be same as class name?
	// Ans: Invalid (must be same)

	// 4. Return type concept applicable for constructors but only void?
	// Ans: Invalid (it doesn't have any return type)

	// 5. We can apply any modifier for constructor?
	// Ans: Invalid (only public, private, default and protected)

	// 6. Default constructor generated by JVM?
	// Ans: Invalid (created by compiler)

	// 7. Compiler is responsible to generate default constructor?
	// Ans: Valid

	// 8. Compiler will always generate default constructor?
	// Ans: Invalid (only when no constructor are written by user)

	// 9. If we're not writing no-arg constructor then compiler will generate default constructor?
	// Ans: Invalid (only when no constructor are written by user)

	// 10. Every no-arg constructor is always default constructor?
	// Ans: Invalid (Only compiler generated constructor is called default constructor)

	// 11. Default constructor is always no-arg constructor?
	// Ans: Valid

	// 12. The first line inside every constructor should be either super() or this(). if we're not writing anything
	// then compiler will generate this()?
	// Ans: Inalid (it'll generate super()).

	// 13. For constructors both overloading and overriding concepts are applicable?
	// Ans: Invalid (only overloading applicable)

	// 14. For constructors, inheritance concept applicable but not overriding?
	// Ans: Invalid

	// 15. Only concrete classes can contain constructor but abstract classes cannot?
	// Ans: Invalid

	// 16. Interface can contain constructors?
	// Ans: Invalid

	// 17. Recursive constructor invocation is a runtime exception?
	// Ans: Invalid (it's compile time error)

	// 18. If parent class constructor throws checked exception then compulsory child class constructor should throw the
	// same checked exception or its child?
	// Ans: Invalid (should throw its parent)
}
