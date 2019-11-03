package com.java.interfaces;

public interface MarkerInterface extends Cloneable {
	// If an interface doesn't contain any methods and by implementing that interface if our objects will get some
	// ability then such types of interfaces are called Marker Interfaces or Ability Interface or Tag Interface.

	// Example
	// Serializable
	// Cloneable
	// RandomAccess
	// SingleThreadModal, etc.

	// Note: These are marked for some ability.

	// Example 1: By implementing Serializable interface, our objects can be saved to the file and can travel across the
	// network.

	// Example 2: By implementing Cloneable interface, our objects are in a position to produce exactly duplicate cloned
	// objects.

	// Q. Without having any methods, how the objects will get some ability in marker interfaces?
	// Ans. Internally, JVM is responsible to provide required ability. JVM will check interface name and will provide
	// desired ability.

	// Q. Why JVM is providing required ability in marker interfaces?
	// Ans. To reduce complexity of programming and to make Java language as simple as possible.

	// Q. Is it possible to create our own marker interface?
	// Ans. Yes, but customization of JVM is required.
}
