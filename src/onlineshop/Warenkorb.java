package onlineshop;

public class Warenkorb {
  private int anzahlArtikel;
  private float artikelSumme;
  private boolean gutscheinEingeloest;

  
  /** 
   * @return int
   */
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + anzahlArtikel;
    result = prime * result + Float.floatToIntBits(artikelSumme);
    result = prime * result + (gutscheinEingeloest ? 1231 : 1237);
    return result;
  }
}
