package com.java.dataTypes.integral;

public class Byte {
	// Size: 1 Bytes
	// Range: -128 to 127

	public static void main(String[] args) {
		byte a = 30; // Output: 30
		byte b = 60; // Output: 60
		byte c = -80; // Output: -80
		byte d = 127; // Output: 127
		byte e = (byte) 128; // Output: -128
		byte f = (byte) 129; // Output: -127
		byte g = (byte) 130; // Output: -126
		byte h = (byte) -130; // (byte) adds - against a number // Output: 126

		/** Possible compile time errors **/
		// if range is violated then you'll receive a compile time error saying,
		// possible loss of precision. Found int Required byte

		// for byte a = true; you'll get compile time error as
		// incompatible types. Found boolean Required byte

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);

		// byte is best suitable for sending data over network/files in terms of
		// Streams.

	}
}
