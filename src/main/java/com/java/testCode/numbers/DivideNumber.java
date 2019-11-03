package com.java.testCode.numbers;

public class DivideNumber {

	public static void main(String[] args) {
		double a = 0.0;
		double b = 0.0;
		double c = a / b;

		if (Double.isNaN(c)) {
			c = 0.0;
		}

		System.out.println(c);
	}

}
