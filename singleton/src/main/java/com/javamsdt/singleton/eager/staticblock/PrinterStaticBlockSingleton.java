package com.javamsdt.singleton.eager.staticblock;
/**
 * 
 * @author Ahmed Samy 
 * https://github.com/JAVA-MSDT
 */
public class PrinterStaticBlockSingleton {

	/**
	 * declaring only one instance of the class
	 */
	private static PrinterStaticBlockSingleton instance;

	/**
	 * Private constructor to prevent creating instance of the class from outside
	 */
	private PrinterStaticBlockSingleton() {

	}

	/**
	 * Instantiating the only declaring instance variable for the class
	 */
	static {
		try {
			instance = new PrinterStaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException(
					"Something wrong during the instantiaiton of the PrinterStaticBlockSingleton Singleton Class: " + e);
		}
	}

	/**
	 * 
	 * @return the only created instance of the class
	 */
	public static PrinterStaticBlockSingleton getInstance() {
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
