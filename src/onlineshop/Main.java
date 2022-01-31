package onlineshop;

import onlineshop.waren.Buch;

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
    /**
     * Der verwendete Online Shop.
     */
    public OnlineShop onlineShop = null;

    /**
     * Legt ein neues Buch and und benachrichtigt die
     * Verwaltungsobjekte darüber.
     *
     * @param autor Name des Autors des neuen Buches
     * @param titel Titel des neuen Buches
     * @param hersteller Hersteller des neuen Buches
     * @param bestand Anzahl des Buches im Lager
     *
     * @return neue Buch-Instanz
     * @throws RuntimeException wenn das Aktualisieren des Bestandes fehlschlägt
     */
    public Buch neuesBuch(String autor, String titel,
                          String hersteller, int bestand) {
        Buch neuesBuch = new Buch();
        neuesBuch.setAutor(autor);
        neuesBuch.setTitel(titel);
        neuesBuch.setHersteller(hersteller);
        return neuesBuch;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
