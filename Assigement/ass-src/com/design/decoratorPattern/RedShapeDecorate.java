package com.design.decoratorPattern;

public class RedShapeDecorate extends ShapeDecorator {
	
	public RedShapeDecorate(Shape shapeDecorate) {
		super(shapeDecorate);
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		shapeDecorate.draw();
		setRedBorder();
	}
	
	public void setRedBorder() {
		System.out.println("Red Border Add");
	}
}
