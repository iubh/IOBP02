package onlineshop;

import java.util.LinkedList;
import java.util.List;

import onlineshop.waren.Artikel;

public class Warenkorb {
  private int anzahlArtikel;
  private float artikelSumme;
  private boolean gutscheinEingeloest;

  private List<Artikel> artikelListe = new LinkedList<Artikel>();

  /**
   * @return int
   */
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + anzahlArtikel;
    result = prime * result + Float.floatToIntBits(artikelSumme);
    result = prime * result + (gutscheinEingeloest ? 1231 : 1237);
    return result;
  }

  /**
   * @param position
   * @param a
   * @return boolean
   *         I recommend to use a Database. Following code is just for learning
   */
  public boolean artikelHinzufuegen(int position, Artikel a) {
    try {
      artikelListe.add(position, a);
      artikelSumme += a.getPreis();
    } catch (IndexOutOfBoundsException ex) {
      return false; // Position ist ungültig
    }
    return true;
  }

  /**
   * @param a
   * @return boolean
   */
  public boolean artikelHinzufuegen(Artikel a) {
    boolean erfolgreich = artikelListe.add(a);
    if (erfolgreich)
      artikelSumme += a.getPreis();
    return erfolgreich;
  }

  /**
   * @param a
   * @return boolean
   */
  public boolean artikelEntfernen(Artikel a) {
    boolean erfolgreich = artikelListe.remove(a);
    if (erfolgreich)
      artikelSumme -= a.getPreis();
    return erfolgreich;
  }

  public void leereWarenkorb() {
    artikelListe.clear();
    artikelSumme = 0;
  }

  /**
   * @return int
   */
  public int getAnzahlArtikel() {
    return artikelListe.size();
  }
}
