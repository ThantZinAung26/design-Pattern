package com.design.proxyPattern;

public class ProxyImage implements Image {

	RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public String display() {
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		return realImage.display();
	}

}
