#9.3 - Logging mit Interface

##9.3.1 - Logging Interface

Erstellen Sie ein package **log**, das ein Interface **LogInterface** enthält. Dieses soll eine Schnittstelle für das Loggen (d. h. Protokollieren) von error, warning und debug (log level) Nachrichten bereitstellen. Verwenden Sie für die Abbildung des log levels eine **enum**.

Das Interface soll die folgenden Methoden enthalten:

    void setLogLevel(LogLevel level)
    void error(String msg)
    void warning(String msg)
    void debug(String msg)

##9.3.2 - ConsoleLogging-Klasse

Fügen Sie nun dem **log** package die Klasse **ConsoleLog** hinzu, welche das **LogInterface** implementiert, indem die Nachrichten auf dem Bildschirm ausgegeben werden. Dabei sollen für das log level DEBUG alle Nachrichten ausgegeben werden, für das log level WARNING sollen nur die Nachrichten des log levels warning angezeigt werden und für das log level ERROR sollen nur Nachrichten des log levels error ausgegeben werden. Schreiben Sie ein Programm, die eine Instanz der **ConsoleLog** Klasse erstellt und deren Funktionen testet.