package com.javamsdt.singleton.singletonproblem.serializationproblem;

import java.io.Serializable;

/**
 * 
 * @author Ahmed Samy https://github.com/JAVA-MSDT
 */
public class PrinterSingletonSerilazier implements Serializable {

	/**
	 * UUID
	 */
	private static final long serialVersionUID = 1463238879402364553L;

	/**
	 * declaring only one instance of the class
	 */
	private static PrinterSingletonSerilazier instance;

	/**
	 * Private constructor to prevent creating instance of the class from outside
	 */
	private PrinterSingletonSerilazier() {

	}

	/**
	 * whithout synchronized check it has good performance because of no
	 * synchronzation
	 * 
	 * @return the only created instance of the class
	 */
	public static PrinterSingletonSerilazier getInstance() {
		if (instance == null) {
			instance = new PrinterSingletonSerilazier();
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

	/**
	 * If you removed this method so everytime you deserialize that instance you
	 * will be creating a new instance to test, comment then run the Runner class in
	 * the same package to see the differences in the HashCode. This method
	 * responsible of deserializing the same instance object not a new one
	 * 
	 * @return the only created instance object
	 */

	protected Object readResolve() {
		return getInstance();
	}

}
