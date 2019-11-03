package com.java.oops.inheritance;

public class HasARelationship {
	// 1. Has-A Relationship is also known as Composition or Aggregation.

	// 2. There is not specific keyword to implement Has-A relation but most of the times we're dependent on new
	// keyword.

	// 3. The main advantage of Has-A relationship is reusability of the code.
}

// Example
class Car {
	public static void main(String[] args) {
		Engine e = new Engine();
		// Class car Has-A Engine reference.
	}
}

class Engine {

}

/**
 * Difference between Composition and Aggregation  Is-A vs Has-A
 **/
// 1. Without existing container object, if there is no chance of existing contained objects then container and
// contained objects are strongly associated and this strong association is nothing but composition.

// Example: University consist of several departments, without existing university there is no change of existing
// department. Hence, university and departments are strongly associated and this strong association is nothing but
// composition.

// 2. Without existing container object, if there is a chance of existing contained objects then container and contained
// objects are weakly associated and this weak association is nothing but aggregation.

// Example: Department consist of several professors, without existing department there may be a chance of existing
// professor objects. Hence, department and professor objects are weakly associated and this weak association is nothing
// but aggregation.

// Note:
// 1. In Composition, objects are strongly associated whereas in aggregation, objects are weakly associated.

// 2. In Composition, container object holds directly contained objects whereas in aggregation, container object holds
// just references of contained objects.

/** Is-A vs Has-A **/
// 1. If we want total functionality of a class automatically then we should go for Is-A relationship.
// Example: Complete functionality of class Person is required in class Student.

// 2. If we want part of the functionality then we should go for Has-A relationship.
// Example 100 methods are present in class Test but only few methods are in another class then go for Has-A
// relationship.