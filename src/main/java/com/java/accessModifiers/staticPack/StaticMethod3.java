package com.java.accessModifiers.staticPack;

public class StaticMethod3 {
	// Case 3: It seems overriding concept is applicable for static methods but it is not overriding, it is method
	// hiding.

	// Note:
	// For static methods overloading and inheritance concepts are applicable but overriding concept is not applicable
	// but instead of overriding method hiding concept is applicable.

	public static void main(String[] args) {
		System.out.println("parent main");
	}
}

class child1 extends StaticMethod3 {
	public static void main(String[] args) {
		System.out.println("child1 main");
	}
}

// Note:
// Save this file as StaticMethod3.java
// On compiling, 2 class files will be generated StaticMethod3.class and child1.class
// On executing java StaticMethod3 >> Output: parent main
// On executing java child1 >> Output: child1 main
