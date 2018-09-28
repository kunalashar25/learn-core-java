package com.java.testCode.String;

public class ReplaceChar
{

	public static void main(String[] args)
	{
		String amount = "USD 123,456,789";
		String getAmount[] = amount.split(" ");
		String Amount = getAmount[1].replaceAll(",", "").trim().replaceAll("\\s{2,}", " ");

		System.out.println(Amount);
	}

}
