package com.java.commandLineArguments;

public class CommandLineArgs {
	// The arguments which are passed via command prompt are called command line arguments. With these cmd line args,
	// JVM will create an array and by passing that array as args JVM will call main method.

	// Example java CommandLineArgs A B C
	// A= args[0];
	// B= args[1];
	// C= args[2];
	// args.length = 3;

	// The main objective of cmd line args is we can customize behavior of the main method.

	// 70% of java operation are with String hence main method accepts String as args and it is possible for us to
	// convert String to any other data type at runtime.

	public static void main(String[] args) {
		// Case 1:
		args = new String[]{"A", "B", "C"};

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		// Output: Runtime Exception occurred as we wrote i <= args.length. To avoid write i < args.length
		// A
		// B
		// C
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		// at com.java.commandLineArguments.CommandLineArgs.main(CommandLineArgs.java:26)

		// Case 2: No matter how mnay input parameter are passed via cmd line args, in this case output will always be
		// XYZ as args is now referring to argh.
		String argh[] = {"X", "Y", "Z"};
		args = argh;
		for (String s : args) {
			System.out.println(s);

			// Output:
			// X
			// Y
			// Z
		}

		// Case 3: Within main method, cmd line args are available in String form.
		args = new String[]{"10", "20"};
		System.out.println(args[0] + args[1]); // Output: 1020

		// to get addition of values, we need to convert it in into integer first.
		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1])); // Output: 30

		// Case 4: Usually space is the separator between cmd line args. if our cmd line args itself contains space then
		// we have to enclose that cmd line arg with double quotes i.e. "Hello World"

		args = new String[]{"Hello World"};
		System.out.println(args[0]); // Output: Hello World

	}

}
