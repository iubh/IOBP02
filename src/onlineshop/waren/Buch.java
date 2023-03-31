package onlineshop.waren;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Buch.
 */
public class Buch extends Artikel implements Cloneable {

  /** The seiten. */
  protected int seiten;

  /** The autor. */
  protected String autor;

  /** The titel. */
  protected String titel;

  /** The scanner. */
  Scanner scanner;

  /**
   * Gets the beschreibung.
   *
   * @return the beschreibung
   */
<<<<<<< HEAD
=======

>>>>>>> feature/mp-exercises-java-classbib
  @Override
  public String getBeschreibung() {
    return super.getBeschreibung();
  }

  /**
   * Sets the seiten.
   *
   * @param seiten the new seiten
   */
  @Deprecated
  public void setSeiten(int seiten) {
    this.seiten = seiten;
  }

  /**
   * Sets the anzahl seiten.
   *
   * @param seiten the new anzahl seiten
   */
  public void setAnzahlSeiten(int seiten) {
    this.seiten = seiten;
  }

  /**
   * Sets the autor.
   *
   * @param autor the new autor
   */
  public void setAutor(final String autor) {
    this.autor = autor;
  }

  /**
   * Sets the titel.
   *
   * @param titel the new titel
   */
  public void setTitel(final String titel) {
    this.titel = titel;
  }

  /**
   * Clone.
   *
   * @return the buch
   */
  @Override
  public Buch clone() {
    Buch buch = null;

    try {
      buch = (Buch) super.clone();
      buch = (Buch) super.clone();
      buch.titel = this.titel;
      buch.autor = this.autor;
      buch.seiten = this.seiten;
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return buch;
  }

  /**
   * @param obj
   * @return boolean
   */
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj instanceof Buch) {
      Buch b = (Buch) obj;
      return (seiten == b.seiten && autor.equals(b.autor) && titel.equals(b.titel));
    } else
      return super.equals(obj);
  }

  /**
   * @return int
   */
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return "Buch{" +
        "seiten=" + seiten +
        ", autor='" + autor + '\'' +
        ", titel='" + titel + '\'' +
        ", scanner=" + scanner +
        '}';
  }
}
