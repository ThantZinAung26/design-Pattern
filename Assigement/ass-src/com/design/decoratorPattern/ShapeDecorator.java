package com.design.decoratorPattern;

public abstract class ShapeDecorator implements Shape {
	
	protected Shape shapeDecorate;

	
	public ShapeDecorator(Shape shapeDecorate) {
		super();
		this.shapeDecorate = shapeDecorate;
	}


	@Override
	public void draw() {
		shapeDecorate.draw();
	}

}
