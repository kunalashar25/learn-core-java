package com.java.exceptionHandling.customizedExceptions;

public class TooYoungException extends RuntimeException
{
	public TooYoungException(String exceptionMessage)
	{
		super(exceptionMessage);
	}
}
