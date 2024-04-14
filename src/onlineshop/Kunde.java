package onlineshop;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Kunde {
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
}
