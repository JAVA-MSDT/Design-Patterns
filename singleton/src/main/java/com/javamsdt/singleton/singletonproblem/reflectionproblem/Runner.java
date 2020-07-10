package com.javamsdt.singleton.singletonproblem.reflectionproblem;

import java.lang.reflect.Constructor;

public class Runner {

	public static void main(final String[] args) {

		PrinterInstanceInitializerSingletonReflection singletonReflectionOriginal = PrinterInstanceInitializerSingletonReflection
				.getInstance();

		PrinterInstanceInitializerSingletonReflection singletonReflectionReflection = null;

		try {
			Constructor<?>[] constructors = PrinterInstanceInitializerSingletonReflection.class
					.getDeclaredConstructors();
			for (Constructor<?> constructor : constructors) {
				constructor.setAccessible(true);
				singletonReflectionReflection = (PrinterInstanceInitializerSingletonReflection) constructor
						.newInstance();
				break;
			}
		} catch (Exception e) {
			throw new RuntimeException("Something went Wrong using reflection: " + e);
		}

		System.out.println("singletonReflectionOriginal HashCode: " + singletonReflectionOriginal.hashCode());
		System.out.println("singletonReflectionReflection HashCode: " + singletonReflectionReflection.hashCode());

	}

}
