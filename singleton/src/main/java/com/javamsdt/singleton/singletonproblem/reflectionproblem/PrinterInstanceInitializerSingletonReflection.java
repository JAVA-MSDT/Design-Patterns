package com.javamsdt.singleton.singletonproblem.reflectionproblem;

/**
 * 
 * @author Ahmed Samy 
 * https://github.com/JAVA-MSDT
 */
public class PrinterInstanceInitializerSingletonReflection {

	/**
	 * creating only one instance of the class
	 */
	private static PrinterInstanceInitializerSingletonReflection instance = new PrinterInstanceInitializerSingletonReflection();

	/**
	 * Private constructor to prevent creating instance of the class from outside
	 */
	private PrinterInstanceInitializerSingletonReflection() {

	}

	/**
	 * 
	 * @return the only created instance of the class
	 */
	public static PrinterInstanceInitializerSingletonReflection getInstance() {
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
