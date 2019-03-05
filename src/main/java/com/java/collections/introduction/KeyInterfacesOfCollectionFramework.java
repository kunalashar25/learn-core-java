package com.java.collections.introduction;

public class KeyInterfacesOfCollectionFramework
{
	// There are 9 key interfaces of collection framework.
	// 1. Collection
	// 2. List
	// 3. Set
	// 4. SortedSet
	// 5. NavigableSet
	// 6. Queue
	// 7. Map
	// 8. SortedMap
	// 9. NavigableMap

	/** 1. Collection Interface **/
	// 1. If we want to represent a group of individual objects as a single entity then we should go for collection.

	// 2. Collection interface defines the most common methods which are applicable for any collection object.

	// 3. In general collection interface is considered as root interface of collection framework.

	// 4. There is no concrete class which implements collection interface directly.

	/** Difference between Collection and Collections **/
	// Collection is an interface. Refer #1.

	// Collections is an utility class present in java.util package to define several utility methods for collection
	// objects like sorting, searching, etc.

	/** 2. List Interface **/
	// 1. It is child interface of collection interface.

	// 2. If we want to represent a group of individual objects as a single entity where duplicates are allowed and
	// insertion order must be preserved then we should go for List interface.

	/** 3. Set Interface **/
	// 1. It is child interface of collection interface.

	// 2. If we want to represent a group of individual objects as a single entity where duplicates are not allowed and
	// insertion order is not required then we should go for Set interface.

	/** 4. Sorted Set Interface **/
	// 1. It is child interface of Set interface.

	// 2. If we want to represent a group of individual objects as a single entity where duplicates are not allowed and
	// all objects should be inserted according to some sorting order then we should go for Sorted Set interface.

	/** 5. Navigable Set Interface **/
	// 1. It is child interface of Sorted Set interface.

	// 2. It contains several method for navigation purposes.

	// 3. TreeSet class implements Navigable Set interface.

	// Refer List_vs_Set.PNG

	/** 6. Queue Interface **/
	// 1. It is child interface of collection interface.

	// 2. If we want to represent a group of individual objects prior to processing then we should go for queue. Usually
	// queue follows FIFO order but based on our requirement we can implement our own priority order.

	// Example: Before sending a mail all mail id's we have to store in some data structure. In which order we added
	// mail id's in the same order only mail should be delivered. For this requirement, queue is the best choice.

}
