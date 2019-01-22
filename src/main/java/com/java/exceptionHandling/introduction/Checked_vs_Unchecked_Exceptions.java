package com.java.exceptionHandling.introduction;

public class Checked_vs_Unchecked_Exceptions
{
	/** Checked Exception **/
	// 1. The exceptions which are checked by compiler for smooth execution of the program are called Checked
	// Exceptions.

	// Example: HallTicketMissingException, PenNotWorkingException, FileNotFoundException, etc.

	// 2. In our program if there is any chance of rising checked exception then compulsory we should handle the checked
	// exception (either by try/catch or by throws keyword) otherwise we'll get compile time error saying,
	// Unresolved compilation problem: Unhandled exception type FileNotFoundException

	/** Unchecked Exception **/
	// 1. The Exception which are not checked by compiler whether programmer handles it or not, such type of exceptions
	// are called Unchecked Exception.

	// Example: ArithmeticException, ArrayIndexOutOfBoundsException, etc.

	// Note 1: Whether checked or unchecked, every exception occurs at Runtime only. There's no chance of occurring any
	// exception at compile time.

	// Note 2: Runtime exception and its child classes, Error and its child classes are Unchecked except these remaining
	// are Checked.

	/** Fully Checked v/s Partially Checked **/

	// 1. A checked exception is said to be fully checked if and only if all its child classes are also checked.

	// Example: IOException, InterruptedException.

	// 2. A checked exception is said to be partially checked if and only if some of its child classes are unchecked.

	// Example: Exception and Throwable.

	// Note: The only possible partially checked exceptions in java are Exception and Throwable.

	/** Describe the behavior of the following exceptions **/
	// 1. IOException > Fully Checked
	// 2. RuntimeException > Unchecked
	// 3. InterruptedException > Fully Checked
	// 4. Error > Unchecked
	// 5. Throwable > Partially Checked
	// 6. ArithmeticException > Unchecked
	// 7. NullPointerException > Unchecked
	// 8. Exception > Partially Checked
	// 9. FileNotFoundException > Fully Checked
}
