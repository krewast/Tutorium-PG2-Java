package de.oth.pg2.log;

import org.apache.log4j.lf5.LogLevel;

public class ConsoleLog implements LogInterface {

	LogLevel level;

	@Override
	public void setLogLevel(LogLevel level) {
		// TODO Auto-generated method stub
		this.level = level;
	}

	@Override
	public void error(String msg) {
		System.out.println("error: " + msg);
	}

	@Override
	public void warning(String msg) {
		System.out.println("warning: " + msg);
	}

	@Override
	public void debug(String msg) {
		System.out.println("debug: " + msg);
	}

	public void log(String msg) {

		String lvl = level.toString();

		switch (lvl) {
		case "DEBUG":
			debug(msg);
		case "WARN":
			warning(msg);
		case "ERROR":
			error(msg);
		}
	}
}
