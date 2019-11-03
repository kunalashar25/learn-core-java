package com.java.exceptionHandling.tryCatchFinally;

public class TryCatchFinallyCombinations {
	/**
	 * Various combinations of try-catch-finally block
	 **/
	// 1. In try-catch-finally, order is important.

	// 2. Whenever we're writing try, compulsory we should write either catch or finally otherwise we'll get compile
	// time error. i,e. try without catch or finally is invalid.

	// 3. Whenever we're writing catch block, compulsory try block must be required i.e. catch without try is invalid.

	// 4. Whenever we're writing finally block, compulsory we should write try block i.e. finally without try is
	// invalid.

	// 5. Inside try, catch and finally block, we can declare try,catch and finally blocks i.e. nesting of
	// try-catch-finally is allowed.

	// 6. Curly braces are mandatory for try, catch and finally blocks.
	public void combo1() {
		try {

		} catch (Exception e) {

		}
	}

	public void combo2() {
		try {

		} catch (ArithmeticException e) {

		} catch (Exception e) {

		}
	}

	public void combo3() {
		try {

		} catch (Exception e) {

		} catch (Exception e) {

		}

		// CE: Exception has already been caught
	}

	public void combo4() {
		try {

		} catch (Exception e) {

		} finally {

		}
	}

	public void combo5() {
		try {

		} finally {

		}
	}

	public void combo6() {
		try {

		} catch (Exception e) {

		}

		try {

		} catch (ArithmeticException e) {

		}
	}

	public void combo7() {
		try {

		} catch (Exception e) {

		}
		try {

		} finally {

		}
	}

	public void combo8() {
		try {

		}
		// CE: try without catch or finally.
	}

	public void combo9() {
		catch(Exception e)
		{

		}
		// CE: catch without try
	}

	public void combo10() {
		finally{

		}
		// CE: finally without try
	}

	public void combo11() {
		try {

		} finally {

		}
		catch(Exception e){

		}
		// CE: catch without try
	}

	public void combo12() {
		try {

		}
		System.out.println("Hello");
		catch(Exception e)
		{

		}
		// CE1: try without catch or fianlly
		// CE2: catch without try
	}

	public void combo13() {
		try {

		} catch (ArithmeticException e) {

		}
		System.out.println("Hello");
		catch(Exception e)
		{

		}

		// CE: catch without try
	}

	public void combo14() {
		try {

		} catch (ArithmeticException e) {

		}
		System.out.println("Hello");
		finally
		{

		}

		// CE: finally without try
	}

	public void combo15() {
		try {
			try {

			} catch (ArithmeticException e) {

			}
		} catch (ArithmeticException e) {

		}
	}

	public void combo16() {
		try {
			try {

			}
		} catch (ArithmeticException e) {

		}

		// CE: try without catch or finally
	}

	public void combo17() {
		try {
			try {

			} finally {

			}
		} catch (ArithmeticException e) {

		}
	}

	public void combo18() {
		try {

		} catch (ArithmeticException e) {
			try {

			} finally {

			}
		}
	}

	public void combo19() {
		try {

		} catch (ArithmeticException e) {
			finally
			{

			}
		}
		// CE: finally without try
	}

	public void combo20() {
		try {

		} catch (ArithmeticException e) {

		} finally {
			try {

			} catch (ArithmeticException e) {

			}
		}
	}

	public void combo21() {
		try {

		} catch (ArithmeticException e) {

		} finally {
			finally
			{

			}
		}

		//CE: finally without try
	}

	public void combo22() {
		try {

		} catch (ArithmeticException e) {

		} finally {

		}
		finally
		{

		}

		//CE: finally without try
	}

	public void combo23() {
		try
		System.out.println("Hello");
		catch(ArithmeticException e)
		{

		}
		finally
		{

		}
		// Invalid. Curley braces are must
	}

	public void combo24() {
		try {

		} catch (ArithmeticException e)
		System.out.println("Hello");
		finally
		{

		}

		// Invalid. Curley braces are must
	}

	public void combo25() {
		try {

		} catch (ArithmeticException e) {

		} finally
		System.out.println("Hello");

		// Invalid. Curley braces are must
	}
}
