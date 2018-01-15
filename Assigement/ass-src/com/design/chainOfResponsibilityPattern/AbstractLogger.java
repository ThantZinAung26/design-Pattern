package com.design.chainOfResponsibilityPattern;

public abstract class AbstractLogger {
	public static int INFO = 1, DEBUG = 2, ERROR = 3;
	protected int level;
	protected AbstractLogger nextLogger;
	
	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}

	public void logMessage(int level, String message) {
		if (this.level <= level) {
			write(message);
		}
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	}

	abstract protected void write(String message);
}
