package com.design.abstractfactoryPattern;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		if (shape.equalsIgnoreCase(null)) {
			return null;
		}else if(shape.equalsIgnoreCase("Circle")) {
			return new Circle();
		}else if(shape.equalsIgnoreCase("Square")) {
			return new Square();
			
		}else if(shape.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		return null;
	}

}
