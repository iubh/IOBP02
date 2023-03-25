package onlineshop;

import java.util.HashMap;
import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Class KundenverwaltungMitMaps.
 */
public class KundenverwaltungMitMaps {

  /** The kunden speicher. */
  private Map<Integer, Kunde> kunden, kundenSpeicher;

  /**
   * Instantiates a new kundenverwaltung mit maps.
   */
  public KundenverwaltungMitMaps() {
    kunden = new HashMap<Integer, Kunde>();
    Kunde k1 = new Kunde("Ulf", "Koll");
    Kunde k2 = new Kunde("Ilse", "Stahl");

    kunden.put(k1.getKundennummer(), k1);
    kunden.put(k2.getKundennummer(), k2);

    for (Kunde k : kunden.values())
      System.out.println(k);
  }

  /**
   * Aktualisiere alle kunden.
   */
  public void aktualisiereAlleKunden() {
    for (Kunde k : kunden.values())
      kundenSpeicher.put(k.zahl, k);
  }

  /**
   * 
   *
   * @param kundenNr the kunden nr
   * @return Kunde
   */
  public Kunde getKundendaten(int kundenNr) {
    Kunde k = kunden.get(kundenNr);
    return k;
  }
}
