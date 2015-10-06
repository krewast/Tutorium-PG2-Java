package de.oth.pg2.log;

import org.apache.log4j.lf5.LogLevel;

public interface LogInterface {

    void setLogLevel(LogLevel level);
    void error(String msg);
    void warning(String msg);
    void debug(String msg);

}
