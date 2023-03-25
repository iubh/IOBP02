package onlineshop;

public class Bestellung {
  private String date;
  private Kunde besteller;
  private Warenkorb warenkorb;

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
