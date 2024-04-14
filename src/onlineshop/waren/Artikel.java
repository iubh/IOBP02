package onlineshop.waren;

public class Artikel implements Cloneable {
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
    this.beschreibung = beschreibung;
    this.hersteller = hersteller;
  }

  public String getBeschreibung() {
    return beschreibung;
  }

  public void setHersteller(final String hersteller) {
    this.hersteller = hersteller;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  protected Artikel clone() throws CloneNotSupportedException {
    Artikel artikel = (Artikel) super.clone();
    artikel.hersteller = this.hersteller;
    artikel.beschreibung = this.beschreibung;
    return artikel;
  }
}
