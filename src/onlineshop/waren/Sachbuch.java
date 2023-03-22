package onlineshop.waren;

/**
 * The Class Sachbuch.
 */
public class Sachbuch extends Buch {

    /** The Constant KLASSEN_PRAEFIX. */
    //private static final String KLASSEN_PRAEFIX = "SB";

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

    /**
     * To string.
     *
     * @return the string
     */
    public String toString() {
        return super.toString();
    }

    /**
     * @param obj
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
     * @return int
     */
    public int hashCode() {
        return super.hashCode();
    }

    public Sachbuch clone() {
        // try {
        Sachbuch k = (Sachbuch) super.clone();
        return k;
        // will never catch exception
        // } catch (CloneNotSupportedException ex) {
        // System.out.println("Clone exception");
        // return null;
        // }
        // Frage zu Einheit 2 Task 4.
    }
}
