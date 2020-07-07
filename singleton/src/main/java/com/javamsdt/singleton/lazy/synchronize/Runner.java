package com.javamsdt.singleton.lazy.synchronize;

public class Runner {

	public static void main(final String[] args) {

		// ===================== Method One ===================== //
		PrinterSynchronizedSingleton noSynchronizedSingleton = PrinterSynchronizedSingleton
				.getInstaneWithoutSynchronize();
		noSynchronizedSingleton.print("noSynchronizedSingleton");

		// ===================== Method Two ===================== //
		PrinterSynchronizedSingleton singleCheckSynchronizedSingleton = PrinterSynchronizedSingleton
				.getInstaneWithoutSynchronize();
		singleCheckSynchronizedSingleton.print("singleCheckSynchronizedSingleton");

		// ===================== Method Three ===================== //
		PrinterSynchronizedSingleton doubleCheckSynchronizedSingleton = PrinterSynchronizedSingleton
				.getInstaneWithoutSynchronize();
		doubleCheckSynchronizedSingleton.print("doubleCheckSynchronizedSingleton");
	}

}
