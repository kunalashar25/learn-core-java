package com.java.main;

public class MainMethodSyntax
{
	// Whether class contains main() or not and whether main() is declared according to requirement or not, these
	// things won't be checked by compiler. At runtime, JVM is responsible to check these things.

	// if JVM unable to find main method then we'll get run time exception saying java.lang.NoSuchMethodError: main

	// At Runtime, JVM always searches for the main() with the following prototype:
	// public static void main(String[] args). this prototype is configured in JVM..

	public static void main(String[] args)
	{
		// public: So JVM can call from anywhere.
		// static: Without existing object also JVM has to call this method.
		// void: main() wont return anything to JVM.
		// main: This is the name which is configured inside JVM.
		// String[] args: command line arguments.

		// Note: It is possible to change name of main() but we need to configure the same in JVM so it can locate
		// method with new name.

		System.out.println("Main Syntax Class");
	}

	// Above syntax is very strict and if we perform any change then we'll get runtime exception saying
	// java.lang.NoSuchMethodError: main

	/** Even though above syntax is very strict , the following changes are acceptable: **/

	// 1. Instead of public static we can take static public i.e the order of modifiers is not important.

	// 2. We can declare String[] in any acceptable form.
	// main (String[] args)
	// main (String []args)
	// main (String args[])

	// 3. Instead of args we can take any valid java identifiers.
	// main (String[] test)

	// 4. We can replace String[] with var-arg parameter.
	// main (String... args)

	// 5. We can declare main() with following modifiers: final, synchronized, strictfp
	// static final synchronized strictfp public void main (String... test) {}

	/** Which of the following main() declarations are valid? **/

	// public static void main (String args) Invalid
	// public static void Main (String[] args) Invalid
	// public void main (String[] args) Invalid
	// public static int main (String[] args) Invalid
	// final synchronized strictfp public void main (String[] args) Invalid
	// final synchronized strictfp public static void main (String[] args) Valid
	// public static void main (String... args) Valid

	/** In which of the above cases we'll get compile time error? **/
	// We won't get compile time error anywhere but expect last 2 cases, we'll get runtime exception as
	// java.lang.NoSuchMethodError: main for rest.
}
