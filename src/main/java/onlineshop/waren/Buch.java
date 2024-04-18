package onlineshop.waren;


import java.util.Objects;

/**
 * Repräsentiert ein Shop-Buch.<br/>
 * Erbt von {@link Artikel}.<br/>
 * Eigene Felder:<br/>
 * {@link #seiten} - Anzahl der Buchseiten<br/>
 * {@link #titel} - Titel des Buches<br/>
 * {@link #autor} - Autor des Buches<br/>
 *
 * @author Alfred Walther
 * @version 1.1
 */
public class Buch extends Artikel {
    protected int seiten;
    protected String titel;
    protected String autor;

    public Buch() {
        super();
    }

    public Buch(String titel, String autor) {
        super();
        this.titel = titel;
        this.autor = autor;
    }

    public String getBeschreibung() {
        return super.getBeschreibung();
    }

    public void setSeiten(int seiten) {
        this.seiten = seiten;
    }

    public void setTitel(final String titel) {
        this.titel = titel;
    }

    public void setAutor(final String autor) {
        this.autor = autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Buch buch = (Buch) o;
        return Objects.equals(titel, buch.titel) && Objects.equals(autor, buch.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titel, autor);
    }

    @Override
    public String toString() {
        return "Buch{" +
                "titel='" + titel + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
