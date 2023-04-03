package onlineshop.waren;

// TODO: Auto-generated Javadoc
/**
 * The Class Sachbuch.
 */
public class Sachbuch extends Buch {

    /** The Constant KLASSEN_PRAEFIX. */
    // private static final String KLASSEN_PRAEFIX = "SB";

    /** The thema. */
    private String thema;

    /**
     * Instantiates a new sachbuch.
     */
    public Sachbuch() {
    }

    /**
     * Instantiates a new sachbuch.
     *
     * @param string  the string
     * @param string2 the string 2
     * @param string3 the string 3
     * @param d       the d
     * @param string4 the string 4
     * @param string5 the string 5
     */
    public Sachbuch(String string, String string2, String string3, double d, String string4, String string5) {
    }

    /**
     * Gets the thema.
     *
     * @return the thema
     */
    private static final String KLASSEN_PRAEFIX = "SB";

    /**
     * @return String
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

    /**
     * To string.
     *
     * @return the string
     */
    public String toString() {
        return super.toString();
    }

    /**
     * Equals.
     *
     * @param obj the obj
     * @return boolean
     */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof Sachbuch) {
            Sachbuch s = (Sachbuch) obj;
            return (thema.equals(s.beschreibung));
        } else
            return super.equals(obj);
    }

    /**
     * Hash code.
     *
     * @return int
     */
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * Clone.
     *
     * @return Sachbuch
     */
    public Sachbuch clone() {
        // try {
        Sachbuch k = (Sachbuch) super.clone();
        return k;
        // will never catch exception
        // }catch (CloneNotSupportedException ex) {
        // System.out.println("Clone exception");
        // return null;
        // }
        // Frage zu Einheit 2 Task 4.
    }
}
