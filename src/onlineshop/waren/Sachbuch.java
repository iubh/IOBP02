package onlineshop.waren;

import java.util.Objects;

/**
 * Repräsentiert ein Shop-Sachbuch.<br/>
 * Erbt von {@link Buch}.<br/>
 * Eigene Felder:<br/>
 * {@link #thema} - Thema des Sachbuches<br/>
 *
 * @author Alfred Walther
 * @version 1.1
 */
public class Sachbuch extends Buch implements Cloneable {
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