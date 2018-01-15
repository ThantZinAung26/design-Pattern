package com.design.factoryPattern;

public class Main {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape = shapeFactory.getShape(new Circle());
		System.out.println(shape.draw("Circle Draw"));
	}
}
