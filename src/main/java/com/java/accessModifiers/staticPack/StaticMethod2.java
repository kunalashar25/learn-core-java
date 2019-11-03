package com.java.accessModifiers.staticPack;

public class StaticMethod2 {
	// Case 2: Inheritance concept applicable for static methods including main() method. Hence, while executing child
	// class, if a child doesn't contain main() method, then parent class main() method will be executed.

	public static void main(String[] args) {
		System.out.println("parent main");
	}
}

class child extends StaticMethod2 {

}
// Note:
// Save this file as StaticMethod2.java
// On compiling, 2 class files will be generated StaticMethod2.class and child.class
// On executing java StaticMethod2 >> Output: parent main
// On executing java child >> Output: parent main
