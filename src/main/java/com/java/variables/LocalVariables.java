package com.java.variables;

public class LocalVariables {
	public static void main(String[] args) {
		// Sometimes to meet temporary requirements of a programmer we can declare variables inside a
		// method/block/constructor, such type of variables are called local/temporary/stack/automatic variables.

		// Local variables will be stored inside stack memory.

		// Local variables will be created while executing the block in which we declared it. Once block execution
		// completes, automatically local variable will be destroyed. Hence, the scope of local variable is the block in
		// which we declared it.

		// Example 1
		int i = 0;
		for (int j = 0; j <= 3; j++) {
			i = i + j;
		}
		// System.out.println("i= "+i+" j="+j); CE: j cannot be resolved to a variable
		// as scope of j is limited only to for loop we cannot access it outside for loop

		// Example 2
		try {
			int j = Integer.parseInt("ten"); // Number format exception
		} catch (NumberFormatException e) {
			// j = 10; CE: as scope of j is limited only to try block we cannot access it outside try.
			System.out.println(e);
		}

		// For local variables, JVM won't provide default values, compulsory we should perform initialization
		// explicitly before using that variable i.e. if we're not using then it is not required to perform
		// initialization

		// Example
		int p;
		System.out.println("Without local variable initialization"); // Valid. as not using p
		// System.out.println(p); CE: The local variable p may not have been initialized

		// Note: It is not recommended to perform initialization for local variables inside logical blocks because there
		// is no guarantee for the execution of these blocks always at runtime.

		// Example
		if (args.length > 0) {
			p = 10;
		}
		// System.out.println(p); CE: The local variable p may not have been initialized as args.length can be 0.

		// Note: It is highly recommended to perform initialization for local variables at the time of declaration
		// at least with the default values.

		// The only applicable modifier for local variables is final. If we're trying to apply any other modifier
		// private/public/protected/static/transient/volatile then we'll get compile time error.

		// Example
		final int b = 10;
		// private int b; CE: Illegal modifier for parameter b; only final is permitted

		// Note: if we're not declaring variables with any modifier then by default it is default modifier but this rule
		// is applicable only for Instance and Static Variables but not for Local variables.

		/** Conclusion **/
		// 1. For instance and static variables, JVM will provide default values and we're not required to perform
		// initialization explicitly but for local variables JVM won't provide default values, initialization is
		// mandatory for local variables before using that variable.

		// 2. Instance and static variables can be accessed by multiple threads simultaneously and hence these are not
		// thread safe but in case of local variables, for every thread a separate copy will be created and hence local
		// variables are thread safe.

		// 3. Every variable in java should be either instance/static/local. Every variable in java should be either
		// primitive/reference. Hence, various possible combinations of variables in java are of 6 types.
		// Refer: VariableCombinations.PNG

		// 4. Uninitialized Arrays: once we create an array, every array element by default initialized with default
		// values irrespective of whether it is instance/static/local array. Refer: Uninitialized Arrays.PNG
	}
}
