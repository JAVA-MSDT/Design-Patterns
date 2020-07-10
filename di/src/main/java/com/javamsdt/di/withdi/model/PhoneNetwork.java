package com.javamsdt.di.withdi.model;

import com.javamsdt.di.withdi.model.operator.Operator;

/**
 * Phone Network with the DI Pattern
 * 
 * @author Ahmed Samy https://github.com/JAVA-MSDT
 */
public class PhoneNetwork {

	/**
	 * instance of Interface which will be used for instance class declaration the
	 * instance variable will be instantiated using Constructor or Setter
	 */
	private Operator operator;

	public PhoneNetwork() {
	}

	public PhoneNetwork(final Operator operator) {
		this.operator = operator;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(final Operator operator) {
		this.operator = operator;
	}

}
