package com.design.flyweightPattern;

import java.util.Random;

public class Main {

	private static final String[] color = {"Red","Green", "Blue","Dark","Yellow","White"};
	
	public static void main(String[] args) {
		for (int i = 0; i < 40; i++) {
			Circle circle = (Circle) ShapeFactory.getCircle(randomColor());
			circle.setX(getX());
			circle.setY(getY());
			circle.setRadius(getRadius());
			
			circle.draw();
		}
	}

	private static String randomColor() {
		return color[new Random().nextInt(color.length)];
	}

	private static int getRadius() {
		return new Random().nextInt(60);
	}

	private static int getY() {
		return new Random().nextInt(40);
	}

	private static int getX() {
		return new Random().nextInt(10);
	}

}
