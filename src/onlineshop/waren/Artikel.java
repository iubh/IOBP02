package onlineshop.waren;

// TODO: Auto-generated Javadoc
/**
 * The Class Artikel.
 */
public class Artikel implements Cloneable {
  
  /** The beschreibung. */
  protected String beschreibung;
  
  /** The hersteller. */
  protected String hersteller;

  /**
   * Gets the beschreibung.
   *
   * @return the beschreibung
   */
  public String getBeschreibung() {
    return beschreibung;
  }

  /**
   * Sets the hersteller.
   *
   * @param hersteller the new hersteller
   */
  public void setHersteller(final String hersteller) {
    this.hersteller = hersteller;
  }

  /**
   * Hash code.
   *
   * @return the int
   */
  @Override
  public int hashCode() {
    return super.hashCode();
  }

  /**
   * Clone.
   *
   * @return the artikel
   * @throws CloneNotSupportedException the clone not supported exception
   */
  @Override
  protected Artikel clone() throws CloneNotSupportedException {
    Artikel artikel = (Artikel) super.clone();
    artikel.hersteller = this.hersteller;
    artikel.beschreibung = this.beschreibung;
    return artikel;
  }
}
