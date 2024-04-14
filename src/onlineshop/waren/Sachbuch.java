package onlineshop.waren;

import java.util.Objects;

public class Sachbuch extends Buch implements Cloneable {
    private static final String KLASSEN_PRAEFIX = "SB";
    private String thema;

    public Sachbuch() {
        super();
    }

    public Sachbuch(String titel, String autor, String thema) {
        super(titel, autor);
        this.thema = thema;
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

    @Override
    public Sachbuch clone() {
        Sachbuch neuesBuch = null;
        try {
            neuesBuch = (Sachbuch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        neuesBuch.thema = this.thema;
        return neuesBuch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sachbuch sachbuch = (Sachbuch) o;
        return Objects.equals(titel, sachbuch.titel)
                && Objects.equals(autor, sachbuch.autor)
                && Objects.equals(thema, sachbuch.thema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), thema);
    }

    @Override
    public String toString() {
        return "Sachbuch{" +
                "titel='" + titel + '\'' +
                ", autor='" + autor + '\'' +
                ", thema='" + thema + '\'' +
                '}';
    }
}
