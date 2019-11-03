package com.java.dataTypes.nonNumeric;

public class Char {
	// Size: 2 Bytes

	// java is unicode base whereas old languages are ascii code based

	// In C, allowed charatcers (ascii) are <= 256. So 8 bits is enough to
	// represent them all and it corresponds to 1Byte. Hence in old languages
	// char size was 1Byte.

	// in java we can use any alphabet symbol irrespectve of the language along
	// with all 256 characters from old language. So to represent all this char
	// more than 1Byte it required and sum of all characters will be less than
	// 65536. So instead of 8bits we go for 16bits in java which is equivalent
	// to 2 Bytes.

	public static void main(String[] args) {
		char a = 'a';

		System.out.println(a);
	}

}
