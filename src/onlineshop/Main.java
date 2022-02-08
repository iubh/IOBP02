package onlineshop;

import onlineshop.waren.Buch;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Diese Klasse stellt den Einstiegspunkt in das Programm dar.
 * Dies Klasse beinhaltet die <code>mmain</code>-Methode, mit der
 * das Programm gestartet wird. Die <code>main</code>-Methode erzeugt
 * alle benötigten Objekte selbst und beendet sich, nachdem alle
 * Anweisungen abgearbeitet wurden.
 *
 * @author Alfred Walther
 * @version 1.0
 */
public class Main {
  private static Logger LOGGER = LogManager.getLogger(Main.class);

  /**
   * Der verwendete Online Shop.
   */
  public OnlineShop onlineShop = null;

  public static void main(String[] args) {
    // write your code here
    LOGGER.trace("Trace Message!");
    LOGGER.debug("Debug Message!");
    LOGGER.info("Info Message!");
    LOGGER.warn("Warn Message!");
    LOGGER.error("Error Message!");
    LOGGER.fatal("Fatal Message!");
  }

  /**
   * Legt ein neues Buch and und benachrichtigt die
   * Verwaltungsobjekte darüber.
   *
   * @param autor      Name des Autors des neuen Buches
   * @param titel      Titel des neuen Buches
   * @param hersteller Hersteller des neuen Buches
   * @param bestand    Anzahl des Buches im Lager
   * @return neue Buch-Instanz
   * @throws RuntimeException wenn das Aktualisieren des Bestandes fehlschlägt
   */
  static public Buch neuesBuch(String autor, String titel,
                               String hersteller, int bestand) {
    Buch neuesBuch = new Buch();
    neuesBuch.setAutor(autor);
    neuesBuch.setTitel(titel);
    neuesBuch.setHersteller(hersteller);
    return neuesBuch;
  }
}
