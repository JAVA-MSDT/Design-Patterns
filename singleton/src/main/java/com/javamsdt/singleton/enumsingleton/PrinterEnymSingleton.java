package com.javamsdt.singleton.enumsingleton;

/**
 * 
 * @author Ahmed Samy https://github.com/JAVA-MSDT
 */
public enum PrinterEnymSingleton {

	/**
	 * That is all and the Enum Type will take care of everything for you even
	 * thread safety
	 */
	INSTANCE;

	/**
	 * Method logic
	 */
	public void print(final String document) {
		System.out.println(" ================================================ ");
		System.out.println("Inside: " + this.getClass().getSimpleName() + ", Singleton to Print Dcument: " + document);
		System.out.println(" ================================================ ");
	}
}
