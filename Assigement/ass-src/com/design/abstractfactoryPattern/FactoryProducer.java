package com.design.abstractfactoryPattern;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factory) {
		if (factory == "Shape") {
			return new ShapeFactory();
		} else if (factory == "Color") {
			return new ColorFactory();
		}
		return null;
	}
}
