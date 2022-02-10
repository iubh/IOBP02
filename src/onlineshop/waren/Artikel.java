package onlineshop.waren;

public class Artikel implements Cloneable {
  protected String beschreibung;
  protected String hersteller;

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
