package onlineshop.waren;

// TODO: Auto-generated Javadoc
/**
 * The Class Sachbuch.
 */
public class Sachbuch extends Buch {
    
    /** The Constant KLASSEN_PRAEFIX. */
    private static final String KLASSEN_PRAEFIX = "SB";
    
    /** The thema. */
    private String thema;

    /**
     * Instantiates a new sachbuch.
     */
    public Sachbuch() {
    }

    /**
     * Gets the thema.
     *
     * @return the thema
     */
    public String getThema() {
        return thema;
    }

    /**
     * Sets the thema.
     *
     * @param thema the new thema
     */
    public void setThema(String thema) {
        this.thema = thema;
    }

    /**
     * Zusammenfassen.
     *
     * @return the string
     */
    public String zusammenfassen() {
        String zusammenfassung = "";
        int anzahlThemen = getAnzahlThemen();

        if (thema == null) {
            return "";
        }

        for (int i = 0; i < anzahlThemen; i++) {
            zusammenfassung += "Thema " + i + ":\n";
        }
        return zusammenfassung;
    }

    /**
     * Gets the anzahl themen.
     *
     * @return the anzahl themen
     */
    private int getAnzahlThemen() {
        return 0;
    }
}
