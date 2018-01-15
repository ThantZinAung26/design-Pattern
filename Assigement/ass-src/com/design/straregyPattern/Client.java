package com.design.straregyPattern;

public class Client {

	public static void main(String[] args) {
		Context add = new Context(new OperationAdd());
		System.out.println(add.executeStrategy(30, 230));

		add = new Context(new OperationMultiply());
		System.out.println(add.executeStrategy(20, 40));

		add = new Context(new OperationSubstract());
		System.out.println(add.executeStrategy(50, 41));

	}

}
