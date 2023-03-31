package onlineshop;

import java.util.LinkedList;
import java.util.List;

import onlineshop.waren.Artikel;

// TODO: Auto-generated Javadoc
/**
 * The Class Warenkorb.
 */
public class Warenkorb {

  /** The anzahl artikel. */
  private int anzahlArtikel;

  /** The artikel summe. */
  private float artikelSumme;

  /** The gutschein eingeloest. */
  private boolean gutscheinEingeloest;

  /** The artikel liste. */
  private List<Artikel> artikelListe = new LinkedList<Artikel>();

  /**
   * Instantiates a new warenkorb.
   *
   * @param anzahlArtikel       the anzahl artikel
   * @param artikelSumme        the artikel summe
   * @param gutscheinEingeloest the gutschein eingeloest
   */
  public Warenkorb(int anzahlArtikel, float artikelSumme, boolean gutscheinEingeloest) {
    this.anzahlArtikel = anzahlArtikel;
    this.artikelSumme = artikelSumme;
    this.gutscheinEingeloest = gutscheinEingeloest;
  }

  /**
   * Instantiates a new warenkorb.
   */
  public Warenkorb() {
  }

  /**
   * @return String
   */
  @Override
  public String toString() {
    return Integer.toString(this.anzahlArtikel) + Float.toString(this.artikelSumme) + " "
        + Boolean.toString(this.gutscheinEingeloest);
  }

  /**
   * Hash code.
   *
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
   * Artikel hinzufuegen.
   *
   * @param position the position
   * @param a        the a
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
   * Artikel hinzufuegen.
   *
   * @param a the a
   * @return boolean
   */
  public boolean artikelHinzufuegen(Artikel a) {
    boolean erfolgreich = artikelListe.add(a);
    if (erfolgreich)
      artikelSumme += a.getPreis();
    return erfolgreich;
  }

  /**
   * Artikel entfernen.
   *
   * @param a the a
   * @return boolean
   */
  public boolean artikelEntfernen(Artikel a) {
    boolean erfolgreich = artikelListe.remove(a);
    if (erfolgreich)
      artikelSumme -= a.getPreis();
    return erfolgreich;
  }

  /**
   * Leere warenkorb.
   */
  public void leereWarenkorb() {
    artikelListe.clear();
    artikelSumme = 0;
  }

  /**
   * Gets the anzahl artikel.
   *
   * @return int
   */
  public int getAnzahlArtikel() {
    return artikelListe.size();
  }
}
