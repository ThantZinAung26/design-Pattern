package com.design.flyweightPattern;

public class Circle implements Shape {

	private int x, y, radius;
	private String color;

	public Circle(String color) {
		super();
		this.color = color;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle [x=" + x + ", y=" + y + ", radius=" + radius + ", color=" + color + "]");
	}

}
