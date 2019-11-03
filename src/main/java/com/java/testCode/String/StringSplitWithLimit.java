package com.java.testCode.String;

public class StringSplitWithLimit {

	public static void main(String[] args) {
		String itemHref = "https://testeinvoice.zycus.net:5543/einvoice/invoice/default/viewInvoice?invoiceId=ff808081-5dbc6211-015d-bd0edee4-138b&docType=3";

		String splitHref[] = itemHref.split("invoiceId=");

		String invoiceID[] = splitHref[1].split("docType=");

		System.out.println(invoiceID[0]);
	}

}
