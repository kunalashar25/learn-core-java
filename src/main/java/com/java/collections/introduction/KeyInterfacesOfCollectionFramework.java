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

	// Note: All the above interfaces (#1-6) meant for representing a group of individual objects. If we want to
	// represent a group of object as key-value pairs then we should go for map.

	/** 7. Map Interface **/
	// 1. Map is NOT a child interface of collection.

	// 2. If we want to represent a group of objects as key-value pairs then we should go for map.

	// 3. Both key and value are objects only. Duplicate keys are not allowed but values can be duplicated.

	// 4. Implementation classes are: HashMap, LinkedHashMap, WeakHashMap, IdentityHashMap, Hashtable, Properties.

	/** 8. SortedMap Interface **/
	// 1. It is a child interface of Map interface.

	// 2. If we want to represent a group of key-values pairs according to some sorting order of keys, then we should go
	// for sorted map.

	// 3. In Sorted Map, the sorting should be based on key but not based on value.

	/** 9. Navigable Map Interface **/
	// 1. It is a child interface of Sorted Map interface.

	// 2. It defines several method for navigation purposes.

	// 3. TreeMap is implementation class of Navigable Map.

	// Note: The following are legacy characters present in collection framework:
	// i. Enumeration (I)
	// ii. Dictionary (AC)
	// iii. Vector (C)
	// iv. Stack (C)
	// v. Hashtable (C)
	// vi. Properties (C)

	/** Sorting **/
	// i. Comparable (I): for default natural sorting.
	// ii. Comparator (I): for customized sorting.

	/** Cursors **/
	// used to fetch object from collections one by one.
	// i. Enumeration (I)
	// ii. Iterator (I)
	// iii. ListIterator (I)

	/** Utility Classes **/
	// i. Collections
	// ii. Arrays
}
