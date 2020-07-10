package com.javamsdt.di.withdi;

import com.javamsdt.di.withdi.model.PhoneNetwork;
import com.javamsdt.di.withdi.model.operator.Operator;
import com.javamsdt.di.withdi.model.operator.impl.OperatorOne;
import com.javamsdt.di.withdi.model.operator.impl.OperatorTwo;

/**
 * With DI Runner
 * @author Ahmed Samy https://github.com/JAVA-MSDT
 */
public class Runner {

	public static void main(final String[] args) {

		// ========= INJECT USING CONSTRUCTOR ========= //
		Operator operatorOne = new OperatorOne();
		PhoneNetwork networkOne = new PhoneNetwork(operatorOne);

		System.out.println("From Operator One using Constructor: " + networkOne.getOperator().getOperatorName());
		System.out.println("From Operator One using Constructor: " + networkOne.getOperator().getOperatorPrefex());
		System.out.println(" ================================================ ");

		// ========= INJECT USING SETTERS ========= //
		operatorOne = new OperatorTwo();
		PhoneNetwork networkTwo = new PhoneNetwork();
		networkTwo.setOperator(operatorOne);

		System.out.println("From Operator Two using Setters: " + networkTwo.getOperator().getOperatorName());
		System.out.println("From Operator Two using Setters: " + networkTwo.getOperator().getOperatorPrefex());
		System.out.println(" ================================================ ");
	}

}
