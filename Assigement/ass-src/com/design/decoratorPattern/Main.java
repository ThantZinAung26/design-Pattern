package com.design.decoratorPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape redCircle = new RedShapeDecorate(new Circle());
		redCircle.draw();
		Shape redRectangle = new RedShapeDecorate(new Rectangle());
		redRectangle.draw();
		Shape square = new BlueShapeDecoretor(new Square());
		square.draw();
	}

}
