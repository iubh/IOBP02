package onlineshop;

import onlineshop.waren.Artikel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Warenkorb {
    private final static Logger log = LogManager.getLogger(Warenkorb.class);

    private int anzahlArtikel;
    private double artikelSumme;
    private boolean gutscheinEingeloest;

    private List<Artikel> artikelListe = new ArrayList<>();

    public Warenkorb() {}

    public List<Artikel> getArtikelListe() {
        return artikelListe;
    }

    public void setArtikelListe(List<Artikel> artikelListe) {
        this.artikelListe = artikelListe;
    }

    public void hinzufuegen(Artikel artikel) {
        artikelListe.add(artikel);
        log.debug("Artikel '" + artikel.getBeschreibung() + "' zum Warenkorb hinzugefügt.");
    }

    public Artikel entfernen(Artikel artikel) {
        boolean erfolgreich = artikelListe.remove(artikel);
        if (erfolgreich) {
            return artikel;
        } else {
            log.error("Der Artikel '" + artikel.getBeschreibung() + "' konnte nicht im Warenkorb gefunden werden!");
            return null;
        }
    }
}
