package com.design.decoratorPattern;

public class BlueShapeDecoretor extends ShapeDecorator {
	public BlueShapeDecoretor(Shape shapeDecorate) {
		super(shapeDecorate);
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println(setBlueBorder());
	}
	
	public String setBlueBorder() {
		return "Blue Border add";
	}
}
