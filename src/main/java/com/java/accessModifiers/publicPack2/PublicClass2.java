package com.java.accessModifiers.publicPack2;

import com.java.accessModifiers.publicPack1.PublicClass1;

class PublicClass2 {

	public static void main(String[] args) {
		PublicClass1 c = new PublicClass1();
		c.method1();
	}

}

// Case1: if we create object of PublicClass without using import and keeping PublicClass as non-public, we'll get
// compile time error as cannot find symbol.
// Symbol: class PublicClass Location: publicPack2.PublicClass1

// Case2: if we create object of PublicClass using import and keeping PublicClass as non-public, we'll get above error
// in addition to below:
// publicPack1.PublicClass is not public in publicPack1; cannot be accessed from outside of package.
