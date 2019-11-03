package com.java.oops.overriding;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OverrridingAccessModifiers {

}

// 1. In overriding the following modifiers won't keep any restrictions: synchronized, native, strictfp

/**
 * Valid Examples
 **/
// parent method: non-final > child method: final
// parent method: abstract > child method: non-abstract
// parent method: synchronized > child method: non-synchronized
// parent method: native > child method: non-native
// parent method: strictfp > child method: non-strictfp

/** Invalid Examples **/
// parent method: final > child method: non-final/final

// 2. While overriding we can't reduce scope of access modifier but we can increase the scope.

class P1 {
	public void m1() {

	}
}

class C1 extends P1 {
	/*
	 * void m1() { }
	 */

	// CE: m1() in C1 cannot override m1() in P1; attempting to assign weaker access privileges; was public
}

/** Valid Examples **/
// parent method: public > child method: public
// parent method: protected > child method: protected or public
// parent method: default > child method: default or protected or public

/** Invalid Examples **/
// parent method: private > child method: overriding concept not applicable for private methods

// 3. If child class method throws any checked exception then parent class should throw same checked exception or its
// parent exception other wise we'll get compile time error. There are no restrictions for unchecked exceptions.

class P2 {
	public void m1() throws Exception {

	}

	public void m2() {

	}

	public void m3() throws Exception {

	}

	public void m4() throws IOException {

	}

	public void m5() throws IOException {

	}

	public void m6() throws IOException {

	}

	public void m7() throws IOException {

	}
}

class C2 extends P2 {
	/** Valid Examples **/
	public void m1() {

	}

	public void m3() throws IOException {

	}

	public void m5() throws FileNotFoundException, EOFException {

	}

	public void m7() throws ArithmeticException, NullPointerException, ClassCastException {

	}

	/** Inalid Examples **/

	public void m2() throws Exception {

	}

	public void m4() throws Exception {

	}

	public void m6() throws EOFException, InterruptedException {

	}

}