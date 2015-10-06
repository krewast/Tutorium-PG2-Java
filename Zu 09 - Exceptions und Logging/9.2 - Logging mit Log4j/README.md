#9.2 - Logging mit Log4j

Schreiben Sie ein einfaches Programm, welches den Log4j-Logger verwendet. (Laden Sie hierzu die Log4j.jar-Datei herunter)

Kopiere Sie folgenden Abschnitt in Ihr Programm und setzen Sie verschiedene Levels.

    logger.debug("Meine Debug-Meldung");
    logger.info( "Meine Info-Meldung" );
    logger.warn( "Meine Warn-Meldung" );
    logger.error("Meine Error-Meldung");
    logger.fatal("Meine Fatal-Meldung");

*Hinweis: Beachten Sie, dass Sie einen Appender definieren müssen - im einfachsten Fall nehmen Sie die Console)*