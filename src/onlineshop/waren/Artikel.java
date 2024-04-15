package onlineshop.waren;

/**
 * Repräsentiert einen Shop-Artikel.<br/
 * Felder:<br/>
 * {@link #beschreibung}  - beschreibt den Artikel<br/
 * {@link #hersteller} - kennzeichnet den Artikel-Hersteller<br/
 * {@link #artikelNr} - die eingeutige Artikelnummer<br/
 *
 * @author Alfred Walther
 * @version 1.1
 */
public class Artikel implements Cloneable {
  /** erzeugt für jeden Artikel eine neue Artikelnummer */
  private static int artikelCounter = 1;
  protected String beschreibung;
  protected String hersteller;
  protected int artikelNr;

  public Artikel() {
    this.artikelNr = Artikel.artikelCounter++;
  }

  public Artikel(String beschreibung, String hersteller) {
    this.beschreibung = beschreibung;
    this.hersteller = hersteller;
  }

  public String getBeschreibung() {
    return beschreibung;
  }

  public void setHersteller(final String hersteller) {
    this.hersteller = hersteller;
  }

}
