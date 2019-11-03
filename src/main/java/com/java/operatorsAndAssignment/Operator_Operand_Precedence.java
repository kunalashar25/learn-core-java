package com.java.operatorsAndAssignment;

public class Operator_Operand_Precedence {

	public static int printIndex(int i) {
		System.out.println("Executing.." + i);
		return i;
	}

	public static void main(String[] args) {
		// In Java, we have only operator precedence but not operand precedence.

		// Before applying any operator, all operands will be evaluated from left to right.

		int a = (printIndex(1) + printIndex(2) * printIndex(3) / printIndex(4) + printIndex(5) * printIndex(6));
		System.out.println("Final Value is " + a);

		// Output for Operands:
		// Executing..1 Executing..2 Executing..3 Executing..4 Executing..5 Executing..6

		// Output for Operator: Final Value is 32

		// * and / have same precedence. Hence * was evaluated before / in this case. First come First Serve basis.

	}

}
