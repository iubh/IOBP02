package onlineshop.waren;

import java.util.Objects;

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
public class Artikel implements Comparable<Artikel> {
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

  @Override
  public int compareTo(Artikel other) {
    if (other == null) throw new RuntimeException("[Artikel.compareTo] Der Vergleichsartikel ist null!");
    if (this == other) return 0;
    return this.artikelNr - other.artikelNr;
  }

  @Override
  public boolean equals(Object vergleichsArtikel) {
    if (this == vergleichsArtikel) return true;
    if (vergleichsArtikel == null || getClass() != vergleichsArtikel.getClass()) return false;
    Artikel artikel = (Artikel) vergleichsArtikel;
    return Objects.equals(beschreibung, artikel.beschreibung);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beschreibung, hersteller);
  }

  @Override
  public String toString() {
    return "Artikel{" +
            "beschreibung='" + beschreibung + '\'' +
            ", hersteller='" + hersteller + '\'' +
            '}';
  }
}
