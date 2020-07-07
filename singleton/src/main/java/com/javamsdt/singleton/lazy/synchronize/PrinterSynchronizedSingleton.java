package com.javamsdt.singleton.lazy.synchronize;

/**
 * 
 * @author Ahmed Samy https://github.com/JAVA-MSDT
 */
public class PrinterSynchronizedSingleton {

	/**
	 * declaring only one instance of the class
	 */
	private static PrinterSynchronizedSingleton instance;

	/**
	 * Private constructor to prevent creating instance of the class from outside
	 */
	private PrinterSynchronizedSingleton() {

	}

	// ===================== Method One ===================== //
	/**
	 * whithout synchronized check it has good performance because of no
	 * synchronzation
	 * 
	 * @return the only created instance of the class
	 */
	public static PrinterSynchronizedSingleton getInstaneWithoutSynchronize() {
		if (instance == null) {
			instance = new PrinterSynchronizedSingleton();
		}
		return instance;

	}

	// ===================== Method Two ===================== //
	/**
	 * Single Check synchronized it will reduce the performance because of the
	 * synchronized methods which will be call everyt ime when we call the class
	 * 
	 * @return the only created instance of the class
	 */
	public static synchronized PrinterSynchronizedSingleton getInstanceSingleCheck() {
		if (instance == null) {
			instance = new PrinterSynchronizedSingleton();
		}

		return instance;
	}

	// ===================== Method Three ===================== //
	/**
	 * Double Check synchronized it has a better performance because we will call
	 * synchronized block only if the instance is null
	 * 
	 * @return the only created instance of the class
	 */
	public static PrinterSynchronizedSingleton getInstanceDoubleCheck() {
		if (instance == null) {
			synchronized (PrinterSynchronizedSingleton.class) {
				if (instance == null) {
					instance = new PrinterSynchronizedSingleton();
				}
			}
		}
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
