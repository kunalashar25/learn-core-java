package com.java.testCode.String;

public class SplitOnLastIndex
{

	public static void main(String[] args)
	{
		String path = "http://192.168.1.128:8081/apiautomationweb/FileUploadServletForSel?filePath=TimeStamp2/Setup1/UserName1/APIName2/GetPOByID4_42_8.xlsx";

		System.out.println(path.lastIndexOf("/"));

		System.out.println(path.substring(0, path.lastIndexOf("/")));

	}

}
