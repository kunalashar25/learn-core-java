package com.java.testCode.String;

public class StringScenarios
{

	public static void main(String[] args)
	{
		String cc = "This is auto generated comment for replace of an item";
		String at = "Item Replaced: Acer Computer is replaced with acer laptop.Buyer Comments: This is auto generated comment for replace of an item This is auto generated comment for replace of an item This is auto generated comment for replace of an item This is auto ...";

		// String1 Contains String2
		if (at.contains(cc))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

		String a = "<script>alert(\"x@#$अप我们&*132\")</script>";
		String b = "<script>alert(\"x@#$अप我们&*132\")</script>";

		if (a.equalsIgnoreCase(b))
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("not equals");
		}

	}

}
