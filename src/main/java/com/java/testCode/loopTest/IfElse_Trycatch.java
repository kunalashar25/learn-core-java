package com.java.testCode.loopTest;

public class IfElse_Trycatch {

	public static void main(String[] args) {

		System.out.println("before if");

		if (true) {
			System.out.println("inside if");

			try {
				System.out.println("Inside try");
			} catch (Exception e) {
				System.out.println("inside catch");
			}
		}
		System.out.println("after if");

	}

}
