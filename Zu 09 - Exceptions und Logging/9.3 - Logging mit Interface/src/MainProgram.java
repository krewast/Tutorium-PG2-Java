import org.apache.log4j.lf5.LogLevel;

public class MainProgram
{
    public static void main(String[] args)
    {
        // Erstellen eines neuen ConsoleLog
        ConsoleLog cLog = new ConsoleLog();

        // Loggen auf lvl WARN
        cLog.setLogLevel(LogLevel.WARN);
        cLog.log("MSG1");

        // Loggen auf lvl DEBUG
        cLog.setLogLevel(LogLevel.DEBUG);
        cLog.log("MSG2");
    }
}


