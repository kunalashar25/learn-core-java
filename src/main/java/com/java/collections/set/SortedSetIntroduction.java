package com.java.collections.set;

public class SortedSetIntroduction
{
	// 1. SortedSet is the child interface of Set.

	// 2. If we want to represent a group of individual objects according to some sorting order without duplicates then
	// we should go for SortedSet.

	/** Methods **/
	// 1. Object first(); >> returns first element of the SortedSet

	// 2. Object last(); >> returns last element of the SortedSet

	// 3. SortedSet headSet(Object obj); >> returns SortedSet whose elements are less than obj

	// 4. SortedSet tailSet(Object obj); >> returns SortedSet whose elements are >= obj

	// 5. SortedSet subSet(Object obj1,Object obj2); >> returns SortedSet whose elements are >= obj1 and < obj2

	// 6. Comparator comparator(); >> return Comparator object that describes underlying sorting technique. If we're
	// using default natural sorting order then we will get null.

	// Note: The default natural sorting order for numbers is ascending order and for String objects is alphabetical
	// order.
}
