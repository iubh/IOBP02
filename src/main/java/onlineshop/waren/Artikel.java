package onlineshop.waren;

public class Artikel {
  private static int artikelCounter = 1;
  /** Beschreibungstext des Artikel */
  protected String beschreibung;
  /** Hersteller des Artikel */
  protected String hersteller;
  /** Eindeutige Nummer des Artikels */
  protected int artikelNr;

  public Artikel() {
    this.artikelNr = Artikel.artikelCounter++;
  }

  public Artikel(String beschreibung, String hersteller) {
    this();
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
