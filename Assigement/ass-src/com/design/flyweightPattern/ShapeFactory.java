package com.design.flyweightPattern;

import java.util.HashMap;

public class ShapeFactory {
	public static int count = 0;
	private static HashMap<String,Shape> circleMap = new HashMap<>();
	
	public static Shape getCircle(String color) {
		Circle circle = (Circle)circleMap.get(color);
		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println(count++ +" :: "+ "Creating circle of color : " + color );
		}
		return circle;
	}
}
