package onlineshop.sortiment;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import onlineshop.waren.Artikel;

// TODO: Auto-generated Javadoc
/**
 * The Class Sortiment.
 */
public class Sortiment {

  /** The sortiment. */
  private Set<Artikel> sortiment = new HashSet<Artikel>();

  /**
   * Neuer artikel.
   *
   * @param b the b
   * @return boolean
   */
  public boolean neuerArtikel(Artikel b) {
    return sortiment.add(b);
  }

  /**
   * Entferne artikel.
   *
   * @param b the b
   * @return true, if successful
   */
  public boolean entferneArtikel(Artikel b) {
    return sortiment.remove(b);
  }

  /**
   * Pruefe bestellung.
   *
   * @param bestellung the bestellung
   * @return true, if successful
   */
  public boolean pruefeBestellung(Collection<Artikel> bestellung) {
    return sortiment.containsAll(bestellung);
  }

  /**
   * Ermittle verfuegbare artikel.
   *
   * @param bestellung the bestellung
   * @return the sets the
   */
  public Set<Artikel> ermittleVerfuegbareArtikel(Set<Artikel> bestellung) {
    Set<Artikel> verfuegbareArtikel = new HashSet<Artikel>(sortiment);
    verfuegbareArtikel.retainAll(bestellung);
    return verfuegbareArtikel;
  }

  /**
   * Ermittle fehlende artikel.
   *
   * @param pruefListe the pruef liste
   * @return the sets the
   */
  public Set<Artikel> ermittleFehlendeArtikel(Set<Artikel> pruefListe) {
    Set<Artikel> fehlendeArtikel = new HashSet<Artikel>(sortiment);
    fehlendeArtikel.removeAll(pruefListe);
    return fehlendeArtikel;
  }

  /**
   * Erweitere sortiment.
   *
   * @param neueArtikel the neue artikel
   * @return true, if successful
   */
  public boolean erweitereSortiment(Collection<Artikel> neueArtikel) {
    return sortiment.addAll(neueArtikel);
  }

}
