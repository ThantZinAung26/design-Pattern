package com.design.straregyPattern;

public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public int executeStrategy(int num,int num1) {
		return strategy.doOperation(num, num1);
	}
}
