package com.java.exceptionHandling.introduction;

public class RuntimeStackMechanism {
	// 1. For every thread JVM will create a runtime stack.

	// 2. Each and every method call performed by that thread will be stored in a corresponding stack.

	// 3. Each entry in the stack is called StackFrame or ActivationRecord.

	// 4. After completing every method call, the corresponding entry from the stack will be removed.

	// 5. After completing all method calls, the stack will become empty and empty stack will be destroyed by JVM just
	// before terminating the thread.

	// Refer RuntimeStackMechanism.png

	public static void main(String[] args) {
		doStuff();
	}

	public static void doStuff() {
		doMoreStuff();
	}

	public static void doMoreStuff() {
		System.out.println("Hello");
	}
}

// Output: Hello
