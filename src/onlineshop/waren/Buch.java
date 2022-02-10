package onlineshop.waren;

import java.util.Scanner;

public class Buch extends Artikel implements Cloneable {
  protected int seiten;
  protected String autor;
  protected String titel;
  Scanner scanner;

  @Override
  public String getBeschreibung() {
    return super.getBeschreibung();
  }

  @Deprecated
  public void setSeiten(int seiten) {
    this.seiten = seiten;
  }

  public void setAnzahlSeiten(int seiten) {
    this.seiten = seiten;
  }

  public void setAutor(final String autor) {
    this.autor = autor;
  }

  public void setTitel(final String titel) {
    this.titel = titel;
  }

  @Override
  public Buch clone() {
    Buch buch = null;

    try {
      buch = (Buch)super.clone();
      buch.titel = this.titel;
      buch.autor = this.autor;
      buch.seiten = this.seiten;
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return buch;
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
