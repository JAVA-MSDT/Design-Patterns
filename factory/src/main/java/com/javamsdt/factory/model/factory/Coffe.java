package com.javamsdt.factory.model.factory;

import java.util.List;

/**
 * 
 * @author Ahmed Samy 
 * https://github.com/JAVA-MSDT
 */
public interface Coffe {

	List<Coffe> makeCoffes(int quantity);

	int preparingTimeForOneCup();
}
