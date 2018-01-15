package com.design.proxyPattern;

public class Main {

	public static void main(String[] args) {
		Image image = new ProxyImage("Hide jpg");
		System.out.println(image.display());
		System.out.println();
		System.out.println(image.display());
	}

}
