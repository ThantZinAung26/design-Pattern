package com.design.bridgePattern;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int x, int y, int radius) {
		System.out.println("Draw Circle [ Color red : x;" + x + " y : " + y + " Radius : " + radius);
	}

}
