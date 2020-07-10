package com.javamsdt.di.withoutdi;

import com.javamsdt.di.withdi.model.operator.impl.OperatorOne;

/**
 * Phone Network without the DI Pattern
 * 
 * @author Ahmed Samy https://github.com/JAVA-MSDT
 */
public class PhoneNetwork {

	/**
	 * instance variable will be hard coded inside the Constructor
	 */
	private OperatorOne operatorOne;

	public PhoneNetwork() {
		operatorOne = new OperatorOne();
	}

	public OperatorOne getOperatorOne() {
		return operatorOne;
	}

}
