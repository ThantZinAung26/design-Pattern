package com.design.singletonPattern;

public class Mian {

	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
		SingleObject test2 = SingleObject.getInstance();
		test2.showMessage();
		//SingleObject obj = new SingleObject();
	}

}
