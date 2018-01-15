package com.design.bridgePattern;

public class Client {

	public static void main(String[] args) {
		Shape redCircle = new Circle(new RedCircle(),10,20,15);
		redCircle.draw();
	}

}
