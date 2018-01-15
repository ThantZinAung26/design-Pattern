package com.design.abstractfactoryPattern;

public class Main {

	public static void main(String[] args) {

		AbstractFactory shape = FactoryProducer.getFactory("Shape");
		Shape circle = shape.getShape("Circle");
		circle.draw();
		// boolean test = FactoryProducer.getFactory("Shape").equals(new
		Shape rectangle = shape.getShape("Rectangle");
		rectangle.draw();
		Shape square = shape.getShape("Square");
		square.draw();
		AbstractFactory color = FactoryProducer.getFactory("Color");
		Color red = color.getColor("Red");
		red.fill();
		Color green = color.getColor("Green");
		green.fill();
		Color blue = color.getColor("Blue");
		blue.fill();

	}

}
