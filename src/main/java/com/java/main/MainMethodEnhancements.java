package com.java.main;

public class MainMethodEnhancements
{
	/** Enhancement came to main() in java v1.7 **/

	// Until v1.6, if class doesn't contain main() then we'll get runtime exception saying NoSuchMethodError: main but
	// from v1.7 onwards instead of NoSuchMethodError we'll get more elaborated error information as Error: Main method
	// in class Test. Please define the main method as:
	// public static void main(String[] args)

	// From v1.7 onwards, main method is mandatory to start program execution. Hence, even though class contains static
	// block it won't be executed if the class doesn't contain main method.
	// Error with v1.7: main method not found in class MainMethodEnhancements
	static
	{
		System.out.println("Static block");
		System.exit(0); // This command will shut down JVM.
	}

	// In v1.6, static block will be executed and then System.exit(0) will be called. Hence, no error message for main
	// method. Where as in v1.7 main method is mandatory to start execution. Hence, we'll get error message as
	// Error with v1.7: main method not found in class MainMethodEnhancements

	// For v1.7 onwards there is only one criteria i.e. class should have main method. There is no change in execution
	// order i.e. initially static block will be executed and then main method.
	// Refer: JAVA 1_7 Execution Flow.PNG

	// Q. Without writing main() is it possible to print some statements to the console?
	// Ans. Yes, by using static block but it is applicable only till v1.6 from 1.7v onwards this is not applicable.
}
