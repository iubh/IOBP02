package onlineshop;

import java.util.Date;

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
   * To string.
   *
   * @return String
   */
  public String toString() {
    return "Kunden-Objekt enthält folgende Daten: " + "\n" +
        "Vorname: " + vorname + "\n" +
        "Nachname: " + name + "\n" +
        "Geschlecht: " + geschlecht + "\n" +
        "Geburtsdatum: " + geburtsdatum;
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
    }
    catch (CloneNotSupportedException ex) {
      System.out.println("Catch clone exception");
      return null;
    }
  }
}
