package com.javamsdt.singleton.lazy.billpugh;

/**
 * 
 * @author Ahmed Samy https://github.com/JAVA-MSDT
 */
public class PrinterBillPughSingleton {

	/**
	 * Private constructor to prevent creating instance of the class from outside
	 */
	private PrinterBillPughSingleton() {

	}

	/**
	 * Private inner class to create only one instance of the class
	 */
	private static class PrintSingletonHelper {
		private final static PrinterBillPughSingleton INSTANCE = new PrinterBillPughSingleton();
	}

	/**
	 * 
	 * @return the only created instance of the class
	 */
	public static PrinterBillPughSingleton getInstance() {
		return PrintSingletonHelper.INSTANCE;
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
