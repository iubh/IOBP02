package onlineshop;

// TODO: Auto-generated Javadoc
/**
 * The Class Bestellung.
 */
public class Bestellung {

  /** The date. */
  private String date;

  /** The besteller. */
  private Kunde besteller;

  /** The warenkorb. */
  private Warenkorb warenkorb;

  /**
   * Instantiates a new bestellung.
   *
   * @param date      the date
   * @param besteller the besteller
   * @param warenkorb the warenkorb
   */
  public Bestellung(String date, Kunde besteller, Warenkorb warenkorb) {
    this.date = date;
    this.besteller = besteller;
    this.warenkorb = warenkorb;
  }

  /**
   * @return String
   */
  @Override
  public String toString() {
    return this.date + " " + this.besteller + " " + this.warenkorb;
  }
}
