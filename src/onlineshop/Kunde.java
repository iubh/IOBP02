package onlineshop;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * Repräsentiert einen Shop-Kunden<br/>
 * Felder:<br/>
 * {@link #kundennummer} - die eindeutige Kundennummer<br/>
 * {@link #vorname} - der/die Vorname(n)<br/>
 * {@link #name} - der Nachname<br/>
 * {@link #geschlecht} - "m" für männlich, "w" für weiblich<br/>
 * {@link #geburtsdatum} - im Format "dd.mm.yyyy"<br/>
 * {@link Warenkorb} - der aktuelle Kunden-Warenkorb<br/>
 *
 * @author Alfred Walther
 * @version 1.1
 */
public class Kunde implements Cloneable, Comparable<Kunde> {
    /** steht für "männlich" */
    public final static String MAENNLICH = "m";
    /** steht für "weiblich" */
    public final static String WEIBLICH = "w";
    /** erzeugt für jeden Kunden eine neue Kundennummer */
    private static int kundenCounter = 1;
    /** wandelt den Date-String in ein {@link java.util.Date} um */
    private static DateFormat df = new SimpleDateFormat("dd.mm.yyyy");

    protected int kundennummer;
    protected String vorname;
    protected String name;
    protected String geschlecht;
    protected Date geburtsdatum;
    protected Warenkorb warenkorb;

    public Kunde() {
        this.kundennummer = kundenCounter++;
    }

    public Kunde(String vorname, String name, String geschlecht, String geburtsdatum, Warenkorb warenkorb) {
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

    public Kunde clone() {
        try {
            Kunde k = (Kunde) super.clone();
            return k;
        } catch (CloneNotSupportedException ex) {
            System.out.println("Cloning of 'Kunde' not supported");
            return null;
        }
    }

    @Override
    public int compareTo(Kunde k) {
        return kundennummer - k.kundennummer;
    }

    @Override
    public boolean equals(Object vergleichsKunde) {
        if (this == vergleichsKunde) return true;
        if (vergleichsKunde == null || getClass() != vergleichsKunde.getClass()) return false;
        Kunde kunde = (Kunde) vergleichsKunde;
        return kundennummer == kunde.kundennummer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kundennummer);
    }

    @Override
    public String toString() {
        return "Kunden-Objekt enthält folgende Daten: " +
                "\nVorname: " + vorname +
                "\nNachname: " + name +
                "\nGeschlecht: " + geschlecht +
                "\nGeburtsdatum: " + df.format(geburtsdatum);
    }
}
