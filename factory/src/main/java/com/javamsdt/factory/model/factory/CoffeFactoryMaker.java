package com.javamsdt.factory.model.factory;

import java.util.Collections;
import java.util.List;

import com.javamsdt.factory.model.factory.impl.BlackCoffe;
import com.javamsdt.factory.model.factory.impl.CoffeWithMilc;

/**
 * 
 * @author Ahmed Samy https://github.com/JAVA-MSDT
 */
public class CoffeFactoryMaker {

	private Coffe getCoffe(final String coffyType) {

		switch (coffyType) {
		case "blackCoffe":
			return new BlackCoffe();
		case "coffeWithMilk":
			return new CoffeWithMilc();
		default:
			System.out.println("Your Coffe type is not in the list!! ;(");
			return null;
		}
	}

	public List<Coffe> coffes(final int quantity, final String coffeType) {
		Coffe coffe = getCoffe(coffeType);

		if (coffe != null) {
			return coffe.makeCoffes(quantity);
		} else {
			System.out.println("Your Coffe type is not in the list!! ;(");
			return Collections.emptyList();
		}

	}
}
