package com.design.proxyPattern;

public class RealImage implements Image {
	private String fileName;

	public RealImage(String fileName) {
		super();
		this.fileName = fileName;
		System.out.println(loadFormatDisk());
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "Real Image file " + fileName;
	}
	
	public String loadFormatDisk() {
		return "Loading Format from disk " + fileName;
	}

}
