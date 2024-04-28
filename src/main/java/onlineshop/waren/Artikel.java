package onlineshop.waren;

public class Artikel implements Comparable<Artikel> {
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

  public String getHersteller() {
    return hersteller;
  }

  public void setHersteller(final String hersteller) {
    this.hersteller = hersteller;
  }

  @Override
  public int compareTo(Artikel andererArtikel) {
    return this.beschreibung.compareTo(andererArtikel.beschreibung);
  }
}
