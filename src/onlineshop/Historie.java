package onlineshop;

import java.util.ArrayDeque;
import java.util.Deque;

// TODO: Auto-generated Javadoc
/**
 * The Class Historie.
 */
public class Historie {

  /** The historie. */
  private Deque<String> historie = new ArrayDeque<String>();

  /**
   * Zurueck.
   *
   * @return String
   */
  public String zurueck() {
    String letzterSchritt = historie.peekFirst();
    if (letzterSchritt != null)
      historie.removeFirst();
    return letzterSchritt;
  }

  /**
   * Weiter.
   *
   * @param s the s
   */
  public void weiter(String s) {
    historie.addFirst(s);
  }
}
