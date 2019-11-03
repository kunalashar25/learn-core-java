package com.java.exceptionHandling.customizedExceptions;

public class TooOldException extends RuntimeException {
	public TooOldException(String exceptionMessage) {
		super(exceptionMessage);
	}
}
