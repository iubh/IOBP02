package onlineshop;

import java.util.Date;

public class Kunde implements Comparable<Kunde> {
  private int kundennummer;
  private String vorname;
  private String name;
  private String geschlecht;
  private Date geburtsdatum;

  /**
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

  public int compareTo(Kunde k) {
    return kundennummer - k.kundennummer;
  }
}
