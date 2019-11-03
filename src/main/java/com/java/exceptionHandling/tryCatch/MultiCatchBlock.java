package com.java.exceptionHandling.tryCatch;

public class MultiCatchBlock {
	// 1. Until 1.6v, even though multiple different exceptions having same handling code for every exception type we
	// have to write a separate catch block. It increases length of the code and reduces readability.

	public void m1() {
		try {
			int a = 10 / 0;
			Thread.sleep(2000);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// 2. To overcome this problem, SUN people introduced multi-catch block in 1.7V. According to this, we can write a
	// single catch block that can handle multiple different types of exceptions.

	public void m2() {
		try {
			int a = 10 / 0;
			Thread.sleep(2000);
		} catch (ArithmeticException | NullPointerException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	// 3. The main advantage of this approach is length of the code will be reduced and readability will be improved.

	// 4. In the above example, whether raised exception is either ArithmeticException or NullPointerException the same
	// catch block can listen.

	// 5. In multi-catch block there should not be any relation between exception types (either child to parent or
	// parent to child or same type) other wise we'll get compile time error.

	public void m3() {
		try {
			int a = 10 / 0;
			Thread.sleep(2000);
		} catch (ArithmeticException | Exception e) {
			e.printStackTrace();
		}
		// CE: Alternatives in multi-catch statement cannot be related by subclassing.
	}

}
