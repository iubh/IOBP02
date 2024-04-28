package onlineshop;

import onlineshop.waren.Artikel;

import java.util.Set;
import java.util.TreeSet;

public class Sortiment {
    private Set<Artikel> artikelListe = new TreeSet<>();

    public Sortiment() {}

    public Sortiment(Set<Artikel> artikelListe) {
        this.artikelListe = artikelListe;
    }

    public Set<Artikel> getArtikelListe() {
        return artikelListe;
    }

    @Override
    public String toString() {
        return "Sortiment{" +
                "artikelListe=" + artikelListe +
                '}';
    }
}
