package com.java.accessModifiers.publicPack2;

//import com.java.accessModifiers.publicPack1.PublicMember1;

public class PublicMember2 {

	public static void main(String[] args) {
		/*
		 * PublicMember1 m1 = new PublicMember1(); m1.method1();
		 *
		 * CE: publicPack1.PublicMember1 is not public in publicPack1; cannot be accessed from outside package
		 */

		// in the above example even though method1 is public we can't access from outside package because corresponding
		// class PublicMember1 is not public i.e. if both class and method are public then only we can access the method
		// from outside package.

	}

}
