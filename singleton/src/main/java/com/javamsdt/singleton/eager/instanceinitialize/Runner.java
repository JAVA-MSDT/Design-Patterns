package com.javamsdt.singleton.eager.instanceinitialize;

public class Runner {

	public static void main(final String[] args) {
		PrinterInstanceInitializerSingleton initializer = PrinterInstanceInitializerSingleton.getInstance();

		initializer.print("PrinterInstanceInitializerSingleton");
	}

}
