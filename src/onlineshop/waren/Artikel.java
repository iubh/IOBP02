package onlineshop.waren;

// TODO: Auto-generated Javadoc
/**
 * The Class Artikel.
 */
public class Artikel implements Cloneable {

  /** The beschreibung. */
  protected String beschreibung;

  /** The preis. */
  protected float preis;

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
   * Sets the preis.
   *
   * @param preis the new preis
   */
  public void setPreis(float preis) {
    this.preis = preis;
  }

  /**
   * Gets the preis.
   *
   * @return float
   */
  public float getPreis() {
    return this.preis;
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

  /**
   * To string.
   *
   * @return the string
   */
  public String toString() {
    return super.toString();
  }

  /**
   * Equals.
   *
   * @param obj the obj
   * @return boolean
   */
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj instanceof Artikel) {
      Artikel a = (Artikel) obj;
      return (beschreibung.equals(a.beschreibung) && hersteller.equals(a.hersteller));
    } else
      return super.equals(obj);
  }
}
