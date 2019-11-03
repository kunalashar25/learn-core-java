package com.java.accessModifiers.protectedPack2;

import com.java.accessModifiers.protectedPack1.ProtectedMembers1;

public class ProtectedMembers3 extends ProtectedMembers1 {

	public static void main(String[] args) {
		ProtectedMembers1 a = new ProtectedMembers1();
		// a.method1();

		ProtectedMembers3 b = new ProtectedMembers3();
		b.method1();

		ProtectedMembers1 c = new ProtectedMembers3();
		// c.method1();

		// We'll get compile time error for below statements:
		// a.method1();
		// c.method1();
		// CE: method1() has protected access in protectedPack1.ProtectedMembers1

	}

}
