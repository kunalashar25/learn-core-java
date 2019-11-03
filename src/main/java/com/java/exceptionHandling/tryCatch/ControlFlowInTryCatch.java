package com.java.exceptionHandling.tryCatch;

public class ControlFlowInTryCatch {
	public static void main(String[] args) {
		try {
			System.out.println("Statement 1");
			System.out.println("Statement 2");
			System.out.println("Statement 3");
		} catch (Exception e) {
			System.out.println("Statement 4");
		}
		System.out.println("Statement 5");
	}

	/** Case 1 : If there is no exception **/
	// Output: (Normal Termination)
	// Statement 1
	// Statement 2
	// Statement 3
	// Statement 5

	/** Case 2 : If an exception raised at statement 2 and corresponding catch block matched **/
	// Output: (Normal Termination)
	// Statement 1
	// Statement 4
	// Statement 5

	/** Case 3 : If an exception raised at statement 2 and corresponding catch block not matched **/
	// Output: (Abnormal Termination)
	// Statement 1
	// Exception

	/** Case 4 : If an exception raised at statement 4 or statement 5 **/
	// Output: (Abnormal Termination)
	// Statement 1
	// Statement 2
	// Statement 3
	// Exception

	// Note:
	// 1. Within the try block if anywhere exception is raised then rest of the try block won't be executed even though
	// exception is handled. Hence, within try block we have to take only risky code and length of try block should be
	// as less as possible.

	// 2. In addition to try block, there may be a chance of raising an exception inside catch and finally block.

	// 3. If any statement which is not part of try block and raises an exception then it is always abnormal
	// termination.
}
