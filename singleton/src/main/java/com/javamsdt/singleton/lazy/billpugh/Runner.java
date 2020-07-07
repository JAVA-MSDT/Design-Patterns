package com.javamsdt.singleton.lazy.billpugh;

public class Runner {

	public static void main(final String[] args) {
		PrinterBillPughSingleton billPughSingleton = PrinterBillPughSingleton.getInstance();

		billPughSingleton.print("billPughSingleton");
	}

}
