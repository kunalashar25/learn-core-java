package com.java.operatorsAndAssignment;

public class RelationalOperators {
	// < , <= , > , >=

	public static void main(String[] args) {
		/** We can apply relational operators for every primitive type except boolean. **/

		System.out.println(10 < 20); // Output: true
		System.out.println('a' < 10); // Output: false
		System.out.println('a' < 97.6); // Output: true
		System.out.println('a' > 'A'); // Output: true
		// System.out.println(true > false); CE: The operator > is undefined for the argument type(s) boolean, boolean

		/** We can't apply relational operators for Object types. **/

		// System.out.println("test1" > "test"); CE: The operator > is undefined for the argument type(s)
		// java.lang.String, java.lang.String

		/** Nesting of relational operators is not allowed **/
		// System.out.println(10 < 20 < 30); CE: The operator < is undefined for the argument type(s) boolean, int
	}

}
