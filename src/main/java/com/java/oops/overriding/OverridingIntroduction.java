package com.java.oops.overriding;

public class OverridingIntroduction extends Parent {

	// 1. Whatever methods parent has by default available to the child through inheritance. If child class not
	// satisfied with parent class implementation then child is allowed to redefine that method based on its
	// requirement. This process is called Overriding.

	// 2. The parent class method which is overridden is called Overridden method and child class method which is
	// overriding is called Overriding method.

	// 3. In overriding, method resolution is always taken cared by JVM based on run time object and hence, overriding
	// is also known as runtime polymorphism or dynamic polymorphism or late binding.

	public void method1() {
		System.out.println("Method from Child class.");
	}

	public static void main(String[] args) {
		OverridingIntroduction o = new OverridingIntroduction();
		o.method1(); // Output: Method from Child class.
	}

}

class Parent {
	public void method1() {
		System.out.println("Method from Parent class.");
	}
}

class Test {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.method1(); // Output: Method from Parent class.

		OverridingIntroduction child = new OverridingIntroduction();
		child.method1(); // Output: Method from Child class.

		Parent p1 = new OverridingIntroduction();
		p1.method1(); // Output: Method from Child class.
	}
}