package com.java.literal;

public class CharLiteral
{

	public static void main(String[] args)
	{
		// we can specify char literal as single char within single quotes
		char ch = 'a'; // valid

		// char ch = a; CE: a cannot be resolved to a variable

		// char ch = "a"; CE: Incompatible Types: Found String Required char

		// char ch = 'ab'; CE: Invalid character constant as it was expecting '
		// instead of b

		// we can specify char literal as integral literal which represents
		// unicode value of the char and that integral literal can be specified
		// in decimal\octal\hexadecimal forms but allowed range is 0 to 65535

		char ch1 = 97; // unicode value of a
		System.out.println(ch1);

		char ch2 = 0XFace; // unicode value of ? in hexadecimal form
		System.out.println(ch2);

		char ch3 = 0777; // unicode value of ? in octal form
		System.out.println(ch3);

		char ch4 = 65535; // unicode value of ? in decimal form
		System.out.println(ch4);

		// char ch = 65536; // CE: Possible loss of Precision: Found int
		// Required char

		// we can represent char literal in unicode representation which is
		// nothing but '\\uxxxx' 4 digit hexadecimal number
		char ch5 = '\u0061';
		System.out.println(ch5);

		// every escape character is a valid char literal

		char ch6 = '\n'; // valid

		char ch7 = '\t'; // valid

		// char ch8 = '\m'; CE: Invalid escape sequence (valid ones are \b \t \n
		// \f \r \" \' \\ )
	}

}
