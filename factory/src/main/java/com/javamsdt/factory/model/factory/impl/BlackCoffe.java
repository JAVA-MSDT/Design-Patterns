package com.javamsdt.factory.model.factory.impl;

import java.util.ArrayList;
import java.util.List;

import com.javamsdt.factory.model.factory.Coffe;

/**
 * 
 * @author Ahmed Samy https://github.com/JAVA-MSDT
 */
public class BlackCoffe implements Coffe {

	@Override
	public List<Coffe> makeCoffes(final int quantity) {
		List<Coffe> coffes = new ArrayList<>();
		System.out
		.println("Time for preparing: " + quantity + " of Coffes is: " + (quantity * preparingTimeForOneCup()));

		for (int i = 0; i < quantity; i++) {
			Coffe coffe = new BlackCoffe();
			coffes.add(coffe);
		}

		return coffes;
	}

	@Override
	public int preparingTimeForOneCup() {
		return 1;

	}

}
