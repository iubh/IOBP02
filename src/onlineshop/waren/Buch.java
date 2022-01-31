package onlineshop.waren;

import java.util.Scanner;

public class Buch extends Artikel {
    Scanner scanner;
    protected int seiten;
    protected String autor;
    protected String titel;

    @Override
    public String getBeschreibung() {
        return super.getBeschreibung();
    }

    @Deprecated
    public void setSeiten(int seiten) {
        this.seiten = seiten;
    }

    public void setAnzahlSeiten(int seiten) {
        this.seiten = seiten;
    }

    public void setAutor(final String autor) {
        this.autor = autor;
    }

    public void setTitel(final String titel) {
        this.titel = titel;
    }
}
