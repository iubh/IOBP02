package onlineshop.waren;

/**
 * Repräsentiert ein Shop-Sachbuch.<br/>
 * Erbt von {@link Buch}.<br/>
 * Eigene Felder:<br/>
 * {@link #thema} - Thema des Sachbuches<br/>
 *
 * @author Alfred Walther
 * @version 1.1
 */
public class Sachbuch extends Buch {
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
}