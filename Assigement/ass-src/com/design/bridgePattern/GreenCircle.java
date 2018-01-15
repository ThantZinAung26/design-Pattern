package com.design.bridgePattern;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int x, int y, int radius) {
		System.out.println("Draw Circle [ Color Green : x;" + x + " y : " + y + " Radius : " + radius);

	}

}
