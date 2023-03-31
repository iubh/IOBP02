package onlineshop;

import java.util.Scanner;

import onlineshop.waren.Buch;

// TODO: Auto-generated Javadoc
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// TODO: Auto-generated Javadoc
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
  
  /** The logger. */
  private static Logger LOGGER = LogManager.getLogger(Main.class);

  /**
   * Der verwendete Online Shop.
   */
  public OnlineShop onlineShop = null;

  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    // write your code here
    System.out.println("Bitte eine Zahl auswählen (1 oder 2): ");
    Scanner s = new Scanner(System.in);
    int eingabe = s.nextInt();
    switch (eingabe) {
      default -> {
        System.out.println("Hi - please read docs!");
        s.close();
        break;
      }
      case 1 -> {
        Buch buch = neuesBuch("asdfasdf", "asdfasdfasdf", "asdfasdf", 333);
        Buch buch2 = buch.clone();
        Kunde k1 = new Kunde("Markus", "G");
        Kunde k2 = new Kunde("Anja", "K");
        System.out.println("buch2 = " + buch2);
        System.out.println(buch.toString());
        System.out.println(buch.hashCode());
        System.out.println(k1.hashCode());
        System.out.println(k1 == k2);
        s.close();
        break;
      }
      case 2 -> {
        new OnlineShop();
        break;
      }
    }
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
