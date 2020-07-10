package com.javamsdt.di.withoutdi;

public class Runner {

	public static void main(final String[] arg) {
		PhoneNetwork phoneNetwork = new PhoneNetwork();

		System.out.println(
				"From Operator One using hard coded Constructor: " + phoneNetwork.getOperatorOne().getOperatorName());
		System.out.println(
				"From Operator One using hard coded Constructor: " + phoneNetwork.getOperatorOne().getOperatorPrefex());
		System.out.println(" ================================================ ");
	}
}
