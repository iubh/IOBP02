package onlineshop;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Kunde implements Cloneable, Comparable<Kunde> {
    public final static String MAENNLICH = "m";
    public final static String WEIBLICH = "w";
    private static int kundenCounter = 1;
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
