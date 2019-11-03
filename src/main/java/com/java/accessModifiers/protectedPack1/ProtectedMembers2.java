package com.java.accessModifiers.protectedPack1;

public class ProtectedMembers2 extends ProtectedMembers1 {

	public static void main(String[] args) {
		ProtectedMembers2 a = new ProtectedMembers2();
		a.method1();

		ProtectedMembers1 b = new ProtectedMembers1();
		b.method1();

		ProtectedMembers1 c = new ProtectedMembers2();
		c.method1();
	}

}
