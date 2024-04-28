package onlineshop;

import onlineshop.waren.Artikel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Bestellung {
    private static int bestellungCounter = 1;
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm");
    private int bestellNr;
    private List<Artikel> artikelListe = new ArrayList<>();
    private LocalDateTime bestellZeitpunkt;
    private Kunde kunde;

    public Bestellung() {
        this.bestellNr = Bestellung.bestellungCounter++;
    }

    public Bestellung(Kunde kunde, Warenkorb warenkorb, LocalDateTime bestellZeitpunkt) {
        this();
        this.kunde = kunde;
        this.artikelListe = warenkorb.getArtikelListe();
        this.bestellZeitpunkt = bestellZeitpunkt;
    }

    public int getBestellNr() {
        return bestellNr;
    }

    @Override
    public String toString() {
        StringBuffer output = new StringBuffer("Bestellung Nr. " + bestellNr + " für Kunde '" + kunde + "'");
        output.append(" am " + dtf.format(bestellZeitpunkt) + " Uhr\n");
        output.append("Liste der bestellten Artikel: \n");
        for (Artikel artikel : artikelListe)
            output.append("• " + artikel.getBeschreibung() + "\n");
        return output.toString();
    }
}
