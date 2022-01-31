package onlineshop.waren;

public class Sachbuch extends Buch {
    private static final String KLASSEN_PRAEFIX = "SB";
    private String thema;

    public Sachbuch() {
    }

    public String getThema() {
        return thema;
    }

    public void setThema(String thema) {
        this.thema = thema;
    }

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

    private int getAnzahlThemen() {
        return 0;
    }
}
