package com.java.testCode.numbers;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumber {

	public static Integer getRandomNumbersBetweenRange(int size, int minRange, int maxRange) {
		int a = ThreadLocalRandom.current().nextInt(minRange, maxRange + 1);
		return a;
	}

	public static String getRandomNumber(int size) {
		String randomString = RandomStringUtils.randomNumeric(size);
		return randomString;
	}

	public static void main(String[] args) {
		int a = getRandomNumbersBetweenRange(2, 10, 15);
		System.out.println(a);

	}

}
