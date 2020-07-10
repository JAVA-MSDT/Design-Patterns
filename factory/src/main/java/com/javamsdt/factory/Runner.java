package com.javamsdt.factory;

import java.util.List;

import com.javamsdt.factory.model.factory.Coffe;
import com.javamsdt.factory.model.factory.CoffeFactoryMaker;

/**
 * 
 * @author Ahmed Samy https://github.com/JAVA-MSDT
 */
public class Runner {
	public static void main(final String[] args) {
		CoffeFactoryMaker coffeFactoryMaker = new CoffeFactoryMaker();

		List<Coffe> coffes = coffeFactoryMaker.coffes(10, "blackCoffe");

		if (coffes.size() == 10) {
			System.out.println("Your coffe order is ready");
		} else if (coffes.isEmpty()) {
			System.out.println("Your Coffe type is not in the list!! ;(");
		}

		coffes = coffeFactoryMaker.coffes(20, "coffeWithMilk");

		if (coffes.size() == 20) {
			System.out.println("Your coffe order With Milk is ready");
		} else if (coffes.isEmpty()) {
			System.out.println("Your Coffe type is not in the list!! ;(");
		}
	}
}
