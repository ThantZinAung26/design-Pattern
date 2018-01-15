package com.design.chainOfResponsibilityPattern;

public class Main {

	private static AbstractLogger getChainOfLoggers() {
		AbstractLogger console = new ConsoleLogger(AbstractLogger.INFO);
		AbstractLogger file = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger error = new ErrorLogger(AbstractLogger.ERROR);

		console.setNextLogger(file);
		file.setNextLogger(error);

		return console;
	}

	public static void main(String[] args) {
		AbstractLogger logger = getChainOfLoggers();
		logger.logMessage(2, "This is Error");
		logger.logMessage(AbstractLogger.DEBUG, "This is Debugging");
		logger.logMessage(AbstractLogger.INFO, "This is Information");
	}

}
