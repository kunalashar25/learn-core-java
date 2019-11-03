package com.java.testCode.String;

public class StringNotEquals {

	public static void main(String[] args) {
		String version = "v2";
		int versionNumber = 0;
		if (!(version.equals(null) || version.equals(""))) {
			String vno = version.charAt(1) + "";
			versionNumber = Integer.parseInt(vno);
		}
		System.out.println(versionNumber);

	}

}
