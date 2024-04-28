package onlineshop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class Kunde {
    private final static Logger log = LogManager.getLogger(Kunde.class);

    /** steht für "männlich" */
    public final static String MAENNLICH = "m";
    /** steht für "weiblich" */
    public final static String WEIBLICH = "w";
    /** erzeugt für jeden Kunden eine neue Kundennummer */
    private static Integer kundenCounter = 1;
    /** wandelt den Date-String in ein {@link java.util.Date} um */
    private static DateFormat df = new SimpleDateFormat("dd.mm.yyyy");

    protected int kundennummer;
    protected String vorname;
    protected String name;
    protected String geschlecht;
    protected Date geburtsdatum;
    protected Warenkorb warenkorb = new Warenkorb();
    protected Queue<Bestellung> bestellungen = new LinkedList<>();

    public Kunde() {
        this.kundennummer = kundenCounter++;
    }

    public Kunde(String vorname, String name, String geschlecht, String geburtsdatum) {
        this();
        this.vorname = vorname;
        this.name = name;
        this.geschlecht = geschlecht;
        try {
            this.geburtsdatum = df.parse(geburtsdatum);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        this.warenkorb = warenkorb;
    }

    // TODO: implementiere die Methode "clone()"


    public Warenkorb getWarenkorb() {
        return warenkorb;
    }

    public void setWarenkorb(Warenkorb warenkorb) {
        this.warenkorb = warenkorb;
    }

    public Queue<Bestellung> getBestellungen() {
        return bestellungen;
    }

    /**
     * Erzeugt eine neue Bestellung aus dem Warenkorb.
     * @return {@link Bestellung} Referenz auf die neue Bestellung
     */
    public Bestellung bestellen() {
        LocalDateTime zeitstempel = LocalDateTime.now();
        Bestellung bestellung = new Bestellung(this, this.warenkorb, zeitstempel);
        bestellungen.add(bestellung);
        log.debug("Neue Bestellung mit " + warenkorb.getArtikelListe().size() + " Artikeln");
        return bestellung;
    }

    @Override
    public String toString() {
        return vorname + " " + name;
    }
}
