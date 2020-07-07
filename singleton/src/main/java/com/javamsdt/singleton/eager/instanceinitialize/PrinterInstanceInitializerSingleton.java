package com.javamsdt.singleton.eager.instanceinitialize;

/**
 * 
 * @author Ahmed Samy 
 * https://github.com/JAVA-MSDT
 */
public class PrinterInstanceInitializerSingleton {

	/**
	 * creating only one instance of the class
	 */
	private static PrinterInstanceInitializerSingleton instance = new PrinterInstanceInitializerSingleton();

	/**
	 * Private constructor to prevent creating instance of the class from outside
	 */
	private PrinterInstanceInitializerSingleton() {

	}

	/**
	 * 
	 * @return the only created instance of the class
	 */
	public static PrinterInstanceInitializerSingleton getInstance() {
		return instance;
	}

	/**
	 * Method logic
	 */
	public void print(final String document) {
		System.out.println(" ================================================ ");
		System.out.println("Inside: " + this.getClass().getSimpleName() + ", Singleton to Print Dcument: " + document);
		System.out.println(" ================================================ ");
	}
}
