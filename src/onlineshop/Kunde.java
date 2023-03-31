package onlineshop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Kunde.
 */
public class Kunde implements Cloneable {

  /** The kundennummer. */
  private int kundennummer;

  /** The vorname. */
  private String vorname;

  /** The name. */
  private String name;

  /** The geschlecht. */
  private String geschlecht;

  /** The geburtsdatum. */
  private Date geburtsdatum;

  /**
   * Instantiates a new kunde.
   *
   * @param vorname  the vorname
   * @param nachname the nachname
   */
  public Kunde(String vorname, String nachname) {
    this.vorname = vorname;
    this.name = nachname;
  }

  /**
   * Gets the kundennummer.
   *
   * @return int
   */
  public int getKundennummer() {
    return kundennummer;
  }

  /**
   * To string.
   *
   * @return String
   */
  public String toString() {
    return vorname + " " + name;
    // "Geschlecht: " + geschlecht + "\n" +
    // "Geburtsdatum: " + geburtsdatum;
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

    if (obj instanceof Kunde) {
      Kunde k = (Kunde) obj;
      return kundennummer == k.kundennummer;
    } else
      return super.equals(obj);
  }

  /**
   * Compare to.
   *
   * @param k the k
   * @return the int
   */
  public int compareTo(Kunde k) {
    return kundennummer - k.kundennummer;
  }

  /**
   * Clone.
   *
   * @return the kunde
   */
  public Kunde clone() {
    try {
      Kunde k = (Kunde) super.clone();
      return k;
    } catch (CloneNotSupportedException ex) {
      System.out.println("Catch clone exception");
      return null;
    }
  }

  /**
   * Hash code.
   *
   * @return int
   */
  public int hashCode() {
    String s = vorname + name + geschlecht;
    return s.hashCode();
  }

  /** The zahl. */
  int zahl = 5;

  /** The list. */
  List<Integer> list = new ArrayList<Integer>();

  /** The wrapper. */
  Integer wrapper = new Integer(zahl);

  /**
   * 
   *
   * @param zahl    the zahl
   * @param wrapper the wrapper
   */
  public void add(int zahl, Integer wrapper) {
    list.add(wrapper);
  }
}
