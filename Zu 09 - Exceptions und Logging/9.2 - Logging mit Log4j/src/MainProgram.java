import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Run {

  private static Logger logger = Logger.getLogger(Run.class);

  /**
   * @param args
   */
  public static void main(String[] args) {

    // Entweder mit BasicConfigurator
    // BasicConfigurator.configure();

    // ODER mit log4JPropertyFile
    try {
      String log4JPropertyFile = "E:/workspaces/spielewiese/PG_Tutor/src/de/oth/log4j.properties";
      Properties p = new Properties();
      p.load(new FileInputStream(log4JPropertyFile));

      PropertyConfigurator.configure(p);
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Passendes Log-Level setzten - DEBUG, INFO, WARN, ERROR, FATAL
    logger.setLevel(Level.WARN);

    logger.debug("Meine Debug-Meldung");
    logger.info("Meine Info-Meldung");
    logger.warn("Meine Warn-Meldung");
    logger.error("Meine Error-Meldung");
    logger.fatal("Meine Fatal-Meldung");

  }

}